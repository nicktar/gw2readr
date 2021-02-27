package de.getsetsociety.gw2readr.v0.item.items.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum UpgradeComponentType {
    @JsonProperty("Rune")
    RUNE,
    @JsonProperty("Sigil")
    SIGIL,
    @JsonProperty("Default")
    DEFAULT,
    @JsonProperty("Gem")
    GEM
}
