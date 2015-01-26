package de.getsetsociety.gw2readr.v1.item.items.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;

public class ConsumableJson extends ItemJson<IConsumable> {

	private IConsumable item = EntityFactoryProvider.getItemEntityFactory().newConsumable();

	@Override
	public IConsumable getEntity() {
		return item;
	}
	
	@JsonProperty("consumable")
	public void setConsumableDetails(ConsumableDetails details) {
		item.setUnlockType(details.getUnlockType());
		item.setConsumableType(details.getType());
		item.setColorId(details.getColorId());
		item.setDurationMs(details.getDurationMs());
		item.setDescription(details.getDescription());
		item.setRecipeId(details.getRecipeId());
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	public static class ConsumableDetails {

		private ConsumableType type;
		private ConsumableUnlockType unlockType;
		private Integer colorId;
		private Integer durationMs;
		private String description;
		private Integer recipeId;
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("type")
		public ConsumableType getType() {
			return type;
		}

		public void setType(String type) {
			this.type = ConsumableType.valueOf(type);
		}

		@JsonProperty("unlock_type")
		public ConsumableUnlockType getUnlockType() {
			return unlockType;
		}

		public void setUnlockType(String unlockType) {
			this.unlockType = ConsumableUnlockType.valueOf(unlockType);
		}

		@JsonAnyGetter
		public Map<String, Object> getAdditionalProperties() {
			return this.additionalProperties;
		}

		@JsonAnySetter
		public void setAdditionalProperty(String name, Object value) {
			this.additionalProperties.put(name, value);
		}

		@JsonProperty("color_id")
		public Integer getColorId() {
			return colorId;
		}

		public void setColorId(Integer colorId) {
			this.colorId = colorId;
		}

		@JsonProperty("duration_ms")
		public Integer getDurationMs() {
			return durationMs;
		}

		public void setDurationMs(Integer durationMs) {
			this.durationMs = durationMs;
		}

		@JsonProperty("description")
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@JsonProperty("recipe_id")
		public Integer getRecipeId() {
			return recipeId;
		}

		public void setRecipeId(Integer recipeId) {
			this.recipeId = recipeId;
		}	
		
	}

}
