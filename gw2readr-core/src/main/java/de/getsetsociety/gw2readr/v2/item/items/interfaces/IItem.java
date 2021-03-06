package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Collection;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseItem;

public interface IItem extends IBaseItem {

	Rarity getRarity();

    void setRarity(Rarity rarity);

    Set<ItemFlags> getFlags();

    void setFlags(Set<ItemFlags> flags);

    Set<RestrictionType> getRestrictions();

    String getIconSignature();

    void setIconSignature(String iconSignature);

    Integer getDefaultSkin();

    void setDefaultSkin(Integer defaultSkin);

    String getChatLink();

    void setChatLink(String chatLink);

    void addAllRestrictions(Collection<RestrictionType> restrictions);

    Set<IUpgradePath> getUpgradesInto();

    void addAllUpgradesInto(Set<IUpgradePath> upgradePath);

    Set<IUpgradePath> getUpgradesFrom();

    void addAllUpgradesFrom(Set<IUpgradePath> upgradePath);

}
