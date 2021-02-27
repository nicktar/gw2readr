package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradeComponent;
import lombok.Data;

public class UpgradeComponentJson extends ItemJson<IUpgradeComponent> {

    private final IUpgradeComponent item = EntityFactoryProvider.getItemEntityFactory().newUpgradeComponent();

    @Override
    public IUpgradeComponent getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setUpgradeComponentDetails(UpgradeComponentDetails details) {
        item.setUpgradeComponentType(details.getType());
        item.addAllUpgradeComponentFlags(details.getUpgradeComponentFlags());
        item.setSuffix(details.getSuffix());
        item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
        item.addAllInfusionUpgradeFlags(details.getInfusionUpgradeFlags());
        item.setAttributeAdjustment(details.getAttributeAdjustment());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Data
    private static class UpgradeComponentDetails {

        @JsonProperty("type")
        private UpgradeComponentType type;
        @JsonProperty("flags")
        private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();
        @JsonProperty("bonuses")
        private Set<String> bonuses;
        @JsonProperty("suffix")
        private String suffix;
        @JsonProperty("infix_upgrade")
        private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
        @JsonProperty("infusion_upgrade_flags")
        private Set<InfusionUpgradeFlag> infusionUpgradeFlags = new HashSet<>();
        @JsonProperty("attribute_adjustment")
        private Double attributeAdjustment;
        private Map<String, Object> additionalProperties = new HashMap<>();

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            additionalProperties.put(name, value);
        }
    }

}
