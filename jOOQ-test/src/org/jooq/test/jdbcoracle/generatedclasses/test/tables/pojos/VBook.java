/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBook implements org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVBook {

	private static final long serialVersionUID = -2051020072;

	private java.math.BigDecimal id;
	private java.math.BigDecimal authorId;
	private java.math.BigDecimal coAuthorId;
	private java.math.BigDecimal detailsId;
	private java.lang.String     title;
	private java.math.BigDecimal publishedIn;
	private java.math.BigDecimal languageId;
	private java.lang.String     contentText;
	private byte[]               contentPdf;

	@Override
	public java.math.BigDecimal getId() {
		return this.id;
	}

	@Override
	public void setId(java.math.BigDecimal id) {
		this.id = id;
	}

	@Override
	public java.math.BigDecimal getAuthorId() {
		return this.authorId;
	}

	@Override
	public void setAuthorId(java.math.BigDecimal authorId) {
		this.authorId = authorId;
	}

	@Override
	public java.math.BigDecimal getCoAuthorId() {
		return this.coAuthorId;
	}

	@Override
	public void setCoAuthorId(java.math.BigDecimal coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@Override
	public java.math.BigDecimal getDetailsId() {
		return this.detailsId;
	}

	@Override
	public void setDetailsId(java.math.BigDecimal detailsId) {
		this.detailsId = detailsId;
	}

	@Override
	public java.lang.String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	@Override
	public java.math.BigDecimal getPublishedIn() {
		return this.publishedIn;
	}

	@Override
	public void setPublishedIn(java.math.BigDecimal publishedIn) {
		this.publishedIn = publishedIn;
	}

	@Override
	public java.math.BigDecimal getLanguageId() {
		return this.languageId;
	}

	@Override
	public void setLanguageId(java.math.BigDecimal languageId) {
		this.languageId = languageId;
	}

	@Override
	public java.lang.String getContentText() {
		return this.contentText;
	}

	@Override
	public void setContentText(java.lang.String contentText) {
		this.contentText = contentText;
	}

	@Override
	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	@Override
	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVBook from) {
		setId(from.getId());
		setAuthorId(from.getAuthorId());
		setCoAuthorId(from.getCoAuthorId());
		setDetailsId(from.getDetailsId());
		setTitle(from.getTitle());
		setPublishedIn(from.getPublishedIn());
		setLanguageId(from.getLanguageId());
		setContentText(from.getContentText());
		setContentPdf(from.getContentPdf());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVBook> E into(E into) {
		into.from(this);
		return into;
	}
}
