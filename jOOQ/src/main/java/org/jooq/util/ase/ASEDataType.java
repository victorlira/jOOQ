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
package org.jooq.util.ase;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

import org.jooq.DataType;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;

/**
 * Supported data types for the {@link SQLDialect#ASE} dialect
 *
 * @see <a href="http://infocenter.sybase.com/help/topic/com.sybase.infocenter.dc36271.1550/html/blocks/X31825.htm">http://infocenter.sybase.com/help/topic/com.sybase.infocenter.dc36271.1550/html/blocks/X31825.htm</a>
 * @author Lukas Eder
 */
public class ASEDataType {

    // -------------------------------------------------------------------------
    // Default SQL data types and synonyms thereof
    // -------------------------------------------------------------------------

    public static final DataType<Byte>       TINYINT                    = new DefaultDataType<Byte>(SQLDialect.ASE, SQLDataType.TINYINT, "tinyint");
    public static final DataType<Short>      SMALLINT                   = new DefaultDataType<Short>(SQLDialect.ASE, SQLDataType.SMALLINT, "smallint");
    public static final DataType<Short>      UNSIGNEDSMALLLINT          = new DefaultDataType<Short>(SQLDialect.ASE, SQLDataType.SMALLINT, "unsigned smallint");
    public static final DataType<Integer>    INT                        = new DefaultDataType<Integer>(SQLDialect.ASE, SQLDataType.INTEGER, "int");
    public static final DataType<Integer>    INTEGER                    = new DefaultDataType<Integer>(SQLDialect.ASE, SQLDataType.INTEGER, "integer");
    public static final DataType<Integer>    UNSIGNEDINT                = new DefaultDataType<Integer>(SQLDialect.ASE, SQLDataType.INTEGER, "unsigned int");
    public static final DataType<Long>       BIGINT                     = new DefaultDataType<Long>(SQLDialect.ASE, SQLDataType.BIGINT, "bigint");
    public static final DataType<Long>       UNSIGNEDBIGINT             = new DefaultDataType<Long>(SQLDialect.ASE, SQLDataType.BIGINT, "unsigned bigint");
    public static final DataType<Double>     DOUBLE_PRECISION           = new DefaultDataType<Double>(SQLDialect.ASE, SQLDataType.DOUBLE, "double precision");
    public static final DataType<Double>     FLOAT                      = new DefaultDataType<Double>(SQLDialect.ASE, SQLDataType.FLOAT, "float");
    public static final DataType<Float>      REAL                       = new DefaultDataType<Float>(SQLDialect.ASE, SQLDataType.REAL, "real");
    public static final DataType<BigDecimal> DECIMAL                    = new DefaultDataType<BigDecimal>(SQLDialect.ASE, SQLDataType.DECIMAL, "decimal");
    public static final DataType<BigDecimal> DEC                        = new DefaultDataType<BigDecimal>(SQLDialect.ASE, SQLDataType.DECIMAL, "dec");
    public static final DataType<BigDecimal> NUMERIC                    = new DefaultDataType<BigDecimal>(SQLDialect.ASE, SQLDataType.NUMERIC, "numeric");
    public static final DataType<Boolean>    BIT                        = new DefaultDataType<Boolean>(SQLDialect.ASE, SQLDataType.BIT, "bit");
    public static final DataType<String>     VARCHAR                    = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.VARCHAR, "varchar");
    public static final DataType<String>     CHAR                       = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.CHAR, "char");
    public static final DataType<String>     LONGVARCHAR                = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.LONGVARCHAR, "text");
    public static final DataType<String>     NCHAR                      = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.NCHAR, "nchar");
    public static final DataType<String>     NVARCHAR                   = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.NVARCHAR, "nvarchar");
    public static final DataType<String>     TEXT                       = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.CLOB, "text");
    public static final DataType<Date>       DATE                       = new DefaultDataType<Date>(SQLDialect.ASE, SQLDataType.DATE, "date");
    public static final DataType<Time>       TIME                       = new DefaultDataType<Time>(SQLDialect.ASE, SQLDataType.TIME, "time");
    public static final DataType<Timestamp>  DATETIME                   = new DefaultDataType<Timestamp>(SQLDialect.ASE, SQLDataType.TIMESTAMP, "datetime");
    public static final DataType<Timestamp>  TIMESTAMP                  = new DefaultDataType<Timestamp>(SQLDialect.ASE, SQLDataType.TIMESTAMP, "datetime");
    public static final DataType<byte[]>     BINARY                     = new DefaultDataType<byte[]>(SQLDialect.ASE, SQLDataType.BINARY, "binary");
    public static final DataType<byte[]>     VARBINARY                  = new DefaultDataType<byte[]>(SQLDialect.ASE, SQLDataType.VARBINARY, "varbinary");

    // -------------------------------------------------------------------------
    // Compatibility types for supported SQLDataTypes
    // -------------------------------------------------------------------------

    protected static final DataType<byte[]>  __BLOB                     = new DefaultDataType<byte[]>(SQLDialect.ASE, SQLDataType.BLOB, "binary");
    protected static final DataType<byte[]>  __LONGVARBINARY            = new DefaultDataType<byte[]>(SQLDialect.ASE, SQLDataType.LONGVARBINARY, "varbinary");
    protected static final DataType<Boolean> __BOOLEAN                  = new DefaultDataType<Boolean>(SQLDialect.ASE, SQLDataType.BOOLEAN, "bit");
    protected static final DataType<String>  __LONGNVARCHAR             = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.LONGNVARCHAR, "unitext");

    // -------------------------------------------------------------------------
    // Compatibility types for supported Java types
    // -------------------------------------------------------------------------

    protected static final DataType<BigInteger> __BIGINTEGER            = new DefaultDataType<BigInteger>(SQLDialect.ASE, SQLDataType.DECIMAL_INTEGER, "decimal");
    protected static final DataType<UUID>       __UUID                  = new DefaultDataType<UUID>(SQLDialect.ASE, SQLDataType.UUID, "varchar");

    // -------------------------------------------------------------------------
    // Dialect-specific data types and synonyms thereof
    // -------------------------------------------------------------------------

    public static final DataType<String>     UNICHAR                    = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.NCHAR, "unichar");
    public static final DataType<String>     UNITEXT                    = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.NCLOB, "unitext");
    public static final DataType<String>     UNIVARCHAR                 = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.NVARCHAR, "univarchar");
    public static final DataType<String>     SYSNAME                    = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.VARCHAR, "sysname");
    public static final DataType<String>     LONGSYSNAME                = new DefaultDataType<String>(SQLDialect.ASE, SQLDataType.VARCHAR, "longsysname");
    public static final DataType<BigDecimal> MONEY                      = new DefaultDataType<BigDecimal>(SQLDialect.ASE, SQLDataType.DECIMAL, "money");
    public static final DataType<BigDecimal> SMALLMONEY                 = new DefaultDataType<BigDecimal>(SQLDialect.ASE, SQLDataType.DECIMAL, "smallmoney");
    public static final DataType<Timestamp>  SMALLDATETIME              = new DefaultDataType<Timestamp>(SQLDialect.ASE, SQLDataType.TIMESTAMP, "smalldatetime");
    public static final DataType<Timestamp>  BIGDATETIME                = new DefaultDataType<Timestamp>(SQLDialect.ASE, SQLDataType.TIMESTAMP, "bigdatetime");
    public static final DataType<Time>       BIGTIME                    = new DefaultDataType<Time>(SQLDialect.ASE, SQLDataType.TIME, "bigtime");
    public static final DataType<byte[]>     IMAGE                      = new DefaultDataType<byte[]>(SQLDialect.ASE, SQLDataType.BINARY, "image");

    private ASEDataType() {}
}
