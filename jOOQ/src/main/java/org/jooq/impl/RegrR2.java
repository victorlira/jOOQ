/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
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
 * For more information, please visit: https://www.jooq.org/legal/licensing
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

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.impl.Tools.ExtendedDataKey.*;
import static org.jooq.impl.Tools.SimpleDataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.Function1;
import org.jooq.Record;
import org.jooq.conf.ParamType;
import org.jooq.tools.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import java.math.BigDecimal;


/**
 * The <code>REGR R2</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unused" })
final class RegrR2
extends
    AbstractAggregateFunction<BigDecimal>
implements
    QOM.RegrR2
{

    RegrR2(
        Field<? extends Number> y,
        Field<? extends Number> x
    ) {
        super(
            false,
            N_REGR_R2,
            NUMERIC,
            nullSafeNotNull(y, INTEGER),
            nullSafeNotNull(x, INTEGER)
        );
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------



    private static final Set<SQLDialect> NO_SUPPORT_NATIVE        = SQLDialect.supportedUntil(CUBRID, DERBY, HSQLDB, IGNITE, MARIADB, MYSQL, SQLITE);





    @Override
    public final void accept(Context<?> ctx) {
        if (NO_SUPPORT_NATIVE.contains(ctx.dialect()))
            acceptEmulation(ctx);




        else
            super.accept(ctx);
    }

    @SuppressWarnings("unchecked")
    private final void acceptEmulation(Context<?> ctx) {
        Field<? extends Number> x = (Field) getArguments().get(0);
        Field<? extends Number> y = (Field) getArguments().get(1);

        ctx.visit(DSL
            .when(fo(DSL.varPop(y(x, y))).eq(inline(BigDecimal.ZERO)), (Field) DSL.inline(null, d(ctx)))
            .when(fo(DSL.varPop(x(x, y))).eq(inline(BigDecimal.ZERO)), inline(BigDecimal.ONE))
            .else_(DSL.square(fo(DSL.corr(x, y))))
        );
    }



    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    @Override
    public final Field<? extends Number> $y() {
        return (Field<? extends Number>) getArguments().get(0);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Field<? extends Number> $x() {
        return (Field<? extends Number>) getArguments().get(1);
    }

    @Override
    public final QOM.RegrR2 $y(Field<? extends Number> newValue) {
        return $constructor().apply(newValue, $x());
    }

    @Override
    public final QOM.RegrR2 $x(Field<? extends Number> newValue) {
        return $constructor().apply($y(), newValue);
    }

    public final Function2<? super Field<? extends Number>, ? super Field<? extends Number>, ? extends QOM.RegrR2> $constructor() {
        return (a1, a2) -> new RegrR2(a1, a2);
    }

























    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.RegrR2 o) {
            return
                StringUtils.equals($y(), o.$y()) &&
                StringUtils.equals($x(), o.$x())
            ;
        }
        else
            return super.equals(that);
    }
}
