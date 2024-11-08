/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class FilmCategoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> {

	private static final long serialVersionUID = 484678669;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_category_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public void setFilmId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.FILM_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_category_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public java.lang.Short getFilmId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.FILM_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_category_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.FilmRecord fetchFilm() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.FILM.FILM_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.FILM_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_category_category
	 * FOREIGN KEY (category_id)
	 * REFERENCES sakila.category (category_id)
	 * </pre></code>
	 */
	public void setCategoryId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.CATEGORY_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_category_category
	 * FOREIGN KEY (category_id)
	 * REFERENCES sakila.category (category_id)
	 * </pre></code>
	 */
	public java.lang.Byte getCategoryId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.CATEGORY_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_category_category
	 * FOREIGN KEY (category_id)
	 * REFERENCES sakila.category (category_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.CategoryRecord fetchCategory() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY)
			.where(org.jooq.examples.mysql.sakila.tables.Category.CATEGORY.CATEGORY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.CATEGORY_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY.LAST_UPDATE);
	}

	/**
	 * Create a detached FilmCategoryRecord
	 */
	public FilmCategoryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY);
	}
}