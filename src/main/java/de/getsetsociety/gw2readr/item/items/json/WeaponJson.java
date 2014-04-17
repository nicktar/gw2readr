package de.getsetsociety.gw2readr.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.item.items.interfaces.IWeapon;
import  de.getsetsociety.gw2readr.item.EntityFactoryProvider;

public class WeaponJson extends ItemJson<IWeapon> {

	private IWeapon item = EntityFactoryProvider.getFactory().newWeapon();

	
	@JsonProperty("weapon")
	public void setWeaponDetails(WeaponDetailsJson details) {
		item.setDamageType(details.getDamageType());
		item.setWeaponType(details.getType());
		item.setMinPower(details.getMinPower());
		item.setMaxPower(details.getMaxPower());
		item.setDefense(details.getDefense());
		for (InfusionSlotJson detail: details.getInfusionSlots()) {
			item.getInfusionSlots().addAll(detail.getFlags());
		}
		item.setSuffixItemId(details.getSuffixItemId());
		item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	@Override
	public IWeapon getEntity() {
		return item;
	}

	public class WeaponDetailsJson {

		private WeaponType type;
		private DamageType damageType;
		private Integer minPower;
		private Integer maxPower;
		private Integer defense;
		private List<InfusionSlotJson> infusionSlots = new ArrayList<>();
		private Integer suffixItemId;
		private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
		private Map<String, Object> additionalProperties = new HashMap<String, Object>();

		@JsonProperty("type")
		public WeaponType getType() {
			return type;
		}

		public void setType(String type) {
			this.type = WeaponType.valueOf(type);
		}

		@JsonProperty("damage_type")
		public DamageType getDamageType() {
			return damageType;
		}

		public void setDamageType(String damageType) {
			this.damageType = DamageType.valueOf(damageType);
		}

		@JsonProperty("min_power")
		public Integer getMinPower() {
			return minPower;
		}

		public void setMinPower(Integer minPower) {
			this.minPower = minPower;
		}

		@JsonProperty("max_power")
		public Integer getMaxPower() {
			return maxPower;
		}

		public void setMaxPower(Integer maxPower) {
			this.maxPower = maxPower;
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

		public void setSuffixItemId(Integer suffix_item_id) {
			this.suffixItemId = suffix_item_id;
		}

		@JsonProperty("infix_upgrade")
		public InfixUpgradeJson getInfixUpgrade() {
			return infixUpgrade;
		}
		
		public void setInfixUpgrade(InfixUpgradeJson infixUpgrade) {
			this.infixUpgrade = infixUpgrade;
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
