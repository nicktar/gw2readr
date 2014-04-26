package de.getsetsociety.gw2readr.v1.build.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuildJson {

	private Integer build_id;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("build_id")
	public Integer getBuild_id() {
		return build_id;
	}

	public void setBuild_id(Integer build_id) {
		this.build_id = build_id;
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
