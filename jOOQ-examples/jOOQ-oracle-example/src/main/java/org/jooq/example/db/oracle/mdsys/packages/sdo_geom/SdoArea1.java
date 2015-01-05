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
public class SdoArea1 extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 103789884;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_AREA.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_AREA.GEOM</code>.
	 */
	public static final Parameter<SdoGeometryRecord> GEOM = createParameter("GEOM", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_AREA.DIM</code>.
	 */
	public static final Parameter<Object> DIM = createParameter("DIM", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * Create a new routine call instance
	 */
	public SdoArea1() {
		super("SDO_AREA", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM);
		addInParameter(DIM);
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
}
