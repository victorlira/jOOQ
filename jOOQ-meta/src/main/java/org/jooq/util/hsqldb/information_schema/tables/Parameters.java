/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.4.0"},
                            comments = "This class is generated by jOOQ")
public class Parameters extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1344780644;

	/**
	 * The singleton instance of INFORMATION_SCHEMA.PARAMETERS
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.Parameters PARAMETERS = new org.jooq.util.hsqldb.information_schema.tables.Parameters();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_CATALOG = createField("SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_SCHEMA = createField("SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_NAME = createField("SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PARAMETER_MODE = createField("PARAMETER_MODE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_RESULT = createField("IS_RESULT", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> AS_LOCATOR = createField("AS_LOCATOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PARAMETER_NAME = createField("PARAMETER_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FROM_SQL_SPECIFIC_CATALOG = createField("FROM_SQL_SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FROM_SQL_SPECIFIC_SCHEMA = createField("FROM_SQL_SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FROM_SQL_SPECIFIC_NAME = createField("FROM_SQL_SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_CATALOG = createField("TO_SQL_SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_SCHEMA = createField("TO_SQL_SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_NAME = createField("TO_SQL_SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_CATALOG = createField("CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_SCHEMA = createField("CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_CATALOG = createField("COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_SCHEMA = createField("COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INTERVAL_TYPE = createField("INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INTERVAL_PRECISION = createField("INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_CATALOG = createField("UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_SCHEMA = createField("UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_NAME = createField("UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_CATALOG = createField("SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_SCHEMA = createField("SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_NAME = createField("SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAXIMUM_CARDINALITY = createField("MAXIMUM_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DECLARED_DATA_TYPE = createField("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_PRECISION = createField("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_SCALE = createField("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	public Parameters() {
		super("PARAMETERS", org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	public Parameters(java.lang.String alias) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.hsqldb.information_schema.tables.Parameters.PARAMETERS);
	}

	@Override
	public org.jooq.util.hsqldb.information_schema.tables.Parameters as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.Parameters(alias);
	}
}