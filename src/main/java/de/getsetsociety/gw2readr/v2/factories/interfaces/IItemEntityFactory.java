package de.getsetsociety.gw2readr.v2.factories.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseAttributeModifier;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseInfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGathering;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGizmo;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IMiniPet;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITool;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrait;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrinket;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrophy;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradeComponent;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;

public interface IItemEntityFactory {

	public abstract IArmor newArmor();

	public abstract IBaseAttributeModifier<Attribute> newAttributeModifier();

	public abstract IBackItem newBackItem();

	public abstract IBag newBag();

	public abstract IBaseBuff newBuff();

	public abstract IConsumable newConsumable();

	public abstract IContainer newContainer();

	public abstract ICraftingMaterial newCraftingMaterial();

	public abstract IGizmo newGizmo();

	public abstract ITool newTool();

	public abstract IGathering newGathering();

	public abstract IBaseInfixUpgrade<Attribute> newInfixUpgrade();

	public abstract IMiniPet newMiniPet();

	public abstract ITrinket newTrinklet();

	public abstract ITrophy newTrophy();

	public abstract IUpgradeComponent newUpgradeComponent();

	public abstract IWeapon newWeapon();

	public abstract ITrait newTrait();

}