/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.daos


import java.lang.Integer
import java.lang.String
import java.math.BigDecimal
import java.sql.Date
import java.util.List

import org.jooq.Configuration
import org.jooq.impl.DAOImpl
import org.jooq.test.all.scala.Test
import org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.TBookSale
import org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.records.TBookSaleRecord


/**
 * This class is generated by jOOQ.
 */
class TBookSaleDao(configuration : Configuration) extends DAOImpl[TBookSaleRecord, org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale, Integer](TBookSale.T_BOOK_SALE, classOf[org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale], configuration) with Test {

	/**
	 * Create a new TBookSaleDao without any configuration
	 */
	def this() = {
		this(null)
	}

	override protected def getId(o : org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale) : Integer = {
		o.getId
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	def fetchById(values : Integer*) : List[org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale] = {
		fetch(TBookSale.T_BOOK_SALE.ID, values:_*)
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	def fetchOneById(value : Integer) : org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale = {
		fetchOne(TBookSale.T_BOOK_SALE.ID, value)
	}

	/**
	 * Fetch records that have <code>BOOK_ID IN (values)</code>
	 */
	def fetchByBookId(values : Integer*) : List[org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale] = {
		fetch(TBookSale.T_BOOK_SALE.BOOK_ID, values:_*)
	}

	/**
	 * Fetch records that have <code>BOOK_STORE_NAME IN (values)</code>
	 */
	def fetchByBookStoreName(values : String*) : List[org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale] = {
		fetch(TBookSale.T_BOOK_SALE.BOOK_STORE_NAME, values:_*)
	}

	/**
	 * Fetch records that have <code>SOLD_AT IN (values)</code>
	 */
	def fetchBySoldAt(values : Date*) : List[org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale] = {
		fetch(TBookSale.T_BOOK_SALE.SOLD_AT, values:_*)
	}

	/**
	 * Fetch records that have <code>SOLD_FOR IN (values)</code>
	 */
	def fetchBySoldFor(values : BigDecimal*) : List[org.jooq.test.oraclescala.generatedclasses.multi_schema.tables.pojos.TBookSale] = {
		fetch(TBookSale.T_BOOK_SALE.SOLD_FOR, values:_*)
	}
}
