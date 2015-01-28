package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;

public class ArmorJson extends ItemJson<IArmor> {

	private IArmor item = EntityFactoryProvider.getItemEntityFactory().newArmor();

	@Override
	public IArmor getEntity() {
		return item;
	}

	@JsonProperty("details")
	public void setArmorDetails(ArmorDetailsJson details) {
		item.setArmorType(details.getArmorType());
		item.setWeightClass(details.getWightClass());
		item.setDefense(details.getDefense());
		for (InfusionSlotJson detail : details.getInfusionSlots()) {
			item.getInfusionSlots().addAll(detail.getFlags());
		}
		item.setSuffixItemId(details.getSuffixItemId());
		item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	public static class ArmorDetailsJson {

		private ArmorType armorType;
		private WeightClass wightClass;
		private Integer defense;
		private List<InfusionSlotJson> infusionSlots;
		private Integer suffixItemId;
		private Integer secondarySuffixItemId;
		private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("type")
		public ArmorType getArmorType() {
			return armorType;
		}

		public void setArmorType(ArmorType armorType) {
			this.armorType = armorType;
		}

		@JsonProperty("weight_class")
		public WeightClass getWightClass() {
			return wightClass;
		}

		public void setWightClass(WeightClass wightClass) {
			this.wightClass = wightClass;
		}

		@JsonProperty("defense")
		public Integer getDefense() {
			return defense;
		}

		public void setDefense(Integer defense) {
			this.defense = defense;
		}

		@JsonProperty("infusion_slots")
		public List<InfusionSlotJson> getInfusionSlots() {
			return infusionSlots;
		}

		public void setInfusionSlots(List<InfusionSlotJson> infusionSlots) {
			this.infusionSlots = infusionSlots;
		}

		@JsonProperty("suffix_item_id")
		public Integer getSuffixItemId() {
			return suffixItemId;
		}

		public void setSuffixItemId(Integer suffixItemId) {
			this.suffixItemId = suffixItemId;
		}

		@JsonProperty("infix_upgrade")
		public InfixUpgradeJson getInfixUpgrade() {
			return infixUpgrade;
		}

		public void setInfixUpgrade(InfixUpgradeJson infixUpgrade) {
			this.infixUpgrade = infixUpgrade;
		}

		@JsonProperty("secondary_suffix_item_id")
		public Integer getSecondarySuffixItemId() {
			return secondarySuffixItemId;
		}

		public void setSecondarySuffixItemId(Integer secondarySuffixItemId) {
			this.secondarySuffixItemId = secondarySuffixItemId;
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
