package de.getsetsociety.gw2readr.v2.item.items;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v0.item.items.enums.*;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseAttributeModifier;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;
import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.entities.Buff;
import de.getsetsociety.gw2readr.v2.item.items.entities.InfusionSlot;
import de.getsetsociety.gw2readr.v2.item.items.entities.UpgradePath;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.*;
import de.getsetsociety.gw2readr.v2.item.items.json.*;

class TestItems {

    private static final ObjectMapper mapper = new ObjectMapper();


    /**
     * Tests the readability of Item 57
     * The Object is a BackItem (Lvl.0 Basic Soullbound on Aquire and on use Back Item, worth 16 coins
     * with Vitality(4) and Toughness(3) stats)
     */
    @Test
    void testReadingBackItem57() {
        String content = "{\"name\":\"Hearty Back Brace\",\"description\":\"This equipment goes under armor and "
                + "can hold an additional upgrade.\",\"type\":\"Back\",\"level\":0,\"rarity\":\"Basic\","
                + "\"vendor_value\":16,\"default_skin\":\"2329\","
                + "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":57,"
                + "\"icon\":\"https://render.guildwars2.com/file/6CF800ACB923E42F6CA40832C80694C7E0E9CB4D/61005.png\","
                + "\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":"
                + "[{\"attribute\":\"Vitality\",\"modifier\":4},"
                + "{\"attribute\":\"Toughness\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}";
        IBackItem entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting BackItemJson, got " + item.getClass().getCanonicalName(), item instanceof BackItemJson, is(true));
            entity = ((BackItemJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().size() + " unassigned values found", item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Hearty Back Brace"));
        assertThat(entity.getDescription(), is("This equipment goes under armor and can hold an additional upgrade."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.BASIC));
        assertThat(entity.getVendorValue(), is(16));
        assertThat(entity.getDefaultSkin(), is(2329));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        assertThat(entity.getFlags().size(), is(2));
        assertThat(entity.getFlags().contains(ItemFlags.SOUL_BIND_ON_USE), is(true));
        assertThat(entity.getFlags().contains(ItemFlags.SOUL_BIND_ON_ACQUIRE), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getId(), is(57));
        assertNull(entity.getSecondarySuffixItemId());
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/6CF800ACB923E42F6CA40832C80694C7E0E9CB4D/61005.png"));
        assertThat(entity.getInfusionSlots().isEmpty(), is(true));
        assertThat(entity.getInfixUpgrade().getAttributes().size(), is(2));
        AttributeModifier attributeModifier1 = AttributeModifier.builder()
                                                                .attribute(Attribute.VITALITY)
                                                                .modifier(4)
                                                                .build();
        assertThat(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1), is(true));
        AttributeModifier attributeModifier2 = AttributeModifier.builder()
                                                                .attribute(Attribute.TOUGHNESS)
                                                                .modifier(3)
                                                                .build();
        assertThat(entity.getInfixUpgrade().getAttributes().contains(attributeModifier2), is(true));
        assertNull(entity.getSuffixItemId());

    }

    /**
     * Tests readability of Item 70
     * The object is an Armor (Lvl.0 Basic Medium Coat with defense 25 worth 6 coins with Power(4) stats
     * that's not upgradeable)
     */
    @Test
    void testReadingArmor70() {
        String content = "{\"name\":\"Mighty Studded Coat\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Basic\","
                + "\"vendor_value\":6,\"default_skin\":\"17\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"id\":70,\"icon\":\"https://render.guildwars2.com/"
                + "file/5050F9A0AAA5324F0501B7944876F0FA29DCEB97/61008.png\",\"details\":{\"type\":\"Coat\","
                + "\"weight_class\":\"Medium\",\"defense\":25,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":"
                + "[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}";
        IArmor entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting ArmorJson, got " + item.getClass().getCanonicalName(), item instanceof ArmorJson, is(true));
            entity = ((ArmorJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().size() + " unassigned values found", item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Mighty Studded Coat"));
        assertNull(entity.getDescription());
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.BASIC));
        assertThat(entity.getVendorValue(), is(6));
        assertThat(entity.getDefaultSkin(), is(17));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        assertThat(entity.getFlags().size(), is(1));
        assertThat(entity.getFlags().contains(ItemFlags.NOT_UPGRADEABLE), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getId(), is(70));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/5050F9A0AAA5324F0501B7944876F0FA29DCEB97/61008.png"));
        assertThat(entity.getInfusionSlots().isEmpty(), is(true));
        assertThat(entity.getInfixUpgrade().getAttributes().size(), is(1));
        AttributeModifier attributeModifier1 = AttributeModifier.builder()
                                                                .attribute(Attribute.POWER)
                                                                .modifier(4)
                                                                .build();
        assertThat(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1), is(true));
        assertNull(entity.getSuffixItemId());
        assertThat(entity.getArmorType(), is(ArmorType.Coat));
        assertThat(entity.getWeightClass(), is(WeightClass.Medium));
        assertThat(entity.getDefense(), is(25));
        assertNull(entity.getSecondarySuffixItemId());
    }

    /**
     * Tests the readability of Item 2
     * The object is a Consumable (Lvl. 0 Basic Assassin Pill that can't be sold, is soul bound on aquire and on use
     * and of type Food
     */
    @Test
    void testConsumable2() {
        String content = "{\"name\":\"Assassin Pill\",\"description\":\"Take this pill to participate in the next round of Assassin\","
                + "\"type\":\"Consumable\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,"
                + "\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],"
                + "\"id\":2,"
                + "\"icon\":\"https://render.guildwars2.com/file/ED903431B97968C79AEC7FB21535FC015DBB0BBA/60981.png\","
                + "\"details\":{\"type\":\"Food\"}}";
        IConsumable entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting ConsumableJson, got " + item.getClass().getCanonicalName(), item instanceof ConsumableJson, is(true));
            entity = ((ConsumableJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Assassin Pill"));
        assertThat(entity.getDescription(), is("Take this pill to participate in the next round of Assassin"));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.BASIC));
        assertThat(entity.getVendorValue(), is(0));
        assertThat(entity.getId(), is(2));
        assertThat(entity.getAvailableInActivity(), is(false));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        assertThat(entity.getFlags().size(), is(3));
        assertThat(entity.getFlags().contains(ItemFlags.NO_SELL), is(true));
        assertThat(entity.getFlags().contains(ItemFlags.SOUL_BIND_ON_ACQUIRE), is(true));
        assertThat(entity.getFlags().contains(ItemFlags.SOUL_BIND_ON_USE), is(true));

        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getId(), is(2));
        assertThat(entity.getIcon(), is("https://render.guildwars2.com/file/ED903431B97968C79AEC7FB21535FC015DBB0BBA/60981.png"));
        assertThat(entity.getConsumableType(), is(ConsumableType.FOOD));
    }

    @Test
    void testUpgradeComponent24654() throws IOException {
        String content = IOUtils.toString(getClass().getResource("SuperiorSigilOfDestroyerSlaying.json"));
        ItemJson<?> item = mapper.readValue(content, ItemJson.class);
        assertThat(item, not(nullValue()));
        assertThat(item, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent entity = ((UpgradeComponentJson) item).getEntity();
        assertThat(entity, not(nullValue()));
        assertThat(item.getAdditionalProperties().entrySet(), empty());
        assertThat(entity.getName(), is("Superior Sigil of Destroyer Slaying"));
        assertThat(entity.getDescription(), is("<c=@abilitytype>Element: </c>Pain<br>Double-click to apply to a weapon."));
        assertThat(entity.getLevel(), is(60));
        assertThat(entity.getRarity(), is(Rarity.EXOTIC));
        assertThat(entity.getVendorValue(), is(216));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getId(), is(24654));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/656ABB62BBEC39BC24D002FBE19EFCE953ABEDCD/221036.png"));
        assertThat(entity.getUpgradeComponentType(), is(UpgradeComponentType.SIGIL));
        UpgradeComponentFlag[] upgradeComponentFlags = new UpgradeComponentFlag[]{UpgradeComponentFlag.Axe, UpgradeComponentFlag.LongBow, UpgradeComponentFlag.ShortBow,
                UpgradeComponentFlag.Dagger, UpgradeComponentFlag.Focus, UpgradeComponentFlag.Greatsword,
                UpgradeComponentFlag.Hammer, UpgradeComponentFlag.Harpoon, UpgradeComponentFlag.Mace,
                UpgradeComponentFlag.Pistol, UpgradeComponentFlag.Rifle, UpgradeComponentFlag.Scepter,
                UpgradeComponentFlag.Shield, UpgradeComponentFlag.Speargun, UpgradeComponentFlag.Staff,
                UpgradeComponentFlag.Sword, UpgradeComponentFlag.Torch, UpgradeComponentFlag.Trident,
                UpgradeComponentFlag.Warhorn};
        assertThat(entity.getUpgradeComponentFlags().size(), is(upgradeComponentFlags.length));
        assertThat(entity.getUpgradeComponentFlags(), hasItems(upgradeComponentFlags));
        assertThat(entity.getInfusionUpgradeFlags().isEmpty(), is(true));
        assertNotNull(entity.getInfixUpgrade());
        IBaseBuff buff = entity.getInfixUpgrade().getBuff();
        assertNotNull(buff);
        assertThat(buff, instanceOf(Buff.class));
        assertThat(buff.getSkillId(), is(9343));
        assertThat(buff.getDescription(), containsString("+7% Damage vs. Destroyers"));
        assertThat(buff.getDescription(), containsString("+3% Damage"));
        assertThat(entity.getInfixUpgrade().getAttributes(), empty());
        assertThat(entity.getFlags(), empty());
        assertThat(entity.getSuffix(), is("of Destroyer Slaying"));
    }

    @Test
    void testTrophy8123() {
        String content = "{\"name\":\"Race Track Voucher\",\"description\":"
                + "\"Redeem this for your winnings by talking to Tigg.\",\"type\":\"Trophy\",\"level\":0,"
                + "\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],"
                + "\"restrictions\":[],\"id\":8123,"
                + "\"icon\":\"https://render.guildwars2.com/file/0FF3F1E574DCDEFA2CC60E04B22BF5291273EDC3/62856.png\"}";
        ITrophy entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting TrophyJson, got " + item.getClass().getCanonicalName(), item instanceof TrophyJson, is(true));
            entity = ((TrophyJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Race Track Voucher"));
        assertThat(entity.getDescription(), is("Redeem this for your winnings by talking to Tigg."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.EXOTIC));
        assertThat(entity.getVendorValue(), is(50));
        assertThat(entity.getId(), is(8123));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SALVAGE,
                ItemFlags.NO_SELL, ItemFlags.NOT_UPGRADEABLE, ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/0FF3F1E574DCDEFA2CC60E04B22BF5291273EDC3/62856.png"));
    }

    @Test
    void testContainer8468() {
        String content = "{\"name\":\"Zephyrite Rescue Pack\",\"description\":"
                + "\"Double-click to receive the following items: 1 Speed Booster, 1 Zephyrite Color Swatch: Red, "
                + "15 Black Lion Keys, 1 Aviator Cap Skin, 250 Piles of Sand.\",\"type\":\"Container\",\"level\":0,"
                + "\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],"
                + "\"restrictions\":[],\"id\":8468,"
                + "\"icon\":\"https://render.guildwars2.com/file/B80BE438007179E12B18B5EBDFCB1C61E2605DD6/824921.png\","
                + "\"details\":{\"type\":\"Default\"}}";
        IContainer entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting ContainerJson, got " + item.getClass().getCanonicalName(), item instanceof ContainerJson, is(true));
            entity = ((ContainerJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Zephyrite Rescue Pack"));
        assertEquals("Double-click to receive the following items: 1 Speed Booster, 1 Zephyrite Color Swatch: Red, 15 Black Lion Keys, 1 Aviator Cap Skin, 250 Piles of Sand.",
                entity.getDescription());
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.RARE));
        assertThat(entity.getVendorValue(), is(129));
        assertThat(entity.getId(), is(8468));
        assertThat(entity.getAvailableInActivity(), is(false));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_MYSTIC_FORGE,
                ItemFlags.NO_SALVAGE, ItemFlags.NO_SELL, ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/B80BE438007179E12B18B5EBDFCB1C61E2605DD6/824921.png"));
        assertThat(entity.getContainerType(), is(ContainerType.Default));
    }

    @Test
    void testBag8932() {
        String content = "{\"name\":\"Starter Backpack\",\"description\":\"A 20 slot bag for beginning characters.\","
                + "\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,"
                + "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":8932,"
                + "\"icon\":\"https://render.guildwars2.com/file/80E36806385691D4C0910817EF2A6C2006AEE353/61755.png\","
                + "\"details\":{\"no_sell_or_sort\":false,\"size\":20}}";
        IBag entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting BagJson, got " + item.getClass().getCanonicalName(), item instanceof BagJson, is(true));
            entity = ((BagJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Starter Backpack"));
        assertThat(entity.getDescription(), is("A 20 slot bag for beginning characters."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.BASIC));
        assertThat(entity.getVendorValue(), is(11));
        assertThat(entity.getId(), is(8932));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NO_SELL, ItemFlags.SOUL_BIND_ON_ACQUIRE,
                ItemFlags.SOUL_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/80E36806385691D4C0910817EF2A6C2006AEE353/61755.png"));
        assertThat(entity.isNoSellOrSort(), is(false));
        assertThat(entity.getSize(), is(20));
    }

    @Test
    void testCraftingMaterial12128() {
        String content = "{\"name\":\"Omnomberry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\","
                + "\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,"
                + "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],"
                + "\"id\":12128,"
                + "\"icon\":\"https://render.guildwars2.com/file/9C5457B024D9152906D808A53BFF67539BB94FA0/219396.png\"}";
        ICraftingMaterial entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting CraftingMaterialJson, got " + item.getClass().getCanonicalName(), item instanceof CraftingMaterialJson, is(true));
            entity = ((CraftingMaterialJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Omnomberry"));
        assertThat(entity.getDescription(), is("Ingredient"));
        assertThat(entity.getLevel(), is(80));
        assertThat(entity.getRarity(), is(Rarity.BASIC));
        assertThat(entity.getVendorValue(), is(9));
        assertThat(entity.getId(), is(12128));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        assertThat(entity.getFlags().isEmpty(), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/9C5457B024D9152906D808A53BFF67539BB94FA0/219396.png"));
    }

    @Test
    void testTrinket13267() {
        String content = "{\"name\":\"Turquoise Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,"
                + "\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13267,"
                + "\"icon\":\"https://render.guildwars2.com/file/BA77541A56E7F639CCC5A379F4662EA2C55420BE/340120.png\","
                + "\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":"
                + "{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":12}]},\"suffix_item_id\":24465,"
                + "\"secondary_suffix_item_id\":\"\"}}";
        ITrinket entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting TrinketJson, got " + item.getClass().getCanonicalName(), item instanceof TrinketJson, is(true));
            entity = ((TrinketJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Turquoise Copper Amulet"));
        assertThat(entity.getDescription(), is(""));
        assertThat(entity.getLevel(), is(20));
        assertThat(entity.getRarity(), is(Rarity.FINE));
        assertThat(entity.getVendorValue(), is(48));
        assertThat(entity.getId(), is(13267));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.HIDE_SUFFIX);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/BA77541A56E7F639CCC5A379F4662EA2C55420BE/340120.png"));
        assertThat(entity.getTrinketType(), is(TrinketType.Amulet));
        assertThat(entity.getInfusionSlots().isEmpty(), is(true));
        AttributeModifier am = AttributeModifier.builder()
                                                .attribute(Attribute.VITALITY)
                                                .modifier(12)
                                                .build();
        assertNotNull(entity.getInfixUpgrade());
        assertNotNull(entity.getInfixUpgrade().getAttributes());
        assertThat(entity.getInfixUpgrade().getAttributes().size(), is(1));
        assertThat(entity.getInfixUpgrade().getAttributes().contains(am), is(true));
        assertThat(entity.getSuffixItemId(), is(24465));
        assertNull(entity.getSecondarySuffixItemId());
    }

    @Test
    void testTrophy19976() {
        String content = "{\"name\":\"Mystic Coin\","
                + "\"description\":\"Coins are used to create high level weapons at the mystic forge in Lion's Arch. \\n"
                + "Part of Zommoros' favorite trades.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\","
                + "\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":19976,"
                + "\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\"}";
        ITrophy entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting TrophyJson, got " + item.getClass().getCanonicalName(), item instanceof TrophyJson, is(true));
            entity = ((TrophyJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Mystic Coin"));
        assertThat(entity.getDescription(), is("Coins are used to create high level weapons at the mystic forge in Lion's Arch. \nPart of Zommoros' favorite trades."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.RARE));
        assertThat(entity.getVendorValue(), is(50));
        assertThat(entity.getId(), is(19976));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NO_SALVAGE, ItemFlags.NO_SELL);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png"));
    }

    @Test
    void testGizmo19980() {
        String content = "{\"name\":\"Black Lion Chest Key\","
                + "\"description\":\"This key will unlock one Black Lion Chest containing random Gem Store merchandise, "
                + "including some rare items not sold separately.\\n\\n Black Lion Chests can be found randomly on enemies "
                + "or bought from the trading post.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\","
                + "\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],"
                + "\"restrictions\":[],\"id\":19980,"
                + "\"icon\":\"https://render.guildwars2.com/file/207BDD31BC494A07A0A1691705079100066D3F2F/414998.png\","
                + "\"details\":{\"type\":\"ContainerKey\"}}";
        IGizmo entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting GizmoJson, got " + item.getClass().getCanonicalName(), item instanceof GizmoJson, is(true));
            entity = ((GizmoJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Black Lion Chest Key"));
        assertThat(entity.getDescription(), is("This key will unlock one Black Lion Chest containing random Gem Store merchandise, including some rare items not sold separately.\n\n Black Lion Chests can be found randomly on enemies or bought from the trading post."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.FINE));
        assertThat(entity.getVendorValue(), is(0));
        assertThat(entity.getId(), is(19980));
        assertThat(entity.getAvailableInActivity(), is(false));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(true));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SALVAGE, ItemFlags.NO_SELL,
                ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/207BDD31BC494A07A0A1691705079100066D3F2F/414998.png"));
        assertThat(entity.getGizmoType(), is(GizmoType.ContainerKey));
    }

    @Test
    void testTool19986() {
        String content = "{\"name\":\"Black Lion Salvage Kit\","
                + "\"description\":\"Double-click then select an item in your inventory to salvage for crafting materials. "
                + "100% chance of recovering upgrades. 50% chance to get rarer materials.\",\"type\":\"Tool\","
                + "\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,"
                + "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],"
                + "\"restrictions\":[],\"id\":19986,"
                + "\"icon\":\"https://render.guildwars2.com/file/2204EE5D7B1F7BEE9261CBAE3BF1DB5B027EE607/66551.png\","
                + "\"details\":{\"type\":\"Salvage\",\"charges\":25}}";
        ITool entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting ToolJson, got " + item.getClass().getCanonicalName(), item instanceof ToolJson, is(true));
            entity = ((ToolJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Black Lion Salvage Kit"));
        assertThat(entity.getDescription(), is("Double-click then select an item in your inventory to salvage for crafting materials. 100% chance of recovering upgrades. 50% chance to get rarer materials."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.EXOTIC));
        assertThat(entity.getVendorValue(), is(0));
        assertThat(entity.getId(), is(19986));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(true));
        assertThat(entity.getAvailableInPvPLobby(), is(true));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SALVAGE, ItemFlags.NO_SELL,
                ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/2204EE5D7B1F7BEE9261CBAE3BF1DB5B027EE607/66551.png"));
        assertThat(entity.getToolType(), is(ToolType.Salvage));
        assertThat(entity.getCharges(), is(25));
    }

    @Test
    void testMiniPet20117() {
        String content = "{\"name\":\"Mini Bandit Bruiser\","
                + "\"description\":\"Double-click to summon this miniature to follow you around. "
                + "Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\","
                + "\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],"
                + "\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20117,"
                + "\"icon\":\"https://render.guildwars2.com/file/D3F3C5BA926B0990FC30C0AAD37A3D57190B0B08/66056.png\"}";
        IMiniPet entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting MiniPetJson, got " + item.getClass().getCanonicalName(), item instanceof MiniPetJson, is(true));
            entity = ((MiniPetJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Mini Bandit Bruiser"));
        assertThat(entity.getDescription(), is("Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.MASTERWORK));
        assertThat(entity.getVendorValue(), is(100));
        assertThat(entity.getId(), is(20117));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(true));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NO_SELL);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/D3F3C5BA926B0990FC30C0AAD37A3D57190B0B08/66056.png"));
    }

    @Test
    void testContainer20313() {
        String content = "{\"name\":\"Black Lion Chest (Unlocked)\","
                + "\"description\":\"Contains a random booster plus two more random items from the Black Lion Trading "
                + "Company warehouse.\\nThese may include weapon tickets redeemable for unique skins and other rare items "
                + "not available anywhere else.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\","
                + "\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],"
                + "\"restrictions\":[],\"id\":20313,"
                + "\"icon\":\"https://render.guildwars2.com/file/48E4CEEAEEF8F3419A63D4F6295AB77136B86656/711974.png\","
                + "\"details\":{\"type\":\"OpenUI\"}}";
        IContainer entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting ContainerJson, got " + item.getClass().getCanonicalName(), item instanceof ContainerJson, is(true));
            entity = ((ContainerJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Black Lion Chest (Unlocked)"));
        assertEquals("Contains a random booster plus two more random items from the Black Lion Trading Company warehouse.\nThese may include weapon tickets redeemable for unique skins and other rare items not available anywhere else.",
                entity.getDescription());
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.FINE));
        assertThat(entity.getVendorValue(), is(0));
        assertThat(entity.getId(), is(20313));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(true));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SELL,
                ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/48E4CEEAEEF8F3419A63D4F6295AB77136B86656/711974.png"));
        assertThat(entity.getContainerType(), is(ContainerType.OpenUI));
    }

    @Test
    void testGathering20324() {
        String content = "{\"name\":\"Black Lion Harvesting Sickle\","
                + "\"description\":\"Extremely efficient at gathering resources and uncovering rare components.\","
                + "\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2385,"
                + "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20324,"
                + "\"icon\":\"https://render.guildwars2.com/file/BD0DC17564A9BC9B2354EAB2122F086DBF699D15/526356.png\","
                + "\"details\":{\"type\":\"Foraging\"}}";
        IGathering entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting GatheringJson, got " + item.getClass().getCanonicalName(), item instanceof GatheringJson, is(true));
            entity = ((GatheringJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Black Lion Harvesting Sickle"));
        assertThat(entity.getDescription(), is("Extremely efficient at gathering resources and uncovering rare components."));
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.RARE));
        assertThat(entity.getDefaultSkin(), is(2385));
        assertThat(entity.getVendorValue(), is(0));
        assertThat(entity.getId(), is(20324));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SELL,
                ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        assertThat(entity.getRestrictions().isEmpty(), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/BD0DC17564A9BC9B2354EAB2122F086DBF699D15/526356.png"));
        assertThat(entity.getGatheringType(), is(GatheringType.Foraging));
    }

    @Test
    void testContainer54813() {
        String content = "{\"name\":\"Francisca\","
                + "\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your "
                + "wishes. Double-click to choose what form it should take.\",\"type\":\"Container\","
                + "\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,"
                + "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],"
                + "\"restrictions\":[\"Ranger\"],\"id\":54813,"
                + "\"icon\":\"https://render.guildwars2.com/file/1B9503F466E464B34620340FEC65CFE7BBC69231/534278.png\","
                + "\"details\":{\"type\":\"Default\"}}";
        IContainer entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting ContainerJson, got " + item.getClass().getCanonicalName(), item instanceof ContainerJson, is(true));
            entity = ((ContainerJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Francisca"));
        assertEquals("A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.",
                entity.getDescription());
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.MASTERWORK));
        assertThat(entity.getVendorValue(), is(0));
        assertThat(entity.getId(), is(54813));
        assertThat(entity.getAvailableInActivity(), is(true));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(false));
        assertThat(entity.getAvailableInPvPLobby(), is(false));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SELL, ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        List<RestrictionType> restrictions = Arrays.asList(RestrictionType.RANGER);
        assertThat(entity.getRestrictions().size(), is(restrictions.size()));
        assertThat(restrictions.containsAll(entity.getRestrictions()), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/1B9503F466E464B34620340FEC65CFE7BBC69231/534278.png"));
        assertThat(entity.getContainerType(), is(ContainerType.Default));
    }

    @Test
    void testTrait65841() {
        String content = "{\"name\":\"Trait Guide [Prismatic Understanding]\",\"type\":\"Trait\",\"level\":0,"
                + "\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],"
                + "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[\"Mesmer\"],"
                + "\"id\":65841,"
                + "\"icon\":\"https://render.guildwars2.com/file/2DFB4EDF0408A8604100BB6A510D215CE637B03C/780409.png\"}";
        ITrait entity = null;
        try {
            ItemJson<?> item = mapper.readValue(content, ItemJson.class);
            assertNotNull(item);
            assertThat("Expecting TraitJson, got " + item.getClass().getCanonicalName(), item instanceof TraitJson, is(true));
            entity = ((TraitJson) item).getEntity();
            assertNotNull(entity);
            assertThat(item.getAdditionalProperties().isEmpty(), is(true));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertThat(entity.getName(), is("Trait Guide [Prismatic Understanding]"));
        assertNull(entity.getDescription());
        assertThat(entity.getLevel(), is(0));
        assertThat(entity.getRarity(), is(Rarity.RARE));
        assertThat(entity.getVendorValue(), is(0));
        assertThat(entity.getId(), is(65841));
        assertThat(entity.getAvailableInActivity(), is(false));
        assertThat(entity.getAvailableInDungeon(), is(true));
        assertThat(entity.getAvailableInPvE(), is(true));
        assertThat(entity.getAvailableInWvW(), is(true));
        assertThat(entity.getAvailableInPvP(), is(true));
        assertThat(entity.getAvailableInPvPLobby(), is(true));
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NO_SELL, ItemFlags.ACCOUNT_BOUND, ItemFlags.NO_SALVAGE,
                ItemFlags.ACCOUNT_BIND_ON_USE);
        assertThat(entity.getFlags().size(), is(flags.size()));
        assertThat(flags.containsAll(entity.getFlags()), is(true));
        List<RestrictionType> restrictions = List.of(RestrictionType.MESMER);
        assertThat(entity.getRestrictions().size(), is(restrictions.size()));
        assertThat(restrictions.containsAll(entity.getRestrictions()), is(true));
        assertThat(entity.getIconSignature(), is("https://render.guildwars2.com/file/2DFB4EDF0408A8604100BB6A510D215CE637B03C/780409.png"));
    }

    @Test
    void testStrongBackBraceForAttributeAdjustment() throws IOException {
        URL resource = getClass().getResource("56.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(BackItemJson.class));
        IBackItem item = ((BackItemJson) value).getEntity();
        assertThat(item.getName(), is("Strong Back Brace"));
        assertThat(item.getAttributeAdjustment(), is(13.585d));
    }

    @Test
    void testShirtForAttributeAdjustment() throws IOException {
        URL resource = getClass().getResource("62.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ArmorJson.class));
        IArmor item = ((ArmorJson) value).getEntity();
        assertThat(item.getName(), is("Shirt"));
        assertThat(item.getAttributeAdjustment(), is(8.775d));
    }

    @Test
    void testSeerCoatOfRageForStatChoices() throws IOException {
        URL resource = getClass().getResource("122.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ArmorJson.class));
        IArmor item = ((ArmorJson) value).getEntity();
        assertThat(item.getName(), is("Seer Coat of Rage"));
        assertThat(item.getStatChoices(), contains(161, 154, 158));
    }

    @Test
    void testCraftingBoosterForDescription() throws IOException {
        URL resource = getClass().getResource("8439.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Crafting Booster"));
        assertThat(item.getDescription(), is("+50% chance of crafting critical experience gain."));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testFlaskOfOozeSpiritsForBulkConsume() throws IOException {
        URL resource = getClass().getResource("8495.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getFlags(), contains(ItemFlags.BULK_CONSUME));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testTurquoiseCopperAmuletForAttributeAdjustment() throws IOException {
        URL resource = getClass().getResource("13267.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(TrinketJson.class));
        ITrinket item = ((TrinketJson) value).getEntity();
        assertThat(item.getName(), is("Turquoise Copper Amulet"));
        assertThat(item.getAttributeAdjustment(), is(42.112d));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testSunstoneSilverPendantForStatChoices() throws IOException {
        URL resource = getClass().getResource("13274.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(TrinketJson.class));
        ITrinket item = ((TrinketJson) value).getEntity();
        assertThat(item.getName(), is("Sunstone Silver Pendant"));
        assertThat(item.getStatChoices(), containsInAnyOrder(142, 144, 145, 146, 149, 152, 755));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testBelindasGreatswordSkinForSkins() throws IOException {
        URL resource = getClass().getResource("8466.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Belinda's Greatsword Skin"));
        assertThat(item.getSkins(), containsInAnyOrder(5586));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testPrimordusStaffForStatChoices() throws IOException {
        URL resource = getClass().getResource("13585.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(WeaponJson.class));
        IWeapon item = ((WeaponJson) value).getEntity();
        assertThat(item.getName(), is("Primordus Staff"));
        assertThat(item.getStatChoices(), containsInAnyOrder(154, 158, 161));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testCarrionPrimordusLongbowForLongBow() throws IOException {
        URL resource = getClass().getResource("13632.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(WeaponJson.class));
        IWeapon item = ((WeaponJson) value).getEntity();
        assertThat(item.getName(), is("Carrion Primordus Longbow"));
        assertThat(item.getWeaponType(), is(WeaponType.LONG_BOW));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testCarrionPrimordusGreatswordForGreatSword() throws IOException {
        URL resource = getClass().getResource("13695.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(WeaponJson.class));
        IWeapon item = ((WeaponJson) value).getEntity();
        assertThat(item.getName(), is("Carrion Primordus Greatsword"));
        assertThat(item.getWeaponType(), is(WeaponType.GREAT_SWORD));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testMiniBanditBruiserForMiniPet() throws IOException {
        URL resource = getClass().getResource("20117.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(MiniPetJson.class));
        IMiniPet item = ((MiniPetJson) value).getEntity();
        assertThat(item.getName(), is("Mini Bandit Bruiser"));
        assertThat(item.getMiniPet(), is(6));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testSigilOfLifeForAttributeAdjustment() throws IOException {
        URL resource = getClass().getResource("21133.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent item = ((UpgradeComponentJson) value).getEntity();
        assertThat(item.getName(), is("Sigil of Life"));
        assertThat(item.getAttributeAdjustment(), is(0d));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testSilverDoubloonForBoonDuration() throws IOException {
        URL resource = getClass().getResource("24502.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent item = ((UpgradeComponentJson) value).getEntity();
        assertThat(item.getName(), is("Silver Doubloon"));
        assertThat(item.getInfixUpgrade(), notNullValue());
        Set<Attribute> attributes = item.getInfixUpgrade().getAttributes().stream()
                                        .map(IBaseAttributeModifier::getAttribute)
                                        .collect(Collectors.toSet());
        assertThat(attributes, contains(Attribute.BOON_DURATION));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testMinorSigilOfStrengthForNecromancerRestriction() throws IOException {
        URL resource = getClass().getResource("24564.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent item = ((UpgradeComponentJson) value).getEntity();
        assertThat(item.getName(), is("Minor Sigil of Strength"));
        assertThat(item.getRestrictions(), contains(RestrictionType.NECROMANCER));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testFrostfangForInfusionTypeInfusion() throws IOException {
        URL resource = getClass().getResource("30684.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(WeaponJson.class));
        IWeapon item = ((WeaponJson) value).getEntity();
        assertThat(item.getName(), is("Frostfang"));
        assertThat(item.getInfusionSlots(), contains(InfusionSlotType.INFUSION));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testGhostlySpineguardForStatChoices() throws IOException {
        URL resource = getClass().getResource("36683.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(BackItemJson.class));
        IBackItem item = ((BackItemJson) value).getEntity();
        assertThat(item.getName(), is("Ghostly Spineguard"));
        assertThat(item.getStatChoices(), containsInAnyOrder(142, 144, 145, 146, 149, 152, 755));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testQuiverOfAThousandArrowsForUpgradePaths() throws IOException {
        URL resource = getClass().getResource("37000.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(BackItemJson.class));
        IBackItem item = ((BackItemJson) value).getEntity();
        assertThat(item.getName(), is("Quiver of a Thousand Arrows"));
        assertThat(item.getUpgradesInto(), hasSize(1));
        assertThat(item.getUpgradesInto(), containsInAnyOrder(UpgradePath.builder()
                                                                         .upgrade(UpgradeType.INFUSTION)
                                                                         .itemId(49365)
                                                                         .build()));
        assertThat(item.getUpgradesFrom(), empty());
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testRoyalSignetOfDoricInfusedForInfusionSlots() throws IOException {
        URL resource = getClass().getResource("37098.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(TrinketJson.class));
        ITrinket item = ((TrinketJson) value).getEntity();
        assertThat(item.getName(), is("Royal Signet of Doric (Infused)"));
        assertThat(item.getInfusionSlots(), hasSize(2));
        assertThat(item.getInfusionSlots(), containsInAnyOrder(
                InfusionSlot.builder()
                            .flag(InfusionSlotType.INFUSION)
                            .build(),
                InfusionSlot.builder()
                            .flag(InfusionSlotType.INFUSION)
                            .item(49428)
                            .build()
        ));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testHealingPlusSevenAgonyInfusionForUpgradeFlagInfusion() throws IOException {
        URL resource = getClass().getResource("37123.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent item = ((UpgradeComponentJson) value).getEntity();
        assertThat(item.getName(), is("Healing +7 Agony Infusion"));
        assertThat(item.getInfusionUpgradeFlags(), containsInAnyOrder(InfusionUpgradeFlag.INFUSION));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testHealingPlusSevenAgonyInfusionForAgonyResistanceAttribute() throws IOException {
        URL resource = getClass().getResource("37123.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent item = ((UpgradeComponentJson) value).getEntity();
        assertThat(item.getName(), is("Healing +7 Agony Infusion"));
        assertThat(item.getInfixUpgrade(), notNullValue());
        assertThat(item.getInfixUpgrade().getAttributes(), containsInAnyOrder(
                AttributeModifier.builder()
                                 .attribute(Attribute.HEALING)
                                 .modifier(5)
                                 .build(),
                AttributeModifier.builder()
                                 .attribute(Attribute.AGONY_RESISTANCE)
                                 .modifier(7)
                                 .build()));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testRidingBroomForToyTwoHanded() throws IOException {
        URL resource = getClass().getResource("39134.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(WeaponJson.class));
        IWeapon item = ((WeaponJson) value).getEntity();
        assertThat(item.getName(), is("Riding Broom"));
        assertThat(item.getWeaponType(), is(WeaponType.TWO_HANDED_TOY));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testThackerayFamilyCrestForEnrichmentInfusion() throws IOException {
        URL resource = getClass().getResource("39264.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(TrinketJson.class));
        ITrinket item = ((TrinketJson) value).getEntity();
        assertThat(item.getName(), is("Thackeray Family Crest"));
        assertThat(item.getInfusionSlots(), containsInAnyOrder(InfusionSlot.builder()
                                                                           .flag(InfusionSlotType.ENRICHMENT)
                                                                           .build()));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testExperiencedEnrichmentForEnrichmentInfusion() throws IOException {
        URL resource = getClass().getResource("39330.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(UpgradeComponentJson.class));
        IUpgradeComponent item = ((UpgradeComponentJson) value).getEntity();
        assertThat(item.getName(), is("Experienced Enrichment"));
        assertThat(item.getInfusionUpgradeFlags(), containsInAnyOrder(InfusionUpgradeFlag.ENRICHMENT));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testGoldenFortuneScrapForVendor() throws IOException {
        URL resource = getClass().getResource("43926.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(GizmoJson.class));
        IGizmo item = ((GizmoJson) value).getEntity();
        assertThat(item.getName(), is("Golden Fortune Scrap"));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testKossOnKossInfusedForInfusedFlag() throws IOException {
        URL resource = getClass().getResource("49362.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(BackItemJson.class));
        IBackItem item = ((BackItemJson) value).getEntity();
        assertThat(item.getName(), is("Koss on Koss (Infused)"));
        assertThat(item.getFlags(), containsInAnyOrder(ItemFlags.HIDE_SUFFIX, ItemFlags.ACCOUNT_BOUND,
                ItemFlags.NO_SELL, ItemFlags.NOT_UPGRADEABLE, ItemFlags.UNIQUE, ItemFlags.ACCOUNT_BIND_ON_USE,
                ItemFlags.INFUSED));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testPirateCaptainsOutfitForOutfitUnlock() throws IOException {
        URL resource = getClass().getResource("64754.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Pirate Captain's Outfit"));
        assertThat(item.getUnlockType(), is(ConsumableUnlockType.OUTFIT));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testHeartOfThornsGliderForGliderSkinUnlock() throws IOException {
        URL resource = getClass().getResource("67054.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Heart of Thorns Glider"));
        assertThat(item.getUnlockType(), is(ConsumableUnlockType.GLIDER_SKIN));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testSharedInventorySlotForSharedSlotUnlock() throws IOException {
        URL resource = getClass().getResource("67071.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Shared Inventory Slot"));
        assertThat(item.getUnlockType(), is(ConsumableUnlockType.SHARED_SLOT));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testTeleportToFriendForTeleportToFriendConsumableType() throws IOException {
        URL resource = getClass().getResource("67280.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Teleport to Friend"));
        assertThat(item.getConsumableType(), is(ConsumableType.TELEPORT_TO_FRIEND));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void tesNikaForChampionUnlock() throws IOException {
        URL resource = getClass().getResource("70076.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Nika"));
        assertThat(item.getUnlockType(), is(ConsumableUnlockType.CHAMPION));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testAttunedRuriksRoyalSignetRingForAttunedFlag() throws IOException {
        URL resource = getClass().getResource("70487.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(TrinketJson.class));
        ITrinket item = ((TrinketJson) value).getEntity();
        assertThat(item.getName(), is("Attuned Rurik's Royal Signet Ring"));
        assertThat(item.getFlags(), containsInAnyOrder(ItemFlags.HIDE_SUFFIX, ItemFlags.ACCOUNT_BOUND,
                ItemFlags.NOT_UPGRADEABLE, ItemFlags.UNIQUE, ItemFlags.ACCOUNT_BIND_ON_USE, ItemFlags.ATTUNED));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

    @Test
    void testGreenTreeForGuildUpgrade() throws IOException {
        URL resource = getClass().getResource("70526.json");

        ItemJson<?> value = mapper.readValue(resource, ItemJson.class);

        assertThat(value, instanceOf(ConsumableJson.class));
        IConsumable item = ((ConsumableJson) value).getEntity();
        assertThat(item.getName(), is("Green Tree"));
        assertThat(item.getGuildUpgradeId(), is(371));
        assertThat(value.getAdditionalProperties().entrySet(), empty());
    }

}
