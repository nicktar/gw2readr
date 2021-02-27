package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionUpgradeFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradeComponent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UpgradeComponent extends Item implements IUpgradeComponent {

    private UpgradeComponentType upgradeComponentType;
    private Set<UpgradeComponentFlag> upgradeComponentFlags = new HashSet<>();
    private Set<String> bonuses;
    private String suffix;
    private IInfixUpgrade infixUpgrade;
    private final Set<InfusionUpgradeFlag> infusionUpgradeFlags = new HashSet<>();
    private Double attributeAdjustment;

    @Override
    public void addAllInfusionUpgradeFlags(Collection<InfusionUpgradeFlag> flags) {
        infusionUpgradeFlags.addAll(flags);
    }

    @Override
    public void addAllUpgradeComponentFlags(Collection<UpgradeComponentFlag> upgradeComponentFlags) {
        this.upgradeComponentFlags.addAll(upgradeComponentFlags);
    }
}
