package de.getsetsociety.gw2readr.item.recipes.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.item.items.json.IEntityWrapper;
import de.getsetsociety.gw2readr.item.recipes.entities.Recipe;
import de.getsetsociety.gw2readr.item.recipes.enums.Disciplines;
import de.getsetsociety.gw2readr.item.recipes.enums.RecipeFlags;
import de.getsetsociety.gw2readr.item.recipes.enums.RecipeType;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IBaseRecipe;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IIngredient;

public class RecipeJson implements IEntityWrapper<IBaseRecipe> {

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private IBaseRecipe entity = new Recipe();

	@JsonProperty("recipe_id")
	public Integer getId() {
		return getEntity().getId();
	}
	
	public void setId(Integer id) {
		getEntity().setId(id);
	}

	@JsonProperty("type")
	public String getType() {
		return getEntity().getType().name();
	}
	
	public void setType(String type) {
		getEntity().setType(RecipeType.valueOf(type));
	}
	
	@JsonProperty("output_item_id")
	public Integer getOutputItemId() {
		return getEntity().getOutputItemId();
	}
	
	public void setOutputItemId(Integer outputItemId) {
		getEntity().setOutputItemId(outputItemId);
	}
	
	@JsonProperty("output_item_count")
	public Integer getOutputItemCount() {
		return getEntity().getOutputItemCount();
	}
	
	public void setOutputItemCount(Integer outputItemCount) {
		getEntity().setOutputItemCount(outputItemCount);
	}
	
	@JsonProperty("min_rating")
	public Integer getMinRating() {
		return getEntity().getMinRating();
	}
	
	public void setMinRating(Integer minRating) {
		getEntity().setMinRating(minRating);
	}
	
	@JsonProperty("time_to_craft_ms")
	public Integer getTimeToCraftMs() {
		return getEntity().getTimeToCraftMs();
	}
	
	public void setTimeToCraftMs(Integer timeToCraftMs) {
		getEntity().setTimeToCraftMs(timeToCraftMs);
	}
	
	@JsonProperty("disciplines")
	public Set<String> getDisciplines() {
		Set<String> retValue = new HashSet<String>();
		for (Disciplines d: getEntity().getDisciplines()) {
			retValue.add(d.name());
		}
		return retValue;
	}
	
	public void setDisciplines(Set<String> disciplines) {
		for (String d: disciplines) {
			getEntity().getDisciplines().add(Disciplines.valueOf(d));
		}
	}
	
	@JsonProperty("flags")
	public Set<String> getFlags() {
		Set<String> retValue = new HashSet<String>();
		for (RecipeFlags f: getEntity().getFlags()) {
			retValue.add(f.name());
		}
		return retValue;
	}
	
	public void setFlags(Set<String> flags) {
		for (String f: flags) {
			getEntity().getFlags().add(RecipeFlags.valueOf(f));
		}
	}
	
	@JsonProperty("ingredients")
	public Set<IIngredient> getIngredients() {
		return getEntity().getIngredients();
	}

	@JsonProperty("ingredients")
	public void setIngredients(Set<IngredientJson> ingredients) {
		for (IngredientJson i: ingredients) {
			getEntity().getIngredients().add(i.getEntity());
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

	@Override
	public IBaseRecipe getEntity() {
		return entity;
	}

}

/*
 * 
 * @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include= JsonTypeInfo.As.PROPERTY,
 * property = "type")
 * 
 * @JsonSubTypes({
 * 
 * @Type(value = CraftingMaterialJson.class, name = "CraftingMaterial"),
 * 
 * @Type(value = WeaponJson.class, name = "Weapon"),
 * 
 * @Type(value = ConsumableJson.class, name ="Consumable"),
 * 
 * @Type(value = ArmorJson.class, name="Armor"),
 * 
 * @Type(value = BagJson.class, name="Bag"),
 * 
 * @Type(value = ContainerJson.class, name="Container"),
 * 
 * @Type(value = TrophyJson.class, name="Trophy"),
 * 
 * @Type(value = TrinketJson.class, name="Trinket"),
 * 
 * @Type(value = GizmoJson.class, name="Gizmo"),
 * 
 * @Type(value = GatheringJson.class, name="Gathering"),
 * 
 * @Type(value = UpgradeComponentJson.class, name="UpgradeComponent"),
 * 
 * @Type(value = MiniPetJson.class, name="MiniPet"),
 * 
 * @Type(value = ToolJson.class, name="Tool"),
 * 
 * @Type(value = BackItemJson.class, name="Back") })
 * 
 * @JsonInclude(JsonInclude.Include.NON_NULL) public abstract class ItemJson <T
 * extends IBaseItem> implements IEntityWrapper<T> {
 * 
 * 
 * @JsonProperty("name") public String getName() { return getEntity().getName();
 * }
 * 
 * @JsonProperty("name") public void setName(String name) {
 * getEntity().setName(name); }
 * 
 * @JsonProperty("description") public String getDescription() { return
 * getEntity().getDescription(); }
 * 
 * @JsonProperty("description") public void setDescription(String description) {
 * this.getEntity().setDescription(description); }
 * 
 * @JsonProperty("rarity") public Rarity getRarity() { return
 * getEntity().getRarity(); }
 * 
 * public void setRarity(String rarity) {
 * getEntity().setRarity(Rarity.valueOf(rarity)); }
 * 
 * @JsonProperty("vendor_value") public Integer getVendor_value() { return
 * getEntity().getVendorValue(); }
 * 
 * public void setVendor_value(Integer vendor_value) {
 * getEntity().setVendorValue(vendor_value); }
 * 
 * @JsonProperty("icon_file_id") public Integer getIconFileId() { return
 * getEntity().getIconFileId(); }
 * 
 * public void setIconFileId(Integer icon_file_id) {
 * getEntity().setIconFileId(icon_file_id);; }
 * 
 * @JsonProperty("icon_file_signature") public String getIconFileSignature() {
 * return getEntity().getIconFileSignature(); }
 * 
 * public void setIconFileSignature(String icon_file_signature) {
 * getEntity().setIconFileSignature(icon_file_signature); }
 * 
 * @JsonProperty("game_types") public List<String> getGameTypes() { return new
 * ArrayList<String>(); }
 * 
 * @JsonProperty("game_types") public void setGameTypes(List<String> game_types)
 * { for (String gt: game_types) { getEntity().string2GameType(gt); } }
 * 
 * @JsonProperty("restrictions") public List<String> getRestrictions() { return
 * new ArrayList<String>(); }
 * 
 * @JsonProperty("restrictions") public void setRestrictions(List<String>
 * restrictions) { for (String restriction: restrictions) {
 * getEntity().getRestrictions().add(RestrictionType.valueOf(restriction)); } }
 * 
 * @JsonAnyGetter public Map<String, Object> getAdditionalProperties() { return
 * this.additionalProperties; }
 * 
 * @JsonAnySetter public void setAdditionalProperty(String name, Object value) {
 * this.additionalProperties.put(name, value); }
 * 
 * @JsonProperty("item_id") public Integer getId() { return getEntity().getId();
 * }
 * 
 * public void setId(Integer id) { getEntity().setId(id); }
 * 
 * @JsonProperty("level") public Integer getLevel() { return
 * getEntity().getLevel(); }
 * 
 * public void setLevel(Integer level) { getEntity().setLevel(level); }
 * 
 * public void setFlags(Set<String> flags) { for (String flag: flags) {
 * getEntity().getFlags().add(ItemFlags.valueOf(flag)); } }
 * 
 * @JsonProperty("flags") public Set<ItemFlags> getFlags() { return
 * getEntity().getFlags(); }
 * 
 * }
 */