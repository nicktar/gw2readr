package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.general.enums.Language;

import java.util.List;

public interface IBaseItem {

	Integer getId();

	void setId(Integer id);

	String getName();

	void setName(String name);

	Integer getLevel();

	void setLevel(Integer level);

	Integer getVendorValue();

	void setVendorValue(Integer vendorValue);

	Boolean getAvailableInActivity();

	void setAvailableInActivity(Boolean availableInActivity);

	Boolean getAvailableInDungeon();

	void setAvailableInDungeon(Boolean availableInDungeon);

	List<String> getUpgradeRecipes();

	void setUpgradeRecipes(List<String> upgradeRecipe);


	Boolean getAvailableInPvE();

	void setAvailableInPvE(Boolean availableInPvE);

	Boolean getAvailableInPvP();

	void setAvailableInPvP(Boolean availableInPvP);

	Boolean getAvailableInPvPLobby();

	void setAvailableInPvPLobby(Boolean availableInPvPLobby);

	Boolean getAvailableInWvW();

	void setAvailableInWvW(Boolean availableInWvW);

	String getDescription();

	void setDescription(String description);

	void string2GameType(String gameType);

	Language getLanguage();
	
	void setLanguage(Language language);

}