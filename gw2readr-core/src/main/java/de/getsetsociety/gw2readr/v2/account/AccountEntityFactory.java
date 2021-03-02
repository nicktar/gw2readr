package de.getsetsociety.gw2readr.v2.account;

import de.getsetsociety.gw2readr.v2.account.interfaces.IAccountEntityFactory;
import de.getsetsociety.gw2readr.v2.account.material.entities.StoredMaterial;
import de.getsetsociety.gw2readr.v2.account.material.interfaces.IStoredMaterial;

public class AccountEntityFactory implements IAccountEntityFactory {

    @Override
    public IStoredMaterial newStoredMaterial() {
        return new StoredMaterial();
    }
}
