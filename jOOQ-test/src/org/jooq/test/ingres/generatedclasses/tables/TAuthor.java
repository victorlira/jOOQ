/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings("all")
public class TAuthor extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 1636372592;

	/**
	 * The singleton instance of <code>test.t_author</code>
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.ingres.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>test.t_author.id</code>. The author ID
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>test.t_author.first_name</code>. The author's first name
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * The column <code>test.t_author.last_name</code>. The author's last name
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * The column <code>test.t_author.date_of_birth</code>. The author's date of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * The column <code>test.t_author.year_of_birth</code>. The author's year of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>test.t_author.address</code>. The author's address
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("t_author", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_T_AUTHOR);
	}
}
