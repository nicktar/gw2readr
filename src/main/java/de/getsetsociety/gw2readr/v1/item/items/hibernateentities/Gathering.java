package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.item.items.enums.GatheringType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IGathering;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ItemId")
public class Gathering extends Item implements IGathering {

	private static final long serialVersionUID = 6230977408259325646L;
	private GatheringType gatheringType;

	@Column
	@Enumerated(EnumType.ORDINAL)
	public GatheringType getGatheringType() {
		return gatheringType;
	}

	public void setGatheringType(GatheringType gatheringType) {
		this.gatheringType = gatheringType;
	}
}
