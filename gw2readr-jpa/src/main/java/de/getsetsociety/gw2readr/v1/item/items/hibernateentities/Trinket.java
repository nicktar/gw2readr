package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrinket;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@Table
@Entity
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "ItemId")
public class Trinket extends Item implements ITrinket {

	@Column
	@Enumerated(EnumType.ORDINAL)
	private TrinketType trinketType;

	@Column
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection(targetClass = InfusionSlotType.class)
	@CollectionTable(name = "TrinketFlags", joinColumns = @JoinColumn(name = "ItemId"))
	private Set<InfusionSlotType> infusionSlots = new HashSet<>();

	@OneToOne(orphanRemoval = true, targetEntity = InfixUpgrade.class, cascade = CascadeType.ALL)
	private IInfixUpgrade infixUpgrade;

	@Column
	private Integer suffixItemId;

	@Column
	private Integer secondarySuffixItemId;
}
