/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITDates {

	private static final long serialVersionUID = 444621915;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.ID);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setD(java.sql.Date value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.D, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.sql.Date getD() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.D);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setT(java.sql.Time value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.T, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.sql.Time getT() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.T);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setTs(java.sql.Timestamp value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.TS, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.sql.Timestamp getTs() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.TS);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setDInt(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.D_INT, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Integer getDInt() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.D_INT);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setTsBigint(java.lang.Long value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.TS_BIGINT, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public java.lang.Long getTsBigint() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.TS_BIGINT);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setIY(org.jooq.types.YearToMonth value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.I_Y, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public org.jooq.types.YearToMonth getIY() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.I_Y);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public void setID(org.jooq.types.DayToSecond value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.I_D, value);
	}

	/**
	 * An uncommented item
	 */
	@Override
	public org.jooq.types.DayToSecond getID() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES.I_D);
	}

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES);
	}
}