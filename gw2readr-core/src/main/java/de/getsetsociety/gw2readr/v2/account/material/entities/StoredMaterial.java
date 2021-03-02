package de.getsetsociety.gw2readr.v2.account.material.entities;


import de.getsetsociety.gw2readr.v2.account.material.enums.Binding;
import de.getsetsociety.gw2readr.v2.account.material.interfaces.IStoredMaterial;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class StoredMaterial implements IStoredMaterial {

    private Integer id;
    private Integer category;
    private Binding binding;
    private Integer count;

}
