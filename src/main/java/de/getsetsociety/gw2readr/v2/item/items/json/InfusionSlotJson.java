package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.item.items.enums.InfusionSlotType;

public class InfusionSlotJson {

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private List<InfusionSlotType> flags = new ArrayList<InfusionSlotType>();

	@JsonProperty("flags")
	public List<InfusionSlotType> getFlags() {
		return flags;
	}

	@JsonProperty("flags")
	public void setFlags(List<String> flags) {
		for (String flag: flags) {
			this.flags.add(InfusionSlotType.valueOf(flag));
		}

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
