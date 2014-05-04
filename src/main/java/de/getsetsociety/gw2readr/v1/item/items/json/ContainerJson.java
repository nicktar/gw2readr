package de.getsetsociety.gw2readr.v1.item.items.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.general.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.enums.ContainerType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IContainer;

public class ContainerJson extends ItemJson<IContainer> {

	private IContainer item = EntityFactoryProvider.getItemEntityFactory().newContainer();

	@Override
	public IContainer getEntity() {
		return item;
	}
	
	@JsonProperty("container")
	public void setConsumableDetails(ConsumableDetails details) {
		item.setContainerType(details.getType());
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	public static class ConsumableDetails {

		private ContainerType type;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("type")
		public ContainerType getType() {
			return type;
		}

		public void setType(String type) {
			this.type = ContainerType.valueOf(type);
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
