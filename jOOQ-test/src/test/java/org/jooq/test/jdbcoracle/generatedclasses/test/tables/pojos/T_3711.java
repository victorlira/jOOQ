/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;


import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_3711;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3711 implements IT_3711 {

	private static final long serialVersionUID = 911382525;

	private Object v1;
	private Object v2;
	private Object v3;
	private Object v4;
	private Object v7;
	private Object v8;

	public T_3711() {}

	public T_3711(T_3711 value) {
		this.v1 = value.v1;
		this.v2 = value.v2;
		this.v3 = value.v3;
		this.v4 = value.v4;
		this.v7 = value.v7;
		this.v8 = value.v8;
	}

	public T_3711(
		Object v1,
		Object v2,
		Object v3,
		Object v4,
		Object v7,
		Object v8
	) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
		this.v7 = v7;
		this.v8 = v8;
	}

	@Override
	public Object getV1() {
		return this.v1;
	}

	@Override
	public void setV1(Object v1) {
		this.v1 = v1;
	}

	@Override
	public Object getV2() {
		return this.v2;
	}

	@Override
	public void setV2(Object v2) {
		this.v2 = v2;
	}

	@Override
	public Object getV3() {
		return this.v3;
	}

	@Override
	public void setV3(Object v3) {
		this.v3 = v3;
	}

	@Override
	public Object getV4() {
		return this.v4;
	}

	@Override
	public void setV4(Object v4) {
		this.v4 = v4;
	}

	@Override
	public Object getV7() {
		return this.v7;
	}

	@Override
	public void setV7(Object v7) {
		this.v7 = v7;
	}

	@Override
	public Object getV8() {
		return this.v8;
	}

	@Override
	public void setV8(Object v8) {
		this.v8 = v8;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IT_3711 from) {
		setV1(from.getV1());
		setV2(from.getV2());
		setV3(from.getV3());
		setV4(from.getV4());
		setV7(from.getV7());
		setV8(from.getV8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_3711> E into(E into) {
		into.from(this);
		return into;
	}
}
