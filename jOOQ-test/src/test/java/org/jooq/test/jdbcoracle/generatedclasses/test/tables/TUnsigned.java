/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;


import java.math.BigInteger;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.Test;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TUnsignedRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned extends TableImpl<TUnsignedRecord> {

	private static final long serialVersionUID = -919527158;

	/**
	 * The reference instance of <code>TEST.T_UNSIGNED</code>
	 */
	public static final TUnsigned T_UNSIGNED = new TUnsigned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TUnsignedRecord> getRecordType() {
		return TUnsignedRecord.class;
	}

	/**
	 * The column <code>TEST.T_UNSIGNED.U_BYTE</code>.
	 */
	public static final TableField<TUnsignedRecord, Short> U_BYTE = createField("U_BYTE", org.jooq.impl.SQLDataType.SMALLINT, T_UNSIGNED, "");

	/**
	 * The column <code>TEST.T_UNSIGNED.U_SHORT</code>.
	 */
	public static final TableField<TUnsignedRecord, Integer> U_SHORT = createField("U_SHORT", org.jooq.impl.SQLDataType.INTEGER, T_UNSIGNED, "");

	/**
	 * The column <code>TEST.T_UNSIGNED.U_INT</code>.
	 */
	public static final TableField<TUnsignedRecord, Long> U_INT = createField("U_INT", org.jooq.impl.SQLDataType.BIGINT, T_UNSIGNED, "");

	/**
	 * The column <code>TEST.T_UNSIGNED.U_LONG</code>.
	 */
	public static final TableField<TUnsignedRecord, BigInteger> U_LONG = createField("U_LONG", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(20), T_UNSIGNED, "");

	/**
	 * No further instances allowed
	 */
	private TUnsigned() {
		this("T_UNSIGNED", null);
	}

	private TUnsigned(String alias, Table<TUnsignedRecord> aliased) {
		this(alias, aliased, null);
	}

	private TUnsigned(String alias, Table<TUnsignedRecord> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "");
	}
}
