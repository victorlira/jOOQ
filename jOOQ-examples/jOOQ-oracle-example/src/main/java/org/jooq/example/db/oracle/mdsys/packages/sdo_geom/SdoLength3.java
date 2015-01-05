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
public class SdoLength3 extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = -1741740195;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_LENGTH.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_LENGTH.GEOM</code>.
	 */
	public static final Parameter<SdoGeometryRecord> GEOM = createParameter("GEOM", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_LENGTH.DIM</code>.
	 */
	public static final Parameter<Object> DIM = createParameter("DIM", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_LENGTH.UNIT</code>.
	 */
	public static final Parameter<String> UNIT = createParameter("UNIT", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_LENGTH.COUNT_SHARED_EDGES</code>.
	 */
	public static final Parameter<BigDecimal> COUNT_SHARED_EDGES = createParameter("COUNT_SHARED_EDGES", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * Create a new routine call instance
	 */
	public SdoLength3() {
		super("SDO_LENGTH", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM);
		addInParameter(DIM);
		addInParameter(UNIT);
		addInParameter(COUNT_SHARED_EDGES);
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
	 * Set the <code>UNIT</code> parameter IN value to the routine
	 */
	public void setUnit(String value) {
		setValue(UNIT, value);
	}

	/**
	 * Set the <code>UNIT</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setUnit(Field<String> field) {
		setField(UNIT, field);
	}

	/**
	 * Set the <code>COUNT_SHARED_EDGES</code> parameter IN value to the routine
	 */
	public void setCountSharedEdges(Number value) {
		setNumber(COUNT_SHARED_EDGES, value);
	}

	/**
	 * Set the <code>COUNT_SHARED_EDGES</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setCountSharedEdges(Field<? extends Number> field) {
		setNumber(COUNT_SHARED_EDGES, field);
	}
}
