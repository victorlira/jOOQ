/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.Test;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TReservedRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TReserved extends TableImpl<TReservedRecord> {

	private static final long serialVersionUID = 1813121341;

	/**
	 * The reference instance of <code>TEST.T_RESERVED</code>
	 */
	public static final TReserved T_RESERVED = new TReserved();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TReservedRecord> getRecordType() {
		return TReservedRecord.class;
	}

	/**
	 * The column <code>TEST.T_RESERVED.abstract</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> ABSTRACT = createField("abstract", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.case</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> CASE = createField("case", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.catch</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> CATCH = createField("catch", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.class</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> CLASS = createField("class", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.def</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> DEF = createField("def", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.do</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> DO = createField("do", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.else</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> ELSE = createField("else", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.extends</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> EXTENDS = createField("extends", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.false</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> FALSE = createField("false", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.final</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> FINAL = createField("final", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.finally</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> FINALLY = createField("finally", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.for</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> FOR = createField("for", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.forSome</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> FORSOME = createField("forSome", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.if</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> IF = createField("if", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.implicit</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> IMPLICIT = createField("implicit", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.import</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> IMPORT = createField("import", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.lazy</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> LAZY = createField("lazy", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.match</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> MATCH = createField("match", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.new</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> NEW = createField("new", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.null</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> NULL = createField("null", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.object</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> OBJECT = createField("object", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.override</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> OVERRIDE = createField("override", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.package</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> PACKAGE = createField("package", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.private</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> PRIVATE = createField("private", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.protected</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> PROTECTED = createField("protected", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.return</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> RETURN = createField("return", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.sealed</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> SEALED = createField("sealed", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.super</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> SUPER = createField("super", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.this</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> THIS = createField("this", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.throw</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> THROW = createField("throw", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.trait</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> TRAIT = createField("trait", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.try</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> TRY = createField("try", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.true</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> TRUE = createField("true", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.type</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> TYPE = createField("type", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.val</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> VAL = createField("val", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.var</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> VAR = createField("var", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.while</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> WHILE = createField("while", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.with</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> WITH = createField("with", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * The column <code>TEST.T_RESERVED.yield</code>.
	 */
	public static final TableField<TReservedRecord, BigDecimal> YIELD = createField("yield", org.jooq.impl.SQLDataType.NUMERIC, T_RESERVED, "");

	/**
	 * No further instances allowed
	 */
	private TReserved() {
		this("T_RESERVED", null);
	}

	private TReserved(String alias, Table<TReservedRecord> aliased) {
		this(alias, aliased, null);
	}

	private TReserved(String alias, Table<TReservedRecord> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "");
	}
}
