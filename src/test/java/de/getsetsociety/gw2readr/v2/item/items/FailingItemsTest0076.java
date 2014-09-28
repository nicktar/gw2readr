package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0076 {

    private static ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testItem19972() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19972,\"icon\":\"https://render.guildwars2.com/file/E14210A49349B2D8DDCCA6043AF329F090DFCDEE/434401.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19973() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19973,\"icon\":\"https://render.guildwars2.com/file/E41231695D2DF8F7D269EB027FF39F0E775A02A3/434402.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19974() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19974,\"icon\":\"https://render.guildwars2.com/file/2E02CBDF2DA8BB2BE8751DE300F2D4DF75E9F9A3/434403.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19975() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19975,\"icon\":\"https://render.guildwars2.com/file/63C51B04C47B20BF4D60D70DB3D1EDCF0CC7C0E8/434404.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19976() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Coin\",\"description\":\"Coins are used to create high level weapons at the mystic forge in Lion's Arch. \\nPart of Zommoros' favorite trades.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":19976,\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19977() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Victory Token\",\"description\":\"Quartermaster Hargrove offers good service rewards in exchange for this symbol of victory.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19977,\"icon\":\"https://render.guildwars2.com/file/0D063CCF079560D06936F32F9AFAA4D595383B1B/434405.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19979() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tournament Ticket\",\"description\":\"Used for tournaments which require an entry fee.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":19979,\"icon\":\"https://render.guildwars2.com/file/D4B2803E51B2BEAB130519F6DACABF069A3B57E8/220546.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19980() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Chest Key\",\"description\":\"This key will unlock one Black Lion Chest containing random Gem Store merchandise, including some rare items not sold separately.\\n\\n Black Lion Chests can be found randomly on enemies or bought from the trading post.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19980,\"icon\":\"https://render.guildwars2.com/file/207BDD31BC494A07A0A1691705079100066D3F2F/414998.png\",\"details\":{\"type\":\"ContainerKey\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19983() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Forge Stone\",\"description\":\"Take this stone to the mystic forge to have Zommoros forge something special for you.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":64,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19983,\"icon\":\"https://render.guildwars2.com/file/033CAC7DB2DE70BF39DA10D061375BA2B9BD6FA9/220548.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19986() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Black Lion Salvage Kit\",\"description\":\"Double-click then select an item in your inventory to salvage for crafting materials. 100% chance of recovering upgrades. 50% chance to get rarer materials.\",\"type\":\"Tool\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19986,\"icon\":\"https://render.guildwars2.com/file/2204EE5D7B1F7BEE9261CBAE3BF1DB5B027EE607/66551.png\",\"details\":{\"type\":\"Salvage\",\"charges\":25}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19992() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Instant Repair Canister\",\"description\":\"Double-click to instantly repair broken or damaged armor.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19992,\"icon\":\"https://render.guildwars2.com/file/0CCB605907DEE64AB9E7090B2FA30AD79341E6EB/66582.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19998() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dye Pack\",\"description\":\"Each dye box contains 7 random dyes (5 common and 2 uncommon or rare). \n\nDyes can be unlocked for unlimited uses to color armor on all characters. Dye bottles can also be recycled in the mystic forge.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19998,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20019() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minis 3-Pack (Set 1)\",\"description\":\"Double-click to receive 3 randomly selected Minis (2 common and 1 uncommon) to add to your collection.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20019,\"icon\":\"https://render.guildwars2.com/file/D1E32ED7F1F962CA4C9525429901A8352A7302A2/66585.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20021() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Booster Multipack\",\"description\":\"Contains boosts to increase karma gained, experience gained by killing enemies, and chance to find magic items. Each lasts one hour. Use all three at once, or each one individually!\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20021,\"icon\":\"https://render.guildwars2.com/file/4BE5D3F8D914CE277E0E46D114033F0E5E476FFA/220572.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20023() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Brown Dye\",\"description\":\"Double-click to identify the exact color.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20023,\"icon\":\"https://render.guildwars2.com/file/165063C7EDC05B0B9404ED56274D55041C7AAB15/340515.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20025() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Green Dye\",\"description\":\"Double-click to identify the exact color.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20025,\"icon\":\"https://render.guildwars2.com/file/B82013E703C56F30E0C92C4F3F9E61D70152F727/340517.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20026() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Orange Dye\",\"description\":\"Double-click to identify the exact color.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20026,\"icon\":\"https://render.guildwars2.com/file/D7191C9FFE42997B91F25E32360FE26805C1BD6A/340518.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20028() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Red Dye\",\"description\":\"Double-click to identify the exact color.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20028,\"icon\":\"https://render.guildwars2.com/file/A22DED7E93B64AB13F3C13C21DBAD813250C735C/340520.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20029() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Yellow Dye\",\"description\":\"Double-click to identify the exact color.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20029,\"icon\":\"https://render.guildwars2.com/file/185107FFBDFB147E3B52FE2634E7B571C19F0BAA/340521.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20117() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Bandit Bruiser\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20117,\"icon\":\"https://render.guildwars2.com/file/D3F3C5BA926B0990FC30C0AAD37A3D57190B0B08/66056.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20118() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Big Nose Ted\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20118,\"icon\":\"https://render.guildwars2.com/file/935BA61948F1762AE3E3A9E207A87E0F02D562CD/66057.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20119() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini River Drake Broodmother\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":500,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20119,\"icon\":\"https://render.guildwars2.com/file/AB04784D9655E00FBC06421F7F41FFE91099F091/66061.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20120() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Wind Rider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20120,\"icon\":\"https://render.guildwars2.com/file/19C2031F2D3309C9DFAAE70F0248F5080535DF69/66062.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20121() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Forest Spider\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20121,\"icon\":\"https://render.guildwars2.com/file/E2A9C0A29FFE9F0307AB5ED448C0ADBEB73ED705/66063.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20122() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Modniir Berserker\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20122,\"icon\":\"https://render.guildwars2.com/file/6AC51D76EBCC5E5ADD1095116A314048290725AE/66065.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}