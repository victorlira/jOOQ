/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class StringRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord> {

	private static final long serialVersionUID = -1872086834;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.String.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.String.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setOther(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.String.OTHER, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getOther() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.String.OTHER);
	}

	/**
	 * Create a detached StringRecord
	 */
	public StringRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING);
	}

	/**
	 * Create an attached StringRecord
	 * @deprecated - (#363) use the other constructor instead
	 */
	@Deprecated
	public StringRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING, configuration);
	}
}
