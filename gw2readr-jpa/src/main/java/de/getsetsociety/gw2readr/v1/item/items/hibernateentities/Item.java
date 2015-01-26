/**
 * 
 */
package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IItem;

/**
 * @author Nicktar
 * 
 */
@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
public class Item implements Serializable, IItem {

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
	private Language language;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getId()
	 */
	@Id
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@Column
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
	@ElementCollection(targetClass=ItemFlags.class)
	@CollectionTable(name="ItemFlags", joinColumns= @JoinColumn(name="ItemId"))
	@Column
	@Enumerated(EnumType.ORDINAL)
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
	@Column(length=512)
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
	@ElementCollection(targetClass=RestrictionType.class)
	@CollectionTable(name="ItemFlags", joinColumns= @JoinColumn(name="ItemId"))
	@Column
	@Enumerated(EnumType.ORDINAL)
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

	@Override
	@Column
	@Enumerated(EnumType.ORDINAL)
	public Language getLanguage() {
		return language;
	}

	@Override
	public void setLanguage(Language language) {
		this.language = language;
	}
}
