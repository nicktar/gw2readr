package de.getsetsociety.gw2readr.v1.map.continents.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContinentJson {

	private String name;
	private List<Integer> continentDims = new ArrayList<Integer>();
	private Integer minZoom;
	private Integer maxZoom;
	private List<Integer> floors = new ArrayList<Integer>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("continent_dims")
	public List<Integer> getContinentDims() {
		return continentDims;
	}

	public void setContinentDims(List<Integer> continentDims) {
		this.continentDims = continentDims;
	}

	@JsonProperty("min_zoom")
	public Integer getMinZoom() {
		return minZoom;
	}

	public void setMinZoom(Integer minZoom) {
		this.minZoom = minZoom;
	}

	@JsonProperty("max_zoom")
	public Integer getMaxZoom() {
		return maxZoom;
	}

	public void setMax_zoom(Integer maxZoom) {
		this.maxZoom = maxZoom;
	}

	@JsonProperty("floors")
	public List<Integer> getFloors() {
		return floors;
	}

	public void setFloors(List<Integer> floors) {
		this.floors = floors;
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