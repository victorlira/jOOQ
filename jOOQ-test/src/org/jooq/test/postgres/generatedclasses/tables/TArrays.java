/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TArrays extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -1058178513;

	/**
	 * The singleton instance of <code>public.t_arrays</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TArrays T_ARRAYS = new org.jooq.test.postgres.generatedclasses.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord.class;
	}

	/**
	 * The column <code>public.t_arrays.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_arrays.string_array</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.String[]> STRING_ARRAY = createField("string_array", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this);

	/**
	 * The column <code>public.t_arrays.number_array</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer[]> NUMBER_ARRAY = createField("number_array", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this);

	/**
	 * The column <code>public.t_arrays.date_array</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.sql.Date[]> DATE_ARRAY = createField("date_array", org.jooq.impl.SQLDataType.DATE.getArrayDataType(), this);

	/**
	 * The column <code>public.t_arrays.udt_array</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[]> UDT_ARRAY = createField("udt_array", org.jooq.test.postgres.generatedclasses.udt.UStreetType.U_STREET_TYPE.getDataType().getArrayDataType(), this);

	/**
	 * The column <code>public.t_arrays.enum_array</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, org.jooq.test.postgres.generatedclasses.enums.UCountry[]> ENUM_ARRAY = createField("enum_array", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.UCountry.class).getArrayDataType(), this);

	/**
	 * The column <code>public.t_arrays.array_array</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord, java.lang.Integer[]> ARRAY_ARRAY = createField("array_array", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this);

	/**
	 * Create a <code>public.t_arrays</code> table reference
	 */
	public TArrays() {
		super("t_arrays", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_arrays</code> table reference
	 */
	public TArrays(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_ARRAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_ARRAYS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TArrays as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TArrays(alias);
	}
}
