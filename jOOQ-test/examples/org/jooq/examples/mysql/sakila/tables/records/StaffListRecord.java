/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class StaffListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord> {

	private static final long serialVersionUID = -175503462;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ADDRESS);
	}

	/**
	 * An uncommented item
	 */
	public void setZipCode(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ZIP_CODE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getZipCode() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.ZIP_CODE);
	}

	/**
	 * An uncommented item
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.PHONE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.PHONE);
	}

	/**
	 * An uncommented item
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.CITY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.CITY);
	}

	/**
	 * An uncommented item
	 */
	public void setCountry(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.COUNTRY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCountry() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.COUNTRY);
	}

	/**
	 * An uncommented item
	 */
	public void setSid(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.SID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getSid() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST.SID);
	}

	/**
	 * Create a detached StaffListRecord
	 */
	public StaffListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST);
	}
}