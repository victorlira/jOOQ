/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VIncomplete extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord> {

	private static final long serialVersionUID = -2102901789;

	/**
	 * The singleton instance of <code>TEST.V_INCOMPLETE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete V_INCOMPLETE = new org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord.class;
	}

	/**
	 * The column <code>TEST.V_INCOMPLETE.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> ID = createField("ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.DETAILS_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.TITLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> TITLE = createField("TITLE", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.REC_VERSION</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> REC_VERSION = createField("REC_VERSION", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>TEST.V_INCOMPLETE.REC_TIMESTAMP</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> REC_TIMESTAMP = createField("REC_TIMESTAMP", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * Create a <code>TEST.V_INCOMPLETE</code> table reference
	 */
	public VIncomplete() {
		this("V_INCOMPLETE", null);
	}

	/**
	 * Create an aliased <code>TEST.V_INCOMPLETE</code> table reference
	 */
	public VIncomplete(java.lang.String alias) {
		this(alias, org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete.V_INCOMPLETE);
	}

	private VIncomplete(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord> aliased) {
		this(alias, aliased, null);
	}

	private VIncomplete(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.VIncompleteRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete rename(java.lang.String name) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VIncomplete(name, null);
	}
}
