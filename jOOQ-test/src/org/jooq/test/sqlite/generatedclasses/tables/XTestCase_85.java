/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 2059524416;

	/**
	 * The singleton instance of x_test_case_85
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85_X_UNUSED_1
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_85_X_UNUSED_1
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85");
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_85_ID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_85_ID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.sqlite.generatedclasses.Keys.FK_X_TEST_CASE_85_X_UNUSED_1);
	}
}