/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_785Record> {

	private static final long serialVersionUID = -678493997;

	/**
	 * The singleton instance of <code>TEST.T_785</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_785 T_785 = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_785Record> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_785Record.class;
	}

	/**
	 * The column <code>TEST.T_785.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_785Record, java.math.BigDecimal> ID = createField("ID", org.jooq.impl.SQLDataType.NUMERIC, T_785);

	/**
	 * The column <code>TEST.T_785.NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_785Record, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, T_785);

	/**
	 * The column <code>TEST.T_785.VALUE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_785Record, java.lang.String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR, T_785);

	/**
	 * No further instances allowed
	 */
	private T_785() {
		super("T_785", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}
