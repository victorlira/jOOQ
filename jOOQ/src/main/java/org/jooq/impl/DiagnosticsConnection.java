/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

// ...
import static org.jooq.conf.ParamType.FORCE_INDEXED;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.jooq.Configuration;
import org.jooq.Parser;
import org.jooq.Queries;
import org.jooq.QueryPart;
import org.jooq.RenderContext;
import org.jooq.impl.QOM.Eq;
import org.jooq.tools.jdbc.DefaultConnection;

/**
 * @author Lukas Eder
 */
final class DiagnosticsConnection extends DefaultConnection {

    // TODO: Make these configurable
    static final int                      LRU_SIZE_GLOBAL = 50000;
    static final int                      LRU_SIZE_LOCAL  = 500;
    static final int                      DUP_SIZE        = 500;
    static final Map<String, Set<String>> DUPLICATE_SQL   = Collections.synchronizedMap(new LRU<>(LRU_SIZE_GLOBAL));

    final Map<String, List<String>>       repeatedSQL     = new LRU<>(LRU_SIZE_LOCAL);
    final Configuration                   configuration;
    final RenderContext                   normalisingRenderer;
    final Parser                          parser;
    final DiagnosticsListeners            listeners;

    DiagnosticsConnection(Configuration configuration) {
        super(configuration.connectionProvider().acquire());

        this.configuration = configuration;
        this.normalisingRenderer = configuration.deriveSettings(s -> s

            // Forcing all inline parameters to be indexed helps find opportunities to use bind variables
            .withParamType(FORCE_INDEXED)

            // Padding IN lists shows duplicates that arise from arbitrary-length dynamic IN lists
            .withInListPadding(true)
            .withInListPadBase(16)
        ).dsl().renderContext();
        this.parser = configuration.dsl().parser();
        this.listeners = DiagnosticsListeners.get(configuration);
    }

    @Override
    public final Statement createStatement() throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().createStatement());
    }

    @Override
    public final Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().createStatement(resultSetType, resultSetConcurrency));
    }

    @Override
    public final Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(parse(sql)));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(parse(sql), resultSetType, resultSetConcurrency));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(parse(sql), resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(parse(sql), autoGeneratedKeys));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(parse(sql), columnIndexes));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareStatement(parse(sql), columnNames));
    }

    @Override
    public final CallableStatement prepareCall(String sql) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareCall(parse(sql)));
    }

    @Override
    public final CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareCall(parse(sql), resultSetType, resultSetConcurrency));
    }

    @Override
    public final CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return new DiagnosticsStatement(this, getDelegate().prepareCall(parse(sql), resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    @Override
    public final void close() throws SQLException {
        repeatedSQL.clear();
        configuration.connectionProvider().release(getDelegate());
    }

    final String parse(String sql) {
        Queries queries = null;
        String normalised;

        try {
            queries = parser.parse(sql);
            normalised = normalisingRenderer.render(queries);
        }
        catch (ParserException exception) {
            normalised = sql;
            listeners.exception(new DefaultDiagnosticsContext(sql, exception));
        }

        try {
            Set<String> duplicates = null;
            synchronized (DUPLICATE_SQL) {
                duplicates = duplicates(DUPLICATE_SQL, sql, normalised);
            }

            if (duplicates != null)
                listeners.duplicateStatements(new DefaultDiagnosticsContext(sql, normalised, duplicates, null, null));

            List<String> repetitions = repetitions(repeatedSQL, sql, normalised);

            if (repetitions != null)
                listeners.repeatedStatements(new DefaultDiagnosticsContext(sql, normalised, null, repetitions, null));
















        }
        catch (Error e) {
            throw e;
        }
        catch (Throwable exception) {
            listeners.exception(new DefaultDiagnosticsContext(sql, normalised, null, null, exception));
        }

        return sql;
    }

    private Set<String> duplicates(Map<String, Set<String>> map, String sql, String normalised) {
        Set<String> v = map.computeIfAbsent(normalised, k -> new HashSet<>());

        if (v.size() >= DUP_SIZE || (v.add(sql) && v.size() > 1))
            return v;
        else
            return null;
    }

    private List<String> repetitions(Map<String, List<String>> map, String sql, String normalised) {
        List<String> v = map.computeIfAbsent(normalised, k -> new ArrayList<>());

        if (v.size() >= DUP_SIZE || (v.add(sql) && v.size() > 1))
            return v;
        else
            return null;
    }

    // See https://stackoverflow.com/a/1953516/521799
    static class LRU<V> extends LinkedHashMap<String, V> {
        private final int size;

        LRU(int size) {
            super(size + 1, 1.0f, true);
            this.size = size;
        }

        @Override
        protected boolean removeEldestEntry(Entry<String, V> eldest) {
            return size() > size;
        }
    }
}
