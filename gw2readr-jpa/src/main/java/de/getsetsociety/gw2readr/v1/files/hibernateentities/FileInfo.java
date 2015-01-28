package de.getsetsociety.gw2readr.v1.files.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;

@Entity
@Table
public class FileInfo implements IFileInfo {

	private Integer fileId;
	private String signature;
	private String name;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.files.entites.IFileInfo#getFileId()
	 */
	@Override
	@Column
	public Integer getFileId() {
		return fileId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.files.entites.IFileInfo#setFileId(java.lang.Integer)
	 */
	@Override
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.files.entites.IFileInfo#getSignature()
	 */
	@Override
	@Column
	public String getSignature() {
		return signature;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.files.entites.IFileInfo#setSignature(java.lang.String)
	 */
	@Override
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.files.entites.IFileInfo#getName()
	 */
	@Override
	@Id
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.files.entites.IFileInfo#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
