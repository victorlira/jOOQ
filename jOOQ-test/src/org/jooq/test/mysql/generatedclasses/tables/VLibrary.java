/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 1864286457;

	/**
	 * The singleton instance of test.v_library
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.mysql.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}
}