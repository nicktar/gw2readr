package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;

public interface IBaseItem extends de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseItem {

	public abstract Rarity getRarity();

	public abstract void setRarity(Rarity rarity);

	public abstract Set<ItemFlags> getFlags();

	public abstract void setFlags(Set<ItemFlags> flags);

	public abstract Set<RestrictionType> getRestrictions();

	public abstract void setRestrictions(Set<RestrictionType> restrictions);

	public abstract String getIcon();

	public abstract void setIcon(String icon);

	public abstract Integer getDefaultSkin();

	public abstract void setDefaultSkin(Integer defaultSkin);

}