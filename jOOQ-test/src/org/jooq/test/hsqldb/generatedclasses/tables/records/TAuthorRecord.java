/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TAuthorRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITAuthor {

	private static final long serialVersionUID = 990480842;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> fetchTBookListByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> fetchTBookListByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TAuthor.T_AUTHOR);
	}
}