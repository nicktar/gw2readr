package de.getsetsociety.gw2readr.v2.item.items.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeType;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradePath;

public class UpgradePathJson implements IEntityWrapper<IUpgradePath> {

    private final IUpgradePath item = EntityFactoryProvider.getItemEntityFactory().newUpgradePath();

    @Override
    public IUpgradePath getEntity() {
        return item;
    }

    public IUpgradePath getItem() {
        return item;
    }

    @JsonProperty("upgrade")
    public UpgradeType getUpgrade() {
        return item.getUpgrade();
    }

    @JsonProperty("item_id")
    public Integer getItemId() {
        return item.getItemId();
    }

    public void setUpgrade(UpgradeType upgrade) {
        item.setUpgrade(upgrade);
    }

    public void setItemId(Integer itemId) {
        item.setItemId(itemId);
    }
}
