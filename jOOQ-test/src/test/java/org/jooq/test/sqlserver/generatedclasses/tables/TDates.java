/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDates extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = 1456239246;

	/**
	 * The singleton instance of <code>dbo.t_dates</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TDates T_DATES = new org.jooq.test.sqlserver.generatedclasses.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord.class;
	}

	/**
	 * The column <code>dbo.t_dates.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.t_dates.d</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Date> D = createField("d", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>dbo.t_dates.t</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Time> T = createField("t", org.jooq.impl.SQLDataType.TIME, this, "");

	/**
	 * The column <code>dbo.t_dates.ts</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("ts", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>dbo.t_dates.ts_tz</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Date> TS_TZ = createField("ts_tz", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>dbo.t_dates.d_int</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("d_int", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dbo.t_dates.ts_bigint</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("ts_bigint", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dbo.t_dates.offset1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.lang.String> OFFSET1 = createField("offset1", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>dbo.t_dates.offset2</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> OFFSET2 = createField("offset2", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>dbo.t_dates.offset3</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Date> OFFSET3 = createField("offset3", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>dbo.t_dates</code> table reference
	 */
	public TDates() {
		this("t_dates", null);
	}

	/**
	 * Create an aliased <code>dbo.t_dates</code> table reference
	 */
	public TDates(java.lang.String alias) {
		this(alias, org.jooq.test.sqlserver.generatedclasses.tables.TDates.T_DATES);
	}

	private TDates(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> aliased) {
		this(alias, aliased, null);
	}

	private TDates(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_DATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TDates as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TDates(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.TDates rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TDates(name, null);
	}
}
