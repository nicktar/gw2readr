package de.getsetsociety.gw2readr.v2.commerce.listings.interfaces;

import java.util.List;

public interface IListings {

	/**
	 * @return the item id
	 */
	public abstract Integer getId();

	/**
	 * NOT A PART OF THE GW2 API
	 * @param id the item id
	 */
	public abstract void setId(Integer id);

	/**
	 * @return a list of all buy offers ordered by the price offered in descending order
	 */
	public abstract List<IOffer> getBuys();

	/**
	 * NOT A PART OF THE GW2 API
	 * this is just a setter that involves no data processing or validation
	 * @param buys a list of all buy offers ordered by the price offered in descending order
	 */
	public abstract void setBuys(List<IOffer> buys);

	/**
	 * @return a list of all sell offers ordered by the price offered in descending order
	 */
	public abstract List<IOffer> getSells();

	/**
	 * NOT A PART OF THE GW2 API
	 * this is just a setter that involves no data processing or validation
	 * @param buys a list of all sell offers ordered by the price offered in ascending order
	 */
	public abstract void setSells(List<IOffer> sells);

}