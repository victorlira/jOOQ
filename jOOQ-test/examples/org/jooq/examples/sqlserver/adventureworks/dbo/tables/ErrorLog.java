/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ErrorLog extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog> {

	private static final long serialVersionUID = -259079385;

	/**
	 * The singleton instance of <code>dbo.ErrorLog</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog ErrorLog = new org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog.class;
	}

	/**
	 * The column <code>dbo.ErrorLog.ErrorLogID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.Integer> ErrorLogID = createField("ErrorLogID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.ErrorLog.ErrorTime</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.sql.Timestamp> ErrorTime = createField("ErrorTime", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dbo.ErrorLog.UserName</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.String> UserName = createField("UserName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>dbo.ErrorLog.ErrorNumber</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.Integer> ErrorNumber = createField("ErrorNumber", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.ErrorLog.ErrorSeverity</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.Integer> ErrorSeverity = createField("ErrorSeverity", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.ErrorLog.ErrorState</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.Integer> ErrorState = createField("ErrorState", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.ErrorLog.ErrorProcedure</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.String> ErrorProcedure = createField("ErrorProcedure", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>dbo.ErrorLog.ErrorLine</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.Integer> ErrorLine = createField("ErrorLine", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.ErrorLog.ErrorMessage</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.String> ErrorMessage = createField("ErrorMessage", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * Create a <code>dbo.ErrorLog</code> table reference
	 */
	public ErrorLog() {
		super("ErrorLog", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);
	}

	/**
	 * Create an aliased <code>dbo.ErrorLog</code> table reference
	 */
	public ErrorLog(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo, org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog.ErrorLog);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.IDENTITY_ErrorLog;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_ErrorLog_ErrorLogID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorLog>>asList(org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_ErrorLog_ErrorLogID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.dbo.tables.ErrorLog(alias);
	}
}
