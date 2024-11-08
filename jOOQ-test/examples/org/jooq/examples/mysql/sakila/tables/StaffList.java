/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class StaffList extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord> {

	private static final long serialVersionUID = -881389626;

	/**
	 * The singleton instance of sakila.staff_list
	 */
	public static final org.jooq.examples.mysql.sakila.tables.StaffList STAFF_LIST = new org.jooq.examples.mysql.sakila.tables.StaffList();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.StaffListRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.Byte> ID = createField("ID", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> ZIP_CODE = createField("zip code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.Byte> SID = createField("SID", org.jooq.impl.SQLDataType.TINYINT, this);

	public StaffList() {
		super("staff_list", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public StaffList(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.StaffList as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.StaffList(alias);
	}
}