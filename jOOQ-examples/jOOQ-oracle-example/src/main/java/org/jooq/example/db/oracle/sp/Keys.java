/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.sp;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.example.db.oracle.sp.tables.Authors;
import org.jooq.example.db.oracle.sp.tables.Books;
import org.jooq.example.db.oracle.sp.tables.ColaMarkets;
import org.jooq.example.db.oracle.sp.tables.NewAuthorAqT;
import org.jooq.example.db.oracle.sp.tables.records.AuthorsRecord;
import org.jooq.example.db.oracle.sp.tables.records.BooksRecord;
import org.jooq.example.db.oracle.sp.tables.records.ColaMarketsRecord;
import org.jooq.example.db.oracle.sp.tables.records.NewAuthorAqTRecord;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>SP</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AuthorsRecord> SYS_C0018818 = UniqueKeys0.SYS_C0018818;
	public static final UniqueKey<BooksRecord> SYS_C0018822 = UniqueKeys0.SYS_C0018822;
	public static final UniqueKey<ColaMarketsRecord> SYS_C0018827 = UniqueKeys0.SYS_C0018827;
	public static final UniqueKey<NewAuthorAqTRecord> SYS_C0018824 = UniqueKeys0.SYS_C0018824;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<BooksRecord, AuthorsRecord> FK_AUTHOR_ID = ForeignKeys0.FK_AUTHOR_ID;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AuthorsRecord> SYS_C0018818 = createUniqueKey(Authors.AUTHORS, Authors.AUTHORS.ID);
		public static final UniqueKey<BooksRecord> SYS_C0018822 = createUniqueKey(Books.BOOKS, Books.BOOKS.ID);
		public static final UniqueKey<ColaMarketsRecord> SYS_C0018827 = createUniqueKey(ColaMarkets.COLA_MARKETS, ColaMarkets.COLA_MARKETS.MKT_ID);
		public static final UniqueKey<NewAuthorAqTRecord> SYS_C0018824 = createUniqueKey(NewAuthorAqT.NEW_AUTHOR_AQ_T, NewAuthorAqT.NEW_AUTHOR_AQ_T.MSGID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<BooksRecord, AuthorsRecord> FK_AUTHOR_ID = createForeignKey(org.jooq.example.db.oracle.sp.Keys.SYS_C0018818, Books.BOOKS, Books.BOOKS.AUTHOR_ID);
	}
}
