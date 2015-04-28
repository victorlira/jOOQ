/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;


import java.math.BigDecimal;

import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_2845CaseSensitivity;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2845CaseSensitivity implements IT_2845CaseSensitivity {

	private static final long serialVersionUID = -1919253814;

	private BigDecimal id;
	private BigDecimal insensitive;
	private BigDecimal upper;
	private BigDecimal lower;
	private BigDecimal mixed;

	public T_2845CaseSensitivity() {}

	public T_2845CaseSensitivity(T_2845CaseSensitivity value) {
		this.id = value.id;
		this.insensitive = value.insensitive;
		this.upper = value.upper;
		this.lower = value.lower;
		this.mixed = value.mixed;
	}

	public T_2845CaseSensitivity(
		BigDecimal id,
		BigDecimal insensitive,
		BigDecimal upper,
		BigDecimal lower,
		BigDecimal mixed
	) {
		this.id = id;
		this.insensitive = insensitive;
		this.upper = upper;
		this.lower = lower;
		this.mixed = mixed;
	}

	@Override
	public BigDecimal getId() {
		return this.id;
	}

	@Override
	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Override
	public BigDecimal getInsensitive() {
		return this.insensitive;
	}

	@Override
	public void setInsensitive(BigDecimal insensitive) {
		this.insensitive = insensitive;
	}

	@Override
	public BigDecimal getUpper() {
		return this.upper;
	}

	@Override
	public void setUpper(BigDecimal upper) {
		this.upper = upper;
	}

	@Override
	public BigDecimal getLower() {
		return this.lower;
	}

	@Override
	public void setLower(BigDecimal lower) {
		this.lower = lower;
	}

	@Override
	public BigDecimal getMixed() {
		return this.mixed;
	}

	@Override
	public void setMixed(BigDecimal mixed) {
		this.mixed = mixed;
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
}
