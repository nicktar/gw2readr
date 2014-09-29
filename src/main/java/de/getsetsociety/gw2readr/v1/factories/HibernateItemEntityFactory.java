package de.getsetsociety.gw2readr.v1.factories;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseAttributeModifier;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseInfixUpgrade;
import de.getsetsociety.gw2readr.v1.factories.interfaces.IItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Armor;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.BackItem;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Bag;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Buff;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Consumable;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Container;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.CraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Gathering;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Gizmo;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.InfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.MiniPet;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Tool;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Trinket;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Trophy;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.UpgradeComponent;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Weapon;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IGathering;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IGizmo;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IMiniPet;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITool;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrinket;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrophy;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IUpgradeComponent;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;

public class HibernateItemEntityFactory implements IItemEntityFactory {

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newArmor()
	 */
	@Override
	public IArmor newArmor() {
		return new Armor();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newAttributeModifier()
	 */
	@Override
	public IBaseAttributeModifier newAttributeModifier() {
		return new AttributeModifier();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newBackItem()
	 */
	@Override
	public IBackItem newBackItem() {
		return new BackItem();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newBag()
	 */
	@Override
	public IBag newBag() {
		return new Bag();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newBuff()
	 */
	@Override
	public IBaseBuff newBuff() {
		return new Buff();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newConsumable()
	 */
	@Override
	public IConsumable newConsumable() {
		return new Consumable();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newContainer()
	 */
	@Override
	public IContainer newContainer() {
		return new Container();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newCraftingMaterial()
	 */
	@Override
	public ICraftingMaterial newCraftingMaterial() {
		return new CraftingMaterial();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newGizmo()
	 */
	@Override
	public IGizmo newGizmo() {
		return new Gizmo();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newGathering()
	 */
	@Override
	public IGathering newGathering() {
		return new Gathering();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newInfixUpgrade()
	 */
	@Override
	public IBaseInfixUpgrade newInfixUpgrade() {
		return new InfixUpgrade();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newMiniPet()
	 */
	@Override
	public IMiniPet newMiniPet() {
		return new MiniPet();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newTrinklet()
	 */
	@Override
	public ITrinket newTrinklet() {
		return new Trinket();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newTrophy()
	 */
	@Override
	public ITrophy newTrophy() {
		return new Trophy();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newUpgradeComponent()
	 */
	@Override
	public IUpgradeComponent newUpgradeComponent() {
		return new UpgradeComponent();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.IEntityFactory#newWeapon()
	 */
	@Override
	public IWeapon newWeapon() {
		return new Weapon();
	}

	@Override
	public ITool newTool() {
		return new Tool();
	}
}
