package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Table
@Entity
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="ItemId")
public class Consumable extends Item implements IConsumable {

    @Column
    @Enumerated(EnumType.ORDINAL)
    private ConsumableType consumableType;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private ConsumableUnlockType unlockType;

    @Column
    private Integer colorId;

    @Column
    private Integer durationMs;

    @Column
    private String description;

    @Column
    private Integer recipeId;

    @Column
    private Integer guildUpgradeId;
}
