/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.T_2327UkOnly;
import org.jooq.test.h2.generatedclasses.tables.interfaces.IT_2327UkOnly;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2327UkOnlyRecord extends TableRecordImpl<T_2327UkOnlyRecord> implements Record1<Integer>, IT_2327UkOnly {

	private static final long serialVersionUID = 1670862459;

	/**
	 * Setter for <code>PUBLIC.T_2327_UK_ONLY.ID</code>.
	 */
	@Override
	public T_2327UkOnlyRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_2327_UK_ONLY.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
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
		return T_2327UkOnly.T_2327_UK_ONLY.ID;
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
	public T_2327UkOnlyRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2327UkOnlyRecord values(Integer value1) {
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
	public void from(IT_2327UkOnly from) {
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_2327UkOnly> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2327UkOnlyRecord
	 */
	public T_2327UkOnlyRecord() {
		super(T_2327UkOnly.T_2327_UK_ONLY);
	}

	/**
	 * Create a detached, initialised T_2327UkOnlyRecord
	 */
	public T_2327UkOnlyRecord(Integer id) {
		super(T_2327UkOnly.T_2327_UK_ONLY);

		setValue(0, id);
	}
}
