package de.getsetsociety.gw2readr.v2.commerce.listings.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer;

public class Listings implements IListings {

	private Integer id;
	private List<IOffer> buys = new ArrayList<>();
	private List<IOffer> sells = new ArrayList<>();

	/**
	 * @return the id
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the buys
	 */
	@Override
	public List<IOffer> getBuys() {
		return buys;
	}

	/**
	 * @param buys
	 *            the buys to set
	 */
	@Override
	public void setBuys(List<IOffer> buys) {
		this.buys = buys;
	}

	/**
	 * @return the sells
	 */
	@Override
	public List<IOffer> getSells() {
		return sells;
	}

	/**
	 * @param sells
	 *            the sells to set
	 */
	@Override
	public void setSells(List<IOffer> sells) {
		this.sells = sells;
	}

}
