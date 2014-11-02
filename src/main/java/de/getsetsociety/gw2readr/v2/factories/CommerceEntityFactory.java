package de.getsetsociety.gw2readr.v2.factories;

import de.getsetsociety.gw2readr.v2.commerce.exchange.entities.Exchange;
import de.getsetsociety.gw2readr.v2.commerce.exchange.json.IExchange;
import de.getsetsociety.gw2readr.v2.commerce.listings.entities.Listings;
import de.getsetsociety.gw2readr.v2.commerce.listings.entities.Offer;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IListings;
import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer;
import de.getsetsociety.gw2readr.v2.factories.interfaces.ICommerceEntityFactory;

public class CommerceEntityFactory implements ICommerceEntityFactory {

	@Override
	public IExchange newExchange() {
		return new Exchange();
	}

	@Override
	public IListings newListings() {
		return new Listings();
	}

	@Override
	public IOffer newOffer() {
		return new Offer();
	}

}
