/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.Keys;
import org.jooq.test.jdbcoracle.generatedclasses.test.Test;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArrays extends TableImpl<TArraysRecord> {

	private static final long serialVersionUID = -1874516282;

	/**
	 * The reference instance of <code>TEST.T_ARRAYS</code>
	 */
	public static final TArrays T_ARRAYS = new TArrays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TArraysRecord> getRecordType() {
		return TArraysRecord.class;
	}

	/**
	 * The column <code>TEST.T_ARRAYS.ID</code>.
	 */
	public static final TableField<TArraysRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_ARRAYS, "");

	/**
	 * The column <code>TEST.T_ARRAYS.STRING_ARRAY</code>.
	 */
	public static final TableField<TArraysRecord, Object> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS, "");

	/**
	 * The column <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	public static final TableField<TArraysRecord, Object> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS, "");

	/**
	 * The column <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>.
	 */
	public static final TableField<TArraysRecord, Object> NUMBER_LONG_ARRAY = createField("NUMBER_LONG_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS, "");

	/**
	 * The column <code>TEST.T_ARRAYS.DATE_ARRAY</code>.
	 */
	public static final TableField<TArraysRecord, Object> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.OTHER, T_ARRAYS, "");

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		this("T_ARRAYS", null);
	}

	private TArrays(String alias, Table<TArraysRecord> aliased) {
		this(alias, aliased, null);
	}

	private TArrays(String alias, Table<TArraysRecord> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TArraysRecord> getPrimaryKey() {
		return Keys.PK_T_ARRAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TArraysRecord>> getKeys() {
		return Arrays.<UniqueKey<TArraysRecord>>asList(Keys.PK_T_ARRAYS);
	}
}
