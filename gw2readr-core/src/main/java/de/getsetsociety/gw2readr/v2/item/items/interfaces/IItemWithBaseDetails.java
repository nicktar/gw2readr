package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Collection;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;

public interface IItemWithBaseDetails {
    void addAllInfusionSlots(Collection<IInfusionSlot> slots);

    void setSuffixItemId(Integer suffixItemId);

    void setSecondarySuffixItemId(Integer secondarySuffixItemId);

    void setInfixUpgrade(IInfixUpgrade entity);

    void setAttributeAdjustment(Double attributeAdjustment);

    void addAllStatChoices(Collection<Integer> statChoices);
}
