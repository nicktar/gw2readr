
package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InfixUpgrade implements IInfixUpgrade {

    private Integer id;
    @Singular
    private List<IAttributeModifier> attributes = new ArrayList<>();
    private IBuff buff;
}
