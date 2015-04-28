/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITBookStore extends Serializable {

	/**
	 * Setter for <code>TEST.T_BOOK_STORE.NAME</code>.
	 */
	public void setName(String value);

	/**
	 * Getter for <code>TEST.T_BOOK_STORE.NAME</code>.
	 */
	public String getName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITBookStore
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBookStore from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITBookStore
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITBookStore> E into(E into);
}
