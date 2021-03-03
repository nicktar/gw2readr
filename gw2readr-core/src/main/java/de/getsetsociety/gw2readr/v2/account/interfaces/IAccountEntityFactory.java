package de.getsetsociety.gw2readr.v2.account.interfaces;

import de.getsetsociety.gw2readr.v2.account.inventory.interfaces.IInventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.interfaces.IStoredMaterial;

public interface IAccountEntityFactory {

    IStoredMaterial newStoredMaterial();

    IInventoryItem newInventoryItem();
}
