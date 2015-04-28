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
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85 extends TableImpl<XTestCase_85Record> {

	private static final long serialVersionUID = 1162253001;

	/**
	 * The reference instance of <code>TEST.X_TEST_CASE_85</code>
	 */
	public static final XTestCase_85 X_TEST_CASE_85 = new XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_85Record> getRecordType() {
		return XTestCase_85Record.class;
	}

	/**
	 * The column <code>TEST.X_TEST_CASE_85.ID</code>.
	 */
	public static final TableField<XTestCase_85Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85, "");

	/**
	 * The column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>.
	 */
	public static final TableField<XTestCase_85Record, Integer> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85, "");

	/**
	 * The column <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>.
	 */
	public static final TableField<XTestCase_85Record, String> X_UNUSED_NAME = createField("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_TEST_CASE_85, "");

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		this("X_TEST_CASE_85", null);
	}

	private XTestCase_85(String alias, Table<XTestCase_85Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_85(String alias, Table<XTestCase_85Record> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<XTestCase_85Record> getPrimaryKey() {
		return Keys.PK_X_TEST_CASE_85;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<XTestCase_85Record>> getKeys() {
		return Arrays.<UniqueKey<XTestCase_85Record>>asList(Keys.PK_X_TEST_CASE_85);
	}
}
