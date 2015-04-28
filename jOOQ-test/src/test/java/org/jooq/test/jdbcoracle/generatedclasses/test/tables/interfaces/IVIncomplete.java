/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVIncomplete extends Serializable {

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.ID</code>.
	 */
	public void setId(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.ID</code>.
	 */
	public Object getId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>.
	 */
	public void setAuthorId(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>.
	 */
	public Object getAuthorId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>.
	 */
	public void setCoAuthorId(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>.
	 */
	public Object getCoAuthorId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>.
	 */
	public void setDetailsId(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>.
	 */
	public Object getDetailsId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.TITLE</code>.
	 */
	public void setTitle(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.TITLE</code>.
	 */
	public Object getTitle();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>.
	 */
	public void setPublishedIn(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>.
	 */
	public Object getPublishedIn();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>.
	 */
	public void setLanguageId(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>.
	 */
	public Object getLanguageId();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>.
	 */
	public void setContentText(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>.
	 */
	public Object getContentText();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>.
	 */
	public void setContentPdf(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>.
	 */
	public Object getContentPdf();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.REC_VERSION</code>.
	 */
	public void setRecVersion(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.REC_VERSION</code>.
	 */
	public Object getRecVersion();

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.REC_TIMESTAMP</code>.
	 */
	public void setRecTimestamp(Object value);

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.REC_TIMESTAMP</code>.
	 */
	public Object getRecTimestamp();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IVIncomplete
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVIncomplete from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IVIncomplete
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVIncomplete> E into(E into);
}
