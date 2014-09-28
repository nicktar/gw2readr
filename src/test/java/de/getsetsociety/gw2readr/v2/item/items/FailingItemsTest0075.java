package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0075 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19947() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Steel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19947,\"icon\":\"https://render.guildwars2.com/file/A00630A7CCF96A6723BE0E2E47B01E0D903FA853/434376.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19948() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19948,\"icon\":\"https://render.guildwars2.com/file/05184F2DA1FB297BDAFC05173CD6ABD8FC274120/434377.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19949() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19949,\"icon\":\"https://render.guildwars2.com/file/D35768A16AB813A03019372D95C103F1F4EBDE6B/434378.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19950() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19950,\"icon\":\"https://render.guildwars2.com/file/490994613A6E3461DFCF5C077914DA4CAF00ACFA/434379.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19951() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19951,\"icon\":\"https://render.guildwars2.com/file/25A207507E79CA0A2D7C02C05573AE09384794EC/434380.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19952() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19952,\"icon\":\"https://render.guildwars2.com/file/16AD33EE4B27B07C0F7C08B7C30CC4699FFF7F04/434381.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19953,\"icon\":\"https://render.guildwars2.com/file/1A75DE44D6CC003FCB077BB0F40423A65D4B2877/434382.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19954() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Darksteel Imbued Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19954,\"icon\":\"https://render.guildwars2.com/file/5A96F5F09699683B1BB627DD0C1E913C9326D1BF/434383.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Intricate Wool Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19955,\"icon\":\"https://render.guildwars2.com/file/806C130FA5BBF4C9A7CCAA13AB5F21BAB8609580/434384.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Intricate Wool Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19956,\"icon\":\"https://render.guildwars2.com/file/D70638023E67900D78B0EC043B276B11C5789E1B/434385.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Intricate Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19957,\"icon\":\"https://render.guildwars2.com/file/1F55B370D406EAAD440EA83EDA5C4448057AFC15/434386.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19958() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Intricate Wool Insignia\",\"description\":\"Used in the crafting of armor with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19958,\"icon\":\"https://render.guildwars2.com/file/04CFB24809F9E95A2DFEF10CC6F77B9EF2589FD1/434387.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Intricate Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19959,\"icon\":\"https://render.guildwars2.com/file/73B90B3C2F779E80E5E64FD9029DAFE8A0CC3BB5/434388.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Intricate Wool Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19960,\"icon\":\"https://render.guildwars2.com/file/D0F87A0FADB52B08DE2A03D7A71AF07B64BA49A5/434389.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Intricate Wool Insignia\",\"description\":\"Used in the crafting of armor with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":26,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19961,\"icon\":\"https://render.guildwars2.com/file/F44FAF4B7CA1C7F7B02FE3A293A5BB405C5162BC/434390.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19962() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Intricate Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19962,\"icon\":\"https://render.guildwars2.com/file/3F562234C2523DC32A0C7C324DF05D28030F61DE/434391.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19963() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Intricate Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power and +Power.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19963,\"icon\":\"https://render.guildwars2.com/file/326B5A96C20413CCFF7A61077CD555B5C43D9B01/434392.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19964() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Intricate Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19964,\"icon\":\"https://render.guildwars2.com/file/7509CFE75E299EC34E04CF237D56C9075996A2DB/434393.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19965() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Intricate Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19965,\"icon\":\"https://render.guildwars2.com/file/F6B1012F9958C0F905E2410F284794703E9E3E48/434394.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19966() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Intricate Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19966,\"icon\":\"https://render.guildwars2.com/file/EEE7C1A26AB3DE5E04E2CDF1CFD4F70DACC3901B/434395.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19967() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Intricate Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19967,\"icon\":\"https://render.guildwars2.com/file/67B007A15BDE2A2725290CE3DDC6CE903EB97B48/434396.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19968() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Intricate Cotton Insignia\",\"description\":\"Used in the crafting of armor with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19968,\"icon\":\"https://render.guildwars2.com/file/2A070DC70B240A7EC99BAC593BFB48DC14D635B6/434397.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19969() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19969,\"icon\":\"https://render.guildwars2.com/file/DF6AF1E8416051ACD10A930405CEB4D3283BC4BD/434398.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19970() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19970,\"icon\":\"https://render.guildwars2.com/file/457009AC80CEC07F051815AF6231D2ECECC22603/434399.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19971() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19971,\"icon\":\"https://render.guildwars2.com/file/40726AFB20781F6BBD10386FBB26D5393B486F6B/434400.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}