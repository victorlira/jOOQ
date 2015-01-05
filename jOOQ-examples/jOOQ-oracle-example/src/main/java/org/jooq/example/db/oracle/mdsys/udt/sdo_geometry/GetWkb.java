/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.mdsys.udt.sdo_geometry;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.example.db.oracle.mdsys.Mdsys;
import org.jooq.example.db.oracle.mdsys.udt.SdoGeometry;
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
public class GetWkb extends AbstractRoutine<byte[]> {

	private static final long serialVersionUID = -1692363466;

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.GET_WKB.RETURN_VALUE</code>.
	 */
	public static final Parameter<byte[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BLOB, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.GET_WKB.SELF</code>.
	 */
	public static final Parameter<SdoGeometryRecord> SELF = createParameter("SELF", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * Create a new routine call instance
	 */
	public GetWkb() {
		super("GET_WKB", Mdsys.MDSYS, SdoGeometry.SDO_GEOMETRY, org.jooq.impl.SQLDataType.BLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(SELF);
	}

	/**
	 * Set the <code>SELF</code> parameter IN value to the routine
	 */
	public void setSelf(SdoGeometryRecord value) {
		setValue(SELF, value);
	}

	/**
	 * Set the <code>SELF</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSelf(Field<SdoGeometryRecord> field) {
		setField(SELF, field);
	}
}
