package de.getsetsociety.gw2readr.item.items.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.item.items.enums.GatheringType;
import de.getsetsociety.gw2readr.item.items.enums.ToolType;
import de.getsetsociety.gw2readr.item.items.interfaces.ITool;
import  de.getsetsociety.gw2readr.item.EntityFactoryProvider;

public class ToolJson extends ItemJson<ITool> {

	private ITool item = EntityFactoryProvider.getFactory().newTool();

	@Override
	public ITool getEntity() {
		return item;
	}
	
	@JsonProperty("tool")
	public void setGatheringDetails(ToolDetails details) {
		item.setToolType(details.getType());
		item.setCharges(details.getCharges());
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	public static class ToolDetails {

		private ToolType type;
		private Integer charges;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("charges")
		public Integer getCharges() {
			return charges;
		}

		public void setCharges(Integer charges) {
			this.charges = charges;
		}

		@JsonProperty("type")
		public ToolType getType() {
			return type;
		}

		public void setType(String type) {
			this.type = ToolType.valueOf(type);
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

}
