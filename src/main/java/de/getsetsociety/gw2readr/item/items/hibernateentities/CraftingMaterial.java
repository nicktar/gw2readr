package de.getsetsociety.gw2readr.item.items.hibernateentities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.item.items.interfaces.ICraftingMaterial;

@Entity
@Table
@PrimaryKeyJoinColumn(name="CraftingMaterialId")
public class CraftingMaterial extends Item implements ICraftingMaterial {

	private static final long serialVersionUID = -3053009181561706950L;
}
