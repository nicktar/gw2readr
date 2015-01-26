package de.getsetsociety.gw2readr.v1.world.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.world.interfaces.IWorld;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorldsJson {

	private final IWorld entity = EntityFactoryProvider.getWorldEntityFactory().newWorld();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	
	@JsonProperty("id")
	public Integer getId() {
		return entity.getId();
	}

	public void setId(Integer id) {
		entity.setId(id);
	}

	@JsonProperty("name")
	public String getName() {
		return entity.getName();
	}

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

	public IWorld getEntity() {
		return entity;
	}
}
