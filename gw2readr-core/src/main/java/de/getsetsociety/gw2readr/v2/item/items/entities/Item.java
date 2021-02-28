package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IItem;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradePath;
import lombok.Data;

@Data
public class Item implements IItem {

    private Integer id;
    private String name;
    private Integer level;
    private Rarity rarity;
    private Integer vendorValue;
    private String iconSignature;
    private Boolean availableInActivity = false;
    private Boolean availableInDungeon = false;
    private Boolean availableInPvE = false;
    private Boolean availableInPvP = false;
    private Boolean availableInPvPLobby = false;
    private Boolean availableInWvW = false;
    private Set<ItemFlags> flags = new HashSet<>();
    private String description;
    private final Set<RestrictionType> restrictions = new HashSet<>();
    private Language language;
    private Integer defaultSkin;
    private String chatLink;
    private final Set<IUpgradePath> upgradesFrom = new HashSet<>();
    private final Set<IUpgradePath> upgradesInto = new HashSet<>();

    @Override
    public void string2GameType(String gameType) {
        switch (gameType) {
            case "Activity" -> setAvailableInActivity(true);
            case "Dungeon" -> setAvailableInDungeon(true);
            case "Pve" -> setAvailableInPvE(true);
            case "Pvp" -> setAvailableInPvP(true);
            case "PvpLobby" -> setAvailableInPvPLobby(true);
            case "Wvw" -> setAvailableInWvW(true);
            default -> System.out.println("Unknown game type: " + gameType);
        }
    }

    @Override
    public void addAllFlags(Set<ItemFlags> flags) {
        this.flags.addAll(flags);
    }

    @Override
    public void addAllRestrictions(Collection<RestrictionType> restrictions) {
        this.restrictions.addAll(restrictions);
    }

    @Override
    public void addAllUpgradesInto(Set<IUpgradePath> upgradePaths) {
        upgradesInto.addAll(upgradePaths);
    }

    @Override
    public void addAllUpgradesFrom(Set<IUpgradePath> upgradePaths) {
        upgradesFrom.addAll(upgradePaths);
    }
}
