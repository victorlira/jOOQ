/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.0"},
                            comments = "This class is generated by jOOQ")
public class Tables extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1679771594;

	/**
	 * The singleton instance of SYSCAT.TABLES
	 */
	public static final org.jooq.util.db2.syscat.tables.Tables TABLES = new org.jooq.util.db2.syscat.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.Record> __RECORD_TYPE = org.jooq.Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABSCHEMA = createField("TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TABNAME = createField("TABNAME", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNERTYPE = createField("OWNERTYPE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> BASE_TABSCHEMA = createField("BASE_TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> BASE_TABNAME = createField("BASE_TABNAME", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ROWTYPESCHEMA = createField("ROWTYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ROWTYPENAME = createField("ROWTYPENAME", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> ALTER_TIME = createField("ALTER_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> INVALIDATE_TIME = createField("INVALIDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> STATS_TIME = createField("STATS_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> COLCOUNT = createField("COLCOUNT", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TBSPACEID = createField("TBSPACEID", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> CARD = createField("CARD", org.jooq.impl.SQLDataType.BIGINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> NPAGES = createField("NPAGES", org.jooq.impl.SQLDataType.BIGINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> FPAGES = createField("FPAGES", org.jooq.impl.SQLDataType.BIGINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> OVERFLOW = createField("OVERFLOW", org.jooq.impl.SQLDataType.BIGINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TBSPACE = createField("TBSPACE", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_TBSPACE = createField("INDEX_TBSPACE", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LONG_TBSPACE = createField("LONG_TBSPACE", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PARENTS = createField("PARENTS", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> CHILDREN = createField("CHILDREN", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SELFREFS = createField("SELFREFS", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> KEYCOLUMNS = createField("KEYCOLUMNS", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> KEYINDEXID = createField("KEYINDEXID", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> KEYUNIQUE = createField("KEYUNIQUE", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> CHECKCOUNT = createField("CHECKCOUNT", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DATACAPTURE = createField("DATACAPTURE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONST_CHECKED = createField("CONST_CHECKED", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PMAP_ID = createField("PMAP_ID", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PARTITION_MODE = createField("PARTITION_MODE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LOG_ATTRIBUTE = createField("LOG_ATTRIBUTE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PCTFREE = createField("PCTFREE", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> APPEND_MODE = createField("APPEND_MODE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REFRESH = createField("REFRESH", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> REFRESH_TIME = createField("REFRESH_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LOCKSIZE = createField("LOCKSIZE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> VOLATILE = createField("VOLATILE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ROW_FORMAT = createField("ROW_FORMAT", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PROPERTY = createField("PROPERTY", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> STATISTICS_PROFILE = createField("STATISTICS_PROFILE", org.jooq.impl.SQLDataType.CLOB, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COMPRESSION = createField("COMPRESSION", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ACCESS_MODE = createField("ACCESS_MODE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CLUSTERED = createField("CLUSTERED", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> ACTIVE_BLOCKS = createField("ACTIVE_BLOCKS", org.jooq.impl.SQLDataType.BIGINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DROPRULE = createField("DROPRULE", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> MAXFREESPACESEARCH = createField("MAXFREESPACESEARCH", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> AVGCOMPRESSEDROWSIZE = createField("AVGCOMPRESSEDROWSIZE", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Float> AVGROWCOMPRESSIONRATIO = createField("AVGROWCOMPRESSIONRATIO", org.jooq.impl.SQLDataType.REAL, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> AVGROWSIZE = createField("AVGROWSIZE", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Float> PCTROWSCOMPRESSED = createField("PCTROWSCOMPRESSED", org.jooq.impl.SQLDataType.REAL, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LOGINDEXBUILD = createField("LOGINDEXBUILD", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> CODEPAGE = createField("CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONSCHEMA = createField("COLLATIONSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONNAME = createField("COLLATIONNAME", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONSCHEMA_ORDERBY = createField("COLLATIONSCHEMA_ORDERBY", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATIONNAME_ORDERBY = createField("COLLATIONNAME_ORDERBY", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ENCODING_SCHEME = createField("ENCODING_SCHEME", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> PCTPAGESSAVED = createField("PCTPAGESSAVED", org.jooq.impl.SQLDataType.SMALLINT, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> LAST_REGEN_TIME = createField("LAST_REGEN_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SECPOLICYID = createField("SECPOLICYID", org.jooq.impl.SQLDataType.INTEGER, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PROTECTIONGRANULARITY = createField("PROTECTIONGRANULARITY", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> AUDITPOLICYID = createField("AUDITPOLICYID", org.jooq.impl.SQLDataType.INTEGER, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> AUDITPOLICYNAME = createField("AUDITPOLICYNAME", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ONCOMMIT = createField("ONCOMMIT", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LOGGED = createField("LOGGED", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ONROLLBACK = createField("ONROLLBACK", org.jooq.impl.SQLDataType.CHAR, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.sql.Date> LASTUSED = createField("LASTUSED", org.jooq.impl.SQLDataType.DATE, TABLES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, TABLES);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super("TABLES", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}