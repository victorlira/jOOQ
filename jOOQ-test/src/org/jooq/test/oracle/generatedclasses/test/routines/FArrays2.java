/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FArrays2 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> {

	private static final long serialVersionUID = 1077133708;

	/**
	 * The parameter <code>TEST.F_ARRAYS2.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord.class));

	/**
	 * The parameter <code>TEST.F_ARRAYS2.IN_ARRAY</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FArrays2() {
		super("F_ARRAYS2", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.FArrays2.IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInArray(org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> field) {
		setField(IN_ARRAY, field);
	}
}
