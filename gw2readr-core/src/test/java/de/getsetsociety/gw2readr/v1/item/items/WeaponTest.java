package de.getsetsociety.gw2readr.v1.item.items;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.WeaponJson;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public class WeaponTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testWeaponSoulBindOnUseLongBow038875() {
        String content = "{\"item_id\":\"38875\",\"name\":\"Tribal Bow\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"396\",\"icon_file_id\":\"67297\",\"icon_file_signature\":\"A51ADB360705467301EC46B62D39BECFDEDE4810\",\"default_skin\":\"5195\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"LongBow\",\"damage_type\":\"Physical\",\"min_power\":\"920\",\"max_power\":\"1080\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(38875));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Tribal Bow"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(396));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(2));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.AccountBound));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.LongBow));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(920));
            assertThat(item.getMaxPower(), is(1080));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponPistol026706() {
        String content = "{\"item_id\":\"26706\",\"name\":\"Dragonshot\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"264\",\"icon_file_id\":\"67327\",\"icon_file_signature\":\"01FE541CE063E197C43D4B233408E1B66C46BD4D\",\"default_skin\":\"5177\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Pistol\",\"damage_type\":\"Physical\",\"min_power\":\"876\",\"max_power\":\"1029\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"90\"},\n{\"attribute\":\"Precision\",\"modifier\":\"64\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"64\"}]},\"suffix_item_id\":\"24630\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(26706));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Dragonshot"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(264));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(2));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.PISTOL));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(876));
            assertThat(item.getMaxPower(), is(1029));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.ConditionDamage, 90), new AttributeModifier(Attribute.Precision, 64), new AttributeModifier(Attribute.Toughness, 64)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(24630));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponWarhorn026920() {
        String content = "{\"item_id\":\"26920\",\"name\":\"Honed Soft Wood Warhorn\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"32\",\"rarity\":\"Fine\",\"vendor_value\":\"32\",\"icon_file_id\":\"65530\",\"icon_file_signature\":\"5A0593B5164DE87591029323F7D90775D716001D\",\"default_skin\":\"3907\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Warhorn\",\"damage_type\":\"Physical\",\"min_power\":\"243\",\"max_power\":\"269\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"19\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"14\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(26920));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Honed Soft Wood Warhorn"));
            assertThat(item.getLevel(), is(32));
            assertThat(item.getVendorValue(), is(32));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().isEmpty(), is(true));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.WARHORN));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(243));
            assertThat(item.getMaxPower(), is(269));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 19), new AttributeModifier(Attribute.CritDamage, 14)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponSword029051() {
        String content = "{\"item_id\":\"29051\",\"name\":\"Mighty Sword\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"4\",\"rarity\":\"Basic\",\"vendor_value\":\"5\",\"icon_file_id\":\"66216\",\"icon_file_signature\":\"4208D4020193450C234C0DC55F7EFCFAB236007B\",\"default_skin\":\"3873\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Sword\",\"damage_type\":\"Physical\",\"min_power\":\"117\",\"max_power\":\"129\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"4\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(29051));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Mighty Sword"));
            assertThat(item.getLevel(), is(4));
            assertThat(item.getVendorValue(), is(5));
            assertThat(item.getRarity(), is(Rarity.Basic));
            assertThat(item.getFlags().isEmpty(), is(true));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.SWORD));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(117));
            assertThat(item.getMaxPower(), is(129));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(1));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 4)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponStaff034330() {
        String content = "{\"item_id\":\"34330\",\"name\":\"Ravaging Glyphic Staff\",\"type\":\"Weapon\",\"level\":\"21\",\"rarity\":\"Fine\",\"vendor_value\":\"36\",\"icon_file_id\":\"62802\",\"icon_file_signature\":\"009BF7054DD8F777207999EC76EA747801A4CA56\",\"default_skin\":\"5237\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Staff\",\"damage_type\":\"Physical\",\"min_power\":\"230\",\"max_power\":\"259\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"25\"},\n{\"attribute\":\"Precision\",\"modifier\":\"18\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(34330));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Ravaging Glyphic Staff"));
            assertThat(item.getLevel(), is(21));
            assertThat(item.getVendorValue(), is(36));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().isEmpty(), is(true));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.STAFF));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(230));
            assertThat(item.getMaxPower(), is(259));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.ConditionDamage, 25), new AttributeModifier(Attribute.Precision, 18)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponGreatsword053029() {
        String content = "{\"item_id\":\"53029\",\"name\":\"Vagabond's Problem Solver\",\"type\":\"Weapon\",\"level\":\"14\",\"rarity\":\"Masterwork\",\"vendor_value\":\"63\",\"icon_file_id\":\"66762\",\"icon_file_signature\":\"D8325BBDF9DDCA3F422531492B0CEC7BA34C9ACB\",\"default_skin\":\"5218\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Greatsword\",\"damage_type\":\"Physical\",\"min_power\":\"231\",\"max_power\":\"255\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"23\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"17\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(53029));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Vagabond's Problem Solver"));
            assertThat(item.getLevel(), is(14));
            assertThat(item.getVendorValue(), is(63));
            assertThat(item.getRarity(), is(Rarity.Masterwork));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.GREATSWORD));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(231));
            assertThat(item.getMaxPower(), is(255));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 23), new AttributeModifier(Attribute.Toughness, 17)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponNoSalvageOffenseSlotTrident046985() {
        String content = "{\"item_id\":\"46985\",\"name\":\"Hronk's Trident\",\"description\":\"<c=@flavor>Crafted in the style of the renowned asuran genius, Hronk.</c>\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Ascended\",\"vendor_value\":\"10000\",\"icon_file_id\":\"632283\",\"icon_file_signature\":\"1FC7B1F52AB19197A5019B59F4053AD0E0E6054A\",\"default_skin\":\"4144\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoSalvage\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Trident\",\"damage_type\":\"Physical\",\"min_power\":\"950\",\"max_power\":\"1050\",\"defense\":\"0\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},\n{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"188\"},\n{\"attribute\":\"Precision\",\"modifier\":\"134\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"134\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(46985));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("<c=@flavor>Crafted in the style of the renowned asuran genius, Hronk.</c>"));
            assertThat(item.getName(), is("Hronk's Trident"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(10000));
            assertThat(item.getRarity(), is(Rarity.Ascended));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.AccountBound));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.TRIDENT));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(950));
            assertThat(item.getMaxPower(), is(1050));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Healing, 188), new AttributeModifier(Attribute.Precision, 134), new AttributeModifier(Attribute.Vitality, 134)));
            assertThat(item.getInfusionSlots().size(), is(1));
            assertThat(item.getInfusionSlots(), hasItems(InfusionSlotType.Offense));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponSoulbindOnAcquire031594() {
        String content = "{\"item_id\":\"31594\",\"name\":\"Tainted Glyphic Maul\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"396\",\"icon_file_id\":\"455718\",\"icon_file_signature\":\"1BD56E11A0350D930E1E611EC212F2AC6C7404EF\",\"default_skin\":\"4516\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Hammer\",\"damage_type\":\"Physical\",\"min_power\":\"985\",\"max_power\":\"1111\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(31594));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Tainted Glyphic Maul"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(396));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(3));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.HAMMER));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(985));
            assertThat(item.getMaxPower(), is(1111));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponAxe052664() {
        String content = "{\"item_id\":\"52664\",\"name\":\"Vagabond's Tarnished Hewer\",\"type\":\"Weapon\",\"level\":\"26\",\"rarity\":\"Masterwork\",\"vendor_value\":\"60\",\"icon_file_id\":\"62850\",\"icon_file_signature\":\"775ED24CE0C0F5749BAD66DD9778BDE4DA37AF4A\",\"default_skin\":\"5192\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Axe\",\"damage_type\":\"Physical\",\"min_power\":\"260\",\"max_power\":\"317\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"19\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"14\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(52664));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Vagabond's Tarnished Hewer"));
            assertThat(item.getLevel(), is(26));
            assertThat(item.getVendorValue(), is(60));
            assertThat(item.getRarity(), is(Rarity.Masterwork));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.AXE));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(260));
            assertThat(item.getMaxPower(), is(317));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 19), new AttributeModifier(Attribute.Toughness, 14)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponShortBow063679() {
        String content = "{\"item_id\":\"63679\",\"name\":\"Rejuvenating Hard Wood Short Bow\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"40\",\"rarity\":\"Masterwork\",\"vendor_value\":\"114\",\"icon_file_id\":\"67068\",\"icon_file_signature\":\"0EFDC626FD430DA00CD9240C95EC6DF0500DB45E\",\"default_skin\":\"3990\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"ShortBow\",\"damage_type\":\"Physical\",\"min_power\":\"349\",\"max_power\":\"386\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"55\"},\n{\"attribute\":\"Power\",\"modifier\":\"39\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(63679));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Rejuvenating Hard Wood Short Bow"));
            assertThat(item.getLevel(), is(40));
            assertThat(item.getVendorValue(), is(114));
            assertThat(item.getRarity(), is(Rarity.Masterwork));
            assertThat(item.getFlags().size(), is(2));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.SHORTBOW));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(349));
            assertThat(item.getMaxPower(), is(386));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Healing, 55), new AttributeModifier(Attribute.Power, 39)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponScepter034391() {
        String content = "{\"item_id\":\"34391\",\"name\":\"Ravaging Glyphic Scepter\",\"type\":\"Weapon\",\"level\":\"46\",\"rarity\":\"Fine\",\"vendor_value\":\"42\",\"icon_file_id\":\"62814\",\"icon_file_signature\":\"B0E409A76215A744756C7E98790F9B06F1489F1F\",\"default_skin\":\"5061\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Scepter\",\"damage_type\":\"Physical\",\"min_power\":\"359\",\"max_power\":\"405\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"30\"},\n{\"attribute\":\"Precision\",\"modifier\":\"21\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(34391));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Ravaging Glyphic Scepter"));
            assertThat(item.getLevel(), is(46));
            assertThat(item.getVendorValue(), is(42));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().isEmpty(), is(true));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.SCEPTER));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(359));
            assertThat(item.getMaxPower(), is(405));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.ConditionDamage, 30), new AttributeModifier(Attribute.Precision, 21)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponSpeargun031026() {
        String content = "{\"item_id\":\"31026\",\"name\":\"Berserker's Speargun\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Basic\",\"vendor_value\":\"50\",\"icon_file_id\":\"66246\",\"icon_file_signature\":\"491298E66504934335705E5091CCCF29C2925B47\",\"default_skin\":\"3858\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"weapon\":{\"type\":\"Speargun\",\"damage_type\":\"Physical\",\"min_power\":\"551\",\"max_power\":\"609\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"108\"},\n{\"attribute\":\"Precision\",\"modifier\":\"77\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"77\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(31026));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Berserker's Speargun"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(50));
            assertThat(item.getRarity(), is(Rarity.Basic));
            assertThat(item.getFlags().size(), is(1));
            assertThat(item.getFlags(), hasItems(ItemFlags.NoSalvage));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.SPEARGUN));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(551));
            assertThat(item.getMaxPower(), is(609));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 108), new AttributeModifier(Attribute.Precision, 77), new AttributeModifier(Attribute.CritDamage, 77)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponMace041540() {
        String content = "{\"item_id\":\"41540\",\"name\":\"Sentinel's Pearl Bludgeoner\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"264\",\"icon_file_id\":\"67776\",\"icon_file_signature\":\"4C3C6AA7923B3B4CF2BBF37505D71A146A21FA4A\",\"default_skin\":\"4075\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Mace\",\"damage_type\":\"Physical\",\"min_power\":\"895\",\"max_power\":\"1010\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":\"90\"},\n{\"attribute\":\"Power\",\"modifier\":\"64\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"64\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(41540));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Sentinel's Pearl Bludgeoner"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(264));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(1));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.MACE));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(895));
            assertThat(item.getMaxPower(), is(1010));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Vitality, 90), new AttributeModifier(Attribute.Power, 64), new AttributeModifier(Attribute.Toughness, 64)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponHarpoon046840() {
        String content = "{\"item_id\":\"46840\",\"name\":\"Occam's Impaler\",\"description\":\"<c=@flavor>Crafted in the style of the renowned Sylvari smith, Occam.</c>\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Ascended\",\"vendor_value\":\"10000\",\"icon_file_id\":\"631961\",\"icon_file_signature\":\"3623A0FC9F062FFF6B9F0C4BB00D3745037306B6\",\"default_skin\":\"4161\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoSalvage\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Harpoon\",\"damage_type\":\"Physical\",\"min_power\":\"950\",\"max_power\":\"1050\",\"defense\":\"0\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},\n{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"188\"},\n{\"attribute\":\"Power\",\"modifier\":\"134\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"134\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(46840));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("<c=@flavor>Crafted in the style of the renowned Sylvari smith, Occam.</c>"));
            assertThat(item.getName(), is("Occam's Impaler"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(10000));
            assertThat(item.getRarity(), is(Rarity.Ascended));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.AccountBound));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.HARPOON));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(950));
            assertThat(item.getMaxPower(), is(1050));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.ConditionDamage, 188), new AttributeModifier(Attribute.Power, 134), new AttributeModifier(Attribute.Vitality, 134)));
            assertThat(item.getInfusionSlots().size(), is(1));
            assertThat(item.getInfusionSlots(), hasItems(InfusionSlotType.Offense));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponTorch029404() {
        String content = "{\"item_id\":\"29404\",\"name\":\"Exterminator Torch\",\"description\":\"<c=@flavor>\\\"Great for cleaning out grawl.\\\"<br>—Etta</c>\",\"type\":\"Weapon\",\"level\":\"9\",\"rarity\":\"Fine\",\"vendor_value\":\"14\",\"icon_file_id\":\"63136\",\"icon_file_signature\":\"FA56C5DD5D7494F25D980E432BA129F44209ED0E\",\"default_skin\":\"3890\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Torch\",\"damage_type\":\"Physical\",\"min_power\":\"141\",\"max_power\":\"165\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":\"7\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(29404));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("<c=@flavor>\"Great for cleaning out grawl.\"<br>—Etta</c>"));
            assertThat(item.getName(), is("Exterminator Torch"));
            assertThat(item.getLevel(), is(9));
            assertThat(item.getVendorValue(), is(14));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.TORCH));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(141));
            assertThat(item.getMaxPower(), is(165));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(1));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Vitality, 7)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponShield054171() {
        String content = "{\"item_id\":\"54171\",\"name\":\"Vagabond's Immutabilis\",\"type\":\"Weapon\",\"level\":\"51\",\"rarity\":\"Rare\",\"vendor_value\":\"141\",\"icon_file_id\":\"434774\",\"icon_file_signature\":\"A2B7C080B75DCC1C65DB50746CB0E90356240667\",\"default_skin\":\"5207\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Shield\",\"damage_type\":\"Physical\",\"min_power\":\"447\",\"max_power\":\"504\",\"defense\":\"32\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"44\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"32\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(54171));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Vagabond's Immutabilis"));
            assertThat(item.getLevel(), is(51));
            assertThat(item.getVendorValue(), is(141));
            assertThat(item.getRarity(), is(Rarity.Rare));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.SHIELD));
            assertThat(item.getDefense(), is(32));
            assertThat(item.getMinPower(), is(447));
            assertThat(item.getMaxPower(), is(504));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 44), new AttributeModifier(Attribute.Toughness, 32)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponDagger033197() {
        String content = "{\"item_id\":\"33197\",\"name\":\"Orrian Dagger of Earth\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Masterwork\",\"vendor_value\":\"132\",\"icon_file_id\":\"779957\",\"icon_file_signature\":\"1DBE7D479EB96C5D99A0ED0E3702BFE118D7F80E\",\"default_skin\":\"5093\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Dagger\",\"damage_type\":\"Physical\",\"min_power\":\"761\",\"max_power\":\"808\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"24558\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(33197));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Orrian Dagger of Earth"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(132));
            assertThat(item.getRarity(), is(Rarity.Masterwork));
            assertThat(item.getFlags().size(), is(2));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.AccountBound));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.DAGGER));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(761));
            assertThat(item.getMaxPower(), is(808));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(24558));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponNotUpgradeableTwoHandedToy043092() {
        String content = "{\"item_id\":\"43092\",\"name\":\"Bloody Prince's Staff Toy\",\"description\":\"Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item.\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"648159\",\"icon_file_signature\":\"DCAA16650655B79ADDAD02B44B590EA9397AD3DE\",\"default_skin\":\"3245\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"NotUpgradeable\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"TwoHandedToy\",\"damage_type\":\"Physical\",\"min_power\":\"0\",\"max_power\":\"0\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(43092));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item."));
            assertThat(item.getName(), is("Bloody Prince's Staff Toy"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Rare));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.NotUpgradeable, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.TWOHANDEDTOY));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(0));
            assertThat(item.getMaxPower(), is(0));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponRifle028035() {
        String content = "{\"item_id\":\"28035\",\"name\":\"Strong Iron Rifle\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"56\",\"rarity\":\"Fine\",\"vendor_value\":\"74\",\"icon_file_id\":\"62700\",\"icon_file_signature\":\"167018D742BBF5120BE4ACE80DE5B049089D20F2\",\"default_skin\":\"4092\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Rifle\",\"damage_type\":\"Physical\",\"min_power\":\"487\",\"max_power\":\"595\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"79\"},\n{\"attribute\":\"Precision\",\"modifier\":\"56\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(28035));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(""));
            assertThat(item.getName(), is("Strong Iron Rifle"));
            assertThat(item.getLevel(), is(56));
            assertThat(item.getVendorValue(), is(74));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().isEmpty(), is(true));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.RIFLE));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(487));
            assertThat(item.getMaxPower(), is(595));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Power, 79), new AttributeModifier(Attribute.Precision, 56)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponFocus034132() {
        String content = "{\"item_id\":\"34132\",\"name\":\"Carrion Tribal Focus of Accuracy\",\"type\":\"Weapon\",\"level\":\"78\",\"rarity\":\"Exotic\",\"vendor_value\":\"256\",\"icon_file_id\":\"67309\",\"icon_file_signature\":\"7524FEB6CFE0FB59E8FA97B1D7AFB27FB0CBFEC9\",\"default_skin\":\"5183\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Focus\",\"damage_type\":\"Physical\",\"min_power\":\"805\",\"max_power\":\"855\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"86\"},\n{\"attribute\":\"Power\",\"modifier\":\"62\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"62\"}]},\"suffix_item_id\":\"24618\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(34132));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(false));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Carrion Tribal Focus of Accuracy"));
            assertThat(item.getLevel(), is(78));
            assertThat(item.getVendorValue(), is(256));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(1));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.FOCUS));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(805));
            assertThat(item.getMaxPower(), is(855));
            assertThat(item.getInfixUpgrade().getAttributes().size(), is(3));
            assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.ConditionDamage, 86), new AttributeModifier(Attribute.Power, 62), new AttributeModifier(Attribute.Vitality, 62)));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(24618));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponToy020262() {
        String content = "{\"item_id\":\"20262\",\"name\":\"Frying Pan\",\"description\":\"Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item.\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"220578\",\"icon_file_signature\":\"511DBF081277C7D470EE5322A1F5377460F95E0C\",\"default_skin\":\"3187\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"NotUpgradeable\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Toy\",\"damage_type\":\"Physical\",\"min_power\":\"0\",\"max_power\":\"0\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(20262));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(true));
            assertThat(item.getDescription(), is("Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item."));
            assertThat(item.getName(), is("Frying Pan"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Fine));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.NotUpgradeable, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.TOY));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(0));
            assertThat(item.getMaxPower(), is(0));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponFireDamage049202() {
        String content = "{\"item_id\":\"49202\",\"name\":\"Rodgort\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"100000\",\"icon_file_id\":\"456027\",\"icon_file_signature\":\"B1D6CB3AB4017633280ACDB36470F46829FDDD13\",\"default_skin\":\"4665\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Torch\",\"damage_type\":\"Fire\",\"min_power\":\"789\",\"max_power\":\"926\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(49202));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Rodgort"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(100000));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Fire));
            assertThat(item.getWeaponType(), is(WeaponType.TORCH));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(789));
            assertThat(item.getMaxPower(), is(926));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponLargeBundle049935() {
        String content = "{\"item_id\":\"49935\",\"name\":\"Enchanted Broom\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"499494\",\"icon_file_signature\":\"306AC2AA3648170B137FFF57030C5AD550F2615F\",\"default_skin\":\"3689\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\"],\"flags\":[\"NoMysticForge\",\n\"NoSell\",\n\"NotUpgradeable\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"LargeBundle\",\"damage_type\":\"Physical\",\"min_power\":\"0\",\"max_power\":\"0\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":\"23133\"},\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(49935));
            assertThat(item.getAvailableInActivity(), is(true));
            assertThat(item.getAvailableInDungeon(), is(true));
            assertThat(item.getAvailableInPvE(), is(true));
            assertThat(item.getAvailableInPvP(), is(false));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Enchanted Broom"));
            assertThat(item.getLevel(), is(0));
            assertThat(item.getVendorValue(), is(0));
            assertThat(item.getRarity(), is(Rarity.Rare));
            assertThat(item.getFlags().size(), is(5));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NotUpgradeable, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire, ItemFlags.NoMysticForge));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Physical));
            assertThat(item.getWeaponType(), is(WeaponType.LARGEBUNDLE));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(0));
            assertThat(item.getMaxPower(), is(0));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponIceDamage049185() {
        String content = "{\"item_id\":\"49185\",\"name\":\"Frostfang\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"100000\",\"icon_file_id\":\"456009\",\"icon_file_signature\":\"0F9C08DE12ADD1082A103DC6EF7401281B23985E\",\"default_skin\":\"4674\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Axe\",\"damage_type\":\"Ice\",\"min_power\":\"857\",\"max_power\":\"1048\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(49185));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Frostfang"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(100000));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Ice));
            assertThat(item.getWeaponType(), is(WeaponType.AXE));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(857));
            assertThat(item.getMaxPower(), is(1048));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponLightningDamage049197() {
        String content = "{\"item_id\":\"49197\",\"name\":\"Meteorlogicus\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"100000\",\"icon_file_id\":\"456020\",\"icon_file_signature\":\"AC940BF377C5D3EF13B2060D53EF19F1BC34BE48\",\"default_skin\":\"4673\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Scepter\",\"damage_type\":\"Lightning\",\"min_power\":\"895\",\"max_power\":\"1010\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertThat(itemJson instanceof WeaponJson, is(true));
            IWeapon item = (IWeapon) itemJson.getEntity();
            assertThat(item.getId(), is(49197));
            assertThat(item.getAvailableInActivity(), is(false));
            assertThat(item.getAvailableInDungeon(), is(false));
            assertThat(item.getAvailableInPvE(), is(false));
            assertThat(item.getAvailableInPvP(), is(true));
            assertThat(item.getAvailableInPvPLobby(), is(true));
            assertThat(item.getAvailableInWvW(), is(false));
            assertThat(item.getDescription(), is(nullValue()));
            assertThat(item.getName(), is("Meteorlogicus"));
            assertThat(item.getLevel(), is(80));
            assertThat(item.getVendorValue(), is(100000));
            assertThat(item.getRarity(), is(Rarity.Exotic));
            assertThat(item.getFlags().size(), is(4));
            assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
            assertThat(item.getRestrictions().isEmpty(), is(true));
            assertThat(item.getDamageType(), is(DamageType.Lightning));
            assertThat(item.getWeaponType(), is(WeaponType.SCEPTER));
            assertThat(item.getDefense(), is(0));
            assertThat(item.getMinPower(), is(895));
            assertThat(item.getMaxPower(), is(1010));
            assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
            assertThat(item.getInfusionSlots().isEmpty(), is(true));
            assertThat(item.getSuffixItemId(), is(nullValue()));
            assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }

        }

    @Test
    public void testWeaponChokingDamageSmallBundle000006() throws IOException {
        String content = "{\"item_id\":\"6\",\"name\":\"((Assassin Coin Bundle))\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"0\",\"icon_file_id\":\"60984\",\"icon_file_signature\":\"CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4\",\"default_skin\":\"2809\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"SmallBundle\",\"damage_type\":\"Choking\",\"min_power\":\"105\",\"max_power\":\"117\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
        assertNotNull(itemJson);
        assertThat(itemJson instanceof WeaponJson, is(true));
        IWeapon item = (IWeapon) itemJson.getEntity();
        assertThat(item.getId(), is(6));
        assertThat(item.getAvailableInActivity(), is(true));
        assertThat(item.getAvailableInDungeon(), is(true));
        assertThat(item.getAvailableInPvE(), is(true));
        assertThat(item.getAvailableInPvP(), is(false));
        assertThat(item.getAvailableInPvPLobby(), is(false));
        assertThat(item.getAvailableInWvW(), is(true));
        assertThat(item.getDescription(), is(""));
        assertThat(item.getName(), is("((Assassin Coin Bundle))"));
        assertThat(item.getLevel(), is(0));
        assertThat(item.getVendorValue(), is(0));
        assertThat(item.getRarity(), is(Rarity.Basic));
        assertThat(item.getFlags().size(), is(3));
        assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
        assertThat(item.getFlags(), hasItems(ItemFlags.SoulBindOnUse, ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire));
        assertThat(item.getRestrictions().isEmpty(), is(true));
        assertThat(item.getDamageType(), is(DamageType.Choking));
        assertThat(item.getWeaponType(), is(WeaponType.SMALLBUNDLE));
        assertThat(item.getDefense(), is(0));
        assertThat(item.getMinPower(), is(105));
        assertThat(item.getMaxPower(), is(117));
        assertThat(item.getInfixUpgrade().getAttributes().isEmpty(), is(true));
        assertThat(item.getInfusionSlots().isEmpty(), is(true));
        assertThat(item.getSuffixItemId(), is(nullValue()));
        assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
    }

    @Test
    public void testDefaultSkinReading() throws IOException {
        String content = IOUtils.toString(getClass().getResource("DesertersPulseHammer.json"));
        ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
        assertThat(itemJson, not(nullValue()));
        assertThat(itemJson, instanceOf(WeaponJson.class));
        IWeapon item = (IWeapon) itemJson.getEntity();
        assertThat(item.getId(), is(52998));
        assertThat(item.getAvailableInActivity(), is(true));
        assertThat(item.getAvailableInDungeon(), is(true));
        assertThat(item.getAvailableInPvE(), is(true));
        assertThat(item.getAvailableInPvP(), is(false));
        assertThat(item.getAvailableInPvPLobby(), is(false));
        assertThat(item.getAvailableInWvW(), is(true));
        assertThat(item.getDescription(), is(nullValue()));
        assertThat(item.getName(), is("Deserter's Pulse Hammer"));
        assertThat(item.getLevel(), is(34));
        assertThat(item.getVendorValue(), is(105));
        assertThat(item.getRarity(), is(Rarity.Masterwork));
        assertThat(item.getFlags().size(), is(5));
        assertThat(item.getFlags(), hasItems(ItemFlags.HideSuffix, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoMysticForge));
        assertThat(item.getRestrictions().isEmpty(), is(true));
        assertThat(item.getDamageType(), is(DamageType.Physical));
        assertThat(item.getWeaponType(), is(WeaponType.HAMMER));
        assertThat(item.getDefense(), is(0));
        assertThat(item.getMinPower(), is(356));
        assertThat(item.getMaxPower(), is(402));
        assertThat(item.getInfixUpgrade().getAttributes().size(), is(2));
        assertThat(item.getInfixUpgrade().getAttributes(), hasItems(new AttributeModifier(Attribute.Toughness, 48), new AttributeModifier(Attribute.ConditionDamage, 68)));
        assertThat(item.getInfusionSlots().isEmpty(), is(true));
        assertThat(item.getSuffixItemId(), is(nullValue()));
        assertThat(item.getSecondarySuffixItemId(), is(nullValue()));
        assertThat(item.getDefaultSkin(), is(5222));
    }

}
