package de.getsetsociety.gw2readr.v1.map.continents.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContinentsJson {

	@JsonProperty("continents")
	private Map<String, ContinentJson> continents =  new HashMap<String, ContinentJson>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("continents")
	public Map<String, ContinentJson> getContinents() {
		return continents;
	}

	@JsonProperty("continents")
	public void setContinents(Map<String, ContinentJson> continents) {
		this.continents = continents;
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