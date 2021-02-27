package de.getsetsociety.gw2readr.v0.item.items.enums;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ConsumableType {
    @JsonProperty("Unlock")
    Unlock,
    @JsonProperty("Transmutation")
    Transmutation,
    @JsonProperty("Food")
    Food,
    @JsonProperty("Generic")
    Generic,
    @JsonProperty("Utility")
    Utility,
    @JsonProperty("Booze")
    Booze,
    @JsonProperty("UnTransmutation")
    UnTransmutation,
    @JsonProperty("Halloween")
    Halloween,
    @JsonProperty("AppearanceChange")
    AppearanceChange,
    @JsonProperty("ContractNpc")
    ContractNpc,
    @JsonProperty("UpgradeRemoval")
    UpgradeRemoval,
    @JsonProperty("Immediate")
    Immediate,
    @JsonProperty("Unknown")
    Unknown
}
