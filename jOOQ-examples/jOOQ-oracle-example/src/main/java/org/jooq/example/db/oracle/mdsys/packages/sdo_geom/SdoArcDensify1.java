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
public class SdoArcDensify1 extends AbstractRoutine<SdoGeometryRecord> {

	private static final long serialVersionUID = 275256111;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_ARC_DENSIFY.RETURN_VALUE</code>.
	 */
	public static final Parameter<SdoGeometryRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_ARC_DENSIFY.GEOM</code>.
	 */
	public static final Parameter<SdoGeometryRecord> GEOM = createParameter("GEOM", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_ARC_DENSIFY.DIM</code>.
	 */
	public static final Parameter<Object> DIM = createParameter("DIM", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_ARC_DENSIFY.PARAMS</code>.
	 */
	public static final Parameter<String> PARAMS = createParameter("PARAMS", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public SdoArcDensify1() {
		super("SDO_ARC_DENSIFY", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM);
		addInParameter(DIM);
		addInParameter(PARAMS);
		setOverloaded(true);
	}

	/**
	 * Set the <code>GEOM</code> parameter IN value to the routine
	 */
	public void setGeom(SdoGeometryRecord value) {
		setValue(GEOM, value);
	}

	/**
	 * Set the <code>GEOM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom(Field<SdoGeometryRecord> field) {
		setField(GEOM, field);
	}

	/**
	 * Set the <code>DIM</code> parameter IN value to the routine
	 */
	public void setDim(Object value) {
		setValue(DIM, value);
	}

	/**
	 * Set the <code>DIM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDim(Field<Object> field) {
		setField(DIM, field);
	}

	/**
	 * Set the <code>PARAMS</code> parameter IN value to the routine
	 */
	public void setParams(String value) {
		setValue(PARAMS, value);
	}

	/**
	 * Set the <code>PARAMS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setParams(Field<String> field) {
		setField(PARAMS, field);
	}
}
