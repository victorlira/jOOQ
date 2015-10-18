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
public class PgConstraint extends TableImpl<Record> {

	private static final long serialVersionUID = 1090390727;

	/**
	 * The reference instance of <code>pg_catalog.pg_constraint</code>
	 */
	public static final PgConstraint PG_CONSTRAINT = new PgConstraint();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>pg_catalog.pg_constraint.conname</code>.
	 */
	public final TableField<Record, String> CONNAME = createField("conname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.connamespace</code>.
	 */
	public final TableField<Record, Long> CONNAMESPACE = createField("connamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.contype</code>.
	 */
	public final TableField<Record, String> CONTYPE = createField("contype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.condeferrable</code>.
	 */
	public final TableField<Record, Boolean> CONDEFERRABLE = createField("condeferrable", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.condeferred</code>.
	 */
	public final TableField<Record, Boolean> CONDEFERRED = createField("condeferred", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.convalidated</code>.
	 */
	public final TableField<Record, Boolean> CONVALIDATED = createField("convalidated", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conrelid</code>.
	 */
	public final TableField<Record, Long> CONRELID = createField("conrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.contypid</code>.
	 */
	public final TableField<Record, Long> CONTYPID = createField("contypid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conindid</code>.
	 */
	public final TableField<Record, Long> CONINDID = createField("conindid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.confrelid</code>.
	 */
	public final TableField<Record, Long> CONFRELID = createField("confrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.confupdtype</code>.
	 */
	public final TableField<Record, String> CONFUPDTYPE = createField("confupdtype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.confdeltype</code>.
	 */
	public final TableField<Record, String> CONFDELTYPE = createField("confdeltype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.confmatchtype</code>.
	 */
	public final TableField<Record, String> CONFMATCHTYPE = createField("confmatchtype", org.jooq.impl.SQLDataType.CHAR.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conislocal</code>.
	 */
	public final TableField<Record, Boolean> CONISLOCAL = createField("conislocal", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.coninhcount</code>.
	 */
	public final TableField<Record, Integer> CONINHCOUNT = createField("coninhcount", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.connoinherit</code>.
	 */
	public final TableField<Record, Boolean> CONNOINHERIT = createField("connoinherit", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conkey</code>.
	 */
	public final TableField<Record, Short[]> CONKEY = createField("conkey", org.jooq.impl.SQLDataType.SMALLINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.confkey</code>.
	 */
	public final TableField<Record, Short[]> CONFKEY = createField("confkey", org.jooq.impl.SQLDataType.SMALLINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conpfeqop</code>.
	 */
	public final TableField<Record, Long[]> CONPFEQOP = createField("conpfeqop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conppeqop</code>.
	 */
	public final TableField<Record, Long[]> CONPPEQOP = createField("conppeqop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conffeqop</code>.
	 */
	public final TableField<Record, Long[]> CONFFEQOP = createField("conffeqop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conexclop</code>.
	 */
	public final TableField<Record, Long[]> CONEXCLOP = createField("conexclop", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.conbin</code>.
	 */
	public final TableField<Record, Object> CONBIN = createField("conbin", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_node_tree"), this, "");

	/**
	 * The column <code>pg_catalog.pg_constraint.consrc</code>.
	 */
	public final TableField<Record, String> CONSRC = createField("consrc", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>pg_catalog.pg_constraint</code> table reference
	 */
	public PgConstraint() {
		this("pg_constraint", null);
	}

	/**
	 * Create an aliased <code>pg_catalog.pg_constraint</code> table reference
	 */
	public PgConstraint(String alias) {
		this(alias, PG_CONSTRAINT);
	}

	private PgConstraint(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private PgConstraint(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, PgCatalog.PG_CATALOG, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PgConstraint as(String alias) {
		return new PgConstraint(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PgConstraint rename(String name) {
		return new PgConstraint(name, null);
	}
}
