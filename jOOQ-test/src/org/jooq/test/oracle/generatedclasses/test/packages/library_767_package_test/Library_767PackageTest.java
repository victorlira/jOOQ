/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.packages.library_767_package_test;

/**
 * This class is generated by jOOQ.
 */
public class Library_767PackageTest extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = 1715232815;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public Library_767PackageTest() {
		super("LIBRARY_767_PACKAGE_TEST", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.packages.Library_767PackageTest.LIBRARY_767_PACKAGE_TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}