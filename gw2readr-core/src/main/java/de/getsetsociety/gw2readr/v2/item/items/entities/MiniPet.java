package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.IMiniPet;
import lombok.Data;

@Data
public class MiniPet extends Item implements IMiniPet {

    private Integer miniPet;

}
