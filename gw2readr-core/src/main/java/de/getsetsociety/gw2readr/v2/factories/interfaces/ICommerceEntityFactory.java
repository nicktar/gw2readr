package de.getsetsociety.gw2readr.v2.factories.interfaces;

import de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer;

public interface ICommerceEntityFactory {

	/**
	 * @return a new IExchange instance
	 */
	public abstract IExchange newExchange();

	/**
	 * @return a new IListings instance
	 */
	public abstract IListings newListings();

	/**
	 * @return a new IOffer instance (used in Listings)
	 */
	public abstract IOffer newOffer();

}
