package de.getsetsociety.gw2readr.v1.item.items;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ITrinket;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.TrinketJson;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;


public class TrinketTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testContainerDefaultAccountBindOnUseNoSellAccountBoundNoRestriction061738() throws IOException {
        String content = IOUtils.toString(getClass().getResource("LargeHorn.json"));
        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
        assertThat(itemJson, not(nullValue()));
        assertThat(itemJson, instanceOf(TrinketJson.class));
        ITrinket item = (ITrinket) itemJson.getEntity();
        assertThat(item.getId(), is(23294));
        assertThat(item.getIconFileId(), is(66804));
        assertThat(item.getIconFileSignature(), is("AA31662624F92ADF714F9FADC8D35C9FE06D5FF3"));
        assertThat(item.getAvailableInActivity(), is(true));
        assertThat(item.getAvailableInDungeon(), is(true));
        assertThat(item.getAvailableInPvE(), is(true));
        assertThat(item.getAvailableInPvP(), is(false));
        assertThat(item.getAvailableInPvPLobby(), is(false));
        assertThat(item.getAvailableInWvW(), is(true));
        assertThat(item.getDescription(), isEmptyString());
        assertThat(item.getName(), is("Large Horn"));
        assertThat(item.getLevel(), is(25));
        assertThat(item.getVendorValue(), is(34));
        assertThat(item.getRarity(), is(Rarity.Fine));
        assertThat(item.getFlags(), hasSize(5));
        assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire, ItemFlags.SoulBindOnUse));
        assertThat(item.getRestrictions(), empty());
        assertThat(item.getUpgradeRecipes(), empty());
        assertThat(item.getTrinketType(), is(TrinketType.Accessory));
        assertThat(item.getInfusionSlots(), empty());
        assertThat(item.getInfixUpgrade().getId(), is(146));
        assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 12), new AttributeModifier(Attribute.Vitality, 8)));
        assertThat(item.getSuffixItemId(), nullValue());
        assertThat(item.getSecondarySuffixItemId(), nullValue());
    }
}
