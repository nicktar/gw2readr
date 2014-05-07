package de.getsetsociety.gw2readr.v1.map.continents.json;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.general.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContinentJson {

	private IContinent entity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 */
	public ContinentJson() {
		this.entity = EntityFactoryProvider.getContinentEntityFactory().newContinent();
	}

	/**
	 * @param entity
	 */
	public ContinentJson(IContinent entity) {
		this.entity = entity;
	}
	
	public IContinent getEntity() {
		return entity;
	}

	@JsonProperty("name")
	public String getName() {
		return entity.getName();
	}

	public void setName(String name) {
		entity.setName(name);;
	}

	@JsonProperty("continent_dims")
	public List<Integer> getContinentDims() {
		return Arrays.asList(new Integer[] {entity.getContinentXDim(), entity.getContinentYDim()});
	}

	public void setContinentDims(List<Integer> continentDims) {
		if (continentDims == null) {
			entity.setContinentXDim(null);
			entity.setContinentYDim(null);
		} else if (continentDims.size() == 2) {
			entity.setContinentXDim(continentDims.get(0));
			entity.setContinentYDim(continentDims.get(1));
		} else {
			throw new IllegalArgumentException("continentDims has to contain exactly 2 values, has " + continentDims.size());
		}
	}

	@JsonProperty("min_zoom")
	public Integer getMinZoom() {
		return entity.getMinZoom();
	}

	public void setMinZoom(Integer minZoom) {
		entity.setMinZoom(minZoom);;
	}

	@JsonProperty("max_zoom")
	public Integer getMaxZoom() {
		return entity.getMaxZoom();
	}

	public void setMax_zoom(Integer maxZoom) {
		entity.setMaxZoom(maxZoom);;
	}

	@JsonProperty("floors")
	public List<Integer> getFloors() {
		return entity.getFloors();
	}

	public void setFloors(List<Integer> floors) {
		entity.setFloors(floors);;
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