/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Attributes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1665246530;

	/**
	 * The singleton instance of SYSCAT.ATTRIBUTES
	 */
	public static final org.jooq.util.db2.syscat.tables.Attributes ATTRIBUTES = new org.jooq.util.db2.syscat.tables.Attributes();

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
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPESCHEMA = createField("TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPEMODULENAME = createField("TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPENAME = createField("TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_NAME = createField("ATTR_NAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPESCHEMA = createField("ATTR_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPEMODULENAME = createField("ATTR_TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ATTR_TYPENAME = createField("ATTR_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPESCHEMA = createField("TARGET_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPEMODULENAME = createField("TARGET_TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPENAME = createField("TARGET_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SOURCE_TYPESCHEMA = createField("SOURCE_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SOURCE_TYPEMODULENAME = createField("SOURCE_TYPEMODULENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SOURCE_TYPENAME = createField("SOURCE_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> ORDINAL = createField("ORDINAL", org.jooq.impl.SQLDataType.SMALLINT, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.INTEGER, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> CODEPAGE = createField("CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONSCHEMA = createField("COLLATIONSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONNAME = createField("COLLATIONNAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LOGGED = createField("LOGGED", org.jooq.impl.SQLDataType.CHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COMPACT = createField("COMPACT", org.jooq.impl.SQLDataType.CHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DL_FEATURES = createField("DL_FEATURES", org.jooq.impl.SQLDataType.CHAR, ATTRIBUTES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> JAVA_FIELDNAME = createField("JAVA_FIELDNAME", org.jooq.impl.SQLDataType.VARCHAR, ATTRIBUTES);

	/**
	 * No further instances allowed
	 */
	private Attributes() {
		super("ATTRIBUTES", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}