/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
public class Vjobcandidate extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord> {

	private static final long serialVersionUID = 1979215273;

	/**
	 * The singleton instance of HumanResources.vJobCandidate
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidate VJOBCANDIDATE = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidate();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.Integer> JOBCANDIDATEID = createField("JobCandidateID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.Integer> EMPLOYEEID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> NAME_PREFIX = createField("Name.Prefix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> NAME_FIRST = createField("Name.First", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> NAME_MIDDLE = createField("Name.Middle", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> NAME_LAST = createField("Name.Last", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> NAME_SUFFIX = createField("Name.Suffix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> SKILLS = createField("Skills", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> ADDR_TYPE = createField("Addr.Type", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> ADDR_LOC_COUNTRYREGION = createField("Addr.Loc.CountryRegion", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> ADDR_LOC_STATE = createField("Addr.Loc.State", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> ADDR_LOC_CITY = createField("Addr.Loc.City", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> ADDR_POSTALCODE = createField("Addr.PostalCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> EMAIL = createField("EMail", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.String> WEBSITE = createField("WebSite", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Vjobcandidate() {
		super("vJobCandidate", org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES);
	}

	/**
	 * No further instances allowed
	 */
	private Vjobcandidate(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.Humanresources.HUMANRESOURCES, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidate.VJOBCANDIDATE);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.VjobcandidateRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.IDENTITY_VJOBCANDIDATE;
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidate as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Vjobcandidate(alias);
	}
}
