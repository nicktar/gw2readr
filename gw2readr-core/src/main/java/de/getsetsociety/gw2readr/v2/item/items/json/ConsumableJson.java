package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IConsumable;
import lombok.Data;

public class ConsumableJson extends ItemJson<IConsumable> {

    private final IConsumable item = EntityFactoryProvider.getItemEntityFactory().newConsumable();

    @Override
    public IConsumable getEntity() {
        return item;
    }

    @JsonProperty("details")
    public void setConsumableDetails(ConsumableDetails details) {
        item.setUnlockType(details.getUnlockType());
        item.setConsumableType(details.getType());
        item.setColorId(details.getColorId());
        item.setDurationMs(details.getDurationMs());
        item.setRecipeId(details.getRecipeId());
        item.setApplyCount(details.getApplyCount());
        item.setConsumableName(details.getName());
        item.setIcon(details.getIcon());
        item.setDescription(details.getDescription());
        item.addAllSkins(details.getSkins());
        item.setGuildUpgradeId(details.getGuildUpgradeId());
        item.setExtraRecipeIds(details.getExtraRecipeIds());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    @Data
    public static class ConsumableDetails {

        @JsonProperty("type")
        private ConsumableType type;
        @JsonProperty("unlock_type")
        private ConsumableUnlockType unlockType;
        @JsonProperty("color_id")
        private Integer colorId;
        @JsonProperty("duration_ms")
        private Integer durationMs;
        @JsonProperty("recipe_id")
        private Integer recipeId;
        @JsonProperty("apply_count")
        private Integer applyCount;
        @JsonProperty("name")
        private String name;
        @JsonProperty("icon")
        private String icon;
        @JsonProperty("description")
        private String description;
        @JsonProperty("skins")
        private Set<Integer> skins = new HashSet<>();
        @JsonProperty("guild_upgrade_id")
        private Integer guildUpgradeId;
        @JsonProperty("extra_recipe_ids")
        private Set<Integer> extraRecipeIds = new HashSet<>();
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
