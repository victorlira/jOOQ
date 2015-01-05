/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.mdsys.packages.sdo_geom;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.example.db.oracle.mdsys.Mdsys;
import org.jooq.example.db.oracle.mdsys.packages.SdoGeom;
import org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ValidateGeometryWithContext1 extends AbstractRoutine<String> {

	private static final long serialVersionUID = 571013031;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.VALIDATE_GEOMETRY_WITH_CONTEXT.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.VALIDATE_GEOMETRY_WITH_CONTEXT.THEGEOMETRY</code>.
	 */
	public static final Parameter<SdoGeometryRecord> THEGEOMETRY = createParameter("THEGEOMETRY", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.VALIDATE_GEOMETRY_WITH_CONTEXT.THEDIMINFO</code>.
	 */
	public static final Parameter<Object> THEDIMINFO = createParameter("THEDIMINFO", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.VALIDATE_GEOMETRY_WITH_CONTEXT.CONDITIONAL</code>.
	 */
	public static final Parameter<String> CONDITIONAL = createParameter("CONDITIONAL", org.jooq.impl.SQLDataType.VARCHAR.defaulted(true), true);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.VALIDATE_GEOMETRY_WITH_CONTEXT.FLAG10G</code>.
	 */
	public static final Parameter<String> FLAG10G = createParameter("FLAG10G", org.jooq.impl.SQLDataType.VARCHAR.defaulted(true), true);

	/**
	 * Create a new routine call instance
	 */
	public ValidateGeometryWithContext1() {
		super("VALIDATE_GEOMETRY_WITH_CONTEXT", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(THEGEOMETRY);
		addInParameter(THEDIMINFO);
		addInParameter(CONDITIONAL);
		addInParameter(FLAG10G);
		setOverloaded(true);
	}

	/**
	 * Set the <code>THEGEOMETRY</code> parameter IN value to the routine
	 */
	public void setThegeometry(SdoGeometryRecord value) {
		setValue(THEGEOMETRY, value);
	}

	/**
	 * Set the <code>THEGEOMETRY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setThegeometry(Field<SdoGeometryRecord> field) {
		setField(THEGEOMETRY, field);
	}

	/**
	 * Set the <code>THEDIMINFO</code> parameter IN value to the routine
	 */
	public void setThediminfo(Object value) {
		setValue(THEDIMINFO, value);
	}

	/**
	 * Set the <code>THEDIMINFO</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setThediminfo(Field<Object> field) {
		setField(THEDIMINFO, field);
	}

	/**
	 * Set the <code>CONDITIONAL</code> parameter IN value to the routine
	 */
	public void setConditional(String value) {
		setValue(CONDITIONAL, value);
	}

	/**
	 * Set the <code>CONDITIONAL</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setConditional(Field<String> field) {
		setField(CONDITIONAL, field);
	}

	/**
	 * Set the <code>FLAG10G</code> parameter IN value to the routine
	 */
	public void setFlag10g(String value) {
		setValue(FLAG10G, value);
	}

	/**
	 * Set the <code>FLAG10G</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setFlag10g(Field<String> field) {
		setField(FLAG10G, field);
	}
}
