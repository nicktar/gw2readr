package de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Binding {
    @JsonProperty("Account")
    ACCOUNT_BOUND,
    @JsonProperty("Character")
    SOUL_BOUND,
    @JsonEnumDefaultValue
    UNKNOWN
}
