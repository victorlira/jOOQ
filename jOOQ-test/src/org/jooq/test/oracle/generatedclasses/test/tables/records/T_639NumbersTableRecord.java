/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_639_NUMBERS_TABLE", schema = "TEST")
public class T_639NumbersTableRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger, java.math.BigDecimal> {

	private static final long serialVersionUID = 1261343747;

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.ID</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>.
	 */
	public void setByte(java.lang.Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>.
	 */
	@javax.persistence.Column(name = "BYTE", precision = 2)
	public java.lang.Byte getByte() {
		return (java.lang.Byte) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>.
	 */
	public void setShort(java.lang.Short value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>.
	 */
	@javax.persistence.Column(name = "SHORT", precision = 4)
	public java.lang.Short getShort() {
		return (java.lang.Short) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>.
	 */
	public void setInteger(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>.
	 */
	@javax.persistence.Column(name = "INTEGER", precision = 7)
	public java.lang.Integer getInteger() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.LONG</code>.
	 */
	public void setLong(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.LONG</code>.
	 */
	@javax.persistence.Column(name = "LONG", precision = 18)
	public java.lang.Long getLong() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>.
	 */
	public void setByteDecimal(java.lang.Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>.
	 */
	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	public java.lang.Byte getByteDecimal() {
		return (java.lang.Byte) getValue(5);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>.
	 */
	public void setShortDecimal(java.lang.Short value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>.
	 */
	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	public java.lang.Short getShortDecimal() {
		return (java.lang.Short) getValue(6);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>.
	 */
	public void setIntegerDecimal(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>.
	 */
	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	public java.lang.Integer getIntegerDecimal() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>.
	 */
	public void setLongDecimal(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>.
	 */
	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	public java.lang.Long getLongDecimal() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>.
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>.
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 22)
	public java.math.BigInteger getBigInteger() {
		return (java.math.BigInteger) getValue(9);
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>.
	 */
	public void setBigDecimal(java.math.BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>.
	 */
	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	public java.math.BigDecimal getBigDecimal() {
		return (java.math.BigDecimal) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field6() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field7() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field10() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field11() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value2() {
		return getByte();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value3() {
		return getShort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getInteger();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getLong();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value6() {
		return getByteDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value7() {
		return getShortDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getIntegerDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getLongDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value10() {
		return getBigInteger();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value11() {
		return getBigDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value2(java.lang.Byte value) {
		setByte(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value3(java.lang.Short value) {
		setShort(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value4(java.lang.Integer value) {
		setInteger(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value5(java.lang.Long value) {
		setLong(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value6(java.lang.Byte value) {
		setByteDecimal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value7(java.lang.Short value) {
		setShortDecimal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value8(java.lang.Integer value) {
		setIntegerDecimal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value9(java.lang.Long value) {
		setLongDecimal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value10(java.math.BigInteger value) {
		setBigInteger(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord value11(java.math.BigDecimal value) {
		setBigDecimal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_639NumbersTableRecord values(java.lang.Integer value1, java.lang.Byte value2, java.lang.Short value3, java.lang.Integer value4, java.lang.Long value5, java.lang.Byte value6, java.lang.Short value7, java.lang.Integer value8, java.lang.Long value9, java.math.BigInteger value10, java.math.BigDecimal value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_639NumbersTableRecord
	 */
	public T_639NumbersTableRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}

	/**
	 * Create a detached, initialised T_639NumbersTableRecord
	 */
	public T_639NumbersTableRecord(java.lang.Integer id, java.lang.Byte byte_, java.lang.Short short_, java.lang.Integer integer, java.lang.Long long_, java.lang.Byte byteDecimal, java.lang.Short shortDecimal, java.lang.Integer integerDecimal, java.lang.Long longDecimal, java.math.BigInteger bigInteger, java.math.BigDecimal bigDecimal) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);

		setValue(0, id);
		setValue(1, byte_);
		setValue(2, short_);
		setValue(3, integer);
		setValue(4, long_);
		setValue(5, byteDecimal);
		setValue(6, shortDecimal);
		setValue(7, integerDecimal);
		setValue(8, longDecimal);
		setValue(9, bigInteger);
		setValue(10, bigDecimal);
	}
}
