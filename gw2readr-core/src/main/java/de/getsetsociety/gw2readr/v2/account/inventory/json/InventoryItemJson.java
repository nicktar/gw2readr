package de.getsetsociety.gw2readr.v2.account.inventory.json;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.account.inventory.interfaces.IInventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.enums.Binding;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.json.IEntityWrapper;
import lombok.Data;

@Data
public class InventoryItemJson implements IEntityWrapper<IInventoryItem> {

    private IInventoryItem entity = EntityFactoryProvider.getAccountFactory().newInventoryItem();

    public Integer getId() {
        return entity.getId();
    }

    public void setId(Integer id) {
        entity.setId(id);
    }

    public Integer getCount() {
        return entity.getCount();
    }

    public void setCount(Integer count) {
        entity.setCount(count);
    }

    public Set<Integer> getUpgrades() {
        return entity.getUpgrades();
    }

    public void setUpgrades(Set<Integer> upgrades) {
        entity.setUpgrades(upgrades);
    }

    public Set<Integer> getInfusions() {
        return entity.getInfusions();
    }

    public void setInfusions(Set<Integer> infusions) {
        entity.setInfusions(infusions);
    }

    public Integer getSkin() {
        return entity.getSkin();
    }

    public void setSkin(Integer skin) {
        entity.setSkin(skin);
    }

    public Binding getBinding() {
        return entity.getBinding();
    }

    public void setBinding(Binding binding) {
        entity.setBinding(binding);
    }

    @JsonProperty("bound_to")
    public String getBoundTo() {
        return entity.getBoundTo();
    }

    public void setBoundTo(String boundTo) {
        entity.setBoundTo(boundTo);
    }

    @JsonProperty("upgrade_slot_indices")
    public Set<Integer> getUpgradeSlotIndices() {
        return entity.getUpgradeSlotIndices();
    }

    public void setUpgradeSlotIndices(Set<Integer> upgradeSlotIndices) {
        entity.setUpgradeSlotIndices(upgradeSlotIndices);
    }

    public Integer getCharges() {
        return entity.getCharges();
    }

    public void setCharges(Integer charges) {
        entity.setCharges(charges);
    }
}
