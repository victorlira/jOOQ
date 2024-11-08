/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class PArrays4 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1085222569;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord> OUT_ARRAY = createParameter("OUT_ARRAY", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public PArrays4() {
		super("P_ARRAYS4", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord value) {
		setValue(IN_ARRAY, value);
	}

	public org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord getOutArray() {
		return getValue(OUT_ARRAY);
	}
}