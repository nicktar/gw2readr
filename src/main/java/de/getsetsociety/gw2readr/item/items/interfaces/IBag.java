package de.getsetsociety.gw2readr.item.items.interfaces;


public interface IBag extends IBaseItem{

	public abstract boolean isNoSellOrSort();

	public abstract void setNoSellOrSort(boolean noSellOrSort);

	public abstract Integer getSize();

	public abstract void setSize(Integer size);

}