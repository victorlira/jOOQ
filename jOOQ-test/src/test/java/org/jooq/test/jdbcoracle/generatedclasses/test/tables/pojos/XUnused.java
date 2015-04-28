/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;


import java.math.BigDecimal;
import java.math.BigInteger;

import org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IXUnused;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused implements IXUnused {

	private static final long serialVersionUID = -948514727;

	private Integer    id;
	private String     name;
	private BigInteger bigInteger;
	private Integer    idRef;
	private Integer    class_;
	private Integer    fields;
	private Integer    configuration;
	private Integer    uDT;
	private Integer    metaData;
	private Integer    type0;
	private Integer    primaryKey;
	private Integer    primarykey;
	private String     nameRef;
	private BigDecimal field_737;
	private Integer    msUnusedIdRef;
	private String     msUnusedNameRef;

	public XUnused() {}

	public XUnused(XUnused value) {
		this.id = value.id;
		this.name = value.name;
		this.bigInteger = value.bigInteger;
		this.idRef = value.idRef;
		this.class_ = value.class_;
		this.fields = value.fields;
		this.configuration = value.configuration;
		this.uDT = value.uDT;
		this.metaData = value.metaData;
		this.type0 = value.type0;
		this.primaryKey = value.primaryKey;
		this.primarykey = value.primarykey;
		this.nameRef = value.nameRef;
		this.field_737 = value.field_737;
		this.msUnusedIdRef = value.msUnusedIdRef;
		this.msUnusedNameRef = value.msUnusedNameRef;
	}

	public XUnused(
		Integer    id,
		String     name,
		BigInteger bigInteger,
		Integer    idRef,
		Integer    class_,
		Integer    fields,
		Integer    configuration,
		Integer    uDT,
		Integer    metaData,
		Integer    type0,
		Integer    primaryKey,
		Integer    primarykey,
		String     nameRef,
		BigDecimal field_737,
		Integer    msUnusedIdRef,
		String     msUnusedNameRef
	) {
		this.id = id;
		this.name = name;
		this.bigInteger = bigInteger;
		this.idRef = idRef;
		this.class_ = class_;
		this.fields = fields;
		this.configuration = configuration;
		this.uDT = uDT;
		this.metaData = metaData;
		this.type0 = type0;
		this.primaryKey = primaryKey;
		this.primarykey = primarykey;
		this.nameRef = nameRef;
		this.field_737 = field_737;
		this.msUnusedIdRef = msUnusedIdRef;
		this.msUnusedNameRef = msUnusedNameRef;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public BigInteger getBigInteger() {
		return this.bigInteger;
	}

	@Override
	public void setBigInteger(BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}

	@Override
	public Integer getIdRef() {
		return this.idRef;
	}

	@Override
	public void setIdRef(Integer idRef) {
		this.idRef = idRef;
	}

	@Override
	public Integer getClass_() {
		return this.class_;
	}

	@Override
	public void setClass_(Integer class_) {
		this.class_ = class_;
	}

	@Override
	public Integer getFields() {
		return this.fields;
	}

	@Override
	public void setFields(Integer fields) {
		this.fields = fields;
	}

	@Override
	public Integer getConfiguration() {
		return this.configuration;
	}

	@Override
	public void setConfiguration(Integer configuration) {
		this.configuration = configuration;
	}

	@Override
	public Integer getUDT() {
		return this.uDT;
	}

	@Override
	public void setUDT(Integer uDT) {
		this.uDT = uDT;
	}

	@Override
	public Integer getMetaData() {
		return this.metaData;
	}

	@Override
	public void setMetaData(Integer metaData) {
		this.metaData = metaData;
	}

	@Override
	public Integer getType0() {
		return this.type0;
	}

	@Override
	public void setType0(Integer type0) {
		this.type0 = type0;
	}

	@Override
	public Integer getPrimaryKey_() {
		return this.primaryKey;
	}

	@Override
	public void setPrimaryKey_(Integer primaryKey) {
		this.primaryKey = primaryKey;
	}

	@Override
	public Integer getPrimarykey() {
		return this.primarykey;
	}

	@Override
	public void setPrimarykey(Integer primarykey) {
		this.primarykey = primarykey;
	}

	@Override
	public String getNameRef() {
		return this.nameRef;
	}

	@Override
	public void setNameRef(String nameRef) {
		this.nameRef = nameRef;
	}

	@Override
	public BigDecimal getField_737() {
		return this.field_737;
	}

	@Override
	public void setField_737(BigDecimal field_737) {
		this.field_737 = field_737;
	}

	@Override
	public Integer getMsUnusedIdRef() {
		return this.msUnusedIdRef;
	}

	@Override
	public void setMsUnusedIdRef(Integer msUnusedIdRef) {
		this.msUnusedIdRef = msUnusedIdRef;
	}

	@Override
	public String getMsUnusedNameRef() {
		return this.msUnusedNameRef;
	}

	@Override
	public void setMsUnusedNameRef(String msUnusedNameRef) {
		this.msUnusedNameRef = msUnusedNameRef;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IXUnused from) {
		setId(from.getId());
		setName(from.getName());
		setBigInteger(from.getBigInteger());
		setIdRef(from.getIdRef());
		setClass_(from.getClass_());
		setFields(from.getFields());
		setConfiguration(from.getConfiguration());
		setUDT(from.getUDT());
		setMetaData(from.getMetaData());
		setType0(from.getType0());
		setPrimaryKey_(from.getPrimaryKey_());
		setPrimarykey(from.getPrimarykey());
		setNameRef(from.getNameRef());
		setField_737(from.getField_737());
		setMsUnusedIdRef(from.getMsUnusedIdRef());
		setMsUnusedNameRef(from.getMsUnusedNameRef());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IXUnused> E into(E into) {
		into.from(this);
		return into;
	}
}
