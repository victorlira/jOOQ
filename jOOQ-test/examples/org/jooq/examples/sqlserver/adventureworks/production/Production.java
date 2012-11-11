/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Production extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1837908048;

	/**
	 * The singleton instance of <code>Production</code>
	 */
	public static final Production Production = new Production();

	/**
	 * No further instances allowed
	 */
	private Production() {
		super("Production");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials,
			org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.Culture,
			org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document,
			org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration.Illustration,
			org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location,
			org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCategory.ProductCategory,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCostHistory.ProductCostHistory,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductDescription.ProductDescription,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductDocument.ProductDocument,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModel.ProductModel,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelProductDescriptionCulture.ProductModelProductDescriptionCulture,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductProductPhoto.ProductProductPhoto,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductReview.ProductReview,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ProductSubcategory.ProductSubcategory,
			org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason,
			org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistory.TransactionHistory,
			org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive,
			org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure.UnitMeasure,
			org.jooq.examples.sqlserver.adventureworks.production.tables.vProductAndDescription.vProductAndDescription,
			org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelCatalogDescription.vProductModelCatalogDescription,
			org.jooq.examples.sqlserver.adventureworks.production.tables.vProductModelInstructions.vProductModelInstructions,
			org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrder.WorkOrder,
			org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting);
	}
}
