/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Sysdomain extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 794707198;

	/**
	 * The singleton instance of <code>SYS.SYSDOMAIN</code>
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysdomain SYSDOMAIN = new org.jooq.util.sybase.sys.tables.Sysdomain();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.SYSDOMAIN.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>SYS.SYSDOMAIN.domain_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The column <code>SYS.SYSDOMAIN.type_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>SYS.SYSDOMAIN.precision</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PRECISION = createField("precision", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * Create a <code>SYS.SYSDOMAIN</code> table reference
	 */
	public Sysdomain() {
		super("SYSDOMAIN", org.jooq.util.sybase.sys.Sys.SYS);
	}

	/**
	 * Create an aliased <code>SYS.SYSDOMAIN</code> table reference
	 */
	public Sysdomain(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Sysdomain.SYSDOMAIN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.sybase.sys.tables.Sysdomain as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Sysdomain(alias);
	}
}
