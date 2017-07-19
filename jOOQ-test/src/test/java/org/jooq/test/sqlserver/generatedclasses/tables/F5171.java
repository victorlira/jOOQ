/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F5171 extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record> {

	private static final long serialVersionUID = -1515157417;

	/**
	 * The singleton instance of <code>dbo.f5171</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.F5171 F5171 = new org.jooq.test.sqlserver.generatedclasses.tables.F5171();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record.class;
	}

	/**
	 * The column <code>dbo.f5171.book_id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record, java.lang.Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dbo.f5171.book_title</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record, java.lang.String> BOOK_TITLE = createField("book_title", org.jooq.impl.SQLDataType.VARCHAR.length(400), this, "");

	/**
	 * The column <code>dbo.f5171.strings_column_value</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record, java.lang.String> STRINGS_COLUMN_VALUE = createField("strings_column_value", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>dbo.f5171.numbers_column_value</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record, java.lang.Integer> NUMBERS_COLUMN_VALUE = createField("numbers_column_value", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dbo.f5171.number_longs_column_value</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record, java.lang.Long> NUMBER_LONGS_COLUMN_VALUE = createField("number_longs_column_value", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dbo.f5171.dates_column_value</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record, java.sql.Date> DATES_COLUMN_VALUE = createField("dates_column_value", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * Create a <code>dbo.f5171</code> table reference
	 */
	public F5171() {
		this("f5171", null);
	}

	/**
	 * Create an aliased <code>dbo.f5171</code> table reference
	 */
	public F5171(java.lang.String alias) {
		this(alias, org.jooq.test.sqlserver.generatedclasses.tables.F5171.F5171);
	}

	private F5171(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record> aliased) {
		this(alias, aliased, null);
	}

	private F5171(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.F5171Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.F5171 as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.F5171(alias, this, parameters);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.F5171 rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.F5171(name, null, parameters);
	}

	/**
	 * Call this table-valued function
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.F5171 call(java.lang.Object books, java.lang.Object strings, java.lang.Object numbers, java.lang.Object numbersLong, java.lang.Object dates) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.F5171(getName(), null, new org.jooq.Field[] { org.jooq.impl.DSL.val(books), org.jooq.impl.DSL.val(strings), org.jooq.impl.DSL.val(numbers), org.jooq.impl.DSL.val(numbersLong), org.jooq.impl.DSL.val(dates) });
	}

	/**
	 * Call this table-valued function
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.F5171 call(org.jooq.Field<java.lang.Object> books, org.jooq.Field<java.lang.Object> strings, org.jooq.Field<java.lang.Object> numbers, org.jooq.Field<java.lang.Object> numbersLong, org.jooq.Field<java.lang.Object> dates) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.F5171(getName(), null, new org.jooq.Field[] { books, strings, numbers, numbersLong, dates });
	}
}
