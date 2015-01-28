package de.getsetsociety.gw2readr.v1.files.interfaces;

public interface IFileInfo {

	/**
	 * @return the fileId
	 */
	public abstract Integer getFileId();

	/**
	 * @param fileId
	 *            the fileId to set
	 */
	public abstract void setFileId(Integer fileId);

	/**
	 * @return the signature
	 */
	public abstract String getSignature();

	/**
	 * @param signature
	 *            the signature to set
	 */
	public abstract void setSignature(String signature);

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @param name
	 *            the name to set
	 */
	public abstract void setName(String name);

}