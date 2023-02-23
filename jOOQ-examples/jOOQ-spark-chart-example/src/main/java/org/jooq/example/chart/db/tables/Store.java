/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.chart.db.Indexes;
import org.jooq.example.chart.db.Keys;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.StoreRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Store extends TableImpl<StoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.store</code>
     */
    public static final Store STORE = new Store();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreRecord> getRecordType() {
        return StoreRecord.class;
    }

    /**
     * The column <code>public.store.store_id</code>.
     */
    public final TableField<StoreRecord, Integer> STORE_ID = createField(DSL.name("store_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.store.manager_staff_id</code>.
     */
    public final TableField<StoreRecord, Short> MANAGER_STAFF_ID = createField(DSL.name("manager_staff_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.store.address_id</code>.
     */
    public final TableField<StoreRecord, Short> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.store.last_update</code>.
     */
    public final TableField<StoreRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "");

    private Store(Name alias, Table<StoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Store(Name alias, Table<StoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    public Store(String alias) {
        this(DSL.name(alias), STORE);
    }

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    public Store(Name alias) {
        this(alias, STORE);
    }

    /**
     * Create a <code>public.store</code> table reference
     */
    public Store() {
        this(DSL.name("store"), null);
    }

    public <O extends Record> Store(Table<O> child, ForeignKey<O, StoreRecord> key) {
        super(child, key, STORE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_UNQ_MANAGER_STAFF_ID);
    }

    @Override
    public Identity<StoreRecord, Integer> getIdentity() {
        return (Identity<StoreRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<StoreRecord> getPrimaryKey() {
        return Keys.STORE_PKEY;
    }

    @Override
    public List<ForeignKey<StoreRecord, ?>> getReferences() {
        return Arrays.asList(Keys.STORE__STORE_MANAGER_STAFF_ID_FKEY, Keys.STORE__STORE_ADDRESS_ID_FKEY);
    }

    private transient Staff _staff;
    private transient Address _address;

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    public Staff staff() {
        if (_staff == null)
            _staff = new Staff(this, Keys.STORE__STORE_MANAGER_STAFF_ID_FKEY);

        return _staff;
    }

    /**
     * Get the implicit join path to the <code>public.address</code> table.
     */
    public Address address() {
        if (_address == null)
            _address = new Address(this, Keys.STORE__STORE_ADDRESS_ID_FKEY);

        return _address;
    }

    @Override
    public Store as(String alias) {
        return new Store(DSL.name(alias), this);
    }

    @Override
    public Store as(Name alias) {
        return new Store(alias, this);
    }

    @Override
    public Store as(Table<?> alias) {
        return new Store(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(String name) {
        return new Store(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(Name name) {
        return new Store(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(Table<?> name) {
        return new Store(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Short, Short, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super Short, ? super Short, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super Short, ? super Short, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
