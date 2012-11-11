/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "EmployeePayHistory", schema = "HumanResources", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"EmployeeID", "RateChangeDate"})
})
public class EmployeePayHistory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeePayHistory> implements org.jooq.Record5<java.lang.Integer, java.sql.Timestamp, java.math.BigDecimal, java.lang.Byte, java.sql.Timestamp> {

	private static final long serialVersionUID = -1605885782;

	/**
	 * Setter for <code>HumanResources.EmployeePayHistory.EmployeeID</code>. 
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.EmployeeID, value);
	}

	/**
	 * Getter for <code>HumanResources.EmployeePayHistory.EmployeeID</code>. 
	 */
	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.EmployeeID);
	}

	/**
	 * Setter for <code>HumanResources.EmployeePayHistory.RateChangeDate</code>. 
	 */
	public void setRateChangeDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.RateChangeDate, value);
	}

	/**
	 * Getter for <code>HumanResources.EmployeePayHistory.RateChangeDate</code>. 
	 */
	@javax.persistence.Column(name = "RateChangeDate", nullable = false)
	public java.sql.Timestamp getRateChangeDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.RateChangeDate);
	}

	/**
	 * Setter for <code>HumanResources.EmployeePayHistory.Rate</code>. 
	 */
	public void setRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.Rate, value);
	}

	/**
	 * Getter for <code>HumanResources.EmployeePayHistory.Rate</code>. 
	 */
	@javax.persistence.Column(name = "Rate", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getRate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.Rate);
	}

	/**
	 * Setter for <code>HumanResources.EmployeePayHistory.PayFrequency</code>. 
	 */
	public void setPayFrequency(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.PayFrequency, value);
	}

	/**
	 * Getter for <code>HumanResources.EmployeePayHistory.PayFrequency</code>. 
	 */
	@javax.persistence.Column(name = "PayFrequency", nullable = false, precision = 3)
	public java.lang.Byte getPayFrequency() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.PayFrequency);
	}

	/**
	 * Setter for <code>HumanResources.EmployeePayHistory.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.ModifiedDate, value);
	}

	/**
	 * Getter for <code>HumanResources.EmployeePayHistory.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.sql.Timestamp> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.sql.Timestamp, java.math.BigDecimal, java.lang.Byte, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.sql.Timestamp, java.math.BigDecimal, java.lang.Byte, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.EmployeeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.RateChangeDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.Rate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field4() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.PayFrequency;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getEmployeeID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getRateChangeDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getRate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value4() {
		return getPayFrequency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmployeePayHistory
	 */
	public EmployeePayHistory() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeePayHistory.EmployeePayHistory);
	}
}
