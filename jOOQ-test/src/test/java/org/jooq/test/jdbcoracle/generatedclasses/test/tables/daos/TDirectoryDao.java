/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.daos;


import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.TDirectory;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDirectoryRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDirectoryDao extends DAOImpl<TDirectoryRecord, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory, Integer> {

	/**
	 * Create a new TDirectoryDao without any configuration
	 */
	public TDirectoryDao() {
		super(TDirectory.T_DIRECTORY, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory.class);
	}

	/**
	 * Create a new TDirectoryDao with an attached configuration
	 */
	public TDirectoryDao(Configuration configuration) {
		super(TDirectory.T_DIRECTORY, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory> fetchById(Integer... values) {
		return fetch(TDirectory.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory fetchOneById(Integer value) {
		return fetchOne(TDirectory.ID, value);
	}

	/**
	 * Fetch records that have <code>PARENT_ID IN (values)</code>
	 */
	public List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory> fetchByParentId(Integer... values) {
		return fetch(TDirectory.PARENT_ID, values);
	}

	/**
	 * Fetch records that have <code>IS_DIRECTORY IN (values)</code>
	 */
	public List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory> fetchByIsDirectory(Integer... values) {
		return fetch(TDirectory.IS_DIRECTORY, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TDirectory> fetchByName(String... values) {
		return fetch(TDirectory.NAME, values);
	}
}
