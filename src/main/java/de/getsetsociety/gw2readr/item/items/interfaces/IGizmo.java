package de.getsetsociety.gw2readr.item.items.interfaces;

import de.getsetsociety.gw2readr.item.items.enums.GizmoType;

public interface IGizmo extends IBaseItem {

	public GizmoType getGizmoType();

	public void setGizmoType(GizmoType gizmoType);
}
