package de.getsetsociety.gw2readr.v2.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v2.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v2.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v2.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBaseItem;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include= JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
	//	@Type(value = CraftingMaterialJson.class, name = "CraftingMaterial"),
	@Type(value = WeaponJson.class, name = "Weapon"),
	@Type(value = ConsumableJson.class, name ="Consumable"),
	@Type(value = ArmorJson.class, name="Armor"),
	//	@Type(value = BagJson.class, name="Bag"),
	//	@Type(value = ContainerJson.class, name="Container"),
	//	@Type(value = TrophyJson.class, name="Trophy"),
	//	@Type(value = TrinketJson.class, name="Trinket"),
	//	@Type(value = GizmoJson.class, name="Gizmo"),
	//	@Type(value = GatheringJson.class, name="Gathering"),
	@Type(value = UpgradeComponentJson.class, name="UpgradeComponent"),
	//	@Type(value = MiniPetJson.class, name="MiniPet"),
	//	@Type(value = ToolJson.class, name="Tool"),
	@Type(value = BackItemJson.class, name="Back")
})
public abstract class ItemJson<T extends IBaseItem> implements IEntityWrapper<T> {

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return getEntity().getName();
	}

	public void setName(String name) {
		getEntity().setName(name);
	}

	@JsonProperty("description")
	public String getDescription() {
		return getEntity().getDescription();
	}

	public void setDescription(String description) {
		getEntity().setDescription(description);
	}

	@JsonProperty("level")
	public Integer getLevel() {
		return getEntity().getLevel();
	}

	public void setLevel(Integer level) {
		getEntity().setLevel(level);
	}

	@JsonProperty("rarity")
	public Rarity getRarity() {
		return getEntity().getRarity();
	}

	public void setRarity(String rarity) {
		getEntity().setRarity(Rarity.valueOf(rarity));
	}

	@JsonProperty("vendor_value")
	public Integer getVendorValue() {
		return getEntity().getVendorValue();
	}

	public void setVendorValue(Integer vendorValue) {
		getEntity().setVendorValue(vendorValue);
	}

	@JsonProperty("game_types")
	public List<String> getGameTypes() {
		return new ArrayList<String>();
	}

	public void setGameTypes(List<String> gameTypes) {
		for (String gameType: gameTypes) {
			getEntity().string2GameType(gameType);
		}
	}

	@JsonProperty("flags")
	public Set<ItemFlags> getFlags() {
		return getEntity().getFlags();
	}

	public void setFlags(Set<String> flags) {
		for (String flag: flags) {
			getEntity().getFlags().add(ItemFlags.valueOf(flag));
		}
	}

	@JsonProperty("restrictions")
	public List<String> getRestrictions() {
		return new ArrayList<String>();
	}

	public void setRestrictions(List<String> restrictions) {
		for (String restriction: restrictions) {
			getEntity().getRestrictions().add(RestrictionType.valueOf(restriction));
		}
	}

	@JsonProperty("id")
	public Integer getId() {
		return getEntity().getId();
	}

	public void setId(Integer id) {
		getEntity().setId(id);
	}

	@JsonProperty("icon")
	public String getIcon() {
		return getEntity().getIcon();
	}

	public void setIcon(String icon) {
		getEntity().setIcon(icon);
	}

	@JsonProperty("default_skin")
	public Integer getDefaultSkin() {
		return getEntity().getDefaultSkin();
	}

	public void setDefaultSkin(Integer defaultSkin) {
		getEntity().setDefaultSkin(defaultSkin);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public void setLanguage(Language language) {
		getEntity().setLanguage(language);
	}

}
