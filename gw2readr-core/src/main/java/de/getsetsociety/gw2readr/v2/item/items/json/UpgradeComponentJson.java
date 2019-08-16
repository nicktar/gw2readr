package de.getsetsociety.gw2readr.v2.item.items.json;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradeComponent;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UpgradeComponentJson extends ItemJson<IUpgradeComponent> {

	private IUpgradeComponent item = EntityFactoryProvider.getItemEntityFactory().newUpgradeComponent();

	@Override
	public IUpgradeComponent getEntity() {
		return item;
	}

	@JsonProperty("details")
	public void setUpgradeComponentDetails(UpgradeComponentDetails details) {
		item.setUpgradeComponentType(details.getType());
		item.setUpgradeComponentType(details.getType());
		item.getUpgradeComponentFlags().addAll(details.getUpgradeComponentFlags());
		item.setSuffix(details.getSuffix());
		item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
		item.setInfusionUpgradeFlags(details.getInfusionUpgradeFlags());
		getAdditionalProperties().putAll(details.getAdditionalProperties());
	}

	public static class UpgradeComponentDetails {

		private UpgradeComponentType type;
		private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();
		private Set<String> bonuses;
		private String suffix;
		private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
		private Set<InfusionUpgradeFlag> infusionUpgradeFlags = new HashSet<>();
		private Map<String, Object> additionalProperties = new HashMap<>();

		@JsonProperty("type")
		public UpgradeComponentType getType() {
			return type;
		}

		public void setType(String upgradeComponentType) {
			type = UpgradeComponentType.valueOf(StringUtils.upperCase(upgradeComponentType));
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
			return additionalProperties;
		}

		@JsonAnySetter
		public void setAdditionalProperty(String name, Object value) {
			additionalProperties.put(name, value);
		}

		@JsonProperty("infusion_upgrade_flags")
		public Set<InfusionUpgradeFlag> getInfusionUpgradeFlags() {
			return infusionUpgradeFlags;
		}

		public void setInfusionUpgradeFlags(Set<String> infusionUpgradeFlags) {
			for (String flag : infusionUpgradeFlags) {
				this.infusionUpgradeFlags.add(InfusionUpgradeFlag.valueOf(flag));
			}
		}
	}

}
