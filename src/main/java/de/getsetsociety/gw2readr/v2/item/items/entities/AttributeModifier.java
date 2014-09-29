package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseAttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.enums.Attribute;

public class AttributeModifier implements IBaseAttributeModifier<Attribute> {

	private Attribute attribute;
	private Integer modifier;

	@Override
	public Attribute getAttribute() {
		return this.attribute;
	}

	@Override
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public Integer getModifier() {
		return this.modifier;
	}

	@Override
	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (attribute == null ? 0 : attribute.hashCode());
		result = prime * result
				+ (modifier == null ? 0 : modifier.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AttributeModifier)) {
			return false;
		}
		AttributeModifier other = (AttributeModifier) obj;
		if (attribute != other.attribute) {
			return false;
		}
		if (modifier == null) {
			if (other.modifier != null) {
				return false;
			}
		} else if (!modifier.equals(other.modifier)) {
			return false;
		}
		return true;
	}
}
