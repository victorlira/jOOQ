/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.VWithDots;
import org.jooq.test.h2.generatedclasses.tables.interfaces.IVWithDots;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VWithDotsRecord extends TableRecordImpl<VWithDotsRecord> implements Record1<Integer>, IVWithDots {

	private static final long serialVersionUID = -1259318745;

	/**
	 * Setter for <code>PUBLIC.v.with.dots.id.with.dots</code>.
	 */
	@Override
	public VWithDotsRecord setIdWithDots(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.v.with.dots.id.with.dots</code>.
	 */
	@Override
	public Integer getIdWithDots() {
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
		return VWithDots.V_WITH_DOTS.ID_WITH_DOTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdWithDots();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VWithDotsRecord value1(Integer value) {
		setIdWithDots(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VWithDotsRecord values(Integer value1) {
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
	public void from(IVWithDots from) {
		setIdWithDots(from.getIdWithDots());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IVWithDots> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VWithDotsRecord
	 */
	public VWithDotsRecord() {
		super(VWithDots.V_WITH_DOTS);
	}

	/**
	 * Create a detached, initialised VWithDotsRecord
	 */
	public VWithDotsRecord(Integer idWithDots) {
		super(VWithDots.V_WITH_DOTS);

		setValue(0, idWithDots);
	}
}
