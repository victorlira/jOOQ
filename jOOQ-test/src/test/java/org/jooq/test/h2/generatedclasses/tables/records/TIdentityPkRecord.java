/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.TIdentityPk;
import org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentityPk;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentityPkRecord extends UpdatableRecordImpl<TIdentityPkRecord> implements Record2<Integer, Integer>, ITIdentityPk {

	private static final long serialVersionUID = 2131421855;

	/**
	 * Setter for <code>PUBLIC.T_IDENTITY_PK.ID</code>.
	 */
	@Override
	public TIdentityPkRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_IDENTITY_PK.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_IDENTITY_PK.VAL</code>.
	 */
	@Override
	public TIdentityPkRecord setVal(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_IDENTITY_PK.VAL</code>.
	 */
	@Override
	public Integer getVal() {
		return (Integer) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TIdentityPk.T_IDENTITY_PK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TIdentityPk.T_IDENTITY_PK.VAL;
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
	public Integer value2() {
		return getVal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentityPkRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentityPkRecord value2(Integer value) {
		setVal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentityPkRecord values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITIdentityPk from) {
		setId(from.getId());
		setVal(from.getVal());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITIdentityPk> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(TIdentityPk.T_IDENTITY_PK);
	}

	/**
	 * Create a detached, initialised TIdentityPkRecord
	 */
	public TIdentityPkRecord(Integer id, Integer val) {
		super(TIdentityPk.T_IDENTITY_PK);

		setValue(0, id);
		setValue(1, val);
	}
}
