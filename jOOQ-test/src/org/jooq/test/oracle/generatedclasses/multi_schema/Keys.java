/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>MULTI_SCHEMA</code> 
 * schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> PK_T_BOOK = createUniqueKey(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> PK_T_BOOK_SALE = createUniqueKey(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord> FK_T_BOOK_AUTHOR_ID = createForeignKey(PK_T_AUTHOR, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = createForeignKey(PK_T_AUTHOR, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> FK_T_BOOK_TO_BOOK_STORE = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_B2BS, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID);

	/**
	 * No instances
	 */
	private Keys() {}
}
