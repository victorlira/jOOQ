/**
 * This class is generated by jOOQ
 */
package org.jooq.test.informix.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85 extends org.jooq.impl.TableImpl<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 525994050;

	/**
	 * The singleton instance of <code>informix.x_test_case_85</code>
	 */
	public static final org.jooq.test.informix.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.informix.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The column <code>informix.x_test_case_85.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>informix.x_test_case_85.x_unused_id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>informix.x_test_case_85.x_unused_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * Create a <code>informix.x_test_case_85</code> table reference
	 */
	public XTestCase_85() {
		this("x_test_case_85", null);
	}

	/**
	 * Create an aliased <code>informix.x_test_case_85</code> table reference
	 */
	public XTestCase_85(java.lang.String alias) {
		this(alias, org.jooq.test.informix.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}

	private XTestCase_85(java.lang.String alias, org.jooq.Table<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_85(java.lang.String alias, org.jooq.Table<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.informix.generatedclasses.Informix.INFORMIX, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> getPrimaryKey() {
		return org.jooq.test.informix.generatedclasses.Keys.U15918_16752;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.informix.generatedclasses.Keys.U15918_16752);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.informix.generatedclasses.Keys.R15918_16753);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.informix.generatedclasses.tables.XTestCase_85 as(java.lang.String alias) {
		return new org.jooq.test.informix.generatedclasses.tables.XTestCase_85(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.informix.generatedclasses.tables.XTestCase_85 rename(java.lang.String name) {
		return new org.jooq.test.informix.generatedclasses.tables.XTestCase_85(name, null);
	}
}
