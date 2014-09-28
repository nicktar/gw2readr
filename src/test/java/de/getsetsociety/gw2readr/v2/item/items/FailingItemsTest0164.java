package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0164 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem37779() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magi's Field Guide\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":37779,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37780() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magi's Field Guide\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":37780,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37781() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magi's Field Guide\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":37781,\"icon\":\"https://render.guildwars2.com/file/095B9410F480575B7EAF9CDA9F05163FB8530251/220884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":49},{\"attribute\":\"Precision\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37895() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honorary Consortium Membership Badge\",\"description\":\"<c=@flavor>\\\"Badge does not imply any actual affiliation between owner and the Consortium.\\\"</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":37895,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Karka Shell\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37897,\"icon\":\"https://render.guildwars2.com/file/B8C22597015FAFB42AB9EDE75528C40C0637B73D/511903.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37899() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Karka Shell\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoMysticForge\",\"NoSalvage\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":37899,\"icon\":\"https://render.guildwars2.com/file/2AECB6FCA1CF2349C548EA145C3F46D5A0ED95E8/511904.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26},{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37906() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Passion Flower\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37906,\"icon\":\"https://render.guildwars2.com/file/665E390152EF601A08E8214A9823F0063B9F0133/511905.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15763,\"description\":\"+25 Healing\n+15 Condition Damage\n+15 Toughness\"},\"attributes\":[]},\"suffix\":\"of Passiflora\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Passion Flower\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37907,\"icon\":\"https://render.guildwars2.com/file/A3EF78BAC765FCBFBA41FE95A17839A3AA3AEDC8/511906.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15765,\"description\":\"+14 Healing\n+10 Condition Damage\n+10 Toughness\"},\"attributes\":[]},\"suffix\":\"of Passiflora\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Embellished Brilliant Passion Flower\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37908,\"icon\":\"https://render.guildwars2.com/file/97BD44DB02AB4C4BE073C5B638D121A91A45CB49/511907.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15767,\"description\":\"+21 Healing\n+13 Condition Damage\n+13 Toughness\"},\"attributes\":[]},\"suffix\":\"of Passiflora\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brilliant Passion Flower\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37909,\"icon\":\"https://render.guildwars2.com/file/37E3C5CF30047DF64FE66D58BDE6277608F89B08/511908.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15766,\"description\":\"+18 Healing\n+12 Condition Damage\n+12 Toughness\"},\"attributes\":[]},\"suffix\":\"of Passiflora\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Karka Slaying\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37910,\"icon\":\"https://render.guildwars2.com/file/FB9E624BD2234BB61092250719088015CAFF23DE/340597.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15768,\"description\":\"+3% Damage vs. Karka\"},\"attributes\":[]},\"suffix\":\"of Karka Slaying\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37911() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Karka Slaying\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37911,\"icon\":\"https://render.guildwars2.com/file/B0C43AA5DDA0E6AB4FB5946317D60109FF536E33/340598.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15769,\"description\":\"+5% Damage vs. Karka\"},\"attributes\":[]},\"suffix\":\"of Karka Slaying\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem37912() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Karka Slaying\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":37912,\"icon\":\"https://render.guildwars2.com/file/4DE74A04923D29D03595E42EB10FBC4F06180994/340599.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":15770,\"description\":\"+10% Damage vs. Karka\"},\"attributes\":[]},\"suffix\":\"of Karka Slaying\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Fractal Bag\",\"description\":\"20 Slot\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":189,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\",\"Unique\"],\"restrictions\":[],\"id\":38010,\"icon\":\"https://render.guildwars2.com/file/2CB59328EA6C742169DB0773B9F5A7414892914B/511997.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38011() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Fractal Exotic Equipment Box\",\"description\":\"20 Slot. If possible, weapons and armor of exotic rarity will fill this box before other empty spaces.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":252,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38011,\"icon\":\"https://render.guildwars2.com/file/9749D74BD359AFB7C1CDE047DF7AE54FB4B5AE7A/511998.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38012() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Fractal Rare Equipment Box\",\"description\":\"20 Slot. If possible, weapons and armor of rare rarity will fill this box before other empty spaces.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":189,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38012,\"icon\":\"https://render.guildwars2.com/file/D652EEA6E236A44FDDD309E1D7EB9968C7DF121A/511999.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38013() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"20 Slot Fractal Uncommon Equipment Box\",\"description\":\"20 Slot. If possible, weapons and armor of uncommon rarity will fill this box before other empty spaces.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38013,\"icon\":\"https://render.guildwars2.com/file/6A140921462258A0900EB637075CFBB50F0D502C/512000.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":20}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38014() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Condensed Mists Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":79,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38014,\"icon\":\"https://render.guildwars2.com/file/471602ACD77D69F968156F01F1D872237703C043/512001.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38023() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glob of Coagulated Mists Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":79,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38023,\"icon\":\"https://render.guildwars2.com/file/7159DCB9BA92C064A4E6699B42225EAAC3B31F2B/512006.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38024() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shard of Crystallized Mists Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":79,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38024,\"icon\":\"https://render.guildwars2.com/file/7DB2AB514CB9ACC219457DC1AEAB340BD578644F/512007.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38027() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Karka Chest\",\"description\":\"Double-click to unpack wondrous things.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38027,\"icon\":\"https://render.guildwars2.com/file/D570763C281536AE520476BCB2A0FD2D16479105/511767.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38034() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wintersday Mystery Box\",\"description\":\"Contains up to five personalized Wintersday gifts, plus an additional themed item. Contents include tonics, mortars, and red and green dyes. Chests could also contain new mini pets and rare themed weapon skin tickets.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38034,\"icon\":\"https://render.guildwars2.com/file/513E04DBCAB7779E1F0A4F5A109ED264F8234E0F/526110.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38045() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wintersday Dye Kit\",\"description\":\"Double-click to gain one random red dye color and one random green dye color.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38045,\"icon\":\"https://render.guildwars2.com/file/9F08757ACD3B2347E8F836275B5E20AF3A8033A2/526111.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38046() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Festive Golem\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38046,\"icon\":\"https://render.guildwars2.com/file/6D01F5C40B5F4ED336DA2BFBE43B37E7D2EF06A9/526112.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38047() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Foostivoo the Merry\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38047,\"icon\":\"https://render.guildwars2.com/file/762B0751C86AD418294E1E9FED1CD0BBF90CCF6D/526113.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}