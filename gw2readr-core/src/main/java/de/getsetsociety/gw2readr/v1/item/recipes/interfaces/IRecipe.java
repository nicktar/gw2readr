package de.getsetsociety.gw2readr.v1.item.recipes.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.Disciplines;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.RecipeFlags;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.RecipeType;

public interface IRecipe {
	

	public abstract void setIngredients(Set<IIngredient> ingredients);

	public abstract Set<IIngredient> getIngredients();

	public abstract void setFlags(Set<RecipeFlags> flags);

	public abstract Set<RecipeFlags> getFlags();

	public abstract void setDisciplines(Set<Disciplines> disciplines);

	public abstract Set<Disciplines> getDisciplines();

	public abstract void setTimeToCraftMs(Integer timeToCraftMs);

	public abstract Integer getTimeToCraftMs();

	public abstract void setMinRating(Integer minRating);

	public abstract Integer getMinRating();

	public abstract void setOutputItemCount(Integer outputItemCount);

	public abstract Integer getOutputItemCount();

	public abstract void setOutputItemId(Integer outputItemId);

	public abstract Integer getOutputItemId();

	public abstract void setType(RecipeType type);

	public abstract RecipeType getType();

	public abstract void setId(Integer id);

	public abstract Integer getId();

	public abstract void setLanguage(Language language);

	public abstract Language getLanguage();


}
