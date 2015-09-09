/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.util.Arrays
import java.util.List

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl
import org.jooq.test.all.scala.Test
import org.jooq.test.oraclescala.generatedclasses.test.Keys
import org.jooq.test.oraclescala.generatedclasses.test.tables.records.TBookToBookStoreRecord


object TBookToBookStore {

	/**
	 * The reference instance of <code>TEST.T_BOOK_TO_BOOK_STORE</code>
	 */
	val T_BOOK_TO_BOOK_STORE = new TBookToBookStore
}

/**
 * An m:n relation between books and book stores
 */
class TBookToBookStore(alias : String, aliased : Table[TBookToBookStoreRecord], parameters : Array[ Field[_] ]) extends TableImpl[TBookToBookStoreRecord](alias, org.jooq.test.oraclescala.generatedclasses.test.Test.TEST, aliased, parameters, "An m:n relation between books and book stores") with Test {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[TBookToBookStoreRecord] = {
		classOf[TBookToBookStoreRecord]
	}

	/**
	 * The column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. The book store name
	 */
	val BOOK_STORE_NAME : TableField[TBookToBookStoreRecord, String] = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), "The book store name")

	/**
	 * The column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. The book ID
	 */
	val BOOK_ID : TableField[TBookToBookStoreRecord, Integer] = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "The book ID")

	/**
	 * The column <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>. The number of books on stock
	 */
	val STOCK : TableField[TBookToBookStoreRecord, Integer] = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, "The number of books on stock")

	/**
	 * Create a <code>TEST.T_BOOK_TO_BOOK_STORE</code> table reference
	 */
	def this() = {
		this("T_BOOK_TO_BOOK_STORE", null, null)
	}

	/**
	 * Create an aliased <code>TEST.T_BOOK_TO_BOOK_STORE</code> table reference
	 */
	def this(alias : String) = {
		this(alias, org.jooq.test.oraclescala.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, null)
	}

	private def this(alias : String, aliased : Table[TBookToBookStoreRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[TBookToBookStoreRecord] = {
		Keys.PK_B2BS
	}

	override def getKeys : List[ UniqueKey[TBookToBookStoreRecord] ] = {
		return Arrays.asList[ UniqueKey[TBookToBookStoreRecord] ](Keys.PK_B2BS)
	}

	override def getReferences : List[ ForeignKey[TBookToBookStoreRecord, _] ] = {
		return Arrays.asList[ ForeignKey[TBookToBookStoreRecord, _] ](Keys.FK_B2BS_BS_NAME, Keys.FK_B2BS_B_ID)
	}

	override def as(alias : String) : TBookToBookStore = {
		new TBookToBookStore(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : TBookToBookStore = {
		new TBookToBookStore(name, null)
	}
}
