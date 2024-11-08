/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.util.derby;

import static org.jooq.impl.Factory.inline;
import static org.jooq.util.derby.sys.tables.Syscolumns.SYSCOLUMNS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Record;
import org.jooq.util.AbstractTableDefinition;
import org.jooq.util.ColumnDefinition;
import org.jooq.util.DataTypeDefinition;
import org.jooq.util.DefaultColumnDefinition;
import org.jooq.util.DefaultDataTypeDefinition;
import org.jooq.util.SchemaDefinition;
import org.jooq.util.derby.sys.tables.Syscolumns;

/**
 * @author Lukas Eder
 */
public class DerbyTableDefinition extends AbstractTableDefinition {

    private final String         tableid;

    public DerbyTableDefinition(SchemaDefinition schema, String name, String tableid) {
		super(schema, name, "");

		this.tableid = tableid;
	}

	@Override
	public List<ColumnDefinition> getElements0() throws SQLException {
		List<ColumnDefinition> result = new ArrayList<ColumnDefinition>();

        for (Record record : create().select(
                Syscolumns.COLUMNNAME,
                Syscolumns.COLUMNNUMBER,
                Syscolumns.COLUMNDATATYPE,
                Syscolumns.AUTOINCREMENTINC)
            .from(SYSCOLUMNS)
            // [#1241] Suddenly, bind values didn't work any longer, here...
            .where(Syscolumns.REFERENCEID.equal(inline(tableid)))
            .orderBy(Syscolumns.COLUMNNUMBER)
            .fetch()) {

            String typeName = record.getValueAsString(Syscolumns.COLUMNDATATYPE);
            Number precision = parsePrecision(typeName);
            Number scale = parseScale(typeName);

            DataTypeDefinition type = new DefaultDataTypeDefinition(
                getDatabase(),
                getSchema(),
                typeName,
                precision,
                precision,
                scale);

			ColumnDefinition column = new DefaultColumnDefinition(
				getDatabase().getTable(getSchema(), getName()),
			    record.getValue(Syscolumns.COLUMNNAME),
			    record.getValue(Syscolumns.COLUMNNUMBER),
			    type,
			    !parseNotNull(typeName),
                null != record.getValue(Syscolumns.AUTOINCREMENTINC),
                null);

			result.add(column);
		}

		return result;
	}
}