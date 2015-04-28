/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;


import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_3711;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_3711;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3711Record extends TableRecordImpl<T_3711Record> implements Record6<Object, Object, Object, Object, Object, Object>, IT_3711 {

	private static final long serialVersionUID = 1867139354;

	/**
	 * Setter for <code>TEST.T_3711.V1</code>.
	 */
	@Override
	public void setV1(Object value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_3711.V1</code>.
	 */
	@Override
	public Object getV1() {
		return (Object) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_3711.V2</code>.
	 */
	@Override
	public void setV2(Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_3711.V2</code>.
	 */
	@Override
	public Object getV2() {
		return (Object) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_3711.V3</code>.
	 */
	@Override
	public void setV3(Object value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_3711.V3</code>.
	 */
	@Override
	public Object getV3() {
		return (Object) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_3711.V4</code>.
	 */
	@Override
	public void setV4(Object value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_3711.V4</code>.
	 */
	@Override
	public Object getV4() {
		return (Object) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_3711.V7</code>.
	 */
	@Override
	public void setV7(Object value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_3711.V7</code>.
	 */
	@Override
	public Object getV7() {
		return (Object) getValue(4);
	}

	/**
	 * Setter for <code>TEST.T_3711.V8</code>.
	 */
	@Override
	public void setV8(Object value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.T_3711.V8</code>.
	 */
	@Override
	public Object getV8() {
		return (Object) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Object, Object, Object, Object, Object, Object> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Object, Object, Object, Object, Object, Object> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field1() {
		return T_3711.V1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field2() {
		return T_3711.V2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field3() {
		return T_3711.V3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field4() {
		return T_3711.V4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field5() {
		return T_3711.V7;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field6() {
		return T_3711.V8;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value1() {
		return getV1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value2() {
		return getV2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value3() {
		return getV3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value4() {
		return getV4();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value5() {
		return getV7();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value6() {
		return getV8();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3711Record value1(Object value) {
		setV1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3711Record value2(Object value) {
		setV2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3711Record value3(Object value) {
		setV3(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3711Record value4(Object value) {
		setV4(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3711Record value5(Object value) {
		setV7(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3711Record value6(Object value) {
		setV8(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3711Record values(Object value1, Object value2, Object value3, Object value4, Object value5, Object value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IT_3711 from) {
		setV1(from.getV1());
		setV2(from.getV2());
		setV3(from.getV3());
		setV4(from.getV4());
		setV7(from.getV7());
		setV8(from.getV8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_3711> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_3711Record
	 */
	public T_3711Record() {
		super(T_3711.T_3711);
	}

	/**
	 * Create a detached, initialised T_3711Record
	 */
	public T_3711Record(Object v1, Object v2, Object v3, Object v4, Object v7, Object v8) {
		super(T_3711.T_3711);

		setValue(0, v1);
		setValue(1, v2);
		setValue(2, v3);
		setValue(3, v4);
		setValue(4, v7);
		setValue(5, v8);
	}
}
