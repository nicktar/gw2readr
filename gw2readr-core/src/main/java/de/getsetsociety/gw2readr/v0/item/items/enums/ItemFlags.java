package de.getsetsociety.gw2readr.v0.item.items.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ItemFlags {
    @JsonProperty("AccountBound")
    ACCOUNT_BOUND,
    @JsonProperty("HideSuffix")
    HIDE_SUFFIX,
    @JsonProperty("NoMysticForge")
    NO_MYSTIC_FORGE,
    @JsonProperty("NoSell")
    NO_SELL,
    @JsonProperty("NoSalvage")
    NO_SALVAGE,
    @JsonProperty("NotUpgradeable")
    NOT_UPGRADEABLE,
    @JsonProperty("NoUnderwater")
    NO_UNDERWATER,
    @JsonProperty("SoulbindOnAcquire")
    SOUL_BIND_ON_ACQUIRE,
    @JsonProperty("SoulBindOnUse")
    SOUL_BIND_ON_USE,
    @JsonProperty("Unique")
    UNIQUE,
    @JsonProperty("AccountBindOnUse")
    ACCOUNT_BIND_ON_USE,
    @JsonProperty("MonsterOnly")
    MONSTER_ONLY,
    @JsonProperty("DeleteWarning")
    DELETE_WARNING,
    @JsonProperty("Tonic")
    TONIC,
    @JsonProperty("BulkConsume")
    BULK_CONSUME,
    @JsonProperty("Attuned")
    ATTUNED,
    @JsonProperty("Infused")
    INFUSED

}
