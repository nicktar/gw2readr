package de.getsetsociety.gw2readr.v2.factories;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.v2.factories.interfaces.IItemEntityFactory;
import de.getsetsociety.gw2readr.v2.item.items.entities.Armor;
import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.entities.BackItem;
import de.getsetsociety.gw2readr.v2.item.items.entities.Bag;
import de.getsetsociety.gw2readr.v2.item.items.entities.Buff;
import de.getsetsociety.gw2readr.v2.item.items.entities.Consumable;
import de.getsetsociety.gw2readr.v2.item.items.entities.Container;
import de.getsetsociety.gw2readr.v2.item.items.entities.CraftingMaterial;
import de.getsetsociety.gw2readr.v2.item.items.entities.Gathering;
import de.getsetsociety.gw2readr.v2.item.items.entities.Gizmo;
import de.getsetsociety.gw2readr.v2.item.items.entities.InfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.entities.InfusionSlot;
import de.getsetsociety.gw2readr.v2.item.items.entities.MiniPet;
import de.getsetsociety.gw2readr.v2.item.items.entities.Tool;
import de.getsetsociety.gw2readr.v2.item.items.entities.Trait;
import de.getsetsociety.gw2readr.v2.item.items.entities.Trinket;
import de.getsetsociety.gw2readr.v2.item.items.entities.Trophy;
import de.getsetsociety.gw2readr.v2.item.items.entities.UpgradeComponent;
import de.getsetsociety.gw2readr.v2.item.items.entities.UpgradePath;
import de.getsetsociety.gw2readr.v2.item.items.entities.Weapon;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGathering;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGizmo;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IMiniPet;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITool;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrait;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrinket;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrophy;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradeComponent;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradePath;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;

public class ItemEntityFactory implements IItemEntityFactory {

	@Override
	public IArmor newArmor() {
		return new Armor();
	}

	@Override
	public IAttributeModifier newAttributeModifier() {
		return new AttributeModifier();
	}

	@Override
	public IBackItem newBackItem() {
		return new BackItem();
	}

	@Override
	public IBag newBag() {
		return new Bag();
	}

	@Override
	public IBuff newBuff() {
		return new Buff();
	}

	@Override
	public IConsumable newConsumable() {
		return new Consumable();
	}

	@Override
	public IContainer newContainer() {
		return new Container();
	}

	@Override
	public ICraftingMaterial newCraftingMaterial() {
		return new CraftingMaterial();
	}

	@Override
	public IGizmo newGizmo() {
		return new Gizmo();
	}

	@Override
	public IGathering newGathering() {
		return new Gathering();
	}

	@Override
	public IInfixUpgrade newInfixUpgrade() {
		return new InfixUpgrade();
	}

    @Override
    public IMiniPet newMiniPet() {
        return new MiniPet();
    }

    @Override
    public ITrinket newTrinklet() {
        return new Trinket();
    }

    @Override
    public ITrophy newTrophy() {
        return new Trophy();
    }

    @Override
    public IUpgradeComponent newUpgradeComponent() {
        return new UpgradeComponent();
    }

    @Override
    public IWeapon newWeapon() {
        return new Weapon();
    }

    @Override
    public ITool newTool() {
        return new Tool();
    }

    @Override
    public ITrait newTrait() {
        return new Trait();
    }

    @Override
    public IUpgradePath newUpgradePath() {
        return new UpgradePath();
    }

    @Override
    public IInfusionSlot newInfusionSlot() {
        return new InfusionSlot();
    }

}
