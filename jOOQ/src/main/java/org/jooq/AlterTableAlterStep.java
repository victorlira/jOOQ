/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
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
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq;

import static org.jooq.SQLDialect.ACCESS;
import static org.jooq.SQLDialect.ASE;
import static org.jooq.SQLDialect.CUBRID;
import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.HSQLDB;
import static org.jooq.SQLDialect.INFORMIX;
import static org.jooq.SQLDialect.INGRES;
import static org.jooq.SQLDialect.MARIADB;
import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.SQLDialect.ORACLE;
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.SQLITE;
import static org.jooq.SQLDialect.SQLSERVER;
import static org.jooq.SQLDialect.SYBASE;

/**
 * The step in the <code>ALTER TABLE</code> DSL used to <code>ALTER</code>
 * columns.
 *
 * @author Lukas Eder
 */
public interface AlterTableAlterStep<T> {

    /**
     * Specify a new column <code>DEFAULT</code>.
     */
    @Support({ ACCESS, ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    AlterTableFinalStep defaultValue(T literal);

    /**
     * Specify a new column <code>DEFAULT</code>.
     */
    @Support({ ACCESS, ASE, CUBRID, DB2, DERBY, FIREBIRD, H2, HSQLDB, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    AlterTableFinalStep defaultValue(Field<T> expression);

    /**
     * Specify a new column data type.
     */
    @Support({ ACCESS, ASE, CUBRID, DB2, DERBY, H2, HSQLDB, INFORMIX, INGRES, MARIADB, MYSQL, ORACLE, POSTGRES, SQLITE, SQLSERVER, SYBASE })
    AlterTableFinalStep set(DataType<?> type);
}
