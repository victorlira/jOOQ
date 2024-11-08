/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTerritory", schema = "Sales")
public class SalesTerritory implements java.io.Serializable {

	private static final long serialVersionUID = 1547924707;


	@javax.validation.constraints.NotNull
	private java.lang.Integer    TerritoryID;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     Name;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 3)
	private java.lang.String     CountryRegionCode;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     Group;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal SalesYTD;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal SalesLastYear;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal CostYTD;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal CostLastYear;

	@javax.validation.constraints.NotNull
	private java.lang.String     rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "TerritoryID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getTerritoryID() {
		return this.TerritoryID;
	}

	public void setTerritoryID(java.lang.Integer TerritoryID) {
		this.TerritoryID = TerritoryID;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "CountryRegionCode", nullable = false, length = 3)
	public java.lang.String getCountryRegionCode() {
		return this.CountryRegionCode;
	}

	public void setCountryRegionCode(java.lang.String CountryRegionCode) {
		this.CountryRegionCode = CountryRegionCode;
	}

	@javax.persistence.Column(name = "Group", nullable = false, length = 50)
	public java.lang.String getGroup() {
		return this.Group;
	}

	public void setGroup(java.lang.String Group) {
		this.Group = Group;
	}

	@javax.persistence.Column(name = "SalesYTD", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSalesYTD() {
		return this.SalesYTD;
	}

	public void setSalesYTD(java.math.BigDecimal SalesYTD) {
		this.SalesYTD = SalesYTD;
	}

	@javax.persistence.Column(name = "SalesLastYear", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSalesLastYear() {
		return this.SalesLastYear;
	}

	public void setSalesLastYear(java.math.BigDecimal SalesLastYear) {
		this.SalesLastYear = SalesLastYear;
	}

	@javax.persistence.Column(name = "CostYTD", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getCostYTD() {
		return this.CostYTD;
	}

	public void setCostYTD(java.math.BigDecimal CostYTD) {
		this.CostYTD = CostYTD;
	}

	@javax.persistence.Column(name = "CostLastYear", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getCostLastYear() {
		return this.CostLastYear;
	}

	public void setCostLastYear(java.math.BigDecimal CostLastYear) {
		this.CostLastYear = CostLastYear;
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