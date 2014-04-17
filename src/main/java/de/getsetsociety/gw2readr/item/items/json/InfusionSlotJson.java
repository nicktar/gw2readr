package de.getsetsociety.gw2readr.item.items.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.item.items.interfaces.IInfusionSlot;
import  de.getsetsociety.gw2readr.item.EntityFactoryProvider;

public class InfusionSlotJson implements IEntityWrapper<IInfusionSlot>{

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private IInfusionSlot entity = EntityFactoryProvider.getFactory().newInfusionSlot();

	@JsonProperty("flags")
	public List<InfusionSlotType> getFlags() {
		return entity.getFlags();
	}

	@JsonProperty("flags")
	public void setFlags(List<String> flags) {
		for (String flag: flags) {
			entity.getFlags().add(InfusionSlotType.valueOf(flag));
		}

	}
	
	public IInfusionSlot getEntity() {
		return entity;
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
