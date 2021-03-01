package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.GizmoType;

public interface IBaseGizmo extends IGuildUpgrade {

    GizmoType getGizmoType();

    void setGizmoType(GizmoType gizmoType);

    void addAllVendors(Set<Integer> vendors);

    Set<Integer> getVendors();

}
