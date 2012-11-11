/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class ConstraintColumnUsage extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1291860707;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE</code>
	 */
	public static final org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage CONSTRAINT_COLUMN_USAGE = new org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.TABLE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.TABLE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.TABLE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.COLUMN_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE</code> table reference
	 */
	public ConstraintColumnUsage() {
		super("CONSTRAINT_COLUMN_USAGE", org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE</code> table reference
	 */
	public ConstraintColumnUsage(java.lang.String alias) {
		super(alias, org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage as(java.lang.String alias) {
		return new org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage(alias);
	}
}
