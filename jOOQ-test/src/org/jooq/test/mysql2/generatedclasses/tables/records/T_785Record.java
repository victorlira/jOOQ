/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_785", schema = "test2")
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_785Record> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -243247716;

	/**
	 * Setter for <code>test2.t_785.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.ID, value);
	}

	/**
	 * Getter for <code>test2.t_785.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", precision = 10)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.ID);
	}

	/**
	 * Setter for <code>test2.t_785.NAME</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.NAME, value);
	}

	/**
	 * Getter for <code>test2.t_785.NAME</code>. 
	 */
	@javax.persistence.Column(name = "NAME", length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.NAME);
	}

	/**
	 * Setter for <code>test2.t_785.VALUE</code>. 
	 */
	public void setValue(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.VALUE, value);
	}

	/**
	 * Getter for <code>test2.t_785.VALUE</code>. 
	 */
	@javax.persistence.Column(name = "VALUE", length = 50)
	public java.lang.String getValue() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.VALUE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getValue();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.mysql2.generatedclasses.tables.T_785.T_785);
	}
}
