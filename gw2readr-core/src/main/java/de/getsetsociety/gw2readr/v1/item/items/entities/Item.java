package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IItem;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Item implements IItem {

	private Integer id;
	private String name;
	private Integer level;
	private Rarity rarity;
	private Integer vendorValue;
	private Integer iconFileId;
	private String iconFileSignature;
	private Boolean availableInActivity = false;
	private Boolean availableInDungeon = false;
	private Boolean availableInPvE = false;
	private Boolean availableInPvP = false;
	private Boolean availableInPvPLobby = false;
	private Boolean availableInWvW = false;
    private Set<ItemFlags> flags = new HashSet<>();
	private String description;
	private Set<RestrictionType> restrictions = new HashSet<>();
	private Language language;
	private List<String> upgradeRecipes;


    @Override
	public void string2GameType(String gameType) {
		switch (gameType) {
			case "Activity":
				setAvailableInActivity(true);
				break;
			case "Dungeon":
				setAvailableInDungeon(true);
				break;
			case "Pve":
				setAvailableInPvE(true);
				break;
			case "Pvp":
				setAvailableInPvP(true);
				break;
			case "PvpLobby":
				setAvailableInPvPLobby(true);
				break;
			case "Wvw":
				setAvailableInWvW(true);
				break;
			default:
				System.out.println("Unknown game type: " + gameType);
		}
	}

}
