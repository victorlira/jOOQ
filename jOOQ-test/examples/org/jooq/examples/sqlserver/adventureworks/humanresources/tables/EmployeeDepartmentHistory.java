/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
public class EmployeeDepartmentHistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory> {

	private static final long serialVersionUID = 563649045;

	/**
	 * The singleton instance of HumanResources.EmployeeDepartmentHistory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeDepartmentHistory EmployeeDepartmentHistory = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeDepartmentHistory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_EmployeeDepartmentHistory_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_EmployeeDepartmentHistory_Department_DepartmentID
	 * FOREIGN KEY (DepartmentID)
	 * REFERENCES HumanResources.Department (DepartmentID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, java.lang.Short> DepartmentID = createField("DepartmentID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_EmployeeDepartmentHistory_Shift_ShiftID
	 * FOREIGN KEY (ShiftID)
	 * REFERENCES HumanResources.Shift (ShiftID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, java.lang.Byte> ShiftID = createField("ShiftID", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, java.sql.Timestamp> StartDate = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, java.sql.Timestamp> EndDate = createField("EndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public EmployeeDepartmentHistory() {
		super("EmployeeDepartmentHistory", org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources);
	}

	public EmployeeDepartmentHistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeDepartmentHistory.EmployeeDepartmentHistory);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeeDepartmentHistory_EmployeeID_StartDate_DepartmentID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeeDepartmentHistory_EmployeeID_StartDate_DepartmentID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeDepartmentHistory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_EmployeeDepartmentHistory_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_EmployeeDepartmentHistory_Department_DepartmentID, org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_EmployeeDepartmentHistory_Shift_ShiftID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeDepartmentHistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeDepartmentHistory(alias);
	}
}
