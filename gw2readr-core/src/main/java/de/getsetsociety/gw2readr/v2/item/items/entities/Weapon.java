package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Weapon extends Item implements IWeapon {

    private DamageType damageType;
    private Integer defense;
    private IInfixUpgrade infixUpgrade;
    private final Set<IInfusionSlot> infusionSlots = new HashSet<>();
    private Integer maxPower;
    private Integer minPower;
    private Integer suffixItemId;
    private WeaponType weaponType;
    private Integer secondarySuffixItemId;
    private Integer defaultSkin;
    private Double attributeAdjustment;
    private final Set<Integer> statChoices = new HashSet<>();

    @Override
    public void addAllStatChoices(Collection<Integer> statChoices) {
        if (statChoices != null) {
            this.statChoices.addAll(statChoices);
        }
    }

    @Override
    public void addAllInfusionSlots(Collection<IInfusionSlot> infusionSlots) {
        this.infusionSlots.addAll(infusionSlots);
    }
}
