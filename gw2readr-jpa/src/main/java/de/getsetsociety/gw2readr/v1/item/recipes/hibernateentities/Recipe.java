/**
 * 
 */
package de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.Disciplines;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.RecipeFlags;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.RecipeType;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IIngredient;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IRecipe;

/**
 * @author Nicktar
 * 
 */
@Table
@Entity
public class Recipe implements Serializable, IRecipe {

	private static final long serialVersionUID = 7537126186106705849L;
	private Integer id;
	private RecipeType type;
	private Integer outputItemId;
	private Integer outputItemCount;
	private Integer minRating;
	private Integer timeToCraftMs;
	private Set<Disciplines> disciplines = new HashSet<Disciplines>();
	private Set<RecipeFlags> flags = new HashSet<RecipeFlags>();
	private Set<IIngredient> ingredients = new HashSet<IIngredient>();
	private Language language;
	

	/*
	 * (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IBaseItem#getId()
	 */
	@Override
	@Id
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
	@Column
	@Enumerated(EnumType.ORDINAL)
	public RecipeType getType() {
		return type;
	}

	@Override
	public void setType(RecipeType type) {
		this.type = type;
	}

	@Override
	@Column
	public Integer getOutputItemId() {
		return outputItemId;
	}

	@Override
	public void setOutputItemId(Integer outputItemId) {
		this.outputItemId = outputItemId;
	}

	@Override
	@Column
	public Integer getOutputItemCount() {
		return outputItemCount;
	}

	@Override
	public void setOutputItemCount(Integer outputItemCount) {
		this.outputItemCount = outputItemCount;
	}

	@Override
	@Column
	public Integer getMinRating() {
		return minRating;
	}

	@Override
	public void setMinRating(Integer minRating) {
		this.minRating = minRating;
	}

	@Override
	@Column
	public Integer getTimeToCraftMs() {
		return timeToCraftMs;
	}

	@Override
	public void setTimeToCraftMs(Integer timeToCraftMs) {
		this.timeToCraftMs = timeToCraftMs;
	}

	@Override
	@ElementCollection(targetClass=Disciplines.class)
	@CollectionTable(name="Disciplines", joinColumns= @JoinColumn(name="RecipeId"))
	@Column
	@Enumerated(EnumType.ORDINAL)

	public Set<Disciplines> getDisciplines() {
		return disciplines;
	}

	@Override
	public void setDisciplines(Set<Disciplines> disciplines) {
		this.disciplines = disciplines;
	}

	@Override
	@ElementCollection(targetClass=RecipeFlags.class)
	@CollectionTable(name="RecipeFlags", joinColumns= @JoinColumn(name="RecipeId"))
	@Column
	@Enumerated(EnumType.ORDINAL)
	public Set<RecipeFlags> getFlags() {
		return flags;
	}

	@Override
	public void setFlags(Set<RecipeFlags> flags) {
		this.flags = flags;
	}

	@Override
	@OneToMany(targetEntity=Ingredient.class, orphanRemoval=true, cascade=CascadeType.ALL)
	public Set<IIngredient> getIngredients() {
		return ingredients;
	}

	@Override
	public void setIngredients(Set<IIngredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	@Column
	@Enumerated(EnumType.STRING)
	public Language getLanguage() {
		return language;
	}

	@Override
	public void setLanguage(Language language) {
		this.language = language;
	}

}
