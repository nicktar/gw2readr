package de.getsetsociety.gw2readr.v2.factories.interfaces;

import de.getsetsociety.gw2readr.v2.commerce.exchange.json.IExchange;

public interface ICommerceEntityFactory {

	public abstract IExchange newExchange();

}
