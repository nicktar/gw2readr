package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class AttributeModifier implements IAttributeModifier {

    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private Attribute attribute;

    @Column
    private Integer modifier;

}
