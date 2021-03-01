package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfusionSlot;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InfusionSlot implements IInfusionSlot {

    @Builder.Default
    private final Set<InfusionSlotType> flags = new HashSet<>();
    private Integer item;

    @Override
    public void addAllFlags(Collection<InfusionSlotType> flags) {
        this.flags.addAll(flags);
    }
}
