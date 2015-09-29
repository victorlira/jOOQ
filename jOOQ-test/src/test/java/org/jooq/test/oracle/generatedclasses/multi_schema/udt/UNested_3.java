/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.udt;


import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.records.UNested_2Record;
import org.jooq.test.oracle.generatedclasses.multi_schema.udt.records.UNested_3Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UNested_3 extends UDTImpl<UNested_3Record> {

	private static final long serialVersionUID = -227065696;

	/**
	 * The reference instance of <code>MULTI_SCHEMA.U_NESTED_3</code>
	 */
	public static final UNested_3 U_NESTED_3 = new UNested_3();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UNested_3Record> getRecordType() {
		return UNested_3Record.class;
	}

	/**
	 * The attribute <code>MULTI_SCHEMA.U_NESTED_3.ID</code>.
	 */
	public static final UDTField<UNested_3Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, U_NESTED_3, "");

	/**
	 * The attribute <code>MULTI_SCHEMA.U_NESTED_3.NESTED</code>.
	 */
	public static final UDTField<UNested_3Record, UNested_2Record> NESTED = createField("NESTED", org.jooq.test.oracle.generatedclasses.multi_schema.udt.UNested_1.U_NESTED_1.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.multi_schema.udt.records.UNested_2Record.class), U_NESTED_3, "");

	/**
	 * No further instances allowed
	 */
	private UNested_3() {
		super("U_NESTED_3", MultiSchema.MULTI_SCHEMA);

		// Initialise data type
		getDataType();
	}
}
