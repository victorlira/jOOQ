/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
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

/**
 * Dialects and dialect families as supported by jOOQ.
 * <p>
 * jOOQ supports a variety of dialects, which are grouped into dialect families.
 * For instance, the SQL Server dialect family {@link #SQLSERVER} is specialised
 * by its dialects
 * <ul>
 * <li> {@link #SQLSERVER2008}</li>
 * <li> {@link #SQLSERVER2012}</li>
 * </ul>
 *
 * @author Lukas Eder
 */
public enum SQLDialect {

    /**
     * The standard SQL dialect family.
     *
     * @deprecated - Do not reference this pseudo-dialect. It is only used for
     *             unit testing
     */
    @Deprecated
    SQL99(null, false),

    // -------------------------------------------------------------------------
    // SQL dialects for free usage
    // -------------------------------------------------------------------------

    /**
     * The CUBRID SQL dialect family.
     */
    CUBRID("CUBRID", false),

    /**
     * The Apache Derby SQL dialect family.
     */
    DERBY("Derby", false),

    /**
     * The Firebird SQL dialect family.
     */
    FIREBIRD("Firebird", false),

    /**
     * The H2 SQL dialect family.
     */
    H2("H2", false),

    /**
     * The Hypersonic SQL dialect family.
     */
    HSQLDB("HSQLDB", false),

    /**
     * The MariaDB dialect family.
     */
    MARIADB("MariaDB", false),

    /**
     * The MySQL dialect family.
     */
    MYSQL("MySQL", false),

    /**
     * The PostgreSQL dialect family.
     */
    POSTGRES("Postgres", false),

    /**
     * The SQLite dialect family.
     */
    SQLITE("SQLite", false),

    // -------------------------------------------------------------------------
    // SQL dialects for commercial usage
    // -------------------------------------------------------------------------

    /* [pro] */

//  /**
//   * The MS Access SQL dialect family. ACCESS support will be added in jOOQ 3.3
//   */
//  ACCESS("Access", true),

    /**
     * The Sybase Adaptive Server SQL dialect family.
     */
    ASE("ASE", true),

    /**
     * The IBM DB2 SQL dialect family.
     */
    DB2("DB2", true),

    /**
     * The IBM DB2 9.x SQL dialect.
     */
    DB2_9("DB2", true, DB2),

    /**
     * The IBM DB2 10.x SQL dialect.
     */
    DB2_10("DB2", true, DB2),

    /**
     * The Ingres dialect family.
     */
    INGRES("Ingres", true),

    /**
     * The Oracle dialect family.
     */
    ORACLE("Oracle", true),

    /**
     * The Oracle 10g dialect.
     */
    ORACLE10G("Oracle", true, ORACLE),

    /**
     * The Oracle 11g dialect.
     */
    ORACLE11G("Oracle", true, ORACLE),

    /**
     * The Oracle 12c dialect.
     */
    ORACLE12C("Oracle", true, ORACLE),

    /**
     * The SQL Server dialect family.
     */
    SQLSERVER("SQLServer", true),

    /**
     * The SQL Server 2008 dialect.
     */
    SQLSERVER2008("SQLServer", true, SQLSERVER),

    /**
     * The SQL Server 2012 dialect.
     */
    SQLSERVER2012("SQLServer", true, SQLSERVER),

    /**
     * The Sybase SQL Anywhere dialect family.
     */
    SYBASE("Sybase", true),

    /* [/pro] */

    ;

    private final String     name;
    private final boolean    commercial;
    private final SQLDialect family;

    private SQLDialect(String name, boolean commercial) {
        this(name, commercial, null);
    }

    private SQLDialect(String name, boolean commercial, SQLDialect family) {
        this.name = name;
        this.commercial = commercial;
        this.family = family;
    }

    /**
     * Whether this dialect is supported with the jOOQ commercial license only.
     */
    public final boolean commercial() {
        return commercial;
    }

    /**
     * The dialect family.
     * <p>
     * This returns the dialect itself, if it has no "parent family". E.g.
     * <code><pre>
     * SQLSERVER == SQLSERVER2012.family();
     * SQLSERVER == SQLSERVER2008.family();
     * SQLSERVER == SQLSERVER.family();
     * </pre></code>
     */
    public final SQLDialect family() {
        return family == null ? this : family;
    }

    /**
     * The name of this dialect as it appears in related class names.
     */
    public final String getName() {
        return name;
    }

    /**
     * The name of this dialect as it appears in related package names.
     */
    public final String getNameLC() {
        return name == null ? null : name.toLowerCase();
    }

    /**
     * The name of this dialect as it appears in related enum values.
     */
    public final String getNameUC() {
        return name == null ? null : name.toUpperCase();
    }
}
