/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -1882496344;

	/**
	 * The singleton instance of test.t_725_lob_test
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.ingres.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_725_LOB_TEST);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("lob", org.jooq.impl.SQLDataType.LONGVARBINARY, T_725_LOB_TEST);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.PK_T_725_LOB_TEST;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_T_725_LOB_TEST);
	}
}