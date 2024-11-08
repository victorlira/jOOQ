/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class FunctionColumns extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1195680875;

	/**
	 * The singleton instance of INFORMATION_SCHEMA.FUNCTION_COLUMNS
	 */
	public static final org.jooq.util.h2.information_schema.tables.FunctionColumns FUNCTION_COLUMNS = new org.jooq.util.h2.information_schema.tables.FunctionColumns();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALIAS_CATALOG = createField("ALIAS_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALIAS_SCHEMA = createField("ALIAS_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ALIAS_NAME = createField("ALIAS_NAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> JAVA_METHOD = createField("JAVA_METHOD", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> COLUMN_COUNT = createField("COLUMN_COUNT", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> RADIX = createField("RADIX", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> COLUMN_TYPE = createField("COLUMN_TYPE", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_COLUMNS);

	/**
	 * No further instances allowed
	 */
	private FunctionColumns() {
		super("FUNCTION_COLUMNS", org.jooq.util.h2.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}