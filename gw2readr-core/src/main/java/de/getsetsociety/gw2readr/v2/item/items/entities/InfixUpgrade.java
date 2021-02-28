
package de.getsetsociety.gw2readr.v2.item.items.entities;

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
    @Singular
    private Set<IAttributeModifier> attributes = new HashSet<>();
    private IBuff buff;
}
