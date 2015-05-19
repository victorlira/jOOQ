/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.TDates;
import org.jooq.test.h2.generatedclasses.tables.interfaces.ITDates;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDatesRecord extends UpdatableRecordImpl<TDatesRecord> implements Record6<Integer, Date, Time, Timestamp, Integer, Long>, ITDates {

	private static final long serialVersionUID = 1607504786;

	/**
	 * Setter for <code>PUBLIC.T_DATES.ID</code>.
	 */
	@Override
	public TDatesRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.D</code>.
	 */
	@Override
	public TDatesRecord setD(Date value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.D</code>.
	 */
	@Override
	public Date getD() {
		return (Date) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.T</code>.
	 */
	@Override
	public TDatesRecord setT(Time value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.T</code>.
	 */
	@Override
	public Time getT() {
		return (Time) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.TS</code>.
	 */
	@Override
	public TDatesRecord setTs(Timestamp value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.TS</code>.
	 */
	@Override
	public Timestamp getTs() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.D_INT</code>.
	 */
	@Override
	public TDatesRecord setDInt(Integer value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.D_INT</code>.
	 */
	@Override
	public Integer getDInt() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.TS_BIGINT</code>.
	 */
	@Override
	public TDatesRecord setTsBigint(Long value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.TS_BIGINT</code>.
	 */
	@Override
	public Long getTsBigint() {
		return (Long) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Date, Time, Timestamp, Integer, Long> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Date, Time, Timestamp, Integer, Long> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TDates.T_DATES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field2() {
		return TDates.T_DATES.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Time> field3() {
		return TDates.T_DATES.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return TDates.T_DATES.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return TDates.T_DATES.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field6() {
		return TDates.T_DATES.TS_BIGINT;
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
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Time value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value6() {
		return getTsBigint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value2(Date value) {
		setD(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value3(Time value) {
		setT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value4(Timestamp value) {
		setTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value5(Integer value) {
		setDInt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value6(Long value) {
		setTsBigint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord values(Integer value1, Date value2, Time value3, Timestamp value4, Integer value5, Long value6) {
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
	public void from(ITDates from) {
		setId(from.getId());
		setD(from.getD());
		setT(from.getT());
		setTs(from.getTs());
		setDInt(from.getDInt());
		setTsBigint(from.getTsBigint());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITDates> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(TDates.T_DATES);
	}

	/**
	 * Create a detached, initialised TDatesRecord
	 */
	public TDatesRecord(Integer id, Date d, Time t, Timestamp ts, Integer dInt, Long tsBigint) {
		super(TDates.T_DATES);

		setValue(0, id);
		setValue(1, d);
		setValue(2, t);
		setValue(3, ts);
		setValue(4, dInt);
		setValue(5, tsBigint);
	}
}
