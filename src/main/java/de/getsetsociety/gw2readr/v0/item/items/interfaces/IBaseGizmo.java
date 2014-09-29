package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.markers.IGizmoType;

public interface IBaseGizmo<T extends IGizmoType> {

	public abstract T getGizmoType();

	public abstract void setGizmoType(T gizmoType);

}