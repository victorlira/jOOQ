/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.VLibrary;
import org.jooq.test.postgres.generatedclasses.tables.interfaces.IVLibrary;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibraryRecord extends TableRecordImpl<VLibraryRecord> implements Record2<String, String>, IVLibrary {

	private static final long serialVersionUID = -1747590570;

	/**
	 * Setter for <code>public.v_library.author</code>.
	 */
	public VLibraryRecord setAuthor(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.v_library.author</code>.
	 */
	@Override
	public String getAuthor() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.v_library.title</code>.
	 */
	public VLibraryRecord setTitle(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.v_library.title</code>.
	 */
	@Override
	public String getTitle() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return VLibrary.V_LIBRARY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord value1(String value) {
		setAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(VLibrary.V_LIBRARY);
	}

	/**
	 * Create a detached, initialised VLibraryRecord
	 */
	public VLibraryRecord(String author, String title) {
		super(VLibrary.V_LIBRARY);

		setValue(0, author);
		setValue(1, title);
	}
}
