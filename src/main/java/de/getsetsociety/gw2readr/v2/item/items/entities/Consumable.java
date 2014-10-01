package de.getsetsociety.gw2readr.v2.item.items.entities;


import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IConsumable;

public class Consumable extends Item implements IConsumable {

	private static final long serialVersionUID = 3862166075196472425L;
	private ConsumableType consumableType;
	private ConsumableUnlockType unlockType;
	private Integer colorId;
	private Integer durationMs;
	private String description;
	private Integer recipeId;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#getUnlockType()
	 */
	@Override
	public ConsumableUnlockType getUnlockType() {
		return unlockType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#setUnlockType(de.getsetsociety.armory.enums.ConsumableUnlockType)
	 */
	@Override
	public void setUnlockType(ConsumableUnlockType unlockType) {
		this.unlockType = unlockType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#getConsumableType()
	 */
	@Override
	public ConsumableType getConsumableType() {
		return consumableType;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#setConsumableType(de.getsetsociety.armory.enums.ConsumableType)
	 */
	@Override
	public void setConsumableType(ConsumableType type) {
		this.consumableType = type;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#getColorId()
	 */
	@Override
	public Integer getColorId() {
		return colorId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#setColorId(java.lang.Integer)
	 */
	@Override
	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#getDurationMs()
	 */
	@Override
	public Integer getDurationMs() {
		return durationMs;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#setDurationMs(java.lang.Integer)
	 */
	@Override
	public void setDurationMs(Integer durationMs) {
		this.durationMs = durationMs;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#getRecipeId()
	 */
	@Override
	public Integer getRecipeId() {
		return recipeId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IConsumable#setRecipeId(java.lang.Integer)
	 */
	@Override
	public void setRecipeId(Integer recipeId) {
		this.recipeId = recipeId;
	}

}
