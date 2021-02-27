package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BackItem extends Item implements IBackItem {

    private Set<InfusionSlotType> infusionSlots = new HashSet<>();
    private IInfixUpgrade infixUpgrade;
    private Integer suffixItemId;
    private Integer secondarySuffixItemId;
    private Double attributeAdjustment;
}
