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
package org.jooq;

import javax.annotation.Generated;

/**
 * An intermediate DSL type for the construction of a <code>BETWEEN</code>
 * predicate.
 *
 * @author Lukas Eder
 */
@Generated("This class was generated using jOOQ-tools")
public interface BetweenAndStep13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> {

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(Field<T1> maxValue1, Field<T2> maxValue2, Field<T3> maxValue3, Field<T4> maxValue4, Field<T5> maxValue5, Field<T6> maxValue6, Field<T7> maxValue7, Field<T8> maxValue8, Field<T9> maxValue9, Field<T10> maxValue10, Field<T11> maxValue11, Field<T12> maxValue12, Field<T13> maxValue13);

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(T1 maxValue1, T2 maxValue2, T3 maxValue3, T4 maxValue4, T5 maxValue5, T6 maxValue6, T7 maxValue7, T8 maxValue8, T9 maxValue9, T10 maxValue10, T11 maxValue11, T12 maxValue12, T13 maxValue13);

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(Row13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> maxValue);

    /**
     * Create a condition to check this field against some bounds
     */
    @Support
    Condition and(Record13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> maxValue);

}
