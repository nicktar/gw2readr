package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Armor extends Item implements IArmor {

    private ArmorType armorType;
    private WeightClass weightClass;
    private Integer defense;
    private final Set<InfusionSlotType> infusionSlots = new HashSet<>();
    private Integer suffixItemId;
    private Integer secondarySuffixItemId;
    private IInfixUpgrade infixUpgrade;
    private Double attributeAdjustment;
    private final Set<Integer> statChoices = new HashSet<>();

    @Override
    public void addInfusionSlot(InfusionSlotType infusionSlot) {
        infusionSlots.add(infusionSlot);
    }

    @Override
    public void addAllStatChoices(Set<Integer> statChoices) {
        if (statChoices != null) {
            this.statChoices.addAll(statChoices);
        }
    }
}
