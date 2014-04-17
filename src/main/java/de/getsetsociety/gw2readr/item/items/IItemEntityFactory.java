package de.getsetsociety.gw2readr.item.items;

import de.getsetsociety.gw2readr.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.item.items.interfaces.IGathering;
import de.getsetsociety.gw2readr.item.items.interfaces.IGizmo;
import de.getsetsociety.gw2readr.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.item.items.interfaces.IMiniPet;
import de.getsetsociety.gw2readr.item.items.interfaces.ITool;
import de.getsetsociety.gw2readr.item.items.interfaces.ITrinket;
import de.getsetsociety.gw2readr.item.items.interfaces.ITrophy;
import de.getsetsociety.gw2readr.item.items.interfaces.IUpgradeComponent;
import de.getsetsociety.gw2readr.item.items.interfaces.IWeapon;

public interface IItemEntityFactory {

	public abstract IArmor newArmor();

	public abstract IAttributeModifier newAttributeModifier();

	public abstract IBackItem newBackItem();

	public abstract IBag newBag();

	public abstract IBuff newBuff();

	public abstract IConsumable newConsumable();

	public abstract IContainer newContainer();

	public abstract ICraftingMaterial newCraftingMaterial();

	public abstract IGizmo newGizmo();

	public abstract ITool newTool();

	public abstract IGathering newGathering();

	public abstract IInfixUpgrade newInfixUpgrade();

	public abstract IInfusionSlot newInfusionSlot();

	public abstract IMiniPet newMiniPet();

	public abstract ITrinket newTrinklet();

	public abstract ITrophy newTrophy();

	public abstract IUpgradeComponent newUpgradeComponent();

	public abstract IWeapon newWeapon();

}