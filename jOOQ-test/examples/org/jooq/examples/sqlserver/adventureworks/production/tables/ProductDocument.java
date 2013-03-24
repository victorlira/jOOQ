/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ProductDocument extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument> {

	private static final long serialVersionUID = 1644060413;

	/**
	 * The singleton instance of <code>Production.ProductDocument</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductDocument ProductDocument = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductDocument();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument.class;
	}

	/**
	 * The column <code>Production.ProductDocument.ProductID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.ProductDocument.DocumentID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument, java.lang.Integer> DocumentID = createField("DocumentID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.ProductDocument.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.ProductDocument</code> table reference
	 */
	public ProductDocument() {
		super("ProductDocument", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.ProductDocument</code> table reference
	 */
	public ProductDocument(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductDocument.ProductDocument);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductDocument_ProductID_DocumentID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductDocument_ProductID_DocumentID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductDocument, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductDocument_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductDocument_Document_DocumentID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductDocument as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductDocument(alias);
	}
}
