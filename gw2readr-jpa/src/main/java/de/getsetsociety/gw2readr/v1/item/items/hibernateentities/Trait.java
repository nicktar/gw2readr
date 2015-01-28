package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrait;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "ItemId")
public class Trait extends Item implements ITrait {

    private static final long serialVersionUID = -2266004415408667682L;

}
