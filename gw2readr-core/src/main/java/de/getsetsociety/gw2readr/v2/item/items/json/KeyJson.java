package de.getsetsociety.gw2readr.v2.item.items.json;

import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IKey;
import lombok.Getter;

@Getter
public class KeyJson extends ItemJson<IKey> {

    private final IKey entity = EntityFactoryProvider.getItemEntityFactory().newKey();

}
