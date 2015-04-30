/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.postgres.generatedclasses.Keys;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.enums.UCountry;
import org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord;
import org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord;
import org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArrays extends TableImpl<TArraysRecord> {

	private static final long serialVersionUID = 2082297609;

	/**
	 * The reference instance of <code>public.t_arrays</code>
	 */
	public static final TArrays T_ARRAYS = new TArrays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TArraysRecord> getRecordType() {
		return TArraysRecord.class;
	}

	/**
	 * The column <code>public.t_arrays.id</code>.
	 */
	public final TableField<TArraysRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.t_arrays.string_array</code>.
	 */
	public final TableField<TArraysRecord, String[]> STRING_ARRAY = createField("string_array", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.number_array</code>.
	 */
	public final TableField<TArraysRecord, Integer[]> NUMBER_ARRAY = createField("number_array", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.date_array</code>.
	 */
	public final TableField<TArraysRecord, Date[]> DATE_ARRAY = createField("date_array", org.jooq.impl.SQLDataType.DATE.getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.udt_array</code>.
	 */
	public final TableField<TArraysRecord, UStreetTypeRecord[]> UDT_ARRAY = createField("udt_array", org.jooq.test.postgres.generatedclasses.udt.UStreetType.U_STREET_TYPE.getDataType().getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.address_array</code>.
	 */
	public final TableField<TArraysRecord, UAddressTypeRecord[]> ADDRESS_ARRAY = createField("address_array", org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType().getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.enum_array</code>.
	 */
	public final TableField<TArraysRecord, UCountry[]> ENUM_ARRAY = createField("enum_array", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.UCountry.class).getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.array_array</code>.
	 */
	public final TableField<TArraysRecord, Integer[]> ARRAY_ARRAY = createField("array_array", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.number_list</code>.
	 */
	public final TableField<TArraysRecord, String[]> NUMBER_LIST = createField("number_list", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.string_list</code>.
	 */
	public final TableField<TArraysRecord, String[]> STRING_LIST = createField("string_list", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * The column <code>public.t_arrays.date_list</code>.
	 */
	public final TableField<TArraysRecord, String[]> DATE_LIST = createField("date_list", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

	/**
	 * Create a <code>public.t_arrays</code> table reference
	 */
	public TArrays() {
		this("t_arrays", null);
	}

	/**
	 * Create an aliased <code>public.t_arrays</code> table reference
	 */
	public TArrays(String alias) {
		this(alias, T_ARRAYS);
	}

	private TArrays(String alias, Table<TArraysRecord> aliased) {
		this(alias, aliased, null);
	}

	private TArrays(String alias, Table<TArraysRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TArraysRecord> getPrimaryKey() {
		return Keys.PK_T_ARRAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TArraysRecord>> getKeys() {
		return Arrays.<UniqueKey<TArraysRecord>>asList(Keys.PK_T_ARRAYS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArrays as(String alias) {
		return new TArrays(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TArrays rename(String name) {
		return new TArrays(name, null);
	}
}
