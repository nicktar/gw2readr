package de.getsetsociety.gw2readr.v1.colors.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColorsJson {

	private Map<Integer, ColorJson> colors = new HashMap<Integer, ColorJson>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("colors")
	public Map<Integer, ColorJson> getColors() { 
		return colors;
	}

	public void setColors(Map<Integer, ColorJson> colors) {
		this.colors = colors;
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