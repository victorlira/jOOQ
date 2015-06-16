/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;


import java.math.BigDecimal;

import org.jooq.test.h2.generatedclasses.tables.interfaces.ITransactions;


/**
 * This is a POJO for table TRANSACTIONS.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Transactions implements ITransactions {

	private static final long serialVersionUID = 662620817;

	private Integer    id;
	private Integer    accountId;
	private BigDecimal amount;

	public Transactions() {}

	public Transactions(Transactions value) {
		this.id = value.id;
		this.accountId = value.accountId;
		this.amount = value.amount;
	}

	public Transactions(
		Integer    id,
		Integer    accountId,
		BigDecimal amount
	) {
		this.id = id;
		this.accountId = accountId;
		this.amount = amount;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public Transactions setId(Integer id) {
		this.id = id;
		return this;
	}

	@Override
	public Integer getAccountId() {
		return this.accountId;
	}

	@Override
	public Transactions setAccountId(Integer accountId) {
		this.accountId = accountId;
		return this;
	}

	@Override
	public BigDecimal getAmount() {
		return this.amount;
	}

	@Override
	public Transactions setAmount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITransactions from) {
		setId(from.getId());
		setAccountId(from.getAccountId());
		setAmount(from.getAmount());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITransactions> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
