/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_639NumbersTable extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 1287498544;

	/**
	 * The singleton instance of t_639_numbers_table
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.NUMERIC, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Float> FLOAT = createField("FLOAT", org.jooq.impl.SQLDataType.REAL, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> DOUBLE = createField("DOUBLE", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE);

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable() {
		super("t_639_numbers_table");
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE_ID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE_ID);
	}
}