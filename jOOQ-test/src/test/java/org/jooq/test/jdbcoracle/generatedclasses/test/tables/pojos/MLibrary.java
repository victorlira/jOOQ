/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;


import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IMLibrary;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MLibrary implements IMLibrary {

	private static final long serialVersionUID = 66718204;

	private String author;
	private String title;

	public MLibrary() {}

	public MLibrary(MLibrary value) {
		this.author = value.author;
		this.title = value.title;
	}

	public MLibrary(
		String author,
		String title
	) {
		this.author = author;
		this.title = title;
	}

	@Override
	public String getAuthor() {
		return this.author;
	}

	@Override
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IMLibrary from) {
		setAuthor(from.getAuthor());
		setTitle(from.getTitle());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IMLibrary> E into(E into) {
		into.from(this);
		return into;
	}
}
