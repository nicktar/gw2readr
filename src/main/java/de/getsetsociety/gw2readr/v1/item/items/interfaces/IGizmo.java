package de.getsetsociety.gw2readr.v1.item.items.interfaces;

import de.getsetsociety.gw2readr.v1.item.items.enums.GizmoType;

public interface IGizmo extends IBaseItem {

	public GizmoType getGizmoType();

	public void setGizmoType(GizmoType gizmoType);
}
