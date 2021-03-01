package de.getsetsociety.gw2readr.v0.item.items.enums;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContainerType {
    @JsonProperty("Default")
    DEFAULT,
    @JsonProperty("GiftBox")
    GIFT_BOX,
    @JsonProperty("OpenUI")
    OPEN_UI,
    @JsonProperty("Immediate")
    IMMEDIATE
}
