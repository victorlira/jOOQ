/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArrays extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> {

	private static final long serialVersionUID = 1240614968;

	/**
	 * The singleton instance of <code>TEST.T_ARRAYS</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TArrays T_ARRAYS = new org.jooq.test.oracle.generatedclasses.test.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord.class;
	}

	/**
	 * The column <code>TEST.T_ARRAYS.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>TEST.T_ARRAYS.STRING_ARRAY</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord.class), this, "");

	/**
	 * The column <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class), this, "");

	/**
	 * The column <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> NUMBER_LONG_ARRAY = createField("NUMBER_LONG_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord.class), this, "");

	/**
	 * The column <code>TEST.T_ARRAYS.DATE_ARRAY</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.DATE.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord.class), this, "");

	/**
	 * Create a <code>TEST.T_ARRAYS</code> table reference
	 */
	public TArrays() {
		this("T_ARRAYS", null);
	}

	/**
	 * Create an aliased <code>TEST.T_ARRAYS</code> table reference
	 */
	public TArrays(java.lang.String alias) {
		this(alias, org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS);
	}

	private TArrays(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> aliased) {
		this(alias, aliased, null);
	}

	private TArrays(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_ARRAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_ARRAYS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TArrays as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TArrays(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.TArrays rename(java.lang.String name) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TArrays(name, null);
	}
}
