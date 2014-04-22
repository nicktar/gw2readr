package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v1.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v1.item.items.enums.RestrictionType;

public interface IBaseItem {

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract String getName();

	public abstract void setName(String name);

	public abstract Integer getLevel();

	public abstract void setLevel(Integer level);

	public abstract Rarity getRarity();

	public abstract void setRarity(Rarity rarity);

	public abstract Integer getVendorValue();

	public abstract void setVendorValue(Integer vendorValue);

	public abstract Integer getIconFileId();

	public abstract void setIconFileId(Integer iconFileId);

	public abstract String getIconFileSignature();

	public abstract void setIconFileSignature(String iconFileSignature);

	public abstract Boolean getAvailableInActivity();

	public abstract void setAvailableInActivity(Boolean availableInActivity);

	public abstract Boolean getAvailableInDungeon();

	public abstract void setAvailableInDungeon(Boolean availableInDungeon);

	public abstract Boolean getAvailableInPvE();

	public abstract void setAvailableInPvE(Boolean availableInPvE);

	public abstract Boolean getAvailableInPvP();

	public abstract void setAvailableInPvP(Boolean availableInPvP);

	public abstract Boolean getAvailableInPvPLobby();

	public abstract void setAvailableInPvPLobby(Boolean availableInPvPLobby);

	public abstract Boolean getAvailableInWvW();

	public abstract void setAvailableInWvW(Boolean availableInWvW);

	public abstract Set<ItemFlags> getFlags();

	public abstract void setFlags(Set<ItemFlags> flags);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	public abstract void string2GameType(String gameType);

	public abstract Set<RestrictionType> getRestrictions();

	public abstract void setRestrictions(Set<RestrictionType> restrictions);
	
	public abstract Language getLanguage();
	
	public abstract void setLanguage(Language language);

}