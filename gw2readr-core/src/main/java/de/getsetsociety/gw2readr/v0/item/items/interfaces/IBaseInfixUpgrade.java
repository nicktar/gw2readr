package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.List;

public interface IBaseInfixUpgrade<U extends IBaseBuff, V extends IBaseAttributeModifier> {

	void setId(Integer id);

	Integer getId();

	List<V> getAttributes();

	void setAttributes(List<V> attributes);

	U getBuff();

	void setBuff(U buff);

}