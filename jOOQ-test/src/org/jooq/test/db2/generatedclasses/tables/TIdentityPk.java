/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityPk extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 304670633;

	/**
	 * The singleton instance of LUKAS.T_IDENTITY_PK
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TIdentityPk T_IDENTITY_PK = new org.jooq.test.db2.generatedclasses.tables.TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY_PK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY_PK);

	/**
	 * No further instances allowed
	 */
	private TIdentityPk() {
		super("T_IDENTITY_PK", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.db2.generatedclasses.Keys.IDENTITY_T_IDENTITY_PK;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_IDENTITY_PK__PK_T_IDENTITY_PK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TIdentityPkRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_IDENTITY_PK__PK_T_IDENTITY_PK);
	}
}