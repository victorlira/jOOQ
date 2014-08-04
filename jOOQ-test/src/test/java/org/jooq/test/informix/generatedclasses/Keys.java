/**
 * This class is generated by jOOQ
 */
package org.jooq.test.informix.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>informix</code> 
 * schema
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TIdentityPkRecord> PK_T_IDENTITY_PK = UniqueKeys0.PK_T_IDENTITY_PK;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TDatesRecord> PK_T_DATES = UniqueKeys0.PK_T_DATES;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBooleansRecord> PK_T_BOOLEANS = UniqueKeys0.PK_T_BOOLEANS;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TTriggersRecord> PK_T_TRIGGERS = UniqueKeys0.PK_T_TRIGGERS;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TDirectoryRecord> PK_T_DIRECTORY = UniqueKeys0.PK_T_DIRECTORY;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TLanguageRecord> PK_T_LANGUAGE = UniqueKeys0.PK_T_LANGUAGE;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = UniqueKeys0.PK_T_725_LOB_TEST;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TAuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBookStoreRecord> UK_T_BOOK_STORE_NAME = UniqueKeys0.UK_T_BOOK_STORE_NAME;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBookToBookStoreRecord> U7552_8147 = UniqueKeys0.U7552_8147;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> U7553_8152 = UniqueKeys0.U7553_8152;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> U7553_8153 = UniqueKeys0.U7553_8153;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TExoticTypesRecord> U7554_8157 = UniqueKeys0.U7554_8157;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.T_639NumbersTableRecord> U7555_8159 = UniqueKeys0.U7555_8159;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_64_69Record> U7556_8161 = UniqueKeys0.U7556_8161;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_71Record> U7557_8164 = UniqueKeys0.U7557_8164;
	public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> U7558_8167 = UniqueKeys0.U7558_8167;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TDirectoryRecord, org.jooq.test.informix.generatedclasses.tables.records.TDirectoryRecord> R7543_8121 = ForeignKeys0.R7543_8121;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord, org.jooq.test.informix.generatedclasses.tables.records.TAuthorRecord> R7550_8136 = ForeignKeys0.R7550_8136;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord, org.jooq.test.informix.generatedclasses.tables.records.TAuthorRecord> R7550_8137 = ForeignKeys0.R7550_8137;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord, org.jooq.test.informix.generatedclasses.tables.records.TLanguageRecord> R7550_8139 = ForeignKeys0.R7550_8139;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.informix.generatedclasses.tables.records.TBookStoreRecord> R7552_8148 = ForeignKeys0.R7552_8148;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.informix.generatedclasses.tables.records.TBookRecord> R7552_8149 = ForeignKeys0.R7552_8149;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7553_8154 = ForeignKeys0.R7553_8154;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7556_8162 = ForeignKeys0.R7556_8162;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.informix.generatedclasses.tables.records.XTestCase_64_69Record> R7557_8165 = ForeignKeys0.R7557_8165;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7558_8168 = ForeignKeys0.R7558_8168;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> R7559_8170 = ForeignKeys0.R7559_8170;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.informix.generatedclasses.tables.records.XTestCase_71Record> R7559_8171 = ForeignKeys0.R7559_8171;
	public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7559_8172 = ForeignKeys0.R7559_8172;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TIdentityPkRecord> PK_T_IDENTITY_PK = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.informix.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TDatesRecord> PK_T_DATES = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TDates.T_DATES, org.jooq.test.informix.generatedclasses.tables.TDates.T_DATES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBooleansRecord> PK_T_BOOLEANS = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.informix.generatedclasses.tables.TBooleans.T_BOOLEANS.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TTriggersRecord> PK_T_TRIGGERS = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.informix.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TDirectoryRecord> PK_T_DIRECTORY = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TDirectory.T_DIRECTORY, org.jooq.test.informix.generatedclasses.tables.TDirectory.T_DIRECTORY.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TLanguageRecord> PK_T_LANGUAGE = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TLanguage.T_LANGUAGE, org.jooq.test.informix.generatedclasses.tables.TLanguage.T_LANGUAGE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.informix.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.informix.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord> PK_T_BOOK = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBookStoreRecord> UK_T_BOOK_STORE_NAME = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.informix.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TBookToBookStoreRecord> U7552_8147 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.informix.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, org.jooq.test.informix.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> U7553_8152 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED.ID, org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> U7553_8153 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.TExoticTypesRecord> U7554_8157 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.informix.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.T_639NumbersTableRecord> U7555_8159 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.informix.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_64_69Record> U7556_8161 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.informix.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_71Record> U7557_8164 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.informix.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> U7558_8167 = createUniqueKey(org.jooq.test.informix.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.informix.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TDirectoryRecord, org.jooq.test.informix.generatedclasses.tables.records.TDirectoryRecord> R7543_8121 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.PK_T_DIRECTORY, org.jooq.test.informix.generatedclasses.tables.TDirectory.T_DIRECTORY, org.jooq.test.informix.generatedclasses.tables.TDirectory.T_DIRECTORY.PARENT_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord, org.jooq.test.informix.generatedclasses.tables.records.TAuthorRecord> R7550_8136 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.PK_T_AUTHOR, org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord, org.jooq.test.informix.generatedclasses.tables.records.TAuthorRecord> R7550_8137 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.PK_T_AUTHOR, org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookRecord, org.jooq.test.informix.generatedclasses.tables.records.TLanguageRecord> R7550_8139 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.PK_T_LANGUAGE, org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.informix.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.informix.generatedclasses.tables.records.TBookStoreRecord> R7552_8148 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.UK_T_BOOK_STORE_NAME, org.jooq.test.informix.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.informix.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.informix.generatedclasses.tables.records.TBookRecord> R7552_8149 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.PK_T_BOOK, org.jooq.test.informix.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.informix.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7553_8154 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.U7553_8152, org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED.ID_REF, org.jooq.test.informix.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7556_8162 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.U7553_8153, org.jooq.test.informix.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.informix.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.informix.generatedclasses.tables.records.XTestCase_64_69Record> R7557_8165 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.U7556_8161, org.jooq.test.informix.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.informix.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7558_8168 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.U7553_8152, org.jooq.test.informix.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.informix.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, org.jooq.test.informix.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.informix.generatedclasses.tables.records.XTestCase_85Record> R7559_8170 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.U7558_8167, org.jooq.test.informix.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.informix.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.informix.generatedclasses.tables.records.XTestCase_71Record> R7559_8171 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.U7557_8164, org.jooq.test.informix.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.informix.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.informix.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.informix.generatedclasses.tables.records.XUnusedRecord> R7559_8172 = createForeignKey(org.jooq.test.informix.generatedclasses.Keys.U7553_8152, org.jooq.test.informix.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.informix.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID, org.jooq.test.informix.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME);
	}
}
