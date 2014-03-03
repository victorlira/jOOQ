/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3090A extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord> {

	private static final long serialVersionUID = -1457760719;

	/**
	 * The singleton instance of <code>dbo.t_3090_a</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.T_3090A T_3090_A = new org.jooq.test.sqlserver.generatedclasses.tables.T_3090A();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord.class;
	}

	/**
	 * The column <code>dbo.t_3090_a.id1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord, java.lang.Integer> ID1 = createField("id1", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.t_3090_a.id2</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord, java.lang.Integer> ID2 = createField("id2", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dbo.t_3090_a.data</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord, java.lang.Integer> DATA = createField("data", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>dbo.t_3090_a</code> table reference
	 */
	public T_3090A() {
		this("t_3090_a", null);
	}

	/**
	 * Create an aliased <code>dbo.t_3090_a</code> table reference
	 */
	public T_3090A(java.lang.String alias) {
		this(alias, org.jooq.test.sqlserver.generatedclasses.tables.T_3090A.T_3090_A);
	}

	private T_3090A(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord> aliased) {
		this(alias, aliased, null);
	}

	private T_3090A(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_3090_A;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3090ARecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_3090_A);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.T_3090A as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.T_3090A(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.T_3090A rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.T_3090A(name, null);
	}
}
