package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public abstract class BasicJsonDetails {
    @JsonProperty("infusion_slots")
    private List<InfusionSlotJson> infusionSlots = new ArrayList<>();
    @JsonProperty("suffix_item_id")
    private Integer suffixItemId;
    @JsonProperty("secondary_suffix_item_id")
    private Integer secondarySuffixItemId;
    @JsonProperty("infix_upgrade")
    private InfixUpgradeJson infixUpgrade = new InfixUpgradeJson();
    @JsonProperty("attribute_adjustment")
    private Double attributeAdjustment;
    @JsonProperty("stat_choices")
    private Set<Integer> statChoices;

    private Map<String, Object> additionalProperties = new HashMap<>();

}
