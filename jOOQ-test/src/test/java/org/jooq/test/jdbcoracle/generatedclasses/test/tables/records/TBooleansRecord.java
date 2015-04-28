/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.all.converters.Boolean_10;
import org.jooq.test.all.converters.Boolean_TF_LC;
import org.jooq.test.all.converters.Boolean_TF_UC;
import org.jooq.test.all.converters.Boolean_YES_NO_LC;
import org.jooq.test.all.converters.Boolean_YES_NO_UC;
import org.jooq.test.all.converters.Boolean_YN_LC;
import org.jooq.test.all.converters.Boolean_YN_UC;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBooleans;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBooleans;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBooleansRecord extends UpdatableRecordImpl<TBooleansRecord> implements Record11<Integer, Boolean_10, Boolean_TF_LC, Boolean_TF_UC, Boolean_YES_NO_LC, Boolean_YES_NO_UC, Boolean_YN_LC, Boolean_YN_UC, Boolean, Boolean, Boolean>, ITBooleans {

	private static final long serialVersionUID = -908719843;

	/**
	 * Setter for <code>TEST.T_BOOLEANS.ID</code>.
	 */
	@Override
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.ID</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.ONE_ZERO</code>.
	 */
	@Override
	public void setOneZero(Boolean_10 value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.ONE_ZERO</code>.
	 */
	@Override
	public Boolean_10 getOneZero() {
		return (Boolean_10) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.TRUE_FALSE_LC</code>.
	 */
	@Override
	public void setTrueFalseLc(Boolean_TF_LC value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.TRUE_FALSE_LC</code>.
	 */
	@Override
	public Boolean_TF_LC getTrueFalseLc() {
		return (Boolean_TF_LC) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.TRUE_FALSE_UC</code>.
	 */
	@Override
	public void setTrueFalseUc(Boolean_TF_UC value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.TRUE_FALSE_UC</code>.
	 */
	@Override
	public Boolean_TF_UC getTrueFalseUc() {
		return (Boolean_TF_UC) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.YES_NO_LC</code>.
	 */
	@Override
	public void setYesNoLc(Boolean_YES_NO_LC value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.YES_NO_LC</code>.
	 */
	@Override
	public Boolean_YES_NO_LC getYesNoLc() {
		return (Boolean_YES_NO_LC) getValue(4);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.YES_NO_UC</code>.
	 */
	@Override
	public void setYesNoUc(Boolean_YES_NO_UC value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.YES_NO_UC</code>.
	 */
	@Override
	public Boolean_YES_NO_UC getYesNoUc() {
		return (Boolean_YES_NO_UC) getValue(5);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.Y_N_LC</code>.
	 */
	@Override
	public void setYNLc(Boolean_YN_LC value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.Y_N_LC</code>.
	 */
	@Override
	public Boolean_YN_LC getYNLc() {
		return (Boolean_YN_LC) getValue(6);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.Y_N_UC</code>.
	 */
	@Override
	public void setYNUc(Boolean_YN_UC value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.Y_N_UC</code>.
	 */
	@Override
	public Boolean_YN_UC getYNUc() {
		return (Boolean_YN_UC) getValue(7);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.VC_BOOLEAN</code>.
	 */
	@Override
	public void setVcBoolean(Boolean value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.VC_BOOLEAN</code>.
	 */
	@Override
	public Boolean getVcBoolean() {
		return (Boolean) getValue(8);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.C_BOOLEAN</code>.
	 */
	@Override
	public void setCBoolean(Boolean value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.C_BOOLEAN</code>.
	 */
	@Override
	public Boolean getCBoolean() {
		return (Boolean) getValue(9);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.N_BOOLEAN</code>.
	 */
	@Override
	public void setNBoolean(Boolean value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.N_BOOLEAN</code>.
	 */
	@Override
	public Boolean getNBoolean() {
		return (Boolean) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Boolean_10, Boolean_TF_LC, Boolean_TF_UC, Boolean_YES_NO_LC, Boolean_YES_NO_UC, Boolean_YN_LC, Boolean_YN_UC, Boolean, Boolean, Boolean> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Boolean_10, Boolean_TF_LC, Boolean_TF_UC, Boolean_YES_NO_LC, Boolean_YES_NO_UC, Boolean_YN_LC, Boolean_YN_UC, Boolean, Boolean, Boolean> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TBooleans.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean_10> field2() {
		return TBooleans.ONE_ZERO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean_TF_LC> field3() {
		return TBooleans.TRUE_FALSE_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean_TF_UC> field4() {
		return TBooleans.TRUE_FALSE_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean_YES_NO_LC> field5() {
		return TBooleans.YES_NO_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean_YES_NO_UC> field6() {
		return TBooleans.YES_NO_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean_YN_LC> field7() {
		return TBooleans.Y_N_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean_YN_UC> field8() {
		return TBooleans.Y_N_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field9() {
		return TBooleans.VC_BOOLEAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field10() {
		return TBooleans.C_BOOLEAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field11() {
		return TBooleans.N_BOOLEAN;
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
	public Boolean_10 value2() {
		return getOneZero();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean_TF_LC value3() {
		return getTrueFalseLc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean_TF_UC value4() {
		return getTrueFalseUc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean_YES_NO_LC value5() {
		return getYesNoLc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean_YES_NO_UC value6() {
		return getYesNoUc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean_YN_LC value7() {
		return getYNLc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean_YN_UC value8() {
		return getYNUc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value9() {
		return getVcBoolean();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value10() {
		return getCBoolean();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value11() {
		return getNBoolean();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value2(Boolean_10 value) {
		setOneZero(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value3(Boolean_TF_LC value) {
		setTrueFalseLc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value4(Boolean_TF_UC value) {
		setTrueFalseUc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value5(Boolean_YES_NO_LC value) {
		setYesNoLc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value6(Boolean_YES_NO_UC value) {
		setYesNoUc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value7(Boolean_YN_LC value) {
		setYNLc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value8(Boolean_YN_UC value) {
		setYNUc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value9(Boolean value) {
		setVcBoolean(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value10(Boolean value) {
		setCBoolean(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value11(Boolean value) {
		setNBoolean(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord values(Integer value1, Boolean_10 value2, Boolean_TF_LC value3, Boolean_TF_UC value4, Boolean_YES_NO_LC value5, Boolean_YES_NO_UC value6, Boolean_YN_LC value7, Boolean_YN_UC value8, Boolean value9, Boolean value10, Boolean value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITBooleans from) {
		setId(from.getId());
		setOneZero(from.getOneZero());
		setTrueFalseLc(from.getTrueFalseLc());
		setTrueFalseUc(from.getTrueFalseUc());
		setYesNoLc(from.getYesNoLc());
		setYesNoUc(from.getYesNoUc());
		setYNLc(from.getYNLc());
		setYNUc(from.getYNUc());
		setVcBoolean(from.getVcBoolean());
		setCBoolean(from.getCBoolean());
		setNBoolean(from.getNBoolean());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITBooleans> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBooleansRecord
	 */
	public TBooleansRecord() {
		super(TBooleans.T_BOOLEANS);
	}

	/**
	 * Create a detached, initialised TBooleansRecord
	 */
	public TBooleansRecord(Integer id, Boolean_10 oneZero, Boolean_TF_LC trueFalseLc, Boolean_TF_UC trueFalseUc, Boolean_YES_NO_LC yesNoLc, Boolean_YES_NO_UC yesNoUc, Boolean_YN_LC yNLc, Boolean_YN_UC yNUc, Boolean vcBoolean, Boolean cBoolean, Boolean nBoolean) {
		super(TBooleans.T_BOOLEANS);

		setValue(0, id);
		setValue(1, oneZero);
		setValue(2, trueFalseLc);
		setValue(3, trueFalseUc);
		setValue(4, yesNoLc);
		setValue(5, yesNoUc);
		setValue(6, yNLc);
		setValue(7, yNUc);
		setValue(8, vcBoolean);
		setValue(9, cBoolean);
		setValue(10, nBoolean);
	}
}
