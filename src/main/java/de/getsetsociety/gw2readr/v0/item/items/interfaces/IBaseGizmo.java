package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.enums.GizmoType;

public interface IBaseGizmo {

	public abstract GizmoType getGizmoType();

	public abstract void setGizmoType(GizmoType gizmoType);

}