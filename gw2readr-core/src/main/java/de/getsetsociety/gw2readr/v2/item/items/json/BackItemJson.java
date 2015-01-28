package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;

public class BackItemJson extends ItemJson<IBackItem> {

    private IBackItem item = EntityFactoryProvider.getItemEntityFactory().newBackItem();

    @JsonProperty("details")
    public void setWeaponDetails(WeaponDetailsJson details) {
        for (InfusionSlotJson detail : details.getInfusionSlots()) {
            item.getInfusionSlots().addAll(detail.getFlags());
        }
        item.setSuffixItemId(details.getSuffixItemId());
        item.setSecondarySuffixItemId(details.getSecondarySuffixItemId());
        item.setInfixUpgrade(details.getInfixUpgrade().getEntity());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Override
    public IBackItem getEntity() {
        return item;
    }

    public class WeaponDetailsJson {

        private List<InfusionSlotJson> infusionSlots = new ArrayList<>();
        private Integer suffixItemId;
        private Integer secondarySuffixItemId;
        private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
