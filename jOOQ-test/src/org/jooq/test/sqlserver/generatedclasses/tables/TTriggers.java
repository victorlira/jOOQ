/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TTriggers extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -2101917380;

	/**
	 * The singleton instance of dbo.t_triggers
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.sqlserver.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, this);

	public TTriggers() {
		super("t_triggers", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	public TTriggers(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}

	@Override
	public org.jooq.Identity<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.IDENTITY_T_TRIGGERS;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> getMainKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_TRIGGERS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_TRIGGERS);
	}

	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TTriggers as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TTriggers(alias);
	}
}