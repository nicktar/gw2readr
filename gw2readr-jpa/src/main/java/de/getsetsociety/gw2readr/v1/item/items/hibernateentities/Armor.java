package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import lombok.Data;

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
@PrimaryKeyJoinColumn(name="ItemId")
public class Armor extends Item implements IArmor {

	private static final long serialVersionUID = 8450275854880660075L;
	@Column
	@Enumerated(EnumType.ORDINAL)
	private ArmorType armorType;
	@Column
	private Integer defense;
	@Column
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection(targetClass = InfusionSlotType.class)
	@CollectionTable(name = "ArmorFlags", joinColumns = @JoinColumn(name = "ItemId"))
	private Set<InfusionSlotType> infusionSlots = new HashSet<>();
	@Column
	private Integer suffixItemId;
	@OneToOne(orphanRemoval = true, targetEntity = InfixUpgrade.class, cascade = CascadeType.ALL)
	private IInfixUpgrade infixUpgrade;
	@Column
	@Enumerated(EnumType.ORDINAL)
	private WeightClass weightClass;
	@Column
	private Integer secondarySuffixItemId;
}
