package de.getsetsociety.gw2readr.v1.item.items.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IUpgradeComponent;

public class UpgradeComponentJson extends ItemJson<IUpgradeComponent> {

	private IUpgradeComponent item = EntityFactoryProvider.getItemEntityFactory().newUpgradeComponent();

	@Override
	public IUpgradeComponent getEntity() {
		return item;
	}
	
	@JsonProperty("upgrade_component")
	public void setUpgradeComponentDetails(UpgradeComponentDetails details) {
		item.setUpgradeComponentType(details.getType());
		item.getUpgradeComponentFlags().addAll(details.getUpgradeComponentFlags());
		item.setSuffix(details.getSuffix());
		item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	public static class UpgradeComponentDetails {

		private UpgradeComponentType type;
		private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();
		private Set<String> bonuses;
		private String suffix;
		private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
		private List<Object> infusionUpgradeFlags;
		private Map<String, Object> additionalProperties = new HashMap<>();

		@JsonProperty("type")
		public UpgradeComponentType getType() {
			return type;
		}

		public void setUpgradeComponentType(UpgradeComponentType upgradeComponentType) {
			this.type = upgradeComponentType;
		}

		@JsonProperty("flags")
		public Set<UpgradeComponentFlag> getUpgradeComponentFlags() {
			return new HashSet<>(upgradeComponentFlags);
		}

		public void setUpgradeComponentFlags(Set<UpgradeComponentFlag> upgradeComponentFlags) {
			this.upgradeComponentFlags.addAll(upgradeComponentFlags);
		}

		@JsonProperty("bonuses")
		public Set<String> getBonuses() {
			return bonuses;
		}

		public void setBonuses(Set<String> bonuses) {
			this.bonuses = bonuses;
		}

		@JsonProperty("suffix")
		public String getSuffix() {
			return suffix;
		}

		public void setSuffix(String suffix) {
			this.suffix = suffix;
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

		//@JsonProperty("infusion_upgrade_flags")
		public List<Object> getInfusionUpgradeFlags() {
			return infusionUpgradeFlags;
		}

		public void setInfusionUpgradeFlags(List<Object> infusionUpgradeFlags) {
			this.infusionUpgradeFlags = infusionUpgradeFlags;
		}

		
	}

}
