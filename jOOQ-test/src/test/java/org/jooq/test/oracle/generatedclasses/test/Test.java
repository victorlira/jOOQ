/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;
import org.jooq.test.oracle.generatedclasses.test.Sequences;
import org.jooq.test.oracle.generatedclasses.test.tables.MLibrary;
import org.jooq.test.oracle.generatedclasses.test.tables.TArrays;
import org.jooq.test.oracle.generatedclasses.test.tables.TAuthor;
import org.jooq.test.oracle.generatedclasses.test.tables.TBook;
import org.jooq.test.oracle.generatedclasses.test.tables.TBookStore;
import org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore;
import org.jooq.test.oracle.generatedclasses.test.tables.TBooleans;
import org.jooq.test.oracle.generatedclasses.test.tables.TDates;
import org.jooq.test.oracle.generatedclasses.test.tables.TDirectory;
import org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes;
import org.jooq.test.oracle.generatedclasses.test.tables.TLanguage;
import org.jooq.test.oracle.generatedclasses.test.tables.TReserved;
import org.jooq.test.oracle.generatedclasses.test.tables.TTemp;
import org.jooq.test.oracle.generatedclasses.test.tables.TTriggers;
import org.jooq.test.oracle.generatedclasses.test.tables.TUnsigned;
import org.jooq.test.oracle.generatedclasses.test.tables.T_2155;
import org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity;
import org.jooq.test.oracle.generatedclasses.test.tables.T_3711;
import org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable;
import org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest;
import org.jooq.test.oracle.generatedclasses.test.tables.T_785;
import org.jooq.test.oracle.generatedclasses.test.tables.VAuthor;
import org.jooq.test.oracle.generatedclasses.test.tables.VBook;
import org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete;
import org.jooq.test.oracle.generatedclasses.test.tables.VLibrary;
import org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025;
import org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69;
import org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71;
import org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85;
import org.jooq.test.oracle.generatedclasses.test.tables.XUnused;
import org.jooq.test.oracle.generatedclasses.test.udt.OInvalidType;
import org.jooq.test.oracle.generatedclasses.test.udt.UAddressType;
import org.jooq.test.oracle.generatedclasses.test.udt.UAuthorType;
import org.jooq.test.oracle.generatedclasses.test.udt.UBookType;
import org.jooq.test.oracle.generatedclasses.test.udt.UInvalidTable;
import org.jooq.test.oracle.generatedclasses.test.udt.UInvalidType;
import org.jooq.test.oracle.generatedclasses.test.udt.UNested_1;
import org.jooq.test.oracle.generatedclasses.test.udt.UNested_3;
import org.jooq.test.oracle.generatedclasses.test.udt.UStreetType;
import org.jooq.test.oracle.generatedclasses.test.udt.U_2155Object;
import org.jooq.test.oracle.generatedclasses.test.udt.U_3005;
import org.jooq.test.oracle.generatedclasses.test.udt.U_3709;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends SchemaImpl {

	private static final long serialVersionUID = 1501980212;

	/**
	 * The reference instance of <code>TEST</code>
	 */
	public static final Test TEST = new Test();

	/**
	 * No further instances allowed
	 */
	private Test() {
		super("TEST");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.S_3899$,
			Sequences.S_961_BIG_INTEGER,
			Sequences.S_961_BYTE,
			Sequences.S_961_INT,
			Sequences.S_961_LONG,
			Sequences.S_961_SHORT);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			MLibrary.M_LIBRARY,
			TArrays.T_ARRAYS,
			TAuthor.T_AUTHOR,
			TBook.T_BOOK,
			TBookStore.T_BOOK_STORE,
			TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			TBooleans.T_BOOLEANS,
			TDates.T_DATES,
			TDirectory.T_DIRECTORY,
			TExoticTypes.T_EXOTIC_TYPES,
			TLanguage.T_LANGUAGE,
			TReserved.T_RESERVED,
			TTemp.T_TEMP,
			TTriggers.T_TRIGGERS,
			TUnsigned.T_UNSIGNED,
			T_2155.T_2155,
			T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY,
			T_3711.T_3711,
			T_639NumbersTable.T_639_NUMBERS_TABLE,
			T_725LobTest.T_725_LOB_TEST,
			T_785.T_785,
			VAuthor.V_AUTHOR,
			VBook.V_BOOK,
			VIncomplete.V_INCOMPLETE,
			VLibrary.V_LIBRARY,
			XTestCase_2025.X_TEST_CASE_2025,
			XTestCase_64_69.X_TEST_CASE_64_69,
			XTestCase_71.X_TEST_CASE_71,
			XTestCase_85.X_TEST_CASE_85,
			XUnused.X_UNUSED);
	}

	@Override
	public final List<UDT<?>> getUDTs() {
		List result = new ArrayList();
		result.addAll(getUDTs0());
		return result;
	}

	private final List<UDT<?>> getUDTs0() {
		return Arrays.<UDT<?>>asList(
			OInvalidType.O_INVALID_TYPE,
			UAddressType.U_ADDRESS_TYPE,
			UAuthorType.U_AUTHOR_TYPE,
			UBookType.U_BOOK_TYPE,
			UInvalidTable.U_INVALID_TABLE,
			UInvalidType.U_INVALID_TYPE,
			UNested_1.U_NESTED_1,
			UNested_3.U_NESTED_3,
			UStreetType.U_STREET_TYPE,
			U_2155Object.U_2155_OBJECT,
			U_3005.U_3005,
			U_3709.U_3709);
	}
}
