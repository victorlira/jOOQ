/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in PUBLIC
 */
public final class Sequences {

	/**
	 * The sequence PUBLIC.event_no
	 */
	public static final org.jooq.Sequence<java.math.BigInteger> EVENT_NO = new org.jooq.impl.SequenceImpl<java.math.BigInteger>("event_no", org.jooq.examples.cubrid.demodb.Public.PUBLIC, org.jooq.impl.SQLDataType.DECIMAL_INTEGER);

	/**
	 * The sequence PUBLIC.stadium_no
	 */
	public static final org.jooq.Sequence<java.math.BigInteger> STADIUM_NO = new org.jooq.impl.SequenceImpl<java.math.BigInteger>("stadium_no", org.jooq.examples.cubrid.demodb.Public.PUBLIC, org.jooq.impl.SQLDataType.DECIMAL_INTEGER);

	/**
	 * No instances
	 */
	private Sequences() {}
}
