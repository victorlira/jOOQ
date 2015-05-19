/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.TArrays;
import org.jooq.test.h2.generatedclasses.tables.interfaces.ITArrays;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArraysRecord extends UpdatableRecordImpl<TArraysRecord> implements Record4<Integer, Object[], Object[], Object[]>, ITArrays {

	private static final long serialVersionUID = -624291864;

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.ID</code>.
	 */
	@Override
	public TArraysRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>.
	 */
	@Override
	public TArraysRecord setStringArray(Object[] value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>.
	 */
	@Override
	public Object[] getStringArray() {
		return (Object[]) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	@Override
	public TArraysRecord setNumberArray(Object[] value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	@Override
	public Object[] getNumberArray() {
		return (Object[]) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>.
	 */
	@Override
	public TArraysRecord setDateArray(Object[] value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>.
	 */
	@Override
	public Object[] getDateArray() {
		return (Object[]) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Object[], Object[], Object[]> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Object[], Object[], Object[]> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TArrays.T_ARRAYS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object[]> field2() {
		return TArrays.T_ARRAYS.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object[]> field3() {
		return TArrays.T_ARRAYS.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object[]> field4() {
		return TArrays.T_ARRAYS.DATE_ARRAY;
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
	public Object[] value2() {
		return getStringArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object[] value3() {
		return getNumberArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object[] value4() {
		return getDateArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value2(Object[] value) {
		setStringArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value3(Object[] value) {
		setNumberArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value4(Object[] value) {
		setDateArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord values(Integer value1, Object[] value2, Object[] value3, Object[] value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITArrays from) {
		setId(from.getId());
		setStringArray(from.getStringArray());
		setNumberArray(from.getNumberArray());
		setDateArray(from.getDateArray());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITArrays> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(TArrays.T_ARRAYS);
	}

	/**
	 * Create a detached, initialised TArraysRecord
	 */
	public TArraysRecord(Integer id, Object[] stringArray, Object[] numberArray, Object[] dateArray) {
		super(TArrays.T_ARRAYS);

		setValue(0, id);
		setValue(1, stringArray);
		setValue(2, numberArray);
		setValue(3, dateArray);
	}
}
