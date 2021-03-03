package de.getsetsociety.gw2readr.v2.account.inventory.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.enums.Binding;

public interface IInventoryItem {
    Integer getId();

    Integer getCount();

    Set<Integer> getUpgrades();

    Set<Integer> getInfusions();

    Integer getSkin();

    Binding getBinding();

    String getBoundTo();

    void setId(Integer id);

    void setCount(Integer count);

    void setUpgrades(Set<Integer> upgrades);

    void setInfusions(Set<Integer> infusions);

    void setSkin(Integer skin);

    void setBinding(Binding binding);

    void setBoundTo(String boundTo);

    Set<Integer> getUpgradeSlotIndices();

    void setUpgradeSlotIndices(Set<Integer> upgradeSlotIndices);

    Integer getCharges();

    void setCharges(Integer charges);
}
