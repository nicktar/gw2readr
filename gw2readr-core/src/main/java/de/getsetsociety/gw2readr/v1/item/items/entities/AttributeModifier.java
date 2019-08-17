package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttributeModifier implements IAttributeModifier {

    private Integer id;
    private Attribute attribute;
    private Integer modifier;

    public AttributeModifier(Attribute attribute, Integer modifier) {
        this.attribute = attribute;
        this.modifier = modifier;
    }
}
