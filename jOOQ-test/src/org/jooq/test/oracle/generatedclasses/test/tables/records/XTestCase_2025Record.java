/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_2025", schema = "TEST")
public class XTestCase_2025Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 145552723;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>. 
	 */
	public void setRefId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>. 
	 */
	@javax.persistence.Column(name = "REF_ID", nullable = false, precision = 7)
	public java.lang.Integer getRefId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	public void setRefName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	@javax.persistence.Column(name = "REF_NAME", nullable = false, length = 10)
	public java.lang.String getRefName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRefId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getRefName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_2025Record
	 */
	public XTestCase_2025Record() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025);
	}
}
