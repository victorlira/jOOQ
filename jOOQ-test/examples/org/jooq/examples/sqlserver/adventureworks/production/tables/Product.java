/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Product extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product> {

	private static final long serialVersionUID = -237865341;

	/**
	 * The singleton instance of <code>Production.Product</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Product Product = new org.jooq.examples.sqlserver.adventureworks.production.tables.Product();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product.class;
	}

	/**
	 * The column <code>Production.Product.ProductID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.Product.Name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Product.ProductNumber</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> ProductNumber = createField("ProductNumber", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Product.MakeFlag</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Boolean> MakeFlag = createField("MakeFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The column <code>Production.Product.FinishedGoodsFlag</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Boolean> FinishedGoodsFlag = createField("FinishedGoodsFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The column <code>Production.Product.Color</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> Color = createField("Color", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Product.SafetyStockLevel</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Short> SafetyStockLevel = createField("SafetyStockLevel", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>Production.Product.ReorderPoint</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Short> ReorderPoint = createField("ReorderPoint", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>Production.Product.StandardCost</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.math.BigDecimal> StandardCost = createField("StandardCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Production.Product.ListPrice</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.math.BigDecimal> ListPrice = createField("ListPrice", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Production.Product.Size</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> Size = createField("Size", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Product.SizeUnitMeasureCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> SizeUnitMeasureCode = createField("SizeUnitMeasureCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Production.Product.WeightUnitMeasureCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> WeightUnitMeasureCode = createField("WeightUnitMeasureCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Production.Product.Weight</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.math.BigDecimal> Weight = createField("Weight", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Production.Product.DaysToManufacture</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Integer> DaysToManufacture = createField("DaysToManufacture", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.Product.ProductLine</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> ProductLine = createField("ProductLine", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Production.Product.Class</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> Class = createField("Class", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Production.Product.Style</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> Style = createField("Style", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Production.Product.ProductSubcategoryID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Integer> ProductSubcategoryID = createField("ProductSubcategoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.Product.ProductModelID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Integer> ProductModelID = createField("ProductModelID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.Product.SellStartDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.sql.Timestamp> SellStartDate = createField("SellStartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.Product.SellEndDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.sql.Timestamp> SellEndDate = createField("SellEndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.Product.DiscontinuedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.sql.Timestamp> DiscontinuedDate = createField("DiscontinuedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.Product.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>Production.Product.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.Product</code> table reference
	 */
	public Product() {
		super("Product", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.Product</code> table reference
	 */
	public Product(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_Product;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Product_ProductID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Product_ProductID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_Product_UnitMeasure_SizeUnitMeasureCode, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_Product_UnitMeasure_WeightUnitMeasureCode, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_Product_ProductSubcategory_ProductSubcategoryID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_Product_ProductModel_ProductModelID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Product as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Product(alias);
	}
}
