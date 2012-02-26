/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in sakila
 */
public final class Routines {

	/**
	 * Call sakila.film_in_stock
	 *
	 * @param pFilmId IN parameter
	 * @param pStoreId IN parameter
	 * @param pFilmCount OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer filmInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) {
		org.jooq.examples.mysql.sakila.routines.FilmInStock p = new org.jooq.examples.mysql.sakila.routines.FilmInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Call sakila.film_not_in_stock
	 *
	 * @param pFilmId IN parameter
	 * @param pStoreId IN parameter
	 * @param pFilmCount OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer filmNotInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) {
		org.jooq.examples.mysql.sakila.routines.FilmNotInStock p = new org.jooq.examples.mysql.sakila.routines.FilmNotInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Call sakila.get_customer_balance
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.math.BigDecimal getCustomerBalance(org.jooq.Configuration configuration, java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get sakila.get_customer_balance as a field
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Get sakila.get_customer_balance as a field
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(org.jooq.Field<java.lang.Integer> pCustomerId, org.jooq.Field<java.sql.Timestamp> pEffectiveDate) {
		org.jooq.examples.mysql.sakila.routines.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.routines.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Call sakila.inventory_held_by_customer
	 *
	 * @param pInventoryId
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer inventoryHeldByCustomer(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get sakila.inventory_held_by_customer as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get sakila.inventory_held_by_customer as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Call sakila.inventory_in_stock
	 *
	 * @param pInventoryId
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Byte inventoryInStock(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryInStock f = new org.jooq.examples.mysql.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get sakila.inventory_in_stock as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryInStock f = new org.jooq.examples.mysql.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get sakila.inventory_in_stock as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.routines.InventoryInStock f = new org.jooq.examples.mysql.sakila.routines.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Call sakila.rewards_report
	 *
	 * @param minMonthlyPurchases IN parameter
	 * @param minDollarAmountPurchased IN parameter
	 * @param countRewardees OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer rewardsReport(org.jooq.Configuration configuration, java.lang.Byte minMonthlyPurchases, java.math.BigDecimal minDollarAmountPurchased) {
		org.jooq.examples.mysql.sakila.routines.RewardsReport p = new org.jooq.examples.mysql.sakila.routines.RewardsReport();
		p.setMinMonthlyPurchases(minMonthlyPurchases);
		p.setMinDollarAmountPurchased(minDollarAmountPurchased);

		p.execute(configuration);
		return p.getCountRewardees();
	}

	/**
	 * No instances
	 */
	private Routines() {}
}
