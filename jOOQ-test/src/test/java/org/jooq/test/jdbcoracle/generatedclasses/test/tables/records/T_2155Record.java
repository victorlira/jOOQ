/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;


import java.sql.Date;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_2155;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_2155;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2155Record extends UpdatableRecordImpl<T_2155Record> implements Record4<Integer, Date, Object, Object>, IT_2155 {

	private static final long serialVersionUID = -276229917;

	/**
	 * Setter for <code>TEST.T_2155.ID</code>.
	 */
	@Override
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_2155.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_2155.D1</code>.
	 */
	@Override
	public void setD1(Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_2155.D1</code>.
	 */
	@Override
	public Date getD1() {
		return (Date) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_2155.D2</code>.
	 */
	@Override
	public void setD2(Object value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_2155.D2</code>.
	 */
	@Override
	public Object getD2() {
		return (Object) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_2155.D3</code>.
	 */
	@Override
	public void setD3(Object value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_2155.D3</code>.
	 */
	@Override
	public Object getD3() {
		return (Object) getValue(3);
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
	public Row4<Integer, Date, Object, Object> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Date, Object, Object> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return T_2155.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field2() {
		return T_2155.D1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field3() {
		return T_2155.D2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field4() {
		return T_2155.D3;
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
	public Date value2() {
		return getD1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value3() {
		return getD2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value4() {
		return getD3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2155Record value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2155Record value2(Date value) {
		setD1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2155Record value3(Object value) {
		setD2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2155Record value4(Object value) {
		setD3(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2155Record values(Integer value1, Date value2, Object value3, Object value4) {
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
	public void from(IT_2155 from) {
		setId(from.getId());
		setD1(from.getD1());
		setD2(from.getD2());
		setD3(from.getD3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_2155> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2155Record
	 */
	public T_2155Record() {
		super(T_2155.T_2155);
	}

	/**
	 * Create a detached, initialised T_2155Record
	 */
	public T_2155Record(Integer id, Date d1, Object d2, Object d3) {
		super(T_2155.T_2155);

		setValue(0, id);
		setValue(1, d1);
		setValue(2, d2);
		setValue(3, d3);
	}
}
