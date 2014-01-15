/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UBookType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord> {

	private static final long serialVersionUID = -971151;

	/**
	 * The singleton instance of <code>TEST.U_BOOK_TYPE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.udt.UBookType U_BOOK_TYPE = new org.jooq.test.oracle.generatedclasses.test.udt.UBookType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord.class;
	}

	/**
	 * The attribute <code>TEST.U_BOOK_TYPE.ID</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, U_BOOK_TYPE);

	/**
	 * The attribute <code>TEST.U_BOOK_TYPE.TITLE</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTypeRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400), U_BOOK_TYPE);

	/**
	 * No further instances allowed
	 */
	private UBookType() {
		super("U_BOOK_TYPE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		// Initialise data type
		getDataType();
	}
}
