package de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces;

public interface IExchange {

	/**
	 * @return the exchange rate in coins per gem
	 */
	public abstract Integer getCoinsPerGem();

	/**
	 * NOT A PART OF THE GW2 API
	 * @param coinsPerGem the exchange rate in coins per gem
	 */
	public abstract void setCoinsPerGem(Integer coinsPerGem);

	/**
	 * @return the amount of coins or gems you could buy
	 */
	public abstract Integer getQuantity();

	/**
	 * NOT A PART OF THE GW2 API
	 * @param quantity the amount of coins or gems you could buy
	 */
	public abstract void setQuantity(Integer quantity);

}