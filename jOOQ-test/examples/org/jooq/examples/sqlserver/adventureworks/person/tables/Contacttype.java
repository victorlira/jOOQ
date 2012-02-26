/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class Contacttype extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord> {

	private static final long serialVersionUID = -1559403733;

	/**
	 * The singleton instance of Person.ContactType
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype CONTACTTYPE = new org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord, java.lang.Integer> CONTACTTYPEID = createField("ContactTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Contacttype() {
		super("ContactType", org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON);
	}

	/**
	 * No further instances allowed
	 */
	private Contacttype(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.PERSON, org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype.CONTACTTYPE);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_CONTACTTYPE;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_CONTACTTYPE_CONTACTTYPEID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContacttypeRecord>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_CONTACTTYPE_CONTACTTYPEID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.Contacttype(alias);
	}
}
