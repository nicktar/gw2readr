/**
 * 
 */
package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IItem;
import lombok.Data;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Nicktar
 * 
 */
@Data
@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
public class Item implements IItem {

    @Id
	private Integer id;

    @Column
    private String name;

    @Column
    private Integer level;
    @Column
    private Rarity rarity;
    @Column
    private Integer vendorValue;
    @Column
    private Integer iconFileId;
    @Column
    private String iconFileSignature;
    @Column
    private Boolean availableInActivity = false;
    @Column
    private Boolean availableInDungeon = false;
    @Column
    private Boolean availableInPvE = false;
    @Column
    private Boolean availableInPvP = false;
    @Column
    private Boolean availableInPvPLobby = false;
    @Column
    private Boolean availableInWvW = false;
    @Column
    @ElementCollection(targetClass = ItemFlags.class)
    @CollectionTable(name = "ItemFlags", joinColumns = @JoinColumn(name = "ItemId"))
    @Enumerated(EnumType.ORDINAL)
    private Set<ItemFlags> flags = new HashSet<>();
    @Column(length = 512)
	private String description;
    @Column
    @ElementCollection(targetClass = RestrictionType.class)
    @CollectionTable(name = "ItemFlags", joinColumns = @JoinColumn(name = "ItemId"))
    @Enumerated(EnumType.ORDINAL)
    private Set<RestrictionType> restrictions = new HashSet<>();
	@Column
	@Enumerated(EnumType.ORDINAL)
    private Language language;
    @ElementCollection(targetClass = String.class)
    private List<String> upgradeRecipes;
    @Column
    private Integer defaultSkin;
    @Column
    private String chatLink;


    /* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#string2GameType(java.lang.String)
	 */
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
