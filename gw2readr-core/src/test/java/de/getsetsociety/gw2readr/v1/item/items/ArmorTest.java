package de.getsetsociety.gw2readr.v1.item.items;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;


public class ArmorTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testArmorMediumHelmSoulBindOnUseNoSellAccountBoundInfixUpgradeNoSlotNoRestriction018431() throws IOException {
        String content = IOUtils.toString(getClass().getResource("FlameLegionHelm.json"));
        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
        assertThat(itemJson, not(nullValue()));
        assertThat(itemJson, instanceOf(ArmorJson.class));
        IArmor item = (IArmor) itemJson.getEntity();
        assertThat(item.getId(), is(18431));
        assertThat(item.getAvailableInActivity(), is(true));
        assertThat(item.getAvailableInDungeon(), is(true));
        assertThat(item.getAvailableInPvE(), is(true));
        assertThat(item.getAvailableInPvP(), is(false));
        assertThat(item.getAvailableInPvPLobby(), is(false));
        assertThat(item.getAvailableInWvW(), is(true));
        assertNull(item.getDescription());
        assertThat(item.getName(), is("Flame Legion Helm"));
        assertThat(item.getLevel(), is(80));
        assertThat(item.getVendorValue(), is(330));
        assertThat(item.getRarity(), is(Rarity.Exotic));
        assertThat(item.getFlags().size(), is(3));
        assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound));
        assertThat(item.getRestrictions().isEmpty(), is(true));
        assertThat(item.getDefense(), is(97));
        assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
        assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.ConditionDamage, 60), new AttributeModifier(Attribute.Power, 43), new AttributeModifier(Attribute.Vitality, 43)));
        assertThat(item.getInfusionSlots().isEmpty(), is(true));
        assertThat(item.getSuffixItemId(), is(24854));
        assertThat(item.getArmorType(), is(ArmorType.Helm));
        assertThat(item.getWeightClass(), is(WeightClass.Medium));
        assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
    }

    @Test
    public void testArmorLightBoots066512() {
        String content = "{\"item_id\":\"66512\",\"name\":\"Nomad's Exalted Boots\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"240\",\"icon_file_id\":\"61520\",\"icon_file_signature\":\"AE26D521B64460E45F69FBD7784313D4BAF070CA\",\"default_skin\":\"172\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":\"34\"},\n{\"attribute\":\"Healing\",\"modifier\":\"24\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"24\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(66512));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertNull(item.getDescription());
            assertThat(item.getName(), is("Nomad's Exalted Boots"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(240));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(2));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.AccountBound));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(133));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Toughness, 34), new AttributeModifier(Attribute.Healing, 24), new AttributeModifier(Attribute.Vitality, 24)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Boots));
            assertThat(item.getWeightClass(), is(WeightClass.Light));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHideSuffix002404() {
        String content = "{\"item_id\":\"2404\",\"name\":\"Khilbron's Mask\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"330\",\"icon_file_id\":\"61083\",\"icon_file_signature\":\"3F43DAA7D2171B41B6F216804AC321E0B1B9A3AA\",\"default_skin\":\"94\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Light\",\"defense\":\"73\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"45\"},\n{\"attribute\":\"Precision\",\"modifier\":\"32\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"32\"}]},\"suffix_item_id\":\"24688\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(2404));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Khilbron's Mask"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(330));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(2));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(73));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.ConditionDamage, 45), new AttributeModifier(Attribute.Precision, 32), new AttributeModifier(Attribute.Toughness, 32)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(24688));
            assertThat(item.getArmorType(), is(ArmorType.Helm));
            assertThat(item.getWeightClass(), is(WeightClass.Light));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorLeggingsNoSalvage005252() {
        String content = "{\"item_id\":\"5252\",\"name\":\"Berserker's Apprentice Pants\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"70\",\"rarity\":\"Basic\",\"vendor_value\":\"42\",\"icon_file_id\":\"61404\",\"icon_file_signature\":\"AAB41A903B03C7DEB833A8CC4E08CF0A02A67BD5\",\"default_skin\":\"3\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"armor\":{\"type\":\"Leggings\",\"weight_class\":\"Light\",\"defense\":\"97\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"33\"},\n{\"attribute\":\"Precision\",\"modifier\":\"23\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"23\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(5252));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Berserker's Apprentice Pants"));
            assertThat(item.getLevel(), is(70));
            assertThat(item.getVendorValue(), is(42));
            assertThat(item.getRarity(), is(Rarity.Basic));
            assertThat(item.getFlags().size(), is(1));
            assertThat(item.getFlags(), hasItems(ItemFlags.NoSalvage));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(97));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 33), new AttributeModifier(Attribute.Precision, 23), new AttributeModifier(Attribute.CritDamage, 23)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Leggings));
            assertThat(item.getWeightClass(), is(WeightClass.Light));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHeavy001752() {
        String content = "{\"item_id\":\"1752\",\"name\":\"Strong Reinforced Scale Helm of Scavenging\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"50\",\"rarity\":\"Masterwork\",\"vendor_value\":\"113\",\"icon_file_id\":\"61064\",\"icon_file_signature\":\"6F30FEDA2B1405EEB10426E1200522E29D7C3ECB\",\"default_skin\":\"101\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Helm\",\"weight_class\":\"Heavy\",\"defense\":\"53\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"18\"},\n{\"attribute\":\"Precision\",\"modifier\":\"13\"}]},\"suffix_item_id\":\"24736\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(1752));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Strong Reinforced Scale Helm of Scavenging"));
            assertThat(item.getLevel(), is(50));
            assertThat(item.getVendorValue(), is(113));
            assertThat(item.getRarity(), is(Rarity.Masterwork));
            assertThat(item.getFlags().size(), is(1));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(53));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 18), new AttributeModifier(Attribute.Precision, 13)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(24736));
            assertThat(item.getArmorType(), is(ArmorType.Helm));
            assertThat(item.getWeightClass(), is(WeightClass.Heavy));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorGloves012052() {
        String content = "{\"item_id\":\"12052\",\"name\":\"Rejuvenating Noble Gloves\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"50\",\"rarity\":\"Rare\",\"vendor_value\":\"122\",\"icon_file_id\":\"61442\",\"icon_file_signature\":\"04D6DAB3CCB0CF65A2CEE2F7BAA4CFC44CBA369C\",\"default_skin\":\"252\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Medium\",\"defense\":\"75\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"15\"},\n{\"attribute\":\"Power\",\"modifier\":\"11\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(12052));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Rejuvenating Noble Gloves"));
            assertThat(item.getLevel(), is(50));
            assertThat(item.getVendorValue(), is(122));
            assertThat(item.getRarity(), is(Rarity.Rare));
            assertThat(item.getFlags().size(), is(1));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(75));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Healing, 15), new AttributeModifier(Attribute.Power, 11)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Gloves));
            assertThat(item.getWeightClass(), is(WeightClass.Medium));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorShouldersAccountBindOnUseDefenseSlot048005() {
        String content = "{\"item_id\":\"48005\",\"name\":\"Tateos's Pauldrons\",\"description\":\"<c=@flavor>Crafted in the style of the ancient Luxon armorer, Tateos.</c>\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Ascended\",\"vendor_value\":\"240\",\"icon_file_id\":\"699214\",\"icon_file_signature\":\"BCF8FD08CF3F4A263704370659D69FEE2EDD0C45\",\"default_skin\":\"113\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoSalvage\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Shoulders\",\"weight_class\":\"Heavy\",\"defense\":\"127\",\"infusion_slots\":[{\"flags\":[\"Defense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"35\"},\n{\"attribute\":\"Power\",\"modifier\":\"25\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"25\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(48005));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("<c=@flavor>Crafted in the style of the ancient Luxon armorer, Tateos.</c>"));
            assertThat(item.getName(), is("Tateos's Pauldrons"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(240));
            assertThat(item.getRarity(), is(Rarity.Ascended));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.AccountBound));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(127));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Healing, 35), new AttributeModifier(Attribute.Power, 25), new AttributeModifier(Attribute.Toughness, 25)));
            assertThat(item.getInfusionSlots().size(), is(1));
            assertThat(item.getInfusionSlots(), hasItems(InfusionSlotType.Defense));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Shoulders));
            assertThat(item.getWeightClass(), is(WeightClass.Heavy));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorCoatSoulbindOnAcquire064561() {
        String content = "{\"item_id\":\"64561\",\"name\":\"Honed Conjurer Chest of Balthazar\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"55\",\"rarity\":\"Rare\",\"vendor_value\":\"216\",\"icon_file_id\":\"61023\",\"icon_file_signature\":\"76CD08463A05730071D400254141B50E570662D3\",\"default_skin\":\"63\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Light\",\"defense\":\"168\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"51\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"37\"}]},\"suffix_item_id\":\"24764\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(64561));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Honed Conjurer Chest of Balthazar"));
            assertThat(item.getLevel(), is(55));
            assertThat(item.getVendorValue(), is(216));
            assertThat(item.getRarity(), is(Rarity.Rare));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(168));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 51), new AttributeModifier(Attribute.CritDamage, 37)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(24764));
            assertThat(item.getArmorType(), is(ArmorType.Coat));
            assertThat(item.getWeightClass(), is(WeightClass.Light));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorNoMysticForge043625() {
        String content = "{\"item_id\":\"43625\",\"name\":\"Flamewalker Boots\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"681047\",\"icon_file_signature\":\"0A23DF990B4C595EFB5BD8EC6D9F3C767FB301D3\",\"default_skin\":\"1264\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":\"157\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(43625));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Flamewalker Boots"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(157));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Boots));
            assertThat(item.getWeightClass(), is(WeightClass.Medium));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorNornRestriction063448() {
        String content = "{\"item_id\":\"63448\",\"name\":\"Dolyak Mail\",\"type\":\"Armor\",\"level\":\"20\",\"rarity\":\"Masterwork\",\"vendor_value\":\"1000\",\"icon_file_id\":\"61141\",\"icon_file_signature\":\"5DB81BDBD7F321A86916D8C17B099C73492A52D8\",\"default_skin\":\"445\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Norn\"],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Heavy\",\"defense\":\"68\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"15\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(63448));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertNull(item.getDescription());
            assertThat(item.getName(), is("Dolyak Mail"));
            assertThat(item.getLevel(), is(20));
            assertThat(item.getVendorValue(), is(1000));
            assertThat(item.getRarity(), is(Rarity.Masterwork));
            assertThat(item.getFlags().size(), is(2));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().size(), is(1));
            assertThat(item.getRestrictions(), hasItems(RestrictionType.Norn));
            assertThat(item.getDefense(), is(68));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(1));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 15)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Coat));
            assertThat(item.getWeightClass(), is(WeightClass.Heavy));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorAsuraRestriction006071() {
        String content = "{\"item_id\":\"6071\",\"name\":\"Adept Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"414938\",\"icon_file_signature\":\"6B08396A0F3D44D229B4B6A9725CF9D615B1E023\",\"default_skin\":\"289\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Asura\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(6071));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertNull(item.getDescription());
            assertThat(item.getName(), is("Adept Boots"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(3));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().size(), is(1));
            assertThat(item.getRestrictions(), hasItems(RestrictionType.Asura));
            assertThat(item.getDefense(), is(133));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Boots));
            assertThat(item.getWeightClass(), is(WeightClass.Light));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHumanRestriction006198() {
        String content = "{\"item_id\":\"6198\",\"name\":\"Scout's Coat\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"218908\",\"icon_file_signature\":\"115DDCB29BEA675FF4777EB675202E0CCE94AB3B\",\"default_skin\":\"392\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Human\"],\"armor\":{\"type\":\"Coat\",\"weight_class\":\"Medium\",\"defense\":\"338\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(6198));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertNull(item.getDescription());
            assertThat(item.getName(), is("Scout's Coat"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(3));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().size(), is(1));
            assertThat(item.getRestrictions(), hasItems(RestrictionType.Human));
            assertThat(item.getDefense(), is(338));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Coat));
            assertThat(item.getWeightClass(), is(WeightClass.Medium));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorClothing039531() {
        String content = "{\"item_id\":\"39531\",\"name\":\"Riding Gloves\",\"description\":\"Town clothes can no longer be equipped separately.\nTalk to a Black Lion armor trader in any major city to exchange this item for an endless casual clothing tonic.\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"543865\",\"icon_file_signature\":\"0B4B9E34265466099D9C09721664BEA967356C04\",\"default_skin\":\"1148\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Clothing\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(39531));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("Town clothes can no longer be equipped separately.\nTalk to a Black Lion armor trader in any major city to exchange this item for an endless casual clothing tonic."));
            assertThat(item.getName(), is("Riding Gloves"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Gloves));
            assertThat(item.getWeightClass(), is(WeightClass.Clothing));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorSylvariRestriction006155() {
        String content = "{\"item_id\":\"6155\",\"name\":\"Dryad Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"61185\",\"icon_file_signature\":\"08483C2E021EAB5409EE03FF4EA2B80D5A1A1166\",\"default_skin\":\"530\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Sylvari\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Light\",\"defense\":\"133\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(6155));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertNull(item.getDescription());
            assertThat(item.getName(), is("Dryad Boots"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(3));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().size(), is(1));
            assertThat(item.getRestrictions(), hasItems(RestrictionType.Sylvari));
            assertThat(item.getDefense(), is(133));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Boots));
            assertThat(item.getWeightClass(), is(WeightClass.Light));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorCharrRestriction006179() {
        String content = "{\"item_id\":\"6179\",\"name\":\"Drover Boots\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Exotic\",\"vendor_value\":\"0\",\"icon_file_id\":\"61216\",\"icon_file_signature\":\"D56CD998247A5A01B1C2333BD21C49F312393FA3\",\"default_skin\":\"350\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Charr\"],\"armor\":{\"type\":\"Boots\",\"weight_class\":\"Medium\",\"defense\":\"157\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(6179));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertNull(item.getDescription());
            assertThat(item.getName(), is("Drover Boots"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(3));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().size(), is(1));
            assertThat(item.getRestrictions(), hasItems(RestrictionType.Charr));
            assertThat(item.getDefense(), is(157));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Boots));
            assertThat(item.getWeightClass(), is(WeightClass.Medium));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorHelmAquatic004943() {
        String content = "{\"item_id\":\"4943\",\"name\":\"Metal Aquabreather\",\"description\":\"<c=@flavor>\\\"Quaggan found this in a shipwreck underwater. Quaggan doesn't need it. OoOOoo! It's very nice, though!\\\"<br>—Leemoola </c>\",\"type\":\"Armor\",\"level\":\"60\",\"rarity\":\"Fine\",\"vendor_value\":\"65\",\"icon_file_id\":\"61297\",\"icon_file_signature\":\"FA1D042B0845BED8DA3CFA0FAA0837D5EB0207A6\",\"default_skin\":\"854\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"armor\":{\"type\":\"HelmAquatic\",\"weight_class\":\"Heavy\",\"defense\":\"62\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"22\"},\n{\"attribute\":\"Precision\",\"modifier\":\"16\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"16\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(4943));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("<c=@flavor>\"Quaggan found this in a shipwreck underwater. Quaggan doesn't need it. OoOOoo! It's very nice, though!\"<br>—Leemoola </c>"));
            assertThat(item.getName(), is("Metal Aquabreather"));
            assertThat(item.getLevel(), is(60));
            assertThat(item.getVendorValue(), is(65));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(62));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Healing, 22), new AttributeModifier(Attribute.Precision, 16), new AttributeModifier(Attribute.Vitality, 16)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.HelmAquatic));
            assertThat(item.getWeightClass(), is(WeightClass.Heavy));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorNotUpgradeable001321() {
        String content = "{\"item_id\":\"1321\",\"name\":\"Mighty Worn Chain Gauntlets\",\"description\":\"\",\"type\":\"Armor\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"5\",\"icon_file_id\":\"61053\",\"icon_file_signature\":\"E21E356DE0083C4DBE95C0DD0EA13C47DF55C6BA\",\"default_skin\":\"50\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"armor\":{\"type\":\"Gloves\",\"weight_class\":\"Heavy\",\"defense\":\"14\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"2\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(1321));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Mighty Worn Chain Gauntlets"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(5));
            assertThat(item.getRarity(), is(Rarity.Basic));
            assertThat(item.getFlags().size(), is(1));
            assertThat(item.getFlags(), hasItems(ItemFlags.NotUpgradeable));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDefense(), is(14));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(1));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 2)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertNull(item.getSuffixItemId());
            assertThat(item.getArmorType(), is(ArmorType.Gloves));
            assertThat(item.getWeightClass(), is(WeightClass.Heavy));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
    @Test
    public void testArmorGuardianRestrictionWarriorRestriction018160() {
        String content = "{\"item_id\":\"18160\",\"name\":\"Body of Koda\",\"type\":\"Armor\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"370\",\"icon_file_id\":\"218952\",\"icon_file_signature\":\"5B3D97ACE0B564D69B7B020AE94016D49E01EEFC\",\"default_skin\":\"707\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSell\",\n\"SoulBindOnUse\"],\"restrictions\":[\"Guardian\",\n\"Warrior\"],\"armor\":{\"type\":\"Leggings\",\"weight_class\":\"Heavy\",\"defense\":\"242\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"67\"},\n{\"attribute\":\"Precision\",\"modifier\":\"48\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"48\"}]},\"suffix_item_id\":\"24857\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertThat(itemJson, not(nullValue()));
            assertThat(itemJson, instanceOf(ArmorJson.class));
            IArmor item = (IArmor) itemJson.getEntity();
            assertThat(item.getId(), is(18160));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertNull(item.getDescription());
            assertThat(item.getName(), is("Body of Koda"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(370));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(3));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound));
            assertThat(item.getRestrictions().size(), is(2));
            assertThat(item.getRestrictions(), hasItems(RestrictionType.Guardian, RestrictionType.Warrior));
            assertThat(item.getDefense(), is(242));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Healing, 67), new AttributeModifier(Attribute.Precision, 48), new AttributeModifier(Attribute.Vitality, 48)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(24857));
            assertThat(item.getArmorType(), is(ArmorType.Leggings));
            assertThat(item.getWeightClass(), is(WeightClass.Heavy));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
}
}
