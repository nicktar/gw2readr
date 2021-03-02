package de.getsetsociety.gw2readr.v2.account.material.enums;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum Binding {
    @JsonProperty("Account")
    ACCOUNT_BOUND,
    @JsonEnumDefaultValue
    UNKNOWN
}
