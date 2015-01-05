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
public class SdoMinMbrOrdinate2 extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 487278838;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_MIN_MBR_ORDINATE.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_MIN_MBR_ORDINATE.GEOM</code>.
	 */
	public static final Parameter<SdoGeometryRecord> GEOM = createParameter("GEOM", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_MIN_MBR_ORDINATE.ORDINATE_POS</code>.
	 */
	public static final Parameter<BigDecimal> ORDINATE_POS = createParameter("ORDINATE_POS", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SdoMinMbrOrdinate2() {
		super("SDO_MIN_MBR_ORDINATE", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM);
		addInParameter(ORDINATE_POS);
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
	 * Set the <code>ORDINATE_POS</code> parameter IN value to the routine
	 */
	public void setOrdinatePos(Number value) {
		setNumber(ORDINATE_POS, value);
	}

	/**
	 * Set the <code>ORDINATE_POS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setOrdinatePos(Field<? extends Number> field) {
		setNumber(ORDINATE_POS, field);
	}
}
