/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -331794585;

	/**
	 * The singleton instance of dbo.x_test_case_64_69
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69a
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES dbo.x_unused (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super("x_test_case_64_69", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.ase.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.ase.generatedclasses.Keys.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A);
	}
}