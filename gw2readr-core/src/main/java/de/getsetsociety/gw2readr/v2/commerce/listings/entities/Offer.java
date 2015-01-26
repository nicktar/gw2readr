package de.getsetsociety.gw2readr.v2.commerce.listings.entities;

import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer;

public class Offer implements IOffer {

	private Integer listings;
	private Integer unitPrice;
	private Integer quantity;

	/**
	 * @return the number of listings
	 */
	@Override
	public Integer getListings() {
		return listings;
	}

	/**
	 * @param listings
	 *            the number of listings to set
	 */
	@Override
	public void setListings(Integer listings) {
		this.listings = listings;
	}

	/**
	 * @return the unitPrice
	 */
	@Override
	public Integer getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice
	 *            the unitPrice to set
	 */
	@Override
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the quantity
	 */
	@Override
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	@Override
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (listings == null ? 0 : listings.hashCode());
		result = prime * result
				+ (quantity == null ? 0 : quantity.hashCode());
		result = prime * result
				+ (unitPrice == null ? 0 : unitPrice.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Offer)) {
			return false;
		}
		Offer other = (Offer) obj;
		if (listings == null) {
			if (other.listings != null) {
				return false;
			}
		} else if (!listings.equals(other.listings)) {
			return false;
		}
		if (quantity == null) {
			if (other.quantity != null) {
				return false;
			}
		} else if (!quantity.equals(other.quantity)) {
			return false;
		}
		if (unitPrice == null) {
			if (other.unitPrice != null) {
				return false;
			}
		} else if (!unitPrice.equals(other.unitPrice)) {
			return false;
		}
		return true;
	}

}
