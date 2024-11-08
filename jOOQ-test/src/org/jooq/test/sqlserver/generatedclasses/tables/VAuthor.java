/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1420545077;

	/**
	 * The singleton instance of dbo.v_author
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.sqlserver.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, this);

	public VAuthor() {
		super("v_author", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	public VAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.VAuthor.V_AUTHOR);
	}

	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.VAuthor as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.VAuthor(alias);
	}
}