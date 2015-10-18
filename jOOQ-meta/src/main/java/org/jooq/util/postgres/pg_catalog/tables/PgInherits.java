/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.8.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgInherits extends TableImpl<Record> {

	private static final long serialVersionUID = -1118829730;

	/**
	 * The reference instance of <code>pg_catalog.pg_inherits</code>
	 */
	public static final PgInherits PG_INHERITS = new PgInherits();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_inherits.inhrelid</code>.
	 */
	public final TableField<Record, Long> INHRELID = createField("inhrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_inherits.inhparent</code>.
	 */
	public final TableField<Record, Long> INHPARENT = createField("inhparent", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_inherits.inhseqno</code>.
	 */
	public final TableField<Record, Integer> INHSEQNO = createField("inhseqno", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>pg_catalog.pg_inherits</code> table reference
	 */
	public PgInherits() {
		this("pg_inherits", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_inherits</code> table reference
	 */
	public PgInherits(String alias) {
		this(alias, PG_INHERITS);
	}

	private PgInherits(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private PgInherits(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgInherits as(String alias) {
		return new PgInherits(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PgInherits rename(String name) {
		return new PgInherits(name, null);
	}
}
