/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class PGetTwoCursors extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -958304863;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = createParameter("BOOKS", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> AUTHORS = createParameter("AUTHORS", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * Create a new routine call instance
	 */
	public PGetTwoCursors() {
		super("P_GET_TWO_CURSORS", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addOutParameter(BOOKS);
		addOutParameter(AUTHORS);
	}

	public org.jooq.Result<org.jooq.Record> getBooks() {
		return getValue(BOOKS);
	}

	public org.jooq.Result<org.jooq.Record> getAuthors() {
		return getValue(AUTHORS);
	}
}