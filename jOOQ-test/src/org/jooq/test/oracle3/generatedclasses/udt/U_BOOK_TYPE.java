/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
public class U_BOOK_TYPE extends org.jooq.impl.UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -481432100;

	/**
	 * The singleton instance of TEST.U_BOOK_TYPE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE U_BOOK_TYPE = new org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, U_BOOK_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, U_BOOK_TYPE);

	/**
	 * No further instances allowed
	 */
	private U_BOOK_TYPE() {
		super("U_BOOK_TYPE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		// Initialise data type
		getDataType();
	}
}