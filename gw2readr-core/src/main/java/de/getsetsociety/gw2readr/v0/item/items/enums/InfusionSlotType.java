package de.getsetsociety.gw2readr.v0.item.items.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum InfusionSlotType {
    @JsonProperty("Offense")
    OFFENSE,
    @JsonProperty("Defense")
    DEFENSE,
    @JsonProperty("Utility")
    UTILITY,
    @JsonProperty("Infusion")
    INFUSION
}
