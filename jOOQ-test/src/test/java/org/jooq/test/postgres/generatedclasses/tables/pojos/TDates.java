/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.jooq.test.postgres.generatedclasses.tables.interfaces.ITDates;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDates implements ITDates {

	private static final long serialVersionUID = 6026993;

	private final Integer   id;
	private final Date      d;
	private final Time      t;
	private final Timestamp ts;
	private final Time      tTz;
	private final Timestamp tsTz;
	private final Integer   dInt;
	private final Long      tsBigint;

	public TDates(TDates value) {
		this.id = value.id;
		this.d = value.d;
		this.t = value.t;
		this.ts = value.ts;
		this.tTz = value.tTz;
		this.tsTz = value.tsTz;
		this.dInt = value.dInt;
		this.tsBigint = value.tsBigint;
	}

	public TDates(
		Integer   id,
		Date      d,
		Time      t,
		Timestamp ts,
		Time      tTz,
		Timestamp tsTz,
		Integer   dInt,
		Long      tsBigint
	) {
		this.id = id;
		this.d = d;
		this.t = t;
		this.ts = ts;
		this.tTz = tTz;
		this.tsTz = tsTz;
		this.dInt = dInt;
		this.tsBigint = tsBigint;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public Date getD() {
		return this.d;
	}

	@Override
	public Time getT() {
		return this.t;
	}

	@Override
	public Timestamp getTs() {
		return this.ts;
	}

	@Override
	public Time getTTz() {
		return this.tTz;
	}

	@Override
	public Timestamp getTsTz() {
		return this.tsTz;
	}

	@Override
	public Integer getDInt() {
		return this.dInt;
	}

	@Override
	public Long getTsBigint() {
		return this.tsBigint;
	}
}
