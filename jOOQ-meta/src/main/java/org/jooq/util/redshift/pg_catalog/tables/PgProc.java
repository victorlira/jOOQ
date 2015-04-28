/**
 * This class is generated by jOOQ
 */
package org.jooq.util.redshift.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.redshift.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgProc extends TableImpl<Record> {

	private static final long serialVersionUID = -917229642;

	/**
	 * The reference instance of <code>pg_catalog.pg_proc</code>
	 */
	public static final PgProc PG_PROC = new PgProc();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_proc.proname</code>.
	 */
	public final TableField<Record, String> PRONAME = createField("proname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.pronamespace</code>.
	 */
	public final TableField<Record, Long> PRONAMESPACE = createField("pronamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proowner</code>.
	 */
	public final TableField<Record, Integer> PROOWNER = createField("proowner", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prolang</code>.
	 */
	public final TableField<Record, Long> PROLANG = createField("prolang", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proisagg</code>.
	 */
	public final TableField<Record, Boolean> PROISAGG = createField("proisagg", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prosecdef</code>.
	 */
	public final TableField<Record, Boolean> PROSECDEF = createField("prosecdef", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proisstrict</code>.
	 */
	public final TableField<Record, Boolean> PROISSTRICT = createField("proisstrict", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proretset</code>.
	 */
	public final TableField<Record, Boolean> PRORETSET = createField("proretset", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.provolatile</code>.
	 */
	public final TableField<Record, String> PROVOLATILE = createField("provolatile", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.pronargs</code>.
	 */
	public final TableField<Record, Short> PRONARGS = createField("pronargs", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prorettype</code>.
	 */
	public final TableField<Record, Long> PRORETTYPE = createField("prorettype", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proargtypes</code>.
	 */
	public final TableField<Record, Long> PROARGTYPES = createField("proargtypes", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proargnames</code>.
	 */
	public final TableField<Record, String[]> PROARGNAMES = createField("proargnames", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.prosrc</code>.
	 */
	public final TableField<Record, String> PROSRC = createField("prosrc", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.probin</code>.
	 */
	public final TableField<Record, byte[]> PROBIN = createField("probin", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>pg_catalog.pg_proc.proacl</code>.
	 */
	public final TableField<Record, String[]> PROACL = createField("proacl", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>pg_catalog.pg_proc</code> table reference
	 */
	public PgProc() {
		this("pg_proc", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_proc</code> table reference
	 */
	public PgProc(String alias) {
		this(alias, PG_PROC);
	}

	private PgProc(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private PgProc(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgProc as(String alias) {
		return new PgProc(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PgProc rename(String name) {
		return new PgProc(name, null);
	}
}
