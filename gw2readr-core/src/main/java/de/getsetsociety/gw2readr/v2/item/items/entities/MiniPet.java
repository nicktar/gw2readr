package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.IMiniPet;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MiniPet extends Item implements IMiniPet {

    private Integer miniPet;

}
