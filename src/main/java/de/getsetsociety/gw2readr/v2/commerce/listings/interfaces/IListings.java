package de.getsetsociety.gw2readr.v2.commerce.listings.interfaces;

import java.util.List;

public interface IListings {

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract List<IOffer> getBuys();

	public abstract void setBuys(List<IOffer> buys);

	public abstract List<IOffer> getSells();

	public abstract void setSells(List<IOffer> sells);

}