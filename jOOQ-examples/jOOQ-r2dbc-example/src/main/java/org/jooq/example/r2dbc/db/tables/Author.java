/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.r2dbc.db.tables;


import java.util.Collection;
import java.util.function.Function;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.SelectField;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.r2dbc.db.Keys;
import org.jooq.example.r2dbc.db.R2dbcExample;
import org.jooq.example.r2dbc.db.tables.Book.BookPath;
import org.jooq.example.r2dbc.db.tables.records.AuthorRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author extends TableImpl<AuthorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>R2DBC_EXAMPLE.AUTHOR</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorRecord> getRecordType() {
        return AuthorRecord.class;
    }

    /**
     * The column <code>R2DBC_EXAMPLE.AUTHOR.ID</code>.
     */
    public final TableField<AuthorRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>R2DBC_EXAMPLE.AUTHOR.FIRST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> FIRST_NAME = createField(DSL.name("FIRST_NAME"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>R2DBC_EXAMPLE.AUTHOR.LAST_NAME</code>.
     */
    public final TableField<AuthorRecord, String> LAST_NAME = createField(DSL.name("LAST_NAME"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    private Author(Name alias, Table<AuthorRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null);
    }

    private Author(Name alias, Table<AuthorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    private Author(Name alias, Table<AuthorRecord> aliased, Condition where) {
        super(alias, null, aliased, null, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>R2DBC_EXAMPLE.AUTHOR</code> table reference
     */
    public Author(String alias) {
        this(DSL.name(alias), AUTHOR);
    }

    /**
     * Create an aliased <code>R2DBC_EXAMPLE.AUTHOR</code> table reference
     */
    public Author(Name alias) {
        this(alias, AUTHOR);
    }

    /**
     * Create a <code>R2DBC_EXAMPLE.AUTHOR</code> table reference
     */
    public Author() {
        this(DSL.name("AUTHOR"), null);
    }

    public <O extends Record> Author(Table<O> path, ForeignKey<O, AuthorRecord> childPath, InverseForeignKey<O, AuthorRecord> parentPath) {
        super(path, childPath, parentPath, AUTHOR);
    }

    public static class AuthorPath extends Author implements Path<AuthorRecord> {
        public <O extends Record> AuthorPath(Table<O> path, ForeignKey<O, AuthorRecord> childPath, InverseForeignKey<O, AuthorRecord> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : R2dbcExample.R2DBC_EXAMPLE;
    }

    @Override
    public Identity<AuthorRecord, Integer> getIdentity() {
        return (Identity<AuthorRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<AuthorRecord> getPrimaryKey() {
        return Keys.PK_AUTHOR;
    }

    private transient BookPath _book;

    /**
     * Get the implicit to-many join path to the <code>R2DBC_EXAMPLE.BOOK</code>
     * table
     */
    public BookPath book() {
        if (_book == null)
            _book = new BookPath(this, null, Keys.FK_BOOK_AUTHOR.getInverseKey());

        return _book;
    }

    @Override
    public Author as(String alias) {
        return new Author(DSL.name(alias), this);
    }

    @Override
    public Author as(Name alias) {
        return new Author(alias, this);
    }

    @Override
    public Author as(Table<?> alias) {
        return new Author(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(String name) {
        return new Author(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(Name name) {
        return new Author(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Author rename(Table<?> name) {
        return new Author(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Author where(Condition condition) {
        return new Author(getQualifiedName(), aliased() ? this : null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Author where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Author where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Author where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Author where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Author where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Author where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Author where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Author whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Author whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
