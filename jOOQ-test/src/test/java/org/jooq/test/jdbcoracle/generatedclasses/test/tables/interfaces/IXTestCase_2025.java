/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXTestCase_2025 extends Serializable {

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>.
	 */
	public void setRefId(Integer value);

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>.
	 */
	public Integer getRefId();

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	public void setRefName(String value);

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	public String getRefName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_2025
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_2025 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_2025
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXTestCase_2025> E into(E into);
}
