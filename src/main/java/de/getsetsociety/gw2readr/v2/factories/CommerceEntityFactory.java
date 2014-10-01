package de.getsetsociety.gw2readr.v2.factories;

import de.getsetsociety.gw2readr.v2.commerce.exchange.entities.Exchange;
import de.getsetsociety.gw2readr.v2.commerce.exchange.json.IExchange;
import de.getsetsociety.gw2readr.v2.factories.interfaces.ICommerceEntityFactory;

public class CommerceEntityFactory implements ICommerceEntityFactory {

	@Override
	public IExchange newExchange() {
		return new Exchange();
	}

}
