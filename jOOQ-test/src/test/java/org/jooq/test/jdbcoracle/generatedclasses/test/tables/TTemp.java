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
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TTempRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTemp extends TableImpl<TTempRecord> {

	private static final long serialVersionUID = 2019406484;

	/**
	 * The reference instance of <code>TEST.T_TEMP</code>
	 */
	public static final TTemp T_TEMP = new TTemp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TTempRecord> getRecordType() {
		return TTempRecord.class;
	}

	/**
	 * The column <code>TEST.T_TEMP.ID</code>.
	 */
	public static final TableField<TTempRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_TEMP, "");

	/**
	 * No further instances allowed
	 */
	private TTemp() {
		this("T_TEMP", null);
	}

	private TTemp(String alias, Table<TTempRecord> aliased) {
		this(alias, aliased, null);
	}

	private TTemp(String alias, Table<TTempRecord> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TTempRecord> getPrimaryKey() {
		return Keys.PK_T_TEMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TTempRecord>> getKeys() {
		return Arrays.<UniqueKey<TTempRecord>>asList(Keys.PK_T_TEMP);
	}
}
