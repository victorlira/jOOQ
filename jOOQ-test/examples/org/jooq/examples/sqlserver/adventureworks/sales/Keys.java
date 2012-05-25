/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>Sales</code> 
 * schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, java.lang.Integer> IDENTITY_CreditCard = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard, org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CreditCardID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.lang.Integer> IDENTITY_CurrencyRate = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.CurrencyRateID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.lang.Integer> IDENTITY_Customer = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.Customer, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.Customer.CustomerID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderDetail, java.lang.Integer> IDENTITY_SalesOrderDetail = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderDetailID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, java.lang.Integer> IDENTITY_SalesOrderHeader = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.SalesOrderID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason, java.lang.Integer> IDENTITY_SalesReason = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.SalesReasonID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, java.lang.Integer> IDENTITY_SalesTaxRate = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate.SalesTaxRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate.SalesTaxRate.SalesTaxRateID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory, java.lang.Integer> IDENTITY_SalesTerritory = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory.SalesTerritory, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory.SalesTerritory.TerritoryID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> IDENTITY_ShoppingCartItem = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem, org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ShoppingCartItemID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOffer, java.lang.Integer> IDENTITY_SpecialOffer = createIdentity(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOffer.SpecialOffer, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOffer.SpecialOffer.SpecialOfferID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactCreditCard> PK_ContactCreditCard_ContactID_CreditCardID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.ContactCreditCard.ContactCreditCard, org.jooq.examples.sqlserver.adventureworks.sales.tables.ContactCreditCard.ContactCreditCard.ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.ContactCreditCard.ContactCreditCard.CreditCardID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency> PK_CountryRegionCurrency_CountryRegionCode_CurrencyCode = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CurrencyCode);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard> PK_CreditCard_CreditCardID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard, org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard.CreditCardID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Currency> PK_Currency_CurrencyCode = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Currency.Currency, org.jooq.examples.sqlserver.adventureworks.sales.tables.Currency.Currency.CurrencyCode);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate> PK_CurrencyRate_CurrencyRateID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.CurrencyRateID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> PK_Customer_CustomerID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.Customer, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.Customer.CustomerID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress> PK_CustomerAddress_CustomerID_AddressID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress.CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress.AddressID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> PK_Individual_CustomerID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual.CustomerID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderDetail> PK_SalesOrderDetail_SalesOrderID_SalesOrderDetailID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderDetailID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader> PK_SalesOrderHeader_SalesOrderID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.SalesOrderID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason> PK_SalesOrderHeaderSalesReason_SalesOrderID_SalesReasonID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason.SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason.SalesReasonID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson> PK_SalesPerson_SalesPersonID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesPersonID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPersonQuotaHistory> PK_SalesPersonQuotaHistory_SalesPersonID_QuotaDate = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.QuotaDate);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason> PK_SalesReason_SalesReasonID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.SalesReasonID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate> PK_SalesTaxRate_SalesTaxRateID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate.SalesTaxRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate.SalesTaxRate.SalesTaxRateID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> PK_SalesTerritory_TerritoryID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory.SalesTerritory, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritory.SalesTerritory.TerritoryID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritoryHistory> PK_SalesTerritoryHistory_SalesPersonID_StartDate_TerritoryID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.StartDate, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.TerritoryID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> PK_ShoppingCartItem_ShoppingCartItemID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem, org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ShoppingCartItemID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOffer> PK_SpecialOffer_SpecialOfferID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOffer.SpecialOffer, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOffer.SpecialOffer.SpecialOfferID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOfferProduct> PK_SpecialOfferProduct_SpecialOfferID_ProductID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.SpecialOfferID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.ProductID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Store> PK_Store_CustomerID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.Store, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.Store.CustomerID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact> PK_StoreContact_CustomerID_ContactID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactCreditCard, org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> FK_ContactCreditCard_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.ContactCreditCard.ContactCreditCard, org.jooq.examples.sqlserver.adventureworks.sales.tables.ContactCreditCard.ContactCreditCard.ContactID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ContactCreditCard, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard> FK_ContactCreditCard_CreditCard_CreditCardID = createForeignKey(PK_CreditCard_CreditCardID, org.jooq.examples.sqlserver.adventureworks.sales.tables.ContactCreditCard.ContactCreditCard, org.jooq.examples.sqlserver.adventureworks.sales.tables.ContactCreditCard.ContactCreditCard.CreditCardID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion> FK_CountryRegionCurrency_CountryRegion_CountryRegionCode = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_CountryRegion_CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CountryRegionCode);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CountryRegionCurrency, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Currency> FK_CountryRegionCurrency_Currency_CurrencyCode = createForeignKey(PK_Currency_CurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency, org.jooq.examples.sqlserver.adventureworks.sales.tables.CountryRegionCurrency.CountryRegionCurrency.CurrencyCode);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Currency> FK_CurrencyRate_Currency_FromCurrencyCode = createForeignKey(PK_Currency_CurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.FromCurrencyCode);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Currency> FK_CurrencyRate_Currency_ToCurrencyCode = createForeignKey(PK_Currency_CurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.ToCurrencyCode);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> FK_Customer_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.Customer, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.Customer.TerritoryID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> FK_CustomerAddress_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress.CustomerID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address> FK_CustomerAddress_Address_AddressID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress.AddressID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType> FK_CustomerAddress_AddressType_AddressTypeID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_AddressType_AddressTypeID, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress.AddressTypeID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> FK_Individual_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual.CustomerID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> FK_Individual_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual.ContactID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderDetail, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader> FK_SalesOrderDetail_SalesOrderHeader_SalesOrderID = createForeignKey(PK_SalesOrderHeader_SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderDetail, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOfferProduct> FK_SalesOrderDetail_SpecialOfferProduct_SpecialOfferIDProductID = createForeignKey(PK_SpecialOfferProduct_SpecialOfferID_ProductID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SpecialOfferID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.ProductID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> FK_SalesOrderHeader_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.CustomerID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> FK_SalesOrderHeader_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.ContactID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson> FK_SalesOrderHeader_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.SalesPersonID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> FK_SalesOrderHeader_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.TerritoryID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address> FK_SalesOrderHeader_Address_BillToAddressID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.BillToAddressID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.person.tables.records.Address> FK_SalesOrderHeader_Address_ShipToAddressID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.ShipToAddressID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod> FK_SalesOrderHeader_ShipMethod_ShipMethodID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_ShipMethod_ShipMethodID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.ShipMethodID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard> FK_SalesOrderHeader_CreditCard_CreditCardID = createForeignKey(PK_CreditCard_CreditCardID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.CreditCardID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate> FK_SalesOrderHeader_CurrencyRate_CurrencyRateID = createForeignKey(PK_CurrencyRate_CurrencyRateID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeader.SalesOrderHeader.CurrencyRateID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeader> FK_SalesOrderHeaderSalesReason_SalesOrderHeader_SalesOrderID = createForeignKey(PK_SalesOrderHeader_SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason.SalesOrderID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason> FK_SalesOrderHeaderSalesReason_SalesReason_SalesReasonID = createForeignKey(PK_SalesReason_SalesReasonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason.SalesReasonID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Employee> FK_SalesPerson_Employee_SalesPersonID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesPersonID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> FK_SalesPerson_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.TerritoryID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPersonQuotaHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson> FK_SalesPersonQuotaHistory_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesPersonID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTaxRate, org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> FK_SalesTaxRate_StateProvince_StateProvinceID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_StateProvince_StateProvinceID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate.SalesTaxRate, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTaxRate.SalesTaxRate.StateProvinceID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritoryHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson> FK_SalesTerritoryHistory_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.SalesPersonID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritoryHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritory> FK_SalesTerritoryHistory_SalesTerritory_TerritoryID = createForeignKey(PK_SalesTerritory_TerritoryID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.TerritoryID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product> FK_ShoppingCartItem_Product_ProductID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem, org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ProductID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOfferProduct, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOffer> FK_SpecialOfferProduct_SpecialOffer_SpecialOfferID = createForeignKey(PK_SpecialOffer_SpecialOfferID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.SpecialOfferID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SpecialOfferProduct, org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product> FK_SpecialOfferProduct_Product_ProductID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct, org.jooq.examples.sqlserver.adventureworks.sales.tables.SpecialOfferProduct.SpecialOfferProduct.ProductID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Store, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> FK_Store_Customer_CustomerID = createForeignKey(PK_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.Store, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.Store.CustomerID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Store, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson> FK_Store_SalesPerson_SalesPersonID = createForeignKey(PK_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.Store, org.jooq.examples.sqlserver.adventureworks.sales.tables.Store.Store.SalesPersonID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Store> FK_StoreContact_Store_CustomerID = createForeignKey(PK_Store_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.CustomerID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> FK_StoreContact_Contact_ContactID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact, org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType> FK_StoreContact_ContactType_ContactTypeID = createForeignKey(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_ContactType_ContactTypeID, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact, org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactTypeID);

	/**
	 * No instances
	 */
	private Keys() {}
}
