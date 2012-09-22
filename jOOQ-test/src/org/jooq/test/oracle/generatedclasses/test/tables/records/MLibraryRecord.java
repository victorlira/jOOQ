/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * snapshot table for snapshot TEST.M_LIBRARY
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "M_LIBRARY", schema = "TEST")
public class MLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.MLibraryRecord> {

	private static final long serialVersionUID = 57159103;

	/**
	 * The table column <code>TEST.M_LIBRARY.AUTHOR</code>
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.AUTHOR, value);
	}

	/**
	 * The table column <code>TEST.M_LIBRARY.AUTHOR</code>
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.AUTHOR);
	}

	/**
	 * The table column <code>TEST.M_LIBRARY.TITLE</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.TITLE, value);
	}

	/**
	 * The table column <code>TEST.M_LIBRARY.TITLE</code>
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY.TITLE);
	}

	/**
	 * Create a detached MLibraryRecord
	 */
	public MLibraryRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.MLibrary.M_LIBRARY);
	}
}
