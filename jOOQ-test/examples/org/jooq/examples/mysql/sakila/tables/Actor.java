/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Actor extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> {

	private static final long serialVersionUID = 296479970;

	/**
	 * The singleton instance of <code>sakila.actor</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Actor ACTOR = new org.jooq.examples.mysql.sakila.tables.Actor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.ActorRecord.class;
	}

	/**
	 * The column <code>sakila.actor.actor_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.Short> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.actor.first_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.actor.last_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.actor.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.actor</code> table reference
	 */
	public Actor() {
		super("actor", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.actor</code> table reference
	 */
	public Actor(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Actor.ACTOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.ActorRecord, java.lang.Short> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_ACTOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_ACTOR_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.ActorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.ActorRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_ACTOR_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.Actor as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Actor(alias);
	}
}
