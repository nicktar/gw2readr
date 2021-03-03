package de.getsetsociety.gw2readr.v2.account.inventory.entities;

import java.util.Set;

import de.getsetsociety.gw2readr.v2.account.inventory.interfaces.IInventoryItem;
import de.getsetsociety.gw2readr.v2.account.inventory.materialstorage.enums.Binding;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InventoryItem implements IInventoryItem {
    private Integer id;
    private Integer count;
    private Integer charges;
    private Set<Integer> upgrades;
    private Set<Integer> upgradeSlotIndices;
    private Set<Integer> infusions;
    private Integer skin;
    private Binding binding;
    private String boundTo;

}
