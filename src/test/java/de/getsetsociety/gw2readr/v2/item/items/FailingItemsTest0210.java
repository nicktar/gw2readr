package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0210 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem46719() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zojja's Berserker Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46719,\"icon\":\"https://render.guildwars2.com/file/133502D7B8B19E3D6942F554A8B5483BE1C7FADF/699295.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46720() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gobrech's Valkyrie Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46720,\"icon\":\"https://render.guildwars2.com/file/1654D0C9592D6D2101E2EF6E5D76CC2E4BA334FA/699296.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46721() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Forgemaster's Rampager Insignia\",\"description\":\"Used in the crafting of armor with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46721,\"icon\":\"https://render.guildwars2.com/file/4F2306D3652554C20FADF90F5692E70C0602BF05/699297.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46722() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beigarth's Knight Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46722,\"icon\":\"https://render.guildwars2.com/file/C8E36FD9747399FFE7FD5817A0CBCDBFBEC0617F/699298.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46723() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wei Qi's Sentinel Insignia\",\"description\":\"Used in the crafting of armor with +Vitality, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46723,\"icon\":\"https://render.guildwars2.com/file/2793F2132F9952AAFDEEB50C09E26BF5B79B0929/699299.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46724() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zintl Shaman Insignia\",\"description\":\"Used in the crafting of armor with +Vitality, +Condition Damage, and +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46724,\"icon\":\"https://render.guildwars2.com/file/45C1050C97D54AB7FB9769C97F910502342DF226/699300.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46725() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Angchu Cavalier Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46725,\"icon\":\"https://render.guildwars2.com/file/79D742D1FCDA751E0346D2ACB7536EF691C9E62D/699301.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46726() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ferratus's Rabid Insignia\",\"description\":\"Used in the crafting of armor with +Condition Damage, +Precision, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46726,\"icon\":\"https://render.guildwars2.com/file/DCD201FAAA41919F7F3B6227DF2E58F2C84D14B3/699302.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46727() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hronk's Magi Insignia\",\"description\":\"Used in the crafting of armor with +Healing Power, +Precision, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46727,\"icon\":\"https://render.guildwars2.com/file/49493472DDB19668F6C1A875801D3A42E8DE5B3A/699303.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46728() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ahamid's Soldier Insignia\",\"description\":\"Used in the crafting of armor with +Power, +Vitality, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46728,\"icon\":\"https://render.guildwars2.com/file/B408274A6225CC0E9EB59DBC5D4A24587A087679/699304.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46729() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Leftpaw's Settler Insignia\",\"description\":\"Used in the crafting of armor with +Toughness, +Healing Power, and +Condition Damage.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46729,\"icon\":\"https://render.guildwars2.com/file/DF0A0AD4C9FE28D77D973A7009CF7A0F3CB94EBA/699305.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46730() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bloodstone Brick\",\"description\":\"Refined from piles of bloodstone dust.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46730,\"icon\":\"https://render.guildwars2.com/file/9C03D6909B0A36EED87538C8D1FFFC27390FDF4E/631479.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46731() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Bloodstone Dust\",\"description\":\"Refine into bloodstone bricks.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46731,\"icon\":\"https://render.guildwars2.com/file/1468C6A946BFF0A42CBD08A70E45F8F05851FED0/631480.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46732() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragonite Ingot\",\"description\":\"Refined from ore.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46732,\"icon\":\"https://render.guildwars2.com/file/DD0CE05EB7F841A99D58A106EE0CDFBF6A96F9FB/631481.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46733() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragonite Ore\",\"description\":\"Refine into dragonite ingots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46733,\"icon\":\"https://render.guildwars2.com/file/D53E69EFB3AFF4C85CC370AA32F1A6A61C03CCE8/631482.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46734() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Empyreal Star\",\"description\":\"Refined from fragments.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46734,\"icon\":\"https://render.guildwars2.com/file/1AF8B122915F042AF6749C0AE4583FA963DADF56/631483.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46735() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Empyreal Fragment\",\"description\":\"Refine into empyreal stars.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46735,\"icon\":\"https://render.guildwars2.com/file/DE4779014F27DE027BDBE761607B220923DB03D5/631484.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46736() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiritwood Plank\",\"description\":\"Refined from soft wood, seasoned wood, hard wood, and elder spirit residue.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46736,\"icon\":\"https://render.guildwars2.com/file/955A9F900BB8AB253C9C91C7F7DF4305A741917C/631485.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46738() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deldrimor Steel Ingot\",\"description\":\"Refined from iron, steel, darksteel, and mithrillium.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46738,\"icon\":\"https://render.guildwars2.com/file/94DCAE59215C0096449906A81F202B0201FBA85B/631486.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46739() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elonian Leather Square\",\"description\":\"Refined from thin leather, coarse leather, rugged leather, and thick elonian cord.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46739,\"icon\":\"https://render.guildwars2.com/file/057F4DB327DB7F46490876E4D9D86E7C1D613C26/631487.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Silk Weaving Thread\",\"description\":\"Used in the weaving of damask.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46740,\"icon\":\"https://render.guildwars2.com/file/45C6FC08BE801CFC31C455A8684A963B51A73759/631488.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bolt of Damask\",\"description\":\"Refined from wool, cotton, linen, and silk weaving thread.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46741,\"icon\":\"https://render.guildwars2.com/file/7E7DA70B0EA3DB78CCB2F4FDA400A9BFEF0B0D6C/631489.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46742() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lump of Mithrillium\",\"description\":\"Used in the refinement of deldrimor steel.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46742,\"icon\":\"https://render.guildwars2.com/file/BAF140ED460135E04101146CC8CE9EFB5698F077/631490.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46744() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glob of Elder Spirit Residue\",\"description\":\"Used in the refinement of spiritwood.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46744,\"icon\":\"https://render.guildwars2.com/file/131F51B9177E2AEB75326901021C42CB3169452D/631492.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46745() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Thick Elonian Cord\",\"description\":\"Used in the refinement of elonian leather.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46745,\"icon\":\"https://render.guildwars2.com/file/643E2343E5B573664DD8010ACBD9B5BD970E305C/631493.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}