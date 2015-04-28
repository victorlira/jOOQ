/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.jdbcoracle.generatedclasses.multi_schema.Keys;
import org.jooq.test.jdbcoracle.generatedclasses.multi_schema.MultiSchema;
import org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records.TAuthorRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthor extends TableImpl<TAuthorRecord> {

	private static final long serialVersionUID = -894166198;

	/**
	 * The reference instance of <code>MULTI_SCHEMA.T_AUTHOR</code>
	 */
	public static final TAuthor T_AUTHOR = new TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TAuthorRecord> getRecordType() {
		return TAuthorRecord.class;
	}

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.ID</code>.
	 */
	public static final TableField<TAuthorRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR, "");

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>.
	 */
	public static final TableField<TAuthorRecord, String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR, "");

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>.
	 */
	public static final TableField<TAuthorRecord, String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR, "");

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public static final TableField<TAuthorRecord, Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, T_AUTHOR, "");

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public static final TableField<TAuthorRecord, Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR, "");

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>.
	 */
	public static final TableField<TAuthorRecord, Object> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.OTHER, T_AUTHOR, "");

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		this("T_AUTHOR", null);
	}

	private TAuthor(String alias, Table<TAuthorRecord> aliased) {
		this(alias, aliased, null);
	}

	private TAuthor(String alias, Table<TAuthorRecord> aliased, Field<?>[] parameters) {
		super(alias, MultiSchema.MULTI_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TAuthorRecord> getPrimaryKey() {
		return Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TAuthorRecord>> getKeys() {
		return Arrays.<UniqueKey<TAuthorRecord>>asList(Keys.PK_T_AUTHOR);
	}
}
