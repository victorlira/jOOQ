/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> {

	private static final long serialVersionUID = 1039137934;

	/**
	 * Setter for <code>t_book.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * Getter for <code>t_book.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.ID);
	}

	/**
	 * Setter for <code>t_book.AUTHOR_ID</code>. 
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * Getter for <code>t_book.AUTHOR_ID</code>. 
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * Setter for <code>t_book.co_author_id</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * Getter for <code>t_book.co_author_id</code>. 
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * Setter for <code>t_book.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * Getter for <code>t_book.DETAILS_ID</code>. 
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * Setter for <code>t_book.TITLE</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * Getter for <code>t_book.TITLE</code>. 
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * Setter for <code>t_book.PUBLISHED_IN</code>. 
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * Getter for <code>t_book.PUBLISHED_IN</code>. 
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * Setter for <code>t_book.LANGUAGE_ID</code>. 
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * Getter for <code>t_book.LANGUAGE_ID</code>. 
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>t_book.CONTENT_TEXT</code>. 
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * Getter for <code>t_book.CONTENT_TEXT</code>. 
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * Setter for <code>t_book.CONTENT_PDF</code>. 
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * Getter for <code>t_book.CONTENT_PDF</code>. 
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBook.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK);
	}
}
