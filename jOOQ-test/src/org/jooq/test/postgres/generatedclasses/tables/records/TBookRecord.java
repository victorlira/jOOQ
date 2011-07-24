/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -918155044;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.BOOK_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.co_author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.co_author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.co_author_id]
	 * REFERENCES t_author [public.t_author.id]
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.postgres.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.language_id]
	 * REFERENCES t_language [public.t_language.id]
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.postgres.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book.language_id]
	 * REFERENCES t_language [public.t_language.id]
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	/**
	 * An uncommented item
	 */
	public void setStatus(org.jooq.test.postgres.generatedclasses.enums.UBookStatus value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.STATUS, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.postgres.generatedclasses.enums.UBookStatus getStatus() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.STATUS);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK);
	}

	/**
	 * Create an attached TBookRecord
	 */
	public TBookRecord(org.jooq.Configuration configuration) {
		super(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK, configuration);
	}
}
