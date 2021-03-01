package de.getsetsociety.gw2readr.v0.item.items.enums;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConsumableUnlockType {
    @JsonProperty("Unknown")
    UNKNOWN,
    @JsonProperty("CraftingRecipe")
    CRAFTING_RECIPE,
    @JsonProperty("Dye")
    DYE,
    @JsonProperty("Content")
    CONTENT,
    @JsonProperty("CollectibleCapacity")
    COLLECTIBLE_CAPACITY,
    @JsonProperty("BagSlot")
    BAG_SLOT,
    @JsonProperty("BankTab")
    BANK_TAB,
    @JsonProperty("Outfit")
    OUTFIT,
    @JsonProperty("GliderSkin")
    GLIDER_SKIN,
    @JsonProperty("SharedSlot")
    SHARED_SLOT,
    @JsonProperty("Champion")
    CHAMPION,
    @JsonProperty("Minipet")
    MINI_PET,
    @JsonProperty("Ms")
    MOUNT_SKIN,
    @JsonProperty("GearLoadoutTab")
    GEAR_LOADOUT_TAB
}
