package de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities;

import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IIngredient;

public class Ingredient implements IIngredient {

	private Integer itemId;
	private Integer count;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.entities.IIngredient#getItemId()
	 */
	@Override
	public Integer getItemId() {
		return itemId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.entities.IIngredient#setItemId(java.lang.Integer)
	 */
	@Override
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.entities.IIngredient#getCount()
	 */
	@Override
	public Integer getCount() {
		return count;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.entities.IIngredient#setCount(java.lang.Integer)
	 */
	@Override
	public void setCount(Integer count) {
		this.count = count;
	}

}
