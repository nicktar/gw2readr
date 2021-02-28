package de.getsetsociety.gw2readr.v0.item.items.enums;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum Attribute {
    @JsonProperty("Power")
    POWER,
    @JsonProperty("Precision")
    PRECISION,
    @JsonProperty("Toughness")
    TOUGHNESS,
    @JsonProperty("Vitality")
    VITALITY,
    @JsonProperty("ConditionDamage")
    CONDITION_DAMAGE,
    @JsonProperty("CritDamage")
    CRIT_DAMAGE,
    @JsonProperty("Healing")
    HEALING,
    @JsonProperty("ConditionDuration")
    CONDITION_DURATION,
    @JsonProperty("BoonDuration")
    BOON_DURATION
}
