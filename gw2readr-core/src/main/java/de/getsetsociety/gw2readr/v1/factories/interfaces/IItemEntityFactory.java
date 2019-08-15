package de.getsetsociety.gw2readr.v1.factories.interfaces;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IGathering;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IGizmo;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IMiniPet;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITool;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrait;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrinket;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrophy;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IUpgradeComponent;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;

public interface IItemEntityFactory {

    IArmor newArmor();

    IAttributeModifier newAttributeModifier();

    IBackItem newBackItem();

    IBag newBag();

    IBuff newBuff();

    IConsumable newConsumable();

    IContainer newContainer();

    ICraftingMaterial newCraftingMaterial();

    IGizmo newGizmo();

    ITool newTool();

    IGathering newGathering();

    IInfixUpgrade newInfixUpgrade();

    IMiniPet newMiniPet();

    ITrinket newTrinklet();

    ITrophy newTrophy();

    IUpgradeComponent newUpgradeComponent();

    IWeapon newWeapon();

    ITrait newTrait();

}