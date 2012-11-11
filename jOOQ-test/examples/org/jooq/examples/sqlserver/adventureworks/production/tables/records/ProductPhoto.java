/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductPhoto", schema = "Production")
public class ProductPhoto extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto> implements org.jooq.Record6<java.lang.Integer, byte[], java.lang.String, byte[], java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -889096499;

	/**
	 * Setter for <code>Production.ProductPhoto.ProductPhotoID</code>. 
	 */
	public void setProductPhotoID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ProductPhotoID, value);
	}

	/**
	 * Getter for <code>Production.ProductPhoto.ProductPhotoID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductPhotoID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductPhotoID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ProductPhotoID);
	}

	/**
	 * Setter for <code>Production.ProductPhoto.ThumbNailPhoto</code>. 
	 */
	public void setThumbNailPhoto(byte[] value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ThumbNailPhoto, value);
	}

	/**
	 * Getter for <code>Production.ProductPhoto.ThumbNailPhoto</code>. 
	 */
	@javax.persistence.Column(name = "ThumbNailPhoto")
	public byte[] getThumbNailPhoto() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ThumbNailPhoto);
	}

	/**
	 * Setter for <code>Production.ProductPhoto.ThumbnailPhotoFileName</code>. 
	 */
	public void setThumbnailPhotoFileName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ThumbnailPhotoFileName, value);
	}

	/**
	 * Getter for <code>Production.ProductPhoto.ThumbnailPhotoFileName</code>. 
	 */
	@javax.persistence.Column(name = "ThumbnailPhotoFileName", length = 50)
	public java.lang.String getThumbnailPhotoFileName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ThumbnailPhotoFileName);
	}

	/**
	 * Setter for <code>Production.ProductPhoto.LargePhoto</code>. 
	 */
	public void setLargePhoto(byte[] value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.LargePhoto, value);
	}

	/**
	 * Getter for <code>Production.ProductPhoto.LargePhoto</code>. 
	 */
	@javax.persistence.Column(name = "LargePhoto")
	public byte[] getLargePhoto() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.LargePhoto);
	}

	/**
	 * Setter for <code>Production.ProductPhoto.LargePhotoFileName</code>. 
	 */
	public void setLargePhotoFileName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.LargePhotoFileName, value);
	}

	/**
	 * Getter for <code>Production.ProductPhoto.LargePhotoFileName</code>. 
	 */
	@javax.persistence.Column(name = "LargePhotoFileName", length = 50)
	public java.lang.String getLargePhotoFileName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.LargePhotoFileName);
	}

	/**
	 * Setter for <code>Production.ProductPhoto.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Production.ProductPhoto.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, byte[], java.lang.String, byte[], java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, byte[], java.lang.String, byte[], java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ProductPhotoID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ThumbNailPhoto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ThumbnailPhotoFileName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field4() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.LargePhoto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.LargePhotoFileName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getProductPhotoID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value2() {
		return getThumbNailPhoto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getThumbnailPhotoFileName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value4() {
		return getLargePhoto();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getLargePhotoFileName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProductPhoto
	 */
	public ProductPhoto() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto);
	}
}
