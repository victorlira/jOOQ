/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PArrays4 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1958081166;

	/**
	 * The parameter <code>TEST.P_ARRAYS4.IN_ARRAY</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord.class));

	/**
	 * The parameter <code>TEST.P_ARRAYS4.OUT_ARRAY</code>.
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
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.PArrays4.IN_ARRAY, value);
	}

	/**
	 * Get the <code>OUT_ARRAY</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UBookArrayRecord getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
