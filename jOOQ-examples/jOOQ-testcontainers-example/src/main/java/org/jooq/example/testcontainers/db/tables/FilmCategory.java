/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
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
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.Category.CategoryPath;
import org.jooq.example.testcontainers.db.tables.Film.FilmPath;
import org.jooq.example.testcontainers.db.tables.records.FilmCategoryRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmCategory extends TableImpl<FilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.film_category</code>
     */
    public static final FilmCategory FILM_CATEGORY = new FilmCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmCategoryRecord> getRecordType() {
        return FilmCategoryRecord.class;
    }

    /**
     * The column <code>public.film_category.film_id</code>.
     */
    public final TableField<FilmCategoryRecord, Long> FILM_ID = createField(DSL.name("film_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.film_category.category_id</code>.
     */
    public final TableField<FilmCategoryRecord, Long> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.film_category.last_update</code>.
     */
    public final TableField<FilmCategoryRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "");

    private FilmCategory(Name alias, Table<FilmCategoryRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null);
    }

    private FilmCategory(Name alias, Table<FilmCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    private FilmCategory(Name alias, Table<FilmCategoryRecord> aliased, Condition where) {
        super(alias, null, aliased, null, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.film_category</code> table reference
     */
    public FilmCategory(String alias) {
        this(DSL.name(alias), FILM_CATEGORY);
    }

    /**
     * Create an aliased <code>public.film_category</code> table reference
     */
    public FilmCategory(Name alias) {
        this(alias, FILM_CATEGORY);
    }

    /**
     * Create a <code>public.film_category</code> table reference
     */
    public FilmCategory() {
        this(DSL.name("film_category"), null);
    }

    public <O extends Record> FilmCategory(Table<O> path, ForeignKey<O, FilmCategoryRecord> childPath, InverseForeignKey<O, FilmCategoryRecord> parentPath) {
        super(path, childPath, parentPath, FILM_CATEGORY);
    }

    public static class FilmCategoryPath extends FilmCategory implements Path<FilmCategoryRecord> {
        public <O extends Record> FilmCategoryPath(Table<O> path, ForeignKey<O, FilmCategoryRecord> childPath, InverseForeignKey<O, FilmCategoryRecord> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<FilmCategoryRecord> getPrimaryKey() {
        return Keys.FILM_CATEGORY_PKEY;
    }

    @Override
    public List<ForeignKey<FilmCategoryRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY);
    }

    private transient FilmPath _film;

    /**
     * Get the implicit join path to the <code>public.film</code> table.
     */
    public FilmPath film() {
        if (_film == null)
            _film = new FilmPath(this, Keys.FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY, null);

        return _film;
    }

    private transient CategoryPath _category;

    /**
     * Get the implicit join path to the <code>public.category</code> table.
     */
    public CategoryPath category() {
        if (_category == null)
            _category = new CategoryPath(this, Keys.FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY, null);

        return _category;
    }

    @Override
    public FilmCategory as(String alias) {
        return new FilmCategory(DSL.name(alias), this);
    }

    @Override
    public FilmCategory as(Name alias) {
        return new FilmCategory(alias, this);
    }

    @Override
    public FilmCategory as(Table<?> alias) {
        return new FilmCategory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmCategory rename(String name) {
        return new FilmCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmCategory rename(Name name) {
        return new FilmCategory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmCategory rename(Table<?> name) {
        return new FilmCategory(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmCategory where(Condition condition) {
        return new FilmCategory(getQualifiedName(), aliased() ? this : null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmCategory where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmCategory where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmCategory where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmCategory where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmCategory where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmCategory where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmCategory where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmCategory whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmCategory whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Long, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
