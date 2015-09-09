/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.pojos


import java.io.Serializable
import java.lang.String

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import org.jooq.test.all.scala.Test


/**
 * A book store
 */
@Entity
@Table(name = "T_BOOK_STORE", schema = "TEST")
class TBookStore(
	  private var name : String
) extends Test with Serializable {

	def this() = {
		this(null : String)
	}

	def this (value : TBookStore) = {
		this(
			  value.name
		)
	}

	@Id
	@Column(name = "NAME", unique = true, nullable = false, length = 400)
	@NotNull
	@Size(max = 400)
	def getName : String = {
		this.name
	}

	def setName(name : String) : Unit = {
		this.name = name
	}

	override def equals(obj : Any) : scala.Boolean = {
		if (this == obj)
			return true
		if (obj == null)
			return false
		if (getClass() != obj.getClass())
			return false
		val other = obj.asInstanceOf[TBookStore]
		if (name == null) {
			if (other.name != null)
				return false
		}
		else if (!name.equals(other.name))
			return false
		return true
	}

	override def hashCode : Int = {
		val prime = 31
		var result = 1
		result = prime * result + (if (name == null) 0 else name.hashCode())
		return result
	}
}
