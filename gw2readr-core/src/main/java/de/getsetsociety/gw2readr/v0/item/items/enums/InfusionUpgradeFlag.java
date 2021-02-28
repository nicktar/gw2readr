package de.getsetsociety.gw2readr.v0.item.items.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum InfusionUpgradeFlag {
    @JsonProperty("Defense")
    DEFENSE,
    @JsonProperty("Offense")
    OFFENSE,
    @JsonProperty("Utility")
    UTILITY,
    @JsonProperty("Infusion")
    INFUSION,
    @JsonProperty("Enrichment")
    ENRICHMENT
}
