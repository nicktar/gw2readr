package de.getsetsociety.gw2readr.v0.item.items.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RestrictionType {
    @JsonProperty("Asura")
    ASURA,
    @JsonProperty("Charr")
    CHARR,
    @JsonProperty("Human")
    HUMAN,
    @JsonProperty("Norn")
    NORN,
    @JsonProperty("Sylvari")
    SYLVARI,
    @JsonProperty("Guardian")
    GUARDIAN,
    @JsonProperty("Warrior")
    WARRIOR,
    @JsonProperty("Mesmer")
    MESMER,
    @JsonProperty("Ranger")
    RANGER,
    @JsonProperty("Necromancer")
    NECROMANCER,
    @JsonProperty("Female")
    FEMALE
}
