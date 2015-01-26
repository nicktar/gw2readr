package de.getsetsociety.gw2readr.v1.files.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilesInfoJson {
	
	private Map<String, FileInfoJson> files = new HashMap<String, FileInfoJson>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	 * @return the files
	 */
	@JsonProperty
	public Map<String, FileInfoJson> getFiles() {
		return files;
	}

	/**
	 * @param files the files to set
	 */
	public void setFiles(Map<String, FileInfoJson> files) {
		this.files = files;
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
