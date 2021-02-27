package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseConsumable;

public interface IConsumable extends IItem, IBaseConsumable {

    void addAllSkins(Set<Integer> skins);

    Set<Integer> getSkins();
}
