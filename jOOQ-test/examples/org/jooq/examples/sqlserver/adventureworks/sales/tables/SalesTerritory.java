/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class SalesTerritory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> {

	private static final long serialVersionUID = -1005472129;

	/**
	 * The singleton instance of <code>Sales.SalesTerritory</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory SalesTerritory = new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory.class;
	}

	/**
	 * The column <code>Sales.SalesTerritory.TerritoryID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.lang.Integer> TerritoryID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.SalesTerritory.Name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Sales.SalesTerritory.CountryRegionCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Sales.SalesTerritory.Group</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.lang.String> Group = createField("Group", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Sales.SalesTerritory.SalesYTD</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.math.BigDecimal> SalesYTD = createField("SalesYTD", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Sales.SalesTerritory.SalesLastYear</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.math.BigDecimal> SalesLastYear = createField("SalesLastYear", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Sales.SalesTerritory.CostYTD</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.math.BigDecimal> CostYTD = createField("CostYTD", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Sales.SalesTerritory.CostLastYear</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.math.BigDecimal> CostLastYear = createField("CostLastYear", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Sales.SalesTerritory.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>Sales.SalesTerritory.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Sales.SalesTerritory</code> table reference
	 */
	public SalesTerritory() {
		super("SalesTerritory", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.SalesTerritory</code> table reference
	 */
	public SalesTerritory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory.SalesTerritory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_SalesTerritory;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesTerritory_TerritoryID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesTerritory_TerritoryID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory(alias);
	}
}
