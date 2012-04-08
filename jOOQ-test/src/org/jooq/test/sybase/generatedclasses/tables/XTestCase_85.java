/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 973148167;

	/**
	 * The singleton instance of dba.x_test_case_85
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.sybase.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_85__fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES dba.x_unused (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_85__fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES dba.x_unused (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public XTestCase_85() {
		super("x_test_case_85", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	public XTestCase_85(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_85__FK_X_TEST_CASE_85);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.XTestCase_85 as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.XTestCase_85(alias);
	}
}
