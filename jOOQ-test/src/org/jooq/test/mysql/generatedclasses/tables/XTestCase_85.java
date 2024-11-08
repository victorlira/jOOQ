/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -1147211870;

	/**
	 * The singleton instance of test.x_test_case_85
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.mysql.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES test.x_unused (ID, NAME)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES test.x_unused (ID, NAME)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_X_TEST_CASE_85_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_X_TEST_CASE_85_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.mysql.generatedclasses.Keys.FK_X_TEST_CASE_85);
	}
}