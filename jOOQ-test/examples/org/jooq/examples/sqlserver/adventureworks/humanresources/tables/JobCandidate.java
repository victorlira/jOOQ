/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class JobCandidate extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate> {

	private static final long serialVersionUID = -625291346;

	/**
	 * The singleton instance of <code>HumanResources.JobCandidate</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate JobCandidate = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate.class;
	}

	/**
	 * The column <code>HumanResources.JobCandidate.JobCandidateID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Integer> JobCandidateID = createField("JobCandidateID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>HumanResources.JobCandidate.EmployeeID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>HumanResources.JobCandidate.Resume</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Object> Resume = createField("Resume", org.jooq.impl.DefaultDataType.getDefaultDataType("xml"), this);

	/**
	 * The column <code>HumanResources.JobCandidate.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>HumanResources.JobCandidate</code> table reference
	 */
	public JobCandidate() {
		super("JobCandidate", org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources);
	}

	/**
	 * Create an aliased <code>HumanResources.JobCandidate</code> table reference
	 */
	public JobCandidate(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate.JobCandidate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.IDENTITY_JobCandidate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_JobCandidate_JobCandidateID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_JobCandidate_JobCandidateID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.JobCandidate, ?>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_JobCandidate_Employee_EmployeeID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.JobCandidate(alias);
	}
}
