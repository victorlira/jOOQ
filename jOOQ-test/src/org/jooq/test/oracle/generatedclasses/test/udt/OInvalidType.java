/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt;

/**
 * This class is generated by jOOQ.
 */
public class OInvalidType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.OInvalidTypeRecord> {

	private static final long serialVersionUID = -2016738739;

	/**
	 * The singleton instance of TEST.O_INVALID_TYPE
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.udt.OInvalidType O_INVALID_TYPE = new org.jooq.test.oracle.generatedclasses.test.udt.OInvalidType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.OInvalidTypeRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.udt.records.OInvalidTypeRecord.class;
	}

	/**
	 * No further instances allowed
	 */
	private OInvalidType() {
		super("O_INVALID_TYPE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		// Initialise data type
		getDataType();
	}
}