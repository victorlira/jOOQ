/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_2845CaseSensitivity;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_2845CaseSensitivity;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2845CaseSensitivityRecord extends UpdatableRecordImpl<T_2845CaseSensitivityRecord> implements Record5<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal>, IT_2845CaseSensitivity {

	private static final long serialVersionUID = -1256014657;

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.ID</code>.
	 */
	@Override
	public void setId(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.ID</code>.
	 */
	@Override
	public BigDecimal getId() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	@Override
	public void setInsensitive(BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	@Override
	public BigDecimal getInsensitive() {
		return (BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	@Override
	public void setUpper(BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	@Override
	public BigDecimal getUpper() {
		return (BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.lower</code>.
	 */
	@Override
	public void setLower(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.lower</code>.
	 */
	@Override
	public BigDecimal getLower() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	@Override
	public void setMixed(BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	@Override
	public BigDecimal getMixed() {
		return (BigDecimal) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<BigDecimal> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return T_2845CaseSensitivity.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field2() {
		return T_2845CaseSensitivity.INSENSITIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field3() {
		return T_2845CaseSensitivity.UPPER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return T_2845CaseSensitivity.LOWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field5() {
		return T_2845CaseSensitivity.MIXED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value2() {
		return getInsensitive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value3() {
		return getUpper();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getLower();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value5() {
		return getMixed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value1(BigDecimal value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value2(BigDecimal value) {
		setInsensitive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value3(BigDecimal value) {
		setUpper(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value4(BigDecimal value) {
		setLower(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value5(BigDecimal value) {
		setMixed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IT_2845CaseSensitivity from) {
		setId(from.getId());
		setInsensitive(from.getInsensitive());
		setUpper(from.getUpper());
		setLower(from.getLower());
		setMixed(from.getMixed());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_2845CaseSensitivity> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2845CaseSensitivityRecord
	 */
	public T_2845CaseSensitivityRecord() {
		super(T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY);
	}

	/**
	 * Create a detached, initialised T_2845CaseSensitivityRecord
	 */
	public T_2845CaseSensitivityRecord(BigDecimal id, BigDecimal insensitive, BigDecimal upper, BigDecimal lower, BigDecimal mixed) {
		super(T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY);

		setValue(0, id);
		setValue(1, insensitive);
		setValue(2, upper);
		setValue(3, lower);
		setValue(4, mixed);
	}
}
