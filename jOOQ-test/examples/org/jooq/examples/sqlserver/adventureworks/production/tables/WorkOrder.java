/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class WorkOrder extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder> {

	private static final long serialVersionUID = -77447262;

	/**
	 * The singleton instance of Production.WorkOrder
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrder WorkOrder = new org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrder();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.lang.Integer> WorkOrderID = createField("WorkOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrder_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.lang.Integer> OrderQty = createField("OrderQty", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.lang.Integer> StockedQty = createField("StockedQty", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.lang.Short> ScrappedQty = createField("ScrappedQty", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.sql.Timestamp> StartDate = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.sql.Timestamp> EndDate = createField("EndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.sql.Timestamp> DueDate = createField("DueDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_WorkOrder_ScrapReason_ScrapReasonID
	 * FOREIGN KEY (ScrapReasonID)
	 * REFERENCES Production.ScrapReason (ScrapReasonID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.lang.Short> ScrapReasonID = createField("ScrapReasonID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public WorkOrder() {
		super("WorkOrder", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	public WorkOrder(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrder.WorkOrder);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_WorkOrder;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WorkOrder_WorkOrderID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_WorkOrder_WorkOrderID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrder, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WorkOrder_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_WorkOrder_ScrapReason_ScrapReasonID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrder as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrder(alias);
	}
}
