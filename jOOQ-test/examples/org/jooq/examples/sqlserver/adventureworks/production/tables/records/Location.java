/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "Location", schema = "Production")
public class Location extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location> implements org.jooq.Record5<java.lang.Short, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> {

	private static final long serialVersionUID = -1497909951;

	/**
	 * Setter for <code>Production.Location.LocationID</code>. 
	 */
	public void setLocationID(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.LocationID, value);
	}

	/**
	 * Getter for <code>Production.Location.LocationID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "LocationID", unique = true, nullable = false, precision = 5)
	public java.lang.Short getLocationID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.LocationID);
	}

	/**
	 * Setter for <code>Production.Location.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.Name, value);
	}

	/**
	 * Getter for <code>Production.Location.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.Name);
	}

	/**
	 * Setter for <code>Production.Location.CostRate</code>. 
	 */
	public void setCostRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.CostRate, value);
	}

	/**
	 * Getter for <code>Production.Location.CostRate</code>. 
	 */
	@javax.persistence.Column(name = "CostRate", nullable = false, precision = 10, scale = 4)
	public java.math.BigDecimal getCostRate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.CostRate);
	}

	/**
	 * Setter for <code>Production.Location.Availability</code>. 
	 */
	public void setAvailability(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.Availability, value);
	}

	/**
	 * Getter for <code>Production.Location.Availability</code>. 
	 */
	@javax.persistence.Column(name = "Availability", nullable = false, precision = 8, scale = 2)
	public java.math.BigDecimal getAvailability() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.Availability);
	}

	/**
	 * Setter for <code>Production.Location.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Production.Location.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Short> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Short, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Short, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.LocationID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.Name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.CostRate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.Availability;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getLocationID();
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
	public java.math.BigDecimal value3() {
		return getCostRate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getAvailability();
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
	 * Create a detached Location
	 */
	public Location() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location);
	}
}
