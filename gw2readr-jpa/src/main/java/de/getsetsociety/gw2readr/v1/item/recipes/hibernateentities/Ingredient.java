package de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IIngredient;

@Entity
@Table
public class Ingredient implements IIngredient {

	private Integer id;
	private Integer itemId;
	private Integer count;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.entities.IIngredient#getItemId()
	 */
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.item.recipes.entities.IIngredient#setItemId(java.lang.Integer)
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column
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
	@Column
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
