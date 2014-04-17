
package de.getsetsociety.gw2readr.item.items.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.getsetsociety.gw2readr.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.item.items.interfaces.IBaseItem;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include= JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
	@Type(value = CraftingMaterialJson.class, name = "CraftingMaterial"),
	@Type(value = WeaponJson.class, name = "Weapon"),
	@Type(value = ConsumableJson.class, name ="Consumable"),
	@Type(value = ArmorJson.class, name="Armor"),
	@Type(value = BagJson.class, name="Bag"),
	@Type(value = ContainerJson.class, name="Container"),
	@Type(value = TrophyJson.class, name="Trophy"),
	@Type(value = TrinketJson.class, name="Trinket"),
	@Type(value = GizmoJson.class, name="Gizmo"),
	@Type(value = GatheringJson.class, name="Gathering"),
	@Type(value = UpgradeComponentJson.class, name="UpgradeComponent"),
	@Type(value = MiniPetJson.class, name="MiniPet"),
	@Type(value = ToolJson.class, name="Tool"),
	@Type(value = BackItemJson.class, name="Back")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ItemJson <T extends IBaseItem> implements IEntityWrapper<T> {

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return getEntity().getName();
    }

    @JsonProperty("name")
    public void setName(String name) {
        getEntity().setName(name);
    }

    @JsonProperty("description")
    public String getDescription() {
        return getEntity().getDescription();
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.getEntity().setDescription(description);
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

    public void setVendorValue(Integer vendor_value) {
        getEntity().setVendorValue(vendor_value);
    }

    @JsonProperty("icon_file_id")
    public Integer getIconFileId() {
        return getEntity().getIconFileId();
    }

    public void setIconFileId(Integer icon_file_id) {
        getEntity().setIconFileId(icon_file_id);;
    }

    @JsonProperty("icon_file_signature")
    public String getIconFileSignature() {
        return getEntity().getIconFileSignature();
    }

    public void setIconFileSignature(String icon_file_signature) {
        getEntity().setIconFileSignature(icon_file_signature);
    }

    @JsonProperty("game_types")
    public List<String> getGameTypes() {
        return new ArrayList<String>();
    }

    @JsonProperty("game_types")
    public void setGameTypes(List<String> game_types) {
        for (String gt: game_types) {
        	getEntity().string2GameType(gt);
        }
    }

    @JsonProperty("restrictions")
    public List<String> getRestrictions() {
        return new ArrayList<String>();
    }

    @JsonProperty("restrictions")
    public void setRestrictions(List<String> restrictions) {
        for (String restriction: restrictions) {
        	getEntity().getRestrictions().add(RestrictionType.valueOf(restriction));
        }
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("item_id")
    public Integer getId() {
		return getEntity().getId();
	}

	public void setId(Integer id) {
		getEntity().setId(id);
	}

    @JsonProperty("level")
    public Integer getLevel() {
		return getEntity().getLevel();
	}

	public void setLevel(Integer level) {
		getEntity().setLevel(level);
	}
	
	public void setFlags(Set<String> flags) {
		for (String flag: flags) {
			getEntity().getFlags().add(ItemFlags.valueOf(flag));
		}
	}
	
	@JsonProperty("flags")
	public Set<ItemFlags> getFlags() {
		return getEntity().getFlags();
	}

}
