/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.jdbcoracle.generatedclasses.test.Test;
import org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_3711Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3711 extends TableImpl<T_3711Record> {

	private static final long serialVersionUID = 1849480683;

	/**
	 * The reference instance of <code>TEST.T_3711</code>
	 */
	public static final T_3711 T_3711 = new T_3711();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T_3711Record> getRecordType() {
		return T_3711Record.class;
	}

	/**
	 * The column <code>TEST.T_3711.V1</code>.
	 */
	public static final TableField<T_3711Record, Object> V1 = createField("V1", org.jooq.impl.SQLDataType.OTHER, T_3711, "");

	/**
	 * The column <code>TEST.T_3711.V2</code>.
	 */
	public static final TableField<T_3711Record, Object> V2 = createField("V2", org.jooq.impl.SQLDataType.OTHER, T_3711, "");

	/**
	 * The column <code>TEST.T_3711.V3</code>.
	 */
	public static final TableField<T_3711Record, Object> V3 = createField("V3", org.jooq.impl.SQLDataType.OTHER, T_3711, "");

	/**
	 * The column <code>TEST.T_3711.V4</code>.
	 */
	public static final TableField<T_3711Record, Object> V4 = createField("V4", org.jooq.impl.SQLDataType.OTHER, T_3711, "");

	/**
	 * The column <code>TEST.T_3711.V7</code>.
	 */
	public static final TableField<T_3711Record, Object> V7 = createField("V7", org.jooq.impl.SQLDataType.OTHER, T_3711, "");

	/**
	 * The column <code>TEST.T_3711.V8</code>.
	 */
	public static final TableField<T_3711Record, Object> V8 = createField("V8", org.jooq.impl.SQLDataType.OTHER, T_3711, "");

	/**
	 * No further instances allowed
	 */
	private T_3711() {
		this("T_3711", null);
	}

	private T_3711(String alias, Table<T_3711Record> aliased) {
		this(alias, aliased, null);
	}

	private T_3711(String alias, Table<T_3711Record> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "");
	}
}
