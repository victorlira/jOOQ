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
public class SdoPolyDifference extends AbstractRoutine<SdoGeometryRecord> {

	private static final long serialVersionUID = -213779175;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_POLY_DIFFERENCE.RETURN_VALUE</code>.
	 */
	public static final Parameter<SdoGeometryRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_POLY_DIFFERENCE.GEOM1</code>.
	 */
	public static final Parameter<SdoGeometryRecord> GEOM1 = createParameter("GEOM1", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_POLY_DIFFERENCE.DIM1</code>.
	 */
	public static final Parameter<Object> DIM1 = createParameter("DIM1", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_POLY_DIFFERENCE.GEOM2</code>.
	 */
	public static final Parameter<SdoGeometryRecord> GEOM2 = createParameter("GEOM2", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_POLY_DIFFERENCE.DIM2</code>.
	 */
	public static final Parameter<Object> DIM2 = createParameter("DIM2", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * Create a new routine call instance
	 */
	public SdoPolyDifference() {
		super("SDO_POLY_DIFFERENCE", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM1);
		addInParameter(DIM1);
		addInParameter(GEOM2);
		addInParameter(DIM2);
	}

	/**
	 * Set the <code>GEOM1</code> parameter IN value to the routine
	 */
	public void setGeom1(SdoGeometryRecord value) {
		setValue(GEOM1, value);
	}

	/**
	 * Set the <code>GEOM1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom1(Field<SdoGeometryRecord> field) {
		setField(GEOM1, field);
	}

	/**
	 * Set the <code>DIM1</code> parameter IN value to the routine
	 */
	public void setDim1(Object value) {
		setValue(DIM1, value);
	}

	/**
	 * Set the <code>DIM1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDim1(Field<Object> field) {
		setField(DIM1, field);
	}

	/**
	 * Set the <code>GEOM2</code> parameter IN value to the routine
	 */
	public void setGeom2(SdoGeometryRecord value) {
		setValue(GEOM2, value);
	}

	/**
	 * Set the <code>GEOM2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom2(Field<SdoGeometryRecord> field) {
		setField(GEOM2, field);
	}

	/**
	 * Set the <code>DIM2</code> parameter IN value to the routine
	 */
	public void setDim2(Object value) {
		setValue(DIM2, value);
	}

	/**
	 * Set the <code>DIM2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDim2(Field<Object> field) {
		setField(DIM2, field);
	}
}
