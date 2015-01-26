package de.getsetsociety.gw2readr.v2.commerce.listings.interfaces;


public interface IOffer {

	/**
	 * @return the number of listings
	 */
	public abstract Integer getListings();

	/**
	 * NOT A PART OF THE GW2 API
	 * @param listings
	 *            the number of listings to set
	 */
	public abstract void setListings(Integer listings);

	/**
	 * @return the unitPrice
	 */
	public abstract Integer getUnitPrice();

	/**
	 * NOT A PART OF THE GW2 API
	 * @param unitPrice
	 *            the unitPrice to set
	 */
	public abstract void setUnitPrice(Integer unitPrice);

	/**
	 * @return the quantity
	 */
	public abstract Integer getQuantity();

	/**
	 * NOT A PART OF THE GW2 API
	 * @param quantity
	 *            the quantity to set
	 */
	public abstract void setQuantity(Integer quantity);

	/**
	 * @see java.lang.Object.equals(java.lang.Object obj)
	 */
	@Override
	public abstract boolean equals(Object obj);

}