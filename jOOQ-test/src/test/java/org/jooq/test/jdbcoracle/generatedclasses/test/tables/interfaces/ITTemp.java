/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITTemp extends Serializable {

	/**
	 * Setter for <code>TEST.T_TEMP.ID</code>.
	 */
	public void setId(Integer value);

	/**
	 * Getter for <code>TEST.T_TEMP.ID</code>.
	 */
	public Integer getId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITTemp
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITTemp from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITTemp
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITTemp> E into(E into);
}
