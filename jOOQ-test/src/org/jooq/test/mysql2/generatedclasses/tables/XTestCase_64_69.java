/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 850753829;

	/**
	 * The singleton instance of test2.x_test_case_64_69
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_x_test_case_64_69a
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES test2.x_unused (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	public XTestCase_64_69() {
		super("x_test_case_64_69", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	public XTestCase_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_X_TEST_CASE_64_69_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_X_TEST_CASE_64_69_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.mysql2.generatedclasses.Keys.FK_X_TEST_CASE_64_69A);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69(alias);
	}
}