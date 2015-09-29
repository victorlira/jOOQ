/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;
import org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor;
import org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook;
import org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.NumberObject;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.UNested_1;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.UNested_3;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.U_4311;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.U_4347;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MultiSchema extends SchemaImpl {

	private static final long serialVersionUID = 1815841913;

	/**
	 * The reference instance of <code>MULTI_SCHEMA</code>
	 */
	public static final MultiSchema MULTI_SCHEMA = new MultiSchema();

	/**
	 * No further instances allowed
	 */
	private MultiSchema() {
		super("MULTI_SCHEMA");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			TAuthor.T_AUTHOR,
			TBook.T_BOOK,
			TBookSale.T_BOOK_SALE);
	}

	@Override
	public final List<UDT<?>> getUDTs() {
		List result = new ArrayList();
		result.addAll(getUDTs0());
		return result;
	}

	private final List<UDT<?>> getUDTs0() {
		return Arrays.<UDT<?>>asList(
			NumberObject.NUMBER_OBJECT,
			UNested_1.U_NESTED_1,
			UNested_3.U_NESTED_3,
			U_4311.U_4311,
			U_4347.U_4347);
	}
}
