/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBookToBookStore;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStoreRecord extends UpdatableRecordImpl<TBookToBookStoreRecord> implements Record3<String, Integer, Integer>, ITBookToBookStore {

	private static final long serialVersionUID = 1401723678;

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
	 */
	@Override
	public void setBookStoreName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
	 */
	@Override
	public String getBookStoreName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>.
	 */
	@Override
	public void setBookId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>.
	 */
	@Override
	public Integer getBookId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>.
	 */
	@Override
	public void setStock(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>.
	 */
	@Override
	public Integer getStock() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TBookToBookStore.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TBookToBookStore.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TBookToBookStore.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getStock();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord value1(String value) {
		setBookStoreName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord value2(Integer value) {
		setBookId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord value3(Integer value) {
		setStock(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord values(String value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITBookToBookStore from) {
		setBookStoreName(from.getBookStoreName());
		setBookId(from.getBookId());
		setStock(from.getStock());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITBookToBookStore> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * Create a detached, initialised TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord(String bookStoreName, Integer bookId, Integer stock) {
		super(TBookToBookStore.T_BOOK_TO_BOOK_STORE);

		setValue(0, bookStoreName);
		setValue(1, bookId);
		setValue(2, stock);
	}
}
