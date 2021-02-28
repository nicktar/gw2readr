package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BackItem extends Item implements IBackItem {

    private final Set<IInfusionSlot> infusionSlots = new HashSet<>();
    private IInfixUpgrade infixUpgrade;
    private Integer suffixItemId;
    private Integer secondarySuffixItemId;
    private Double attributeAdjustment;
    private final Set<Integer> statChoices = new HashSet<>();

    @Override
    public void addAllStatChoices(Collection<Integer> statChoices) {
        this.statChoices.addAll(statChoices);
    }

    @Override
    public void addAllInfusionSlots(Collection<IInfusionSlot> infusionSlots) {
        this.infusionSlots.addAll(infusionSlots);
    }
}
