package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v1.item.items.enums.ContainerType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IContainer;

public class Container extends Item implements IContainer {

	private static final long serialVersionUID = 3143725419779745274L;
	private ContainerType containerType;

	public ContainerType getContainerType() {
		return containerType;
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}
}
