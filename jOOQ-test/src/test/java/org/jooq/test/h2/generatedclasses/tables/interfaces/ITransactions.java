/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITransactions extends Serializable {

	/**
	 * Setter for <code>PUBLIC.TRANSACTIONS.ID</code>.
	 */
	public ITransactions setId(Integer value);

	/**
	 * Getter for <code>PUBLIC.TRANSACTIONS.ID</code>.
	 */
	public Integer getId();

	/**
	 * Setter for <code>PUBLIC.TRANSACTIONS.ACCOUNT_ID</code>.
	 */
	public ITransactions setAccountId(Integer value);

	/**
	 * Getter for <code>PUBLIC.TRANSACTIONS.ACCOUNT_ID</code>.
	 */
	public Integer getAccountId();

	/**
	 * Setter for <code>PUBLIC.TRANSACTIONS.AMOUNT</code>.
	 */
	public ITransactions setAmount(BigDecimal value);

	/**
	 * Getter for <code>PUBLIC.TRANSACTIONS.AMOUNT</code>.
	 */
	public BigDecimal getAmount();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITransactions
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITransactions from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITransactions
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITransactions> E into(E into);
}
