package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v0.item.items.enums.ContainerType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IContainer;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ItemId")
public class Container extends Item implements IContainer {

	private static final long serialVersionUID = 3143725419779745274L;
	private ContainerType containerType;

	@Column
	@Enumerated(EnumType.ORDINAL)
	public ContainerType getContainerType() {
		return containerType;
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}
}
