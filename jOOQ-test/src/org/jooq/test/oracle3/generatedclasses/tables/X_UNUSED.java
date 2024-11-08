/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class X_UNUSED extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = -202343797;

	/**
	 * The singleton instance of TEST.X_UNUSED
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED X_UNUSED = new org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID_REF = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME_REF = createField("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigDecimal> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> MS_UNUSED_ID_REF = createField("MS_UNUSED_ID_REF", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> MS_UNUSED_NAME_REF = createField("MS_UNUSED_NAME_REF", org.jooq.impl.SQLDataType.VARCHAR, this);

	public X_UNUSED() {
		super("X_UNUSED", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public X_UNUSED(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_X_UNUSED;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.oracle3.generatedclasses.Keys.UK_X_UNUSED_ID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.Record, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_X_UNUSED_SELF);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED(alias);
	}
}