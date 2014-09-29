package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IContainerType;

public interface IBaseContainer<T extends IContainerType> {

	public T getContainerType();

	public void setContainerType(T containerType);


}