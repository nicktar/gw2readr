package de.getsetsociety.gw2readr.v1.factories;

import de.getsetsociety.gw2readr.v1.factories.interfaces.IItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.items.entities.Armor;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.entities.BackItem;
import de.getsetsociety.gw2readr.v1.item.items.entities.Bag;
import de.getsetsociety.gw2readr.v1.item.items.entities.Buff;
import de.getsetsociety.gw2readr.v1.item.items.entities.Consumable;
import de.getsetsociety.gw2readr.v1.item.items.entities.Container;
import de.getsetsociety.gw2readr.v1.item.items.entities.CraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.entities.Gathering;
import de.getsetsociety.gw2readr.v1.item.items.entities.Gizmo;
import de.getsetsociety.gw2readr.v1.item.items.entities.InfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.entities.MiniPet;
import de.getsetsociety.gw2readr.v1.item.items.entities.Tool;
import de.getsetsociety.gw2readr.v1.item.items.entities.Trait;
import de.getsetsociety.gw2readr.v1.item.items.entities.Trinket;
import de.getsetsociety.gw2readr.v1.item.items.entities.Trophy;
import de.getsetsociety.gw2readr.v1.item.items.entities.UpgradeComponent;
import de.getsetsociety.gw2readr.v1.item.items.entities.Weapon;
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

public class ItemEntityFactory implements IItemEntityFactory {

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newArmor()
     */
    @Override
    public IArmor newArmor() {
        return new Armor();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newAttributeModifier()
     */
    @Override
    public IAttributeModifier newAttributeModifier() {
        return new AttributeModifier();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newBackItem()
     */
    @Override
    public IBackItem newBackItem() {
        return new BackItem();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newBag()
     */
    @Override
    public IBag newBag() {
        return new Bag();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newBuff()
     */
    @Override
    public IBuff newBuff() {
        return new Buff();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newConsumable()
     */
    @Override
    public IConsumable newConsumable() {
        return new Consumable();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newContainer()
     */
    @Override
    public IContainer newContainer() {
        return new Container();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newCraftingMaterial()
     */
    @Override
    public ICraftingMaterial newCraftingMaterial() {
        return new CraftingMaterial();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newGizmo()
     */
    @Override
    public IGizmo newGizmo() {
        return new Gizmo();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newGathering()
     */
    @Override
    public IGathering newGathering() {
        return new Gathering();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newInfixUpgrade()
     */
    @Override
    public IInfixUpgrade newInfixUpgrade() {
        return new InfixUpgrade();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newMiniPet()
     */
    @Override
    public IMiniPet newMiniPet() {
        return new MiniPet();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newTrinklet()
     */
    @Override
    public ITrinket newTrinklet() {
        return new Trinket();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newTrophy()
     */
    @Override
    public ITrophy newTrophy() {
        return new Trophy();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newUpgradeComponent()
     */
    @Override
    public IUpgradeComponent newUpgradeComponent() {
        return new UpgradeComponent();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.IEntityFactory#newWeapon()
     */
    @Override
    public IWeapon newWeapon() {
        return new Weapon();
    }

    /*
     * (non-Javadoc)
     * @see de.getsetsociety.gw2readr.v1.factories.interfaces.IItemEntityFactory#newTool()
     */
    @Override
    public ITool newTool() {
        return new Tool();
    }

    @Override
    public ITrait newTrait() {
        return new Trait();
    }
}
