package de.getsetsociety.gw2readr.item.items.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.item.items.enums.GizmoType;
import de.getsetsociety.gw2readr.item.items.interfaces.IGizmo;

@Entity
@Table
@PrimaryKeyJoinColumn(name="GizmoId")
public class Gizmo extends Item implements IGizmo {

	private static final long serialVersionUID = 6230977408259325646L;
	private GizmoType gizmoType;

	@Column
	@Enumerated(EnumType.ORDINAL)
	public GizmoType getGizmoType() {
		return gizmoType;
	}

	public void setGizmoType(GizmoType gizmoType) {
		this.gizmoType = gizmoType;
	}
}
