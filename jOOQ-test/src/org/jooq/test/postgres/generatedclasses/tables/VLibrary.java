/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 1443212392;

	/**
	 * The singleton instance of public.v_library
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.postgres.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	public VLibrary() {
		super("v_library", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public VLibrary(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.VLibrary(alias);
	}
}