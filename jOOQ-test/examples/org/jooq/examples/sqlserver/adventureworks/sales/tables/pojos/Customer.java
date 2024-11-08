/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Customer", schema = "Sales")
public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = -1257221465;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  CustomerID;
	private java.lang.Integer  TerritoryID;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 10)
	private java.lang.String   AccountNumber;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 1)
	private java.lang.String   CustomerType;

	@javax.validation.constraints.NotNull
	private java.lang.String   rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "CustomerID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getCustomerID() {
		return this.CustomerID;
	}

	public void setCustomerID(java.lang.Integer CustomerID) {
		this.CustomerID = CustomerID;
	}

	@javax.persistence.Column(name = "TerritoryID", precision = 10)
	public java.lang.Integer getTerritoryID() {
		return this.TerritoryID;
	}

	public void setTerritoryID(java.lang.Integer TerritoryID) {
		this.TerritoryID = TerritoryID;
	}

	@javax.persistence.Column(name = "AccountNumber", nullable = false, length = 10)
	public java.lang.String getAccountNumber() {
		return this.AccountNumber;
	}

	public void setAccountNumber(java.lang.String AccountNumber) {
		this.AccountNumber = AccountNumber;
	}

	@javax.persistence.Column(name = "CustomerType", nullable = false, length = 1)
	public java.lang.String getCustomerType() {
		return this.CustomerType;
	}

	public void setCustomerType(java.lang.String CustomerType) {
		this.CustomerType = CustomerType;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}