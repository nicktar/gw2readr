package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

public interface IBaseInfixUpgrade<U extends IBaseBuff, V extends IBaseAttributeModifier> {

    void setId(Integer id);

    Integer getId();

    Set<V> getAttributes();

    void setAttributes(Set<V> attributes);

    U getBuff();

    void setBuff(U buff);

}
