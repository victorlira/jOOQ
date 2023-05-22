/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables;


import java.util.Collection;
import java.util.function.Function;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.SelectField;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.example.testcontainersflyway.db.Public;
import org.jooq.example.testcontainersflyway.db.tables.records.CustomerListRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerList extends TableImpl<CustomerListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.customer_list</code>
     */
    public static final CustomerList CUSTOMER_LIST = new CustomerList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerListRecord> getRecordType() {
        return CustomerListRecord.class;
    }

    /**
     * The column <code>public.customer_list.id</code>.
     */
    public final TableField<CustomerListRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.customer_list.name</code>.
     */
    public final TableField<CustomerListRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.address</code>.
     */
    public final TableField<CustomerListRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.customer_list.zip code</code>.
     */
    public final TableField<CustomerListRecord, String> ZIP_CODE = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.customer_list.phone</code>.
     */
    public final TableField<CustomerListRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.customer_list.city</code>.
     */
    public final TableField<CustomerListRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.customer_list.country</code>.
     */
    public final TableField<CustomerListRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.customer_list.notes</code>.
     */
    public final TableField<CustomerListRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.customer_list.sid</code>.
     */
    public final TableField<CustomerListRecord, Long> SID = createField(DSL.name("sid"), SQLDataType.BIGINT, this, "");

    private CustomerList(Name alias, Table<CustomerListRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null);
    }

    private CustomerList(Name alias, Table<CustomerListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "customer_list" as  SELECT cu.customer_id AS id,
         (((cu.first_name)::text || ' '::text) || (cu.last_name)::text) AS name,
         a.address,
         a.postal_code AS "zip code",
         a.phone,
         city.city,
         country.country,
             CASE
                 WHEN cu.activebool THEN 'active'::text
                 ELSE ''::text
             END AS notes,
         cu.store_id AS sid
        FROM (((customer cu
          JOIN address a ON ((cu.address_id = a.address_id)))
          JOIN city ON ((a.city_id = city.city_id)))
          JOIN country ON ((city.country_id = country.country_id)));
        """));
    }

    private CustomerList(Name alias, Table<CustomerListRecord> aliased, Condition where) {
        super(alias, null, aliased, null, DSL.comment(""), TableOptions.view("""
        create view "customer_list" as  SELECT cu.customer_id AS id,
         (((cu.first_name)::text || ' '::text) || (cu.last_name)::text) AS name,
         a.address,
         a.postal_code AS "zip code",
         a.phone,
         city.city,
         country.country,
             CASE
                 WHEN cu.activebool THEN 'active'::text
                 ELSE ''::text
             END AS notes,
         cu.store_id AS sid
        FROM (((customer cu
          JOIN address a ON ((cu.address_id = a.address_id)))
          JOIN city ON ((a.city_id = city.city_id)))
          JOIN country ON ((city.country_id = country.country_id)));
        """), where);
    }

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    public CustomerList(String alias) {
        this(DSL.name(alias), CUSTOMER_LIST);
    }

    /**
     * Create an aliased <code>public.customer_list</code> table reference
     */
    public CustomerList(Name alias) {
        this(alias, CUSTOMER_LIST);
    }

    /**
     * Create a <code>public.customer_list</code> table reference
     */
    public CustomerList() {
        this(DSL.name("customer_list"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public CustomerList as(String alias) {
        return new CustomerList(DSL.name(alias), this);
    }

    @Override
    public CustomerList as(Name alias) {
        return new CustomerList(alias, this);
    }

    @Override
    public CustomerList as(Table<?> alias) {
        return new CustomerList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(String name) {
        return new CustomerList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(Name name) {
        return new CustomerList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(Table<?> name) {
        return new CustomerList(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CustomerList where(Condition condition) {
        return new CustomerList(getQualifiedName(), aliased() ? this : null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CustomerList where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CustomerList where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CustomerList where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CustomerList where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CustomerList where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CustomerList where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public CustomerList where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CustomerList whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public CustomerList whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, String, String, String, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
