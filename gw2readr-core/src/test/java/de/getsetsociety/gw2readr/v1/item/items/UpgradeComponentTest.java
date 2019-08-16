package de.getsetsociety.gw2readr.v1.item.items;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IUpgradeComponent;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.UpgradeComponentJson;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;


public class UpgradeComponentTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testContainerDefaultAccountBindOnUseNoSellAccountBoundNoRestriction061738() throws IOException {
        String content = IOUtils.toString(getClass().getResource("SuperiorSigilOfAbsorption.json"));
        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
        assertThat(itemJson, not(nullValue()));
        assertThat(itemJson, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent item = (IUpgradeComponent) itemJson.getEntity();
        assertThat(item.getId(), is(72872));
        assertThat(item.getIconFileId(), is(1201531));
        assertThat(item.getIconFileSignature(), is("56CB34140E68F7153DD4F240D2F040D4060B06AA"));
        assertThat(item.getAvailableInActivity(), is(true));
        assertThat(item.getAvailableInDungeon(), is(true));
        assertThat(item.getAvailableInPvE(), is(true));
        assertThat(item.getAvailableInPvP(), is(false));
        assertThat(item.getAvailableInPvPLobby(), is(false));
        assertThat(item.getAvailableInWvW(), is(true));
        assertThat(item.getDescription(), is("<c=@abilitytype>Element: </c>Control<br>Double-click to apply to a weapon."));
        assertThat(item.getName(), is("Superior Sigil of Absorption"));
        assertThat(item.getLevel(), is(60));
        assertThat(item.getVendorValue(), is(216));
        assertThat(item.getRarity(), is(Rarity.EXOTIC));
        assertThat(item.getFlags(), hasSize(4));
        assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.AccountBound, ItemFlags.NoSell, ItemFlags.AccountBindOnUse));
        assertThat(item.getRestrictions(), empty());
        assertThat(item.getUpgradeRecipes(), empty());
        assertThat(item.getUpgradeComponentType(), is(UpgradeComponentType.SIGIL));
        assertThat(item.getUpgradeComponentFlags(), hasItems(UpgradeComponentFlag.ShortBow, UpgradeComponentFlag.Dagger, UpgradeComponentFlag.Focus, UpgradeComponentFlag.Greatsword, UpgradeComponentFlag.Hammer, UpgradeComponentFlag.Harpoon, UpgradeComponentFlag.Mace, UpgradeComponentFlag.Pistol, UpgradeComponentFlag.Rifle, UpgradeComponentFlag.Scepter, UpgradeComponentFlag.Shield, UpgradeComponentFlag.Speargun, UpgradeComponentFlag.Axe, UpgradeComponentFlag.Staff, UpgradeComponentFlag.Sword, UpgradeComponentFlag.Torch, UpgradeComponentFlag.Warhorn, UpgradeComponentFlag.LongBow));
        assertThat(item.getInfusionUpgradeFlags(), empty());
        assertThat(item.getInfixUpgrade().getId(), is(146));
        assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.POWER, 12), new AttributeModifier(Attribute.VITALITY, 8)));
    }
}
