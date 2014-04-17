/**
 * 
 */
package de.getsetsociety.gw2readr.item.recipes.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.item.recipes.enums.Disciplines;
import de.getsetsociety.gw2readr.item.recipes.enums.RecipeFlags;
import de.getsetsociety.gw2readr.item.recipes.enums.RecipeType;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IBaseRecipe;
import de.getsetsociety.gw2readr.item.recipes.interfaces.IIngredient;

/**
 * @author Nicktar
 * 
 */
public class Recipe implements Serializable, IBaseRecipe {

	protected Integer id;
	protected RecipeType type;
	protected Integer outputItemId;
	protected Integer outputItemCount;
	protected Integer minRating;
	protected Integer timeToCraftMs;
	protected Set<Disciplines> disciplines = new HashSet<Disciplines>();
	protected Set<RecipeFlags> flags = new HashSet<RecipeFlags>();
	protected Set<IIngredient> ingredients = new HashSet<IIngredient>();

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public RecipeType getType() {
		return type;
	}

	@Override
	public void setType(RecipeType type) {
		this.type = type;
	}

	@Override
	public Integer getOutputItemId() {
		return outputItemId;
	}

	@Override
	public void setOutputItemId(Integer outputItemId) {
		this.outputItemId = outputItemId;
	}

	@Override
	public Integer getOutputItemCount() {
		return outputItemCount;
	}

	@Override
	public void setOutputItemCount(Integer outputItemCount) {
		this.outputItemCount = outputItemCount;
	}

	@Override
	public Integer getMinRating() {
		return minRating;
	}

	@Override
	public void setMinRating(Integer minRating) {
		this.minRating = minRating;
	}

	@Override
	public Integer getTimeToCraftMs() {
		return timeToCraftMs;
	}

	@Override
	public void setTimeToCraftMs(Integer timeToCraftMs) {
		this.timeToCraftMs = timeToCraftMs;
	}

	@Override
	public Set<Disciplines> getDisciplines() {
		return disciplines;
	}

	@Override
	public void setDisciplines(Set<Disciplines> disciplines) {
		this.disciplines = disciplines;
	}

	@Override
	public Set<RecipeFlags> getFlags() {
		return flags;
	}

	@Override
	public void setFlags(Set<RecipeFlags> flags) {
		this.flags = flags;
	}

	@Override
	public Set<IIngredient> getIngredients() {
		return ingredients;
	}

	@Override
	public void setIngredients(Set<IIngredient> ingredients) {
		this.ingredients = ingredients;
	}

}
