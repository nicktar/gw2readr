package de.getsetsociety.gw2readr.v2.factories.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.*;

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

    ITrinket newTrinket();

    ITrophy newTrophy();

    IUpgradeComponent newUpgradeComponent();

    IWeapon newWeapon();

    ITrait newTrait();

    IUpgradePath newUpgradePath();

    IInfusionSlot newInfusionSlot();

    IKey newKey();
}
