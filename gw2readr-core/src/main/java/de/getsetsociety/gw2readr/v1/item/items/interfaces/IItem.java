package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseItem;

import java.util.Set;

public interface IItem extends IBaseItem {

    Rarity getRarity();

    void setRarity(Rarity rarity);

    Integer getIconFileId();

    void setIconFileId(Integer iconFileId);

    String getIconFileSignature();

    void setIconFileSignature(String iconFileSignature);

    Set<RestrictionType> getRestrictions();

    void setRestrictions(Set<RestrictionType> restrictions);

    Set<ItemFlags> getFlags();

    void setFlags(Set<ItemFlags> flags);

    Integer getDefaultSkin();

    void setDefaultSkin(Integer defaultSkin);

}