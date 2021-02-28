package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradePath;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpgradePath implements IUpgradePath {

    private UpgradeType upgrade;
    private Integer itemId;
}
