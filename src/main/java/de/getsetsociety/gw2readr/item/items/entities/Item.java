/**
 * 
 */
package de.getsetsociety.gw2readr.item.items.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.item.items.interfaces.IBaseItem;

/**
 * @author Nicktar
 * 
 */
public class Item implements Serializable, IBaseItem {

	private static final long serialVersionUID = -8942935346941562118L;
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
	private Set<ItemFlags> flags = new HashSet<ItemFlags>();
	private String description;
	private Set<RestrictionType> restrictions = new HashSet<>();

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getLevel()
	 */
	@Override
	public Integer getLevel() {
		return level;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setLevel(java.lang.Integer)
	 */
	@Override
	public void setLevel(Integer level) {
		this.level = level;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getRarity()
	 */
	@Override
	public Rarity getRarity() {
		return rarity;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setRarity(de.getsetsociety.armory.enums.Rarity)
	 */
	@Override
	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getVendorValue()
	 */
	@Override
	public Integer getVendorValue() {
		return vendorValue;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setVendorValue(java.lang.Integer)
	 */
	@Override
	public void setVendorValue(Integer vendorValue) {
		this.vendorValue = vendorValue;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getIconFileId()
	 */
	@Override
	public Integer getIconFileId() {
		return iconFileId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setIconFileId(java.lang.Integer)
	 */
	@Override
	public void setIconFileId(Integer iconFileId) {
		this.iconFileId = iconFileId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getIconFileSignature()
	 */
	@Override
	public String getIconFileSignature() {
		return iconFileSignature;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setIconFileSignature(java.lang.String)
	 */
	@Override
	public void setIconFileSignature(String iconFileSignature) {
		this.iconFileSignature = iconFileSignature;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getAvailableInActivity()
	 */
	@Override
	public Boolean getAvailableInActivity() {
		return availableInActivity;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setAvailableInActivity(java.lang.Boolean)
	 */
	@Override
	public void setAvailableInActivity(Boolean availableInActivity) {
		this.availableInActivity = availableInActivity;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getAvailableInDungeon()
	 */
	@Override
	public Boolean getAvailableInDungeon() {
		return availableInDungeon;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setAvailableInDungeon(java.lang.Boolean)
	 */
	@Override
	public void setAvailableInDungeon(Boolean availableInDungeon) {
		this.availableInDungeon = availableInDungeon;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getAvailableInPvE()
	 */
	@Override
	public Boolean getAvailableInPvE() {
		return availableInPvE;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setAvailableInPvE(java.lang.Boolean)
	 */
	@Override
	public void setAvailableInPvE(Boolean availableInPvE) {
		this.availableInPvE = availableInPvE;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getAvailableInPvP()
	 */
	@Override
	public Boolean getAvailableInPvP() {
		return availableInPvP;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setAvailableInPvP(java.lang.Boolean)
	 */
	@Override
	public void setAvailableInPvP(Boolean availableInPvP) {
		this.availableInPvP = availableInPvP;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getAvailableInPvPLobby()
	 */
	@Override
	public Boolean getAvailableInPvPLobby() {
		return availableInPvPLobby;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setAvailableInPvPLobby(java.lang.Boolean)
	 */
	@Override
	public void setAvailableInPvPLobby(Boolean availableInPvPLobby) {
		this.availableInPvPLobby = availableInPvPLobby;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getAvailableInWvW()
	 */
	@Override
	public Boolean getAvailableInWvW() {
		return availableInWvW;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setAvailableInWvW(java.lang.Boolean)
	 */
	@Override
	public void setAvailableInWvW(Boolean availableInWvW) {
		this.availableInWvW = availableInWvW;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getFlags()
	 */
	@Override
	public Set<ItemFlags> getFlags() {
		return flags;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setFlags(java.util.Set)
	 */
	@Override
	public void setFlags(Set<ItemFlags> flags) {
		this.flags = flags;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

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

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getRestrictions()
	 */
	@Override
	public Set<RestrictionType> getRestrictions() {
		return restrictions;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setRestrictions(java.util.Set)
	 */
	@Override
	public void setRestrictions(Set<RestrictionType> restrictions) {
		this.restrictions = restrictions;
	}
}
