/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class DiffPlanCursor extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = 1199657581;

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DIFF_PLAN_CURSOR.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DIFF_PLAN_CURSOR.SQL_ID</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> SQL_ID = createParameter("SQL_ID", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DIFF_PLAN_CURSOR.CURSOR_CHILD_NUM1</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> CURSOR_CHILD_NUM1 = createParameter("CURSOR_CHILD_NUM1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DIFF_PLAN_CURSOR.CURSOR_CHILD_NUM2</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> CURSOR_CHILD_NUM2 = createParameter("CURSOR_CHILD_NUM2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public DiffPlanCursor() {
		super("DIFF_PLAN_CURSOR", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(SQL_ID);
		addInParameter(CURSOR_CHILD_NUM1);
		addInParameter(CURSOR_CHILD_NUM2);
	}

	/**
	 * Set the <code>SQL_ID</code> parameter IN value to the routine
	 */
	public void setSqlId(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor.SQL_ID, value);
	}

	/**
	 * Set the <code>SQL_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSqlId(org.jooq.Field<java.lang.String> field) {
		setField(SQL_ID, field);
	}

	/**
	 * Set the <code>CURSOR_CHILD_NUM1</code> parameter IN value to the routine
	 */
	public void setCursorChildNum1(java.lang.Number value) {
		setNumber(org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor.CURSOR_CHILD_NUM1, value);
	}

	/**
	 * Set the <code>CURSOR_CHILD_NUM1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setCursorChildNum1(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(CURSOR_CHILD_NUM1, field);
	}

	/**
	 * Set the <code>CURSOR_CHILD_NUM2</code> parameter IN value to the routine
	 */
	public void setCursorChildNum2(java.lang.Number value) {
		setNumber(org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlanCursor.CURSOR_CHILD_NUM2, value);
	}

	/**
	 * Set the <code>CURSOR_CHILD_NUM2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setCursorChildNum2(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(CURSOR_CHILD_NUM2, field);
	}
}
