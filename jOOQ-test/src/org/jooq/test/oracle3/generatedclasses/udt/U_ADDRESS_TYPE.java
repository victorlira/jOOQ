/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
public class U_ADDRESS_TYPE extends org.jooq.impl.UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1920477614;

	/**
	 * The singleton instance of TEST.U_ADDRESS_TYPE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE U_ADDRESS_TYPE = new org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> STREET = createField("STREET", org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.U_STREET_TYPE.getDataType(), U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> ZIP = createField("ZIP", org.jooq.impl.SQLDataType.VARCHAR, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> CITY = createField("CITY", org.jooq.impl.SQLDataType.VARCHAR, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.VARCHAR, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.sql.Date> SINCE = createField("SINCE", org.jooq.impl.SQLDataType.DATE, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.Integer> CODE = createField("CODE", org.jooq.impl.SQLDataType.INTEGER, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, byte[]> F_1323 = createField("F_1323", org.jooq.impl.SQLDataType.BLOB, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> F_1326 = createField("F_1326", org.jooq.impl.SQLDataType.CLOB, U_ADDRESS_TYPE);

	/**
	 * No further instances allowed
	 */
	private U_ADDRESS_TYPE() {
		super("U_ADDRESS_TYPE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		// Initialise data type
		getDataType();
	}
}