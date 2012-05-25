/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A Factory for specific use with the <code>TEST</code> schema.
 * <p>
 * This Factory will not render the <code>TEST</code> schema's schema name 
 * in rendered SQL (assuming that you use it as the default schema on your 
 * connection!). Use the more generic {@link org.jooq.util.oracle.OracleFactory} 
 * or the {@link org.jooq.impl.Factory} instead, if you want to fully qualify 
 * tables, routines, etc.
 */
public class DateAsTimestampTestFactory extends org.jooq.util.oracle.OracleFactory {

	private static final long serialVersionUID = 1394864375;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public DateAsTimestampTestFactory(java.sql.Connection connection) {
		super(connection);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #DateAsTimestampTestFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public DateAsTimestampTestFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public DateAsTimestampTestFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);

		initDefaultSchema();
	}

	/**
	 * Initialise the render mapping's default schema.
	 * <p>
	 * For convenience, this schema-specific factory should override any pre-existing setting
	 */
	private final void initDefaultSchema() {
		org.jooq.conf.SettingsTools.getRenderMapping(getSettings()).setDefaultSchema(org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST.getName());
	}
}
