/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Customeraddress extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord> {

	private static final long serialVersionUID = -64216529;

	/**
	 * The singleton instance of Sales.CustomerAddress
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress CUSTOMERADDRESS = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CustomerAddress_Customer_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Customer (CustomerID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, java.lang.Integer> CUSTOMERID = createField("CustomerID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CustomerAddress_Address_AddressID
	 * FOREIGN KEY (AddressID)
	 * REFERENCES Person.Address (AddressID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, java.lang.Integer> ADDRESSID = createField("AddressID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CustomerAddress_AddressType_AddressTypeID
	 * FOREIGN KEY (AddressTypeID)
	 * REFERENCES Person.AddressType (AddressTypeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, java.lang.Integer> ADDRESSTYPEID = createField("AddressTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Customeraddress() {
		super("CustomerAddress", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Customeraddress(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress.CUSTOMERADDRESS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CUSTOMERADDRESS_CUSTOMERID_ADDRESSID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CUSTOMERADDRESS_CUSTOMERID_ADDRESSID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomeraddressRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CUSTOMERADDRESS_CUSTOMER_CUSTOMERID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CUSTOMERADDRESS_ADDRESS_ADDRESSID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CUSTOMERADDRESS_ADDRESSTYPE_ADDRESSTYPEID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Customeraddress(alias);
	}
}
