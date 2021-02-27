package de.getsetsociety.gw2readr.v0.item.items.interfaces;

import java.util.Set;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableUnlockType;

public interface IBaseConsumable {

    ConsumableUnlockType getUnlockType();

    void setUnlockType(ConsumableUnlockType unlockType);

    ConsumableType getConsumableType();

    void setConsumableType(ConsumableType type);

    Integer getColorId();

    void setColorId(Integer colorId);

    Integer getDurationMs();

    void setDurationMs(Integer durationMs);

    Integer getRecipeId();

    void setRecipeId(Integer recipeId);

    Integer getGuildUpgradeId();

    void setGuildUpgradeId(Integer guildUpgradeId);

    String getConsumableName();

    void setConsumableName(String name);

    Integer getApplyCount();

    void setApplyCount(Integer applyCount);

    String getIcon();

    void setIcon(String icon);

    void setExtraRecipeIds(Set<Integer> extraRecipeIds);

    Set<Integer> getExtraRecipeIds();
}
