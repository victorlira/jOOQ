/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;


import java.sql.Date;

import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IVAuthor;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor implements IVAuthor {

	private static final long serialVersionUID = -1044399013;

	private Integer id;
	private String  firstName;
	private String  lastName;
	private Date    dateOfBirth;
	private Integer yearOfBirth;
	private Object  address;

	public VAuthor() {}

	public VAuthor(VAuthor value) {
		this.id = value.id;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.dateOfBirth = value.dateOfBirth;
		this.yearOfBirth = value.yearOfBirth;
		this.address = value.address;
	}

	public VAuthor(
		Integer id,
		String  firstName,
		String  lastName,
		Date    dateOfBirth,
		Integer yearOfBirth,
		Object  address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	@Override
	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	public Object getAddress() {
		return this.address;
	}

	@Override
	public void setAddress(Object address) {
		this.address = address;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IVAuthor from) {
		setId(from.getId());
		setFirstName(from.getFirstName());
		setLastName(from.getLastName());
		setDateOfBirth(from.getDateOfBirth());
		setYearOfBirth(from.getYearOfBirth());
		setAddress(from.getAddress());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IVAuthor> E into(E into) {
		into.from(this);
		return into;
	}
}
