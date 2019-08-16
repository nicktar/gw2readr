package de.getsetsociety.gw2readr.v2.item.items.entities;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradeComponent;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class UpgradeComponent extends Item implements IUpgradeComponent {

    private UpgradeComponentType upgradeComponentType;
    private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();
    private Set<String> bonuses;
    private String suffix;
    private IInfixUpgrade infixUpgrade;
    private Set<InfusionUpgradeFlag> infusionUpgradeFlags = new HashSet<>();
}
