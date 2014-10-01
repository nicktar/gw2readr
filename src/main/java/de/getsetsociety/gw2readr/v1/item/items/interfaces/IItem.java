package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseItem;

public interface IItem extends IBaseItem {

	public abstract Rarity getRarity();

	public abstract void setRarity(Rarity rarity);

	public abstract Integer getIconFileId();

	public abstract void setIconFileId(Integer iconFileId);

	public abstract String getIconFileSignature();

	public abstract void setIconFileSignature(String iconFileSignature);

	public abstract Set<RestrictionType> getRestrictions();

	public abstract void setRestrictions(Set<RestrictionType> restrictions);

	public abstract Set<ItemFlags> getFlags();

	public abstract void setFlags(Set<ItemFlags> flags);

}