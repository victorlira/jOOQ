/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.util.postgres.pg_catalog.tables.PgAttribute;
import org.jooq.util.postgres.pg_catalog.tables.PgClass;
import org.jooq.util.postgres.pg_catalog.tables.PgConstraint;
import org.jooq.util.postgres.pg_catalog.tables.PgCursor;
import org.jooq.util.postgres.pg_catalog.tables.PgDescription;
import org.jooq.util.postgres.pg_catalog.tables.PgEnum;
import org.jooq.util.postgres.pg_catalog.tables.PgInherits;
import org.jooq.util.postgres.pg_catalog.tables.PgNamespace;
import org.jooq.util.postgres.pg_catalog.tables.PgProc;
import org.jooq.util.postgres.pg_catalog.tables.PgType;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.8.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgCatalog extends SchemaImpl {

	private static final long serialVersionUID = 1107728347;

	/**
	 * The reference instance of <code>pg_catalog</code>
	 */
	public static final PgCatalog PG_CATALOG = new PgCatalog();

	/**
	 * No further instances allowed
	 */
	private PgCatalog() {
		super("pg_catalog");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			PgAttribute.PG_ATTRIBUTE,
			PgClass.PG_CLASS,
			PgConstraint.PG_CONSTRAINT,
			PgCursor.PG_CURSOR,
			PgDescription.PG_DESCRIPTION,
			PgEnum.PG_ENUM,
			PgInherits.PG_INHERITS,
			PgNamespace.PG_NAMESPACE,
			PgProc.PG_PROC,
			PgType.PG_TYPE);
	}
}
