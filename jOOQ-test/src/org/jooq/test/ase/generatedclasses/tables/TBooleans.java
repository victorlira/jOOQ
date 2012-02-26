/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 655830670;

	/**
	 * The singleton instance of dbo.t_booleans
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.ase.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord> __RECORD_TYPE = org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.ase.generatedclasses.enums.Boolean_10> ONE_ZERO = createField("one_zero", org.jooq.util.ase.ASEDataType.VARCHAR.asEnumDataType(org.jooq.test.ase.generatedclasses.enums.Boolean_10.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.ase.generatedclasses.enums.BooleanTrueFalseLc> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.util.ase.ASEDataType.VARCHAR.asEnumDataType(org.jooq.test.ase.generatedclasses.enums.BooleanTrueFalseLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.ase.generatedclasses.enums.BooleanTrueFalseUc> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.util.ase.ASEDataType.VARCHAR.asEnumDataType(org.jooq.test.ase.generatedclasses.enums.BooleanTrueFalseUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.ase.generatedclasses.enums.BooleanYesNoLc> YES_NO_LC = createField("yes_no_lc", org.jooq.util.ase.ASEDataType.VARCHAR.asEnumDataType(org.jooq.test.ase.generatedclasses.enums.BooleanYesNoLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.ase.generatedclasses.enums.BooleanYesNoUc> YES_NO_UC = createField("yes_no_uc", org.jooq.util.ase.ASEDataType.VARCHAR.asEnumDataType(org.jooq.test.ase.generatedclasses.enums.BooleanYesNoUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.ase.generatedclasses.enums.BooleanYnLc> Y_N_LC = createField("y_n_lc", org.jooq.util.ase.ASEDataType.VARCHAR.asEnumDataType(org.jooq.test.ase.generatedclasses.enums.BooleanYnLc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test.ase.generatedclasses.enums.BooleanYnUc> Y_N_UC = createField("y_n_uc", org.jooq.util.ase.ASEDataType.VARCHAR.asEnumDataType(org.jooq.test.ase.generatedclasses.enums.BooleanYnUc.class), T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("vc_boolean", org.jooq.impl.SQLDataType.BIT, T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("c_boolean", org.jooq.impl.SQLDataType.BIT, T_BOOLEANS);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("n_boolean", org.jooq.impl.SQLDataType.BIT, T_BOOLEANS);

	/**
	 * No further instances allowed
	 */
	private TBooleans() {
		super("t_booleans", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.T_BOOLEANS__PK_T_BOOLEANS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.ase.generatedclasses.Keys.T_BOOLEANS__PK_T_BOOLEANS);
	}
}
