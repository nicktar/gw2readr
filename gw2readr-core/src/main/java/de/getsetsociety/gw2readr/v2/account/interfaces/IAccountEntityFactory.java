package de.getsetsociety.gw2readr.v2.account.interfaces;

import de.getsetsociety.gw2readr.v2.account.material.interfaces.IStoredMaterial;

public interface IAccountEntityFactory {

    IStoredMaterial newStoredMaterial();
}
