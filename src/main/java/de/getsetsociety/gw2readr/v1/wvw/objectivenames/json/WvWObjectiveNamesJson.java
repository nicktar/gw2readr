package de.getsetsociety.gw2readr.v1.wvw.objectivenames.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.general.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.wvw.objectivenames.interfaces.IWvWObjectiveName;

public class WvWObjectiveNamesJson {

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final IWvWObjectiveName entity = EntityFactoryProvider.getWvWEntityFactory().newWvWObjectiveName();

	@JsonProperty("id")
	public String getId() {
		return entity.getId();
	}

	public void setId(String id) {
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

}