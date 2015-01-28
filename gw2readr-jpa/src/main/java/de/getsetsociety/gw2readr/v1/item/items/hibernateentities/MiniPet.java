package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.IMiniPet;

@Entity
@Table
@PrimaryKeyJoinColumn(name="ItemId")
public class MiniPet extends Item implements IMiniPet {

	private static final long serialVersionUID = 5045479017826759433L;


}
