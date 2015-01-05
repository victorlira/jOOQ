/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.sp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.example.db.oracle.sp.Sequences;
import org.jooq.example.db.oracle.sp.tables.Authors;
import org.jooq.example.db.oracle.sp.tables.Books;
import org.jooq.example.db.oracle.sp.tables.ColaMarkets;
import org.jooq.example.db.oracle.sp.tables.NewAuthorAqT;
import org.jooq.example.db.oracle.sp.udt.AuthorT;
import org.jooq.example.db.oracle.sp.udt.BookT;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sp extends SchemaImpl {

	private static final long serialVersionUID = -817554921;

	/**
	 * The reference instance of <code>SP</code>
	 */
	public static final Sp SP = new Sp();

	/**
	 * No further instances allowed
	 */
	private Sp() {
		super("SP");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.MDRS_9804$);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Authors.AUTHORS,
			Books.BOOKS,
			ColaMarkets.COLA_MARKETS,
			NewAuthorAqT.NEW_AUTHOR_AQ_T);
	}

	@Override
	public final List<UDT<?>> getUDTs() {
		List result = new ArrayList();
		result.addAll(getUDTs0());
		return result;
	}

	private final List<UDT<?>> getUDTs0() {
		return Arrays.<UDT<?>>asList(
			AuthorT.AUTHOR_T,
			BookT.BOOK_T);
	}
}
