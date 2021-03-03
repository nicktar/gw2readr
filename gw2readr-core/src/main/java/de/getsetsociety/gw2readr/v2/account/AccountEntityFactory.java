package de.getsetsociety.gw2readr.v2.account;

import de.getsetsociety.gw2readr.v2.account.interfaces.IAccountEntityFactory;
import de.getsetsociety.gw2readr.v2.account.inventory.entities.InventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.interfaces.IInventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.entities.StoredMaterial;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.interfaces.IStoredMaterial;

public class AccountEntityFactory implements IAccountEntityFactory {

    @Override
    public IStoredMaterial newStoredMaterial() {
        return new StoredMaterial();
    }

    @Override
    public IInventoryItem newInventoryItem() {
        return new InventoryItem();
    }
}
