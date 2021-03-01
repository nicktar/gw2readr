
package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InfixUpgrade implements IInfixUpgrade {

    private Integer id;
    @Builder.Default
    private final Set<IAttributeModifier> attributes = new HashSet<>();
    private IBuff buff;

    @Override
    public void addAllAttributed(Collection<IAttributeModifier> attributes) {
        this.attributes.addAll(attributes);
    }
}
