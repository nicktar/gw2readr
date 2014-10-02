package de.getsetsociety.gw2readr.v2.commerce.listings.interfaces;


public interface IOffer {

	/**
	 * @return the number of listings
	 */
	public abstract Integer getListings();

	/**
	 * @param listings
	 *            the number of listings to set
	 */
	public abstract void setListings(Integer listings);

	/**
	 * @return the unitPrice
	 */
	public abstract Integer getUnitPrice();

	/**
	 * @param unitPrice
	 *            the unitPrice to set
	 */
	public abstract void setUnitPrice(Integer unitPrice);

	/**
	 * @return the quantity
	 */
	public abstract Integer getQuantity();

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public abstract void setQuantity(Integer quantity);

	@Override
	public boolean equals(Object obj);

}