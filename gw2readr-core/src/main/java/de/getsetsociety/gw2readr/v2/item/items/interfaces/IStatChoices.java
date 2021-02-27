package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Set;

public interface IStatChoices {
    void addAllStatChoices(Set<Integer> statChoices);

    Set<Integer> getStatChoices();
}
