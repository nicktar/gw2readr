package de.getsetsociety.gw2readr.v2.commerce.exchange.entities;

import de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange;


public class Exchange implements IExchange {

	private Integer coinsPerGem;
	private Integer quantity;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange#getCoinsPerGem()
	 */
	@Override
	public Integer getCoinsPerGem() {
		return coinsPerGem;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange#setCoinsPerGem(java.lang.Integer)
	 */
	@Override
	public void setCoinsPerGem(Integer coinsPerGem) {
		this.coinsPerGem = coinsPerGem;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange#getQuantity()
	 */
	@Override
	public Integer getQuantity() {
		return quantity;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces.IExchange#setQuantity(java.lang.Integer)
	 */
	@Override
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
