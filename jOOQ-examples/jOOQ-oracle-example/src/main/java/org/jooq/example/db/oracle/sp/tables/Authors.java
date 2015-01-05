/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.sp.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.db.oracle.sp.Keys;
import org.jooq.example.db.oracle.sp.Sp;
import org.jooq.example.db.oracle.sp.tables.records.AuthorsRecord;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Authors extends TableImpl<AuthorsRecord> {

	private static final long serialVersionUID = -223964551;

	/**
	 * The reference instance of <code>SP.AUTHORS</code>
	 */
	public static final Authors AUTHORS = new Authors();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AuthorsRecord> getRecordType() {
		return AuthorsRecord.class;
	}

	/**
	 * The column <code>SP.AUTHORS.ID</code>.
	 */
	public final TableField<AuthorsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>SP.AUTHORS.FIRST_NAME</code>.
	 */
	public final TableField<AuthorsRecord, String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>SP.AUTHORS.LAST_NAME</code>.
	 */
	public final TableField<AuthorsRecord, String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * Create a <code>SP.AUTHORS</code> table reference
	 */
	public Authors() {
		this("AUTHORS", null);
	}

	/**
	 * Create an aliased <code>SP.AUTHORS</code> table reference
	 */
	public Authors(String alias) {
		this(alias, AUTHORS);
	}

	private Authors(String alias, Table<AuthorsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Authors(String alias, Table<AuthorsRecord> aliased, Field<?>[] parameters) {
		super(alias, Sp.SP, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AuthorsRecord> getPrimaryKey() {
		return Keys.SYS_C0018818;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AuthorsRecord>> getKeys() {
		return Arrays.<UniqueKey<AuthorsRecord>>asList(Keys.SYS_C0018818);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Authors as(String alias) {
		return new Authors(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Authors rename(String name) {
		return new Authors(name, null);
	}
}
