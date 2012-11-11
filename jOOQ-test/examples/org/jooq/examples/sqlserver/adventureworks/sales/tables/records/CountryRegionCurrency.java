/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "CountryRegionCurrency", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CountryRegionCode", "CurrencyCode"})
})
public class CountryRegionCurrency extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> implements org.jooq.Record3<java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -1715748;

	/**
	 * Setter for <code>Sales.CountryRegionCurrency.CountryRegionCode</code>. 
	 */
	public void setCountryRegionCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CountryRegionCode, value);
	}

	/**
	 * Getter for <code>Sales.CountryRegionCurrency.CountryRegionCode</code>. 
	 */
	@javax.persistence.Column(name = "CountryRegionCode", nullable = false, length = 3)
	public java.lang.String getCountryRegionCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CountryRegionCode);
	}

	/**
	 * Setter for <code>Sales.CountryRegionCurrency.CurrencyCode</code>. 
	 */
	public void setCurrencyCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CurrencyCode, value);
	}

	/**
	 * Getter for <code>Sales.CountryRegionCurrency.CurrencyCode</code>. 
	 */
	@javax.persistence.Column(name = "CurrencyCode", nullable = false, length = 3)
	public java.lang.String getCurrencyCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CurrencyCode);
	}

	/**
	 * Setter for <code>Sales.CountryRegionCurrency.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Sales.CountryRegionCurrency.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.String, java.lang.String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CountryRegionCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CurrencyCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCountryRegionCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCurrencyCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CountryRegionCurrency
	 */
	public CountryRegionCurrency() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency);
	}
}
