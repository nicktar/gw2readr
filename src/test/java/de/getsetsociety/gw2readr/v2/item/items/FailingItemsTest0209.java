package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0209 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem46694() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soros' Assassin Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46694,\"icon\":\"https://render.guildwars2.com/file/2F03245F922749A2F8CF08C19133232F5FB95F45/674814.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46695() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zojja's Berserker Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46695,\"icon\":\"https://render.guildwars2.com/file/F6A599BF0BCF4F77A3C57BF81F3C0CD1513A06BC/674815.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46696() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stonecleaver's Valkyrie Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46696,\"icon\":\"https://render.guildwars2.com/file/DD4C12296AB2F2CF5EA7ECF7472F6C1BA6F96A31/674816.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46697() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coalforge's Rampager Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46697,\"icon\":\"https://render.guildwars2.com/file/77570547DDD811B208C60291ED7ED799CD5D0076/674817.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46698() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beigarth's Knight Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46698,\"icon\":\"https://render.guildwars2.com/file/AA60699567E2E9D137A49207B64CF4DE3761C1A0/674818.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46699() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup Celestial Inscription\",\"description\":\"Used in the crafting of weapons with a bonus to all stats.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46699,\"icon\":\"https://render.guildwars2.com/file/A1B9624AAB0123D7FCBA4C0A5E9CAADF6C30FCBB/674819.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46700() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tonn's Sentinel Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46700,\"icon\":\"https://render.guildwars2.com/file/66CD5263350F03C19060F72705144F9BE63995B9/674820.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46701() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zintl Shaman Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Vitality, +Condition Damage, and +Healing.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46701,\"icon\":\"https://render.guildwars2.com/file/09ADBF72B6B51F0758DE2F685E592BB375B9E7A7/674821.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46702() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Angchu Cavalier Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Toughness, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46702,\"icon\":\"https://render.guildwars2.com/file/E658040AED957DA00C45B05B63699AA909ED0A4D/674822.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46703() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grizzlemouth's Rabid Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Condition Damage, +Precision, and Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46703,\"icon\":\"https://render.guildwars2.com/file/F32DA603132BBCC0329E450B7E7020654452BBD4/674823.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46704() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hronk's Magi Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Healing, +Precision, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46704,\"icon\":\"https://render.guildwars2.com/file/53DD3296AAEFC8C0C99BD5BA9533990796D8F7A7/674824.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46705() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chorben's Soldier Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Power, +Vitality, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46705,\"icon\":\"https://render.guildwars2.com/file/B70F7837D041209F1EA9E86A04034AE4DAE3DBFD/674825.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46706() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leftpaw's Settler Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Toughness, +Healing, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46706,\"icon\":\"https://render.guildwars2.com/file/AA491E280E90537D1169F2114AFE7C79EE49BEA8/674826.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46707() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mathilde's Dire Inscription\",\"description\":\"Used in the crafting of Ascended weapons with +Condition Damage, +Vitality, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46707,\"icon\":\"https://render.guildwars2.com/file/39460E615F037D1CCB37E35F954AE3FF6A995543/674827.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46708() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shaman's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Vitality, +Condition Damage, and +Healing.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46708,\"icon\":\"https://render.guildwars2.com/file/6299D476551B3ADA132B211DF6EFF3C3C8CBB97E/699284.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46709() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cavalier's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46709,\"icon\":\"https://render.guildwars2.com/file/C507B7123817449BAC19C2A9ECB0A5A303092B99/699285.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46710() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rabid Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Precision, and Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46710,\"icon\":\"https://render.guildwars2.com/file/9C594080BB9C6B4536FADEF21DFC2006F44A455D/699286.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46711() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magi's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Healing, +Precision, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46711,\"icon\":\"https://render.guildwars2.com/file/051501594FD0080C5D159CCBB320AA76E54BAA92/699287.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46712() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soldier's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Vitality, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46712,\"icon\":\"https://render.guildwars2.com/file/A431EE55EB47093FFEB0DD35920465F3B770BBF8/699288.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46713() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Settler's Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Healing, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46713,\"icon\":\"https://render.guildwars2.com/file/A2F2A3CE57CC6B20B99A91BB3B20D97CEB19562A/699289.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46714() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup Celestial Insignia\",\"description\":\"Used in the crafting of armor with a bonus to all stats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46714,\"icon\":\"https://render.guildwars2.com/file/925E2AE52A5DB827AD7C260AA2E9277123E22314/699290.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46715() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Occam's Carrion Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46715,\"icon\":\"https://render.guildwars2.com/file/DDCE0A1C6AD83CE295EBD532C301CBE87144C1A0/699291.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46716() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tateos's Cleric Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46716,\"icon\":\"https://render.guildwars2.com/file/22283D725FA79005CADC6D74CED5C55A5ABFDAA6/699292.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46717() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Veldrunner Apothecary Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Toughness, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46717,\"icon\":\"https://render.guildwars2.com/file/E91BD9162B80A4F00AC60F47165B423753EAAA0C/699293.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46718() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Saphir's Assassin Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46718,\"icon\":\"https://render.guildwars2.com/file/ED54926505E714780CD25750BDF1FFE09B786346/699294.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}