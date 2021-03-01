package de.getsetsociety.gw2readr.v0.item.items.enums;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ConsumableType {
    @JsonProperty("Unlock")
    UNLOCK,
    @JsonProperty("Transmutation")
    TRANSMUTATION,
    @JsonProperty("Food")
    FOOD,
    @JsonProperty("Generic")
    GENERIC,
    @JsonProperty("Utility")
    UTILITY,
    @JsonProperty("Booze")
    BOOZE,
    @JsonProperty("UnTransmutation")
    UN_TRANSMUTATION,
    @JsonProperty("Halloween")
    HALLOWEEN,
    @JsonProperty("AppearanceChange")
    APPEARANCE_CHANGE,
    @JsonProperty("ContractNpc")
    CONTRACT_NPC,
    @JsonProperty("UpgradeRemoval")
    UPGRADE_REMOVAL,
    @JsonProperty("Immediate")
    IMMEDIATE,
    @JsonProperty("TeleportToFriend")
    TELEPORT_TO_FRIEND,
    @JsonProperty("Currency")
    CURRENCY,
    @JsonProperty("RandomUnlock")
    RANDOM_UNLOCK,
    @JsonProperty("MountRandomUnlock")
    RANDOM_MOUNT_SKIN,
    @JsonProperty("Unknown")
    UNKNOWN
}
