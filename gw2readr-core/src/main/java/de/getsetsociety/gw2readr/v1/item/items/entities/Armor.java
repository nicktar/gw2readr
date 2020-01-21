package de.getsetsociety.gw2readr.v1.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Armor extends Item implements IArmor {

    private static final long serialVersionUID = 8450275854880660075L;
    private ArmorType armorType;
    private WeightClass wightClass;
    private Integer defense;
    private Set<InfusionSlotType> infusionSlots = new HashSet<>();
    private Integer suffixItemId;
    private IInfixUpgrade infixUpgrade;
    private WeightClass weightClass;
    private Integer secondarySuffixItemId;

}
