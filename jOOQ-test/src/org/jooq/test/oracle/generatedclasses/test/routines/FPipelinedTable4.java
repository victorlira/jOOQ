/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class FPipelinedTable4 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> {

	private static final long serialVersionUID = 617379728;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FPipelinedTable4() {
		super("F_PIPELINED_TABLE4", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

		setReturnParameter(RETURN_VALUE);
	}
}