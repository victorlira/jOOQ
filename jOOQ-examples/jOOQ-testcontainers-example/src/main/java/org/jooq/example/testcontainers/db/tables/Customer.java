/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.SelectField;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.testcontainers.db.Indexes;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.Address.AddressPath;
import org.jooq.example.testcontainers.db.tables.Payment.PaymentPath;
import org.jooq.example.testcontainers.db.tables.PaymentP2007_01.PaymentP2007_01Path;
import org.jooq.example.testcontainers.db.tables.PaymentP2007_02.PaymentP2007_02Path;
import org.jooq.example.testcontainers.db.tables.PaymentP2007_03.PaymentP2007_03Path;
import org.jooq.example.testcontainers.db.tables.PaymentP2007_04.PaymentP2007_04Path;
import org.jooq.example.testcontainers.db.tables.PaymentP2007_05.PaymentP2007_05Path;
import org.jooq.example.testcontainers.db.tables.PaymentP2007_06.PaymentP2007_06Path;
import org.jooq.example.testcontainers.db.tables.Rental.RentalPath;
import org.jooq.example.testcontainers.db.tables.Store.StorePath;
import org.jooq.example.testcontainers.db.tables.records.CustomerRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>public.customer.customer_id</code>.
     */
    public final TableField<CustomerRecord, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.customer.store_id</code>.
     */
    public final TableField<CustomerRecord, Long> STORE_ID = createField(DSL.name("store_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.customer.first_name</code>.
     */
    public final TableField<CustomerRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.customer.last_name</code>.
     */
    public final TableField<CustomerRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.customer.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.customer.address_id</code>.
     */
    public final TableField<CustomerRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.customer.activebool</code>.
     */
    public final TableField<CustomerRecord, Boolean> ACTIVEBOOL = createField(DSL.name("activebool"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.customer.create_date</code>.
     */
    public final TableField<CustomerRecord, LocalDate> CREATE_DATE = createField(DSL.name("create_date"), SQLDataType.LOCALDATE.nullable(false).defaultValue(DSL.field(DSL.raw("('now'::text)::date"), SQLDataType.LOCALDATE)), this, "");

    /**
     * The column <code>public.customer.last_update</code>.
     */
    public final TableField<CustomerRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.customer.active</code>.
     */
    public final TableField<CustomerRecord, Integer> ACTIVE = createField(DSL.name("active"), SQLDataType.INTEGER, this, "");

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    /**
     * Create a <code>public.customer</code> table reference
     */
    public Customer() {
        this(DSL.name("customer"), null);
    }

    public <O extends Record> Customer(Table<O> path, ForeignKey<O, CustomerRecord> childPath, InverseForeignKey<O, CustomerRecord> parentPath) {
        super(path, childPath, parentPath, CUSTOMER);
    }

    public static class CustomerPath extends Customer implements Path<CustomerRecord> {
        public <O extends Record> CustomerPath(Table<O> path, ForeignKey<O, CustomerRecord> childPath, InverseForeignKey<O, CustomerRecord> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_ADDRESS_ID, Indexes.IDX_FK_STORE_ID, Indexes.IDX_LAST_NAME);
    }

    @Override
    public Identity<CustomerRecord, Long> getIdentity() {
        return (Identity<CustomerRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.CUSTOMER_PKEY;
    }

    @Override
    public List<ForeignKey<CustomerRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CUSTOMER__CUSTOMER_STORE_ID_FKEY, Keys.CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY);
    }

    private transient StorePath _store;

    /**
     * Get the implicit join path to the <code>public.store</code> table.
     */
    public StorePath store() {
        if (_store == null)
            _store = new StorePath(this, Keys.CUSTOMER__CUSTOMER_STORE_ID_FKEY, null);

        return _store;
    }

    private transient AddressPath _address;

    /**
     * Get the implicit join path to the <code>public.address</code> table.
     */
    public AddressPath address() {
        if (_address == null)
            _address = new AddressPath(this, Keys.CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY, null);

        return _address;
    }

    private transient PaymentPath _payment;

    /**
     * Get the implicit to-many join path to the <code>public.payment</code>
     * table
     */
    public PaymentPath payment() {
        if (_payment == null)
            _payment = new PaymentPath(this, null, Keys.PAYMENT__PAYMENT_CUSTOMER_ID_FKEY.getInverseKey());

        return _payment;
    }

    private transient PaymentP2007_01Path _paymentP2007_01;

    /**
     * Get the implicit to-many join path to the
     * <code>public.payment_p2007_01</code> table
     */
    public PaymentP2007_01Path paymentP2007_01() {
        if (_paymentP2007_01 == null)
            _paymentP2007_01 = new PaymentP2007_01Path(this, null, Keys.PAYMENT_P2007_01__PAYMENT_P2007_01_CUSTOMER_ID_FKEY.getInverseKey());

        return _paymentP2007_01;
    }

    private transient PaymentP2007_02Path _paymentP2007_02;

    /**
     * Get the implicit to-many join path to the
     * <code>public.payment_p2007_02</code> table
     */
    public PaymentP2007_02Path paymentP2007_02() {
        if (_paymentP2007_02 == null)
            _paymentP2007_02 = new PaymentP2007_02Path(this, null, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY.getInverseKey());

        return _paymentP2007_02;
    }

    private transient PaymentP2007_03Path _paymentP2007_03;

    /**
     * Get the implicit to-many join path to the
     * <code>public.payment_p2007_03</code> table
     */
    public PaymentP2007_03Path paymentP2007_03() {
        if (_paymentP2007_03 == null)
            _paymentP2007_03 = new PaymentP2007_03Path(this, null, Keys.PAYMENT_P2007_03__PAYMENT_P2007_03_CUSTOMER_ID_FKEY.getInverseKey());

        return _paymentP2007_03;
    }

    private transient PaymentP2007_04Path _paymentP2007_04;

    /**
     * Get the implicit to-many join path to the
     * <code>public.payment_p2007_04</code> table
     */
    public PaymentP2007_04Path paymentP2007_04() {
        if (_paymentP2007_04 == null)
            _paymentP2007_04 = new PaymentP2007_04Path(this, null, Keys.PAYMENT_P2007_04__PAYMENT_P2007_04_CUSTOMER_ID_FKEY.getInverseKey());

        return _paymentP2007_04;
    }

    private transient PaymentP2007_05Path _paymentP2007_05;

    /**
     * Get the implicit to-many join path to the
     * <code>public.payment_p2007_05</code> table
     */
    public PaymentP2007_05Path paymentP2007_05() {
        if (_paymentP2007_05 == null)
            _paymentP2007_05 = new PaymentP2007_05Path(this, null, Keys.PAYMENT_P2007_05__PAYMENT_P2007_05_CUSTOMER_ID_FKEY.getInverseKey());

        return _paymentP2007_05;
    }

    private transient PaymentP2007_06Path _paymentP2007_06;

    /**
     * Get the implicit to-many join path to the
     * <code>public.payment_p2007_06</code> table
     */
    public PaymentP2007_06Path paymentP2007_06() {
        if (_paymentP2007_06 == null)
            _paymentP2007_06 = new PaymentP2007_06Path(this, null, Keys.PAYMENT_P2007_06__PAYMENT_P2007_06_CUSTOMER_ID_FKEY.getInverseKey());

        return _paymentP2007_06;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit to-many join path to the <code>public.rental</code>
     * table
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, null, Keys.RENTAL__RENTAL_CUSTOMER_ID_FKEY.getInverseKey());

        return _rental;
    }

    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    @Override
    public Customer as(Table<?> alias) {
        return new Customer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Table<?> name) {
        return new Customer(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Condition condition) {
        return new Customer(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, String, String, String, Long, Boolean, LocalDate, LocalDateTime, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super Boolean, ? super LocalDate, ? super LocalDateTime, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super Boolean, ? super LocalDate, ? super LocalDateTime, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
