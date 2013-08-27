/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 * 
 * This work is dual-licensed Open Source, under LGPL and jOOQ EULA
 * =============================================================================
 * You may freely choose which license applies to you. For more information 
 * about licensing, please visit http://www.jooq.org/licenses
 * 
 * LGPL:  
 * -----------------------------------------------------------------------------
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.
 * If not, see http://www.gnu.org/licenses.
 * 
 * jOOQ End User License Agreement:
 * -----------------------------------------------------------------------------
 * This library is commercial software; you may not redistribute it nor
 * modify it.
 * 
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ End User
 * License Agreement for more details.
 * 
 * You should have received a copy of the jOOQ End User License Agreement
 * along with this library.
 * If not, see http://www.jooq.org/eula
 */

package org.jooq.impl;


import static org.jooq.Clause.CONDITION;
import static org.jooq.Clause.CONDITION_BETWEEN;

import org.jooq.BindContext;
import org.jooq.Clause;
import org.jooq.Comparator;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.QuantifiedSelect;
import org.jooq.RenderContext;

/**
 * @author Lukas Eder
 */
class QuantifiedComparisonCondition extends AbstractCondition {

    private static final long         serialVersionUID = -402776705884329740L;
    private static final Clause[]     CLAUSES          = { CONDITION, CONDITION_BETWEEN };

    private final QuantifiedSelect<?> query;
    private final Field<?>            field;
    private final Comparator          comparator;

    QuantifiedComparisonCondition(QuantifiedSelect<?> query, Field<?> field, Comparator comparator) {
        this.query = query;
        this.field = field;
        this.comparator = comparator;
    }

    @Override
    public final void toSQL(RenderContext context) {
        context.visit(field)
               .sql(" ")
               .keyword(comparator.toSQL())
               .sql(" ")
               .visit(query);
    }

    @Override
    public final void bind(BindContext context) {
        context.visit(field).visit(query);
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }
}
