package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseWeapon;
import de.getsetsociety.gw2readr.v1.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v1.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v1.item.items.enums.WeaponType;

public interface IWeapon extends IBaseItem, IBaseWeapon<DamageType, IInfixUpgrade, InfusionSlotType, WeaponType> {

}