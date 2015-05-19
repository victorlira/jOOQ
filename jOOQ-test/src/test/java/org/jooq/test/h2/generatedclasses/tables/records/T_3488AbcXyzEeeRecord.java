/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee;
import org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3488AbcXyzEee;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3488AbcXyzEeeRecord extends UpdatableRecordImpl<T_3488AbcXyzEeeRecord> implements Record1<Integer>, IT_3488AbcXyzEee {

	private static final long serialVersionUID = -2079419771;

	/**
	 * Setter for <code>PUBLIC.T_3488_ABC_XYZ_EEE.ID</code>.
	 */
	@Override
	public T_3488AbcXyzEeeRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_3488_ABC_XYZ_EEE.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
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
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return T_3488AbcXyzEee.T_3488_ABC_XYZ_EEE.ID;
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
	public T_3488AbcXyzEeeRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3488AbcXyzEeeRecord values(Integer value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IT_3488AbcXyzEee from) {
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_3488AbcXyzEee> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_3488AbcXyzEeeRecord
	 */
	public T_3488AbcXyzEeeRecord() {
		super(T_3488AbcXyzEee.T_3488_ABC_XYZ_EEE);
	}

	/**
	 * Create a detached, initialised T_3488AbcXyzEeeRecord
	 */
	public T_3488AbcXyzEeeRecord(Integer id) {
		super(T_3488AbcXyzEee.T_3488_ABC_XYZ_EEE);

		setValue(0, id);
	}
}
