package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IIcon;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Table
@Entity
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name = "ItemId")
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

    @Column
    private Integer applyCount;

    @Column
    private String consumableName;

    @Column
    private String name;

    @OneToOne(targetEntity = Icon.class)
    private IIcon icon;

    @ElementCollection
    private Set<Integer> extraRecipeIds;
}
