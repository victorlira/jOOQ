/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.mdsys.packages.sdo_geom;


import java.math.BigDecimal;

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
public class SdoBuffer1 extends AbstractRoutine<SdoGeometryRecord> {

	private static final long serialVersionUID = 1559112294;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.RETURN_VALUE</code>.
	 */
	public static final Parameter<SdoGeometryRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.GEOM</code>.
	 */
	public static final Parameter<SdoGeometryRecord> GEOM = createParameter("GEOM", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.DIM</code>.
	 */
	public static final Parameter<Object> DIM = createParameter("DIM", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.DIST</code>.
	 */
	public static final Parameter<BigDecimal> DIST = createParameter("DIST", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SdoBuffer1() {
		super("SDO_BUFFER", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM);
		addInParameter(DIM);
		addInParameter(DIST);
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
	 * Set the <code>DIST</code> parameter IN value to the routine
	 */
	public void setDist(Number value) {
		setNumber(DIST, value);
	}

	/**
	 * Set the <code>DIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDist(Field<? extends Number> field) {
		setNumber(DIST, field);
	}
}
