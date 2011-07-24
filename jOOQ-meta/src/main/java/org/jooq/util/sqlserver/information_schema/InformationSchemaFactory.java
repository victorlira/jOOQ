/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class InformationSchemaFactory extends org.jooq.util.hsqldb.HSQLDBFactory {

	private static final long serialVersionUID = -1318824023;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public InformationSchemaFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param mapping The schema mapping to use with objects created from this factory
	 */
	public InformationSchemaFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}
}
