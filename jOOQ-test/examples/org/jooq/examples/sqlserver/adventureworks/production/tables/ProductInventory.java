/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ProductInventory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> {

	private static final long serialVersionUID = 417150621;

	/**
	 * The singleton instance of <code>Production.ProductInventory</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory ProductInventory = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory.class;
	}

	/**
	 * The column <code>Production.ProductInventory.ProductID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.ProductInventory.LocationID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Short> LocationID = createField("LocationID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>Production.ProductInventory.Shelf</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.String> Shelf = createField("Shelf", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.ProductInventory.Bin</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Byte> Bin = createField("Bin", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>Production.ProductInventory.Quantity</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Short> Quantity = createField("Quantity", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>Production.ProductInventory.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>Production.ProductInventory.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.ProductInventory</code> table reference
	 */
	public ProductInventory() {
		super("ProductInventory", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.ProductInventory</code> table reference
	 */
	public ProductInventory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductInventory_ProductID_LocationID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductInventory_ProductID_LocationID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductInventory_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductInventory_Location_LocationID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory(alias);
	}
}
