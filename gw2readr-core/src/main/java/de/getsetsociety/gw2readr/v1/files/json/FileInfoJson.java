package de.getsetsociety.gw2readr.v1.files.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;

public class FileInfoJson {
	
	private IFileInfo entity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();


	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo#getFileId()
	 */
	public Integer getFileId() {
		return entity.getFileId();
	}

	/**
	 * @param fileId
	 * @see de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo#setFileId(java.lang.Integer)
	 */
	public void setFileId(Integer fileId) {
		entity.setFileId(fileId);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo#getSignature()
	 */
	public String getSignature() {
		return entity.getSignature();
	}

	/**
	 * @param signature
	 * @see de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo#setSignature(java.lang.String)
	 */
	public void setSignature(String signature) {
		entity.setSignature(signature);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo#getName()
	 */
	public String getName() {
		return entity.getName();
	}

	/**
	 * @param name
	 * @see de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo#setName(java.lang.String)
	 */
	public void setName(String name) {
		entity.setName(name);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
