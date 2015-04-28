/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.TBook;
import org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBook;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> implements Record9<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[]>, ITBook {

	private static final long serialVersionUID = -1536980174;

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.ID</code>.
	 */
	@Override
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.AUTHOR_ID</code>.
	 */
	@Override
	public void setAuthorId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.AUTHOR_ID</code>.
	 */
	@Override
	public Integer getAuthorId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Override
	public void setCoAuthorId(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Override
	public Integer getCoAuthorId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.DETAILS_ID</code>.
	 */
	@Override
	public void setDetailsId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.DETAILS_ID</code>.
	 */
	@Override
	public Integer getDetailsId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.TITLE</code>.
	 */
	@Override
	public void setTitle(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.TITLE</code>.
	 */
	@Override
	public String getTitle() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.PUBLISHED_IN</code>.
	 */
	@Override
	public void setPublishedIn(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.PUBLISHED_IN</code>.
	 */
	@Override
	public Integer getPublishedIn() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.LANGUAGE_ID</code>.
	 */
	@Override
	public void setLanguageId(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.LANGUAGE_ID</code>.
	 */
	@Override
	public Integer getLanguageId() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_TEXT</code>.
	 */
	@Override
	public void setContentText(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_TEXT</code>.
	 */
	@Override
	public String getContentText() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_PDF</code>.
	 */
	@Override
	public void setContentPdf(byte[] value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK.CONTENT_PDF</code>.
	 */
	@Override
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[]> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[]> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TBook.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TBook.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TBook.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return TBook.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TBook.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return TBook.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return TBook.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TBook.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field9() {
		return TBook.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value2(Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value3(Integer value) {
		setCoAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value4(Integer value) {
		setDetailsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value5(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value6(Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value7(Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value8(String value) {
		setContentText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value9(byte[] value) {
		setContentPdf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, String value8, byte[] value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITBook from) {
		setId(from.getId());
		setAuthorId(from.getAuthorId());
		setCoAuthorId(from.getCoAuthorId());
		setDetailsId(from.getDetailsId());
		setTitle(from.getTitle());
		setPublishedIn(from.getPublishedIn());
		setLanguageId(from.getLanguageId());
		setContentText(from.getContentText());
		setContentPdf(from.getContentPdf());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITBook> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(TBook.T_BOOK);
	}

	/**
	 * Create a detached, initialised TBookRecord
	 */
	public TBookRecord(Integer id, Integer authorId, Integer coAuthorId, Integer detailsId, String title, Integer publishedIn, Integer languageId, String contentText, byte[] contentPdf) {
		super(TBook.T_BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, coAuthorId);
		setValue(3, detailsId);
		setValue(4, title);
		setValue(5, publishedIn);
		setValue(6, languageId);
		setValue(7, contentText);
		setValue(8, contentPdf);
	}
}
