package de.getsetsociety.gw2readr.v0.item.items.interfaces;

public interface IBaseBag {

	public abstract boolean isNoSellOrSort();

	public abstract void setNoSellOrSort(boolean noSellOrSort);

	public abstract Integer getSize();

	public abstract void setSize(Integer size);

}