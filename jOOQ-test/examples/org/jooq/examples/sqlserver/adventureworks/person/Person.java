/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person;

/**
 * This class is generated by jOOQ.
 */
public class Person extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -198705809;

	/**
	 * The singleton instance of Person
	 */
	public static final Person Person = new Person();

	/**
	 * No further instances allowed
	 */
	private Person() {
		super("Person");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.examples.sqlserver.adventureworks.person.tables.Address.Address,
			org.jooq.examples.sqlserver.adventureworks.person.tables.AddressType.AddressType,
			org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact,
			org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType,
			org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion,
			org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince.StateProvince,
			org.jooq.examples.sqlserver.adventureworks.person.tables.vAdditionalContactInfo.vAdditionalContactInfo,
			org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion.vStateProvinceCountryRegion);
	}
}