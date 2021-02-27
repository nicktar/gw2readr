package de.getsetsociety.gw2readr.v0.item.items.enums;

import java.util.Arrays;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ItemFlags {
    ACCOUNT_BOUND("ACCOUNTBOUND"),
    HIDE_SUFFIX("HIDESUFFIX"),
    NO_MYSTIC_FORGE("NOMYSTICFORGE"),
    NO_SELL("NOSELL"),
    NO_SALVAGE("NOSALVAGE"),
    NOT_UPGRADEABLE("NOTUPGRADEABLE"),
    NO_UNDERWATER("NOUNDERWATER"),
    SOUL_BIND_ON_ACQUIRE("SOULBINDONACQUIRE"),
    SOUL_BIND_ON_USE("SOULBINDONUSE"),
    UNIQUE("UNIQUE"),
    ACCOUNT_BIND_ON_USE("ACCOUNTBINDONUSE"),
    MONSTER_ONLY("MONSTERONLY"),
    DELETE_WARNING("DELETEWARNING"),
    TONIC("TONIC"),
    BULK_CONSUME("BULKCONSUME");

    private final String jsonString;

    public static ItemFlags fromJsonString(String jsonString) {
        return Arrays.stream(ItemFlags.values())
                     .filter(i -> i.jsonString.equalsIgnoreCase(jsonString))
                     .findFirst()
                     .orElseThrow(() -> new IllegalArgumentException("No Flag found for String " + jsonString));
    }
}
