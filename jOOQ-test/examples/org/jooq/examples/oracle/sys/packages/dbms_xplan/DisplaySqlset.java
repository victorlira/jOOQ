/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class DisplaySqlset extends org.jooq.impl.AbstractRoutine<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> {

	private static final long serialVersionUID = 1764291088;

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE.getDataType().asArrayDataType(org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord.class));

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET.SQLSET_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> SQLSET_NAME = createParameter("SQLSET_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET.SQL_ID</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> SQL_ID = createParameter("SQL_ID", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET.PLAN_HASH_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigInteger> PLAN_HASH_VALUE = createParameter("PLAN_HASH_VALUE", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, true);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET.FORMAT</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = createParameter("FORMAT", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The parameter <code>SYS.DBMS_XPLAN.DISPLAY_SQLSET.SQLSET_OWNER</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> SQLSET_OWNER = createParameter("SQLSET_OWNER", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * Create a new routine call instance
	 */
	public DisplaySqlset() {
		super("DISPLAY_SQLSET", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE.getDataType().asArrayDataType(org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeTableRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(SQLSET_NAME);
		addInParameter(SQL_ID);
		addInParameter(PLAN_HASH_VALUE);
		addInParameter(FORMAT);
		addInParameter(SQLSET_OWNER);
	}

	/**
	 * Set the <code>SQLSET_NAME</code> parameter IN value to the routine
	 */
	public void setSqlsetName(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset.SQLSET_NAME, value);
	}

	/**
	 * Set the <code>SQLSET_NAME</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSqlsetName(org.jooq.Field<java.lang.String> field) {
		setField(SQLSET_NAME, field);
	}

	/**
	 * Set the <code>SQL_ID</code> parameter IN value to the routine
	 */
	public void setSqlId(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset.SQL_ID, value);
	}

	/**
	 * Set the <code>SQL_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSqlId(org.jooq.Field<java.lang.String> field) {
		setField(SQL_ID, field);
	}

	/**
	 * Set the <code>PLAN_HASH_VALUE</code> parameter IN value to the routine
	 */
	public void setPlanHashValue(java.math.BigInteger value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset.PLAN_HASH_VALUE, value);
	}

	/**
	 * Set the <code>PLAN_HASH_VALUE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPlanHashValue(org.jooq.Field<java.math.BigInteger> field) {
		setField(PLAN_HASH_VALUE, field);
	}

	/**
	 * Set the <code>FORMAT</code> parameter IN value to the routine
	 */
	public void setFormat(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset.FORMAT, value);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setFormat(org.jooq.Field<java.lang.String> field) {
		setField(FORMAT, field);
	}

	/**
	 * Set the <code>SQLSET_OWNER</code> parameter IN value to the routine
	 */
	public void setSqlsetOwner(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DisplaySqlset.SQLSET_OWNER, value);
	}

	/**
	 * Set the <code>SQLSET_OWNER</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSqlsetOwner(org.jooq.Field<java.lang.String> field) {
		setField(SQLSET_OWNER, field);
	}
}
