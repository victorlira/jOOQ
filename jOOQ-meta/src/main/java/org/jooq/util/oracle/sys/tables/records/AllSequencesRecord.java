/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Description of SEQUENCEs accessible to the user
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class AllSequencesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.oracle.sys.tables.records.AllSequencesRecord> {

	private static final long serialVersionUID = 955289071;

	/**
	 * Name of the owner of the sequence
	 */
	public void setSequenceOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.SEQUENCE_OWNER, value);
	}

	/**
	 * Name of the owner of the sequence
	 */
	public java.lang.String getSequenceOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.SEQUENCE_OWNER);
	}

	/**
	 * SEQUENCE name
	 */
	public void setSequenceName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.SEQUENCE_NAME, value);
	}

	/**
	 * SEQUENCE name
	 */
	public java.lang.String getSequenceName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.SEQUENCE_NAME);
	}

	/**
	 * Minimum value of the sequence
	 */
	public void setMinValue(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.MIN_VALUE, value);
	}

	/**
	 * Minimum value of the sequence
	 */
	public java.math.BigDecimal getMinValue() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.MIN_VALUE);
	}

	/**
	 * Maximum value of the sequence
	 */
	public void setMaxValue(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.MAX_VALUE, value);
	}

	/**
	 * Maximum value of the sequence
	 */
	public java.math.BigDecimal getMaxValue() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.MAX_VALUE);
	}

	/**
	 * Value by which sequence is incremented
	 */
	public void setIncrementBy(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.INCREMENT_BY, value);
	}

	/**
	 * Value by which sequence is incremented
	 */
	public java.math.BigDecimal getIncrementBy() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.INCREMENT_BY);
	}

	/**
	 * Does sequence wrap around on reaching limit?
	 */
	public void setCycleFlag(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.CYCLE_FLAG, value);
	}

	/**
	 * Does sequence wrap around on reaching limit?
	 */
	public java.lang.String getCycleFlag() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.CYCLE_FLAG);
	}

	/**
	 * Are sequence numbers generated in order?
	 */
	public void setOrderFlag(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.ORDER_FLAG, value);
	}

	/**
	 * Are sequence numbers generated in order?
	 */
	public java.lang.String getOrderFlag() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.ORDER_FLAG);
	}

	/**
	 * Number of sequence numbers to cache
	 */
	public void setCacheSize(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.CACHE_SIZE, value);
	}

	/**
	 * Number of sequence numbers to cache
	 */
	public java.math.BigDecimal getCacheSize() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.CACHE_SIZE);
	}

	/**
	 * Last sequence number written to disk
	 */
	public void setLastNumber(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllSequences.LAST_NUMBER, value);
	}

	/**
	 * Last sequence number written to disk
	 */
	public java.math.BigDecimal getLastNumber() {
		return getValue(org.jooq.util.oracle.sys.tables.AllSequences.LAST_NUMBER);
	}

	/**
	 * Create a detached AllSequencesRecord
	 */
	public AllSequencesRecord() {
		super(org.jooq.util.oracle.sys.tables.AllSequences.ALL_SEQUENCES);
	}
}
