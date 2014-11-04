package de.getsetsociety.gw2readr.v2.commerce.exchange.interfaces;

public interface IExchange {

	public abstract Integer getCoinsPerGem();

	public abstract void setCoinsPerGem(Integer coinsPerGem);

	public abstract Integer getQuantity();

	public abstract void setQuantity(Integer quantity);

}
