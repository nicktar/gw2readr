package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import de.getsetsociety.gw2readr.v2.item.items.enums.ContainerType;

public interface IContainer extends IBaseItem {

    public ContainerType getContainerType();

    public void setContainerType(ContainerType containerType);
}
