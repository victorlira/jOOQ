/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class SysconglomeratesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.derby.sys.tables.records.SysconglomeratesRecord> {

	private static final long serialVersionUID = 831211574;

	/**
	 * An uncommented item
	 */
	public void setSchemaid(java.lang.String value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.SCHEMAID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSchemaid() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.SCHEMAID);
	}

	/**
	 * An uncommented item
	 */
	public void setTableid(java.lang.String value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.TABLEID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTableid() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.TABLEID);
	}

	/**
	 * An uncommented item
	 */
	public void setConglomeratenumber(java.lang.Long value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.CONGLOMERATENUMBER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Long getConglomeratenumber() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.CONGLOMERATENUMBER);
	}

	/**
	 * An uncommented item
	 */
	public void setConglomeratename(java.lang.String value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.CONGLOMERATENAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConglomeratename() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.CONGLOMERATENAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIsindex(java.lang.Boolean value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.ISINDEX, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Boolean getIsindex() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.ISINDEX);
	}

	/**
	 * An uncommented item
	 */
	public void setDescriptor(java.lang.String value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.DESCRIPTOR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDescriptor() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.DESCRIPTOR);
	}

	/**
	 * An uncommented item
	 */
	public void setIsconstraint(java.lang.Boolean value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.ISCONSTRAINT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Boolean getIsconstraint() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.ISCONSTRAINT);
	}

	/**
	 * An uncommented item
	 */
	public void setConglomerateid(java.lang.String value) {
		setValue(org.jooq.util.derby.sys.tables.Sysconglomerates.CONGLOMERATEID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConglomerateid() {
		return getValue(org.jooq.util.derby.sys.tables.Sysconglomerates.CONGLOMERATEID);
	}

	/**
	 * Create a detached SysconglomeratesRecord
	 */
	public SysconglomeratesRecord() {
		super(org.jooq.util.derby.sys.tables.Sysconglomerates.SYSCONGLOMERATES);
	}
}
