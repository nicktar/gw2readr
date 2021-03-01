package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.GizmoType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGizmo;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class Gizmo extends Item implements IGizmo {

    private GizmoType gizmoType;
    private Integer guildUpgradeId;
    private Set<Integer> vendors = new HashSet<>();

    @Override
    public void addAllVendors(Set<Integer> vendors) {
        this.vendors.addAll(vendors);
    }
}
