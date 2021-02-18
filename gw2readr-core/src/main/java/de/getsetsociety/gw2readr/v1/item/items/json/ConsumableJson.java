package de.getsetsociety.gw2readr.v1.item.items.json;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.items.entities.Icon;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IIcon;
import lombok.Getter;
import lombok.Setter;

public class ConsumableJson extends ItemJson<IConsumable> {

    private final IConsumable item = EntityFactoryProvider.getItemEntityFactory().newConsumable();

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
        if (StringUtils.isNotEmpty(details.getDescription())) {
            item.setDescription(details.getDescription());
        }
        item.setRecipeId(details.getRecipeId());
        item.setApplyCount(details.getApplyCount());
        item.setIcon(mapIcon(details.getIcon()));
        item.setConsumableName(details.getName());
        item.setExtraRecipeIds(details.getExtraRecipeIds());
        getAdditionalProperties().putAll(details.getAdditionalProperties());
    }

    private IIcon mapIcon(IconJson icon) {
        return Optional.ofNullable(icon)
                       .map(i -> Icon.builder()
                                     .fileId(i.getFileId())
                                     .signature(i.getSignature())
                                     .build())
                       .orElse(null);
    }

    @Getter
    @Setter
    public static class ConsumableDetails {

        @JsonProperty("type")
        private ConsumableType type;
        @JsonProperty("unlock_type")
        private ConsumableUnlockType unlockType;
        @JsonProperty("color_id")
        private Integer colorId;
        @JsonProperty("duration_ms")
        private Integer durationMs;
        private String description;
        @JsonProperty("recipe_id")
        private Integer recipeId;
        @JsonProperty("guild_upgrade_id")
        private Integer guildUpgradeId;
        @JsonProperty("apply_count")
        private Integer applyCount;
        private String name;
        private IconJson icon;
        @JsonProperty("extra_recipe_ids")
        private Set<Integer> extraRecipeIds;
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
