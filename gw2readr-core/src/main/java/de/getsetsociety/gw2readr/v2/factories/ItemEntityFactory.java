package de.getsetsociety.gw2readr.v2.factories;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import de.getsetsociety.gw2readr.v2.factories.interfaces.IItemEntityFactory;
import de.getsetsociety.gw2readr.v2.item.items.entities.*;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.*;

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
    public ITrinket newTrinket() {
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

    @Override
    public IKey newKey() {
        return new Key();
    }

}
