package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.GizmoType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGizmo;

public class Gizmo extends Item implements IGizmo {

    private static final long serialVersionUID = 6230977408259325646L;
    private GizmoType gizmoType;

    public GizmoType getGizmoType() {
        return gizmoType;
    }

    public void setGizmoType(GizmoType gizmoType) {
        this.gizmoType = gizmoType;
    }
}
