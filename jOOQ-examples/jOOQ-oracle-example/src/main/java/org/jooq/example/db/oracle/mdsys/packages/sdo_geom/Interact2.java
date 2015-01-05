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
public class Interact2 extends AbstractRoutine<String> {

	private static final long serialVersionUID = -836141744;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.INTERACT.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.INTERACT.LAYER1</code>.
	 */
	public static final Parameter<String> LAYER1 = createParameter("LAYER1", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.INTERACT.GID1</code>.
	 */
	public static final Parameter<BigDecimal> GID1 = createParameter("GID1", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.INTERACT.LAYER2</code>.
	 */
	public static final Parameter<String> LAYER2 = createParameter("LAYER2", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.INTERACT.GID2</code>.
	 */
	public static final Parameter<BigDecimal> GID2 = createParameter("GID2", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public Interact2() {
		super("INTERACT", Mdsys.MDSYS, SdoGeom.SDO_GEOM, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(LAYER1);
		addInParameter(GID1);
		addInParameter(LAYER2);
		addInParameter(GID2);
		setOverloaded(true);
	}

	/**
	 * Set the <code>LAYER1</code> parameter IN value to the routine
	 */
	public void setLayer1(String value) {
		setValue(LAYER1, value);
	}

	/**
	 * Set the <code>LAYER1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setLayer1(Field<String> field) {
		setField(LAYER1, field);
	}

	/**
	 * Set the <code>GID1</code> parameter IN value to the routine
	 */
	public void setGid1(Number value) {
		setNumber(GID1, value);
	}

	/**
	 * Set the <code>GID1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGid1(Field<? extends Number> field) {
		setNumber(GID1, field);
	}

	/**
	 * Set the <code>LAYER2</code> parameter IN value to the routine
	 */
	public void setLayer2(String value) {
		setValue(LAYER2, value);
	}

	/**
	 * Set the <code>LAYER2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setLayer2(Field<String> field) {
		setField(LAYER2, field);
	}

	/**
	 * Set the <code>GID2</code> parameter IN value to the routine
	 */
	public void setGid2(Number value) {
		setNumber(GID2, value);
	}

	/**
	 * Set the <code>GID2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGid2(Field<? extends Number> field) {
		setNumber(GID2, field);
	}
}
