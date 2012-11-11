/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Procedures extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 2081527498;

	/**
	 * The singleton instance of <code>SYSCAT.PROCEDURES</code>
	 */
	public static final org.jooq.util.db2.syscat.tables.Procedures PROCEDURES = new org.jooq.util.db2.syscat.tables.Procedures();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYSCAT.PROCEDURES.PROCSCHEMA</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PROCSCHEMA = createField("PROCSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.PROCNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PROCNAME = createField("PROCNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.SPECIFICNAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFICNAME = createField("SPECIFICNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.PROCEDURE_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PROCEDURE_ID = createField("PROCEDURE_ID", org.jooq.impl.SQLDataType.INTEGER, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.DEFINER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.PARM_COUNT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PARM_COUNT = createField("PARM_COUNT", org.jooq.impl.SQLDataType.SMALLINT, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.PARM_SIGNATURE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PARM_SIGNATURE = createField("PARM_SIGNATURE", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.ORIGIN</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ORIGIN = createField("ORIGIN", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.CREATE_TIME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.DETERMINISTIC</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DETERMINISTIC = createField("DETERMINISTIC", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.FENCED</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> FENCED = createField("FENCED", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.NULLCALL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> NULLCALL = createField("NULLCALL", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.LANGUAGE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.IMPLEMENTATION</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> IMPLEMENTATION = createField("IMPLEMENTATION", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.CLASS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.JAR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> JAR_ID = createField("JAR_ID", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.PARM_STYLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PARM_STYLE = createField("PARM_STYLE", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.CONTAINS_SQL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONTAINS_SQL = createField("CONTAINS_SQL", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.DBINFO</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DBINFO = createField("DBINFO", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.PROGRAM_TYPE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PROGRAM_TYPE = createField("PROGRAM_TYPE", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.RESULT_SETS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> RESULT_SETS = createField("RESULT_SETS", org.jooq.impl.SQLDataType.SMALLINT, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.VALID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> VALID = createField("VALID", org.jooq.impl.SQLDataType.CHAR, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.TEXT_BODY_OFFSET</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TEXT_BODY_OFFSET = createField("TEXT_BODY_OFFSET", org.jooq.impl.SQLDataType.INTEGER, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.TEXT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TEXT = createField("TEXT", org.jooq.impl.SQLDataType.CLOB, PROCEDURES);

	/**
	 * The column <code>SYSCAT.PROCEDURES.REMARKS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, PROCEDURES);

	/**
	 * No further instances allowed
	 */
	private Procedures() {
		super("PROCEDURES", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}
