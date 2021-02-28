package de.getsetsociety.gw2readr.v2.item.items.interfaces;

import java.util.Collection;
import java.util.Set;

public interface IStatChoices {
    void addAllStatChoices(Collection<Integer> statChoices);

    Set<Integer> getStatChoices();
}
