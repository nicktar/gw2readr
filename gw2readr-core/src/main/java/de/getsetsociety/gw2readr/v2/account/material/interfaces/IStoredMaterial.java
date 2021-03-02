package de.getsetsociety.gw2readr.v2.account.material.interfaces;

import de.getsetsociety.gw2readr.v2.account.material.enums.Binding;

public interface IStoredMaterial {
    Integer getId();

    Integer getCategory();

    Binding getBinding();

    Integer getCount();

    void setId(Integer id);

    void setCategory(Integer category);

    void setBinding(Binding binding);

    void setCount(Integer count);
}
