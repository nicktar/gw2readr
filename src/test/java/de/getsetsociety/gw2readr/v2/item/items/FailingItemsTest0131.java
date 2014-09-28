package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0131 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24319() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glacial Core\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24319,\"icon\":\"https://render.guildwars2.com/file/7C5BF3B99647E2AB0E0F6C18B60CD5743D21BADC/66970.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24320() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glacial Lodestone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":24320,\"icon\":\"https://render.guildwars2.com/file/E6FE2939F9BE1E03B4CD32B8492D3EDC407C0F75/66971.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24321() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Destroyer Sliver\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24321,\"icon\":\"https://render.guildwars2.com/file/5CBA53FEA2210EC074E33D650D6E3FDCCB252B2C/66972.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24322() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Destroyer Fragment\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24322,\"icon\":\"https://render.guildwars2.com/file/EF65D6D16101C608709619BAE2045E00511E7CD5/66973.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Destroyer Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24323,\"icon\":\"https://render.guildwars2.com/file/51F010BBE69639210416F8E436C00177670C5847/66974.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24324() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Destroyer Core\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24324,\"icon\":\"https://render.guildwars2.com/file/D59CDF80A1C9C061ED729C78BAA5980DAC75BE4C/66975.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24325() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Destroyer Lodestone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":24325,\"icon\":\"https://render.guildwars2.com/file/77BE2565DD345ADFEF3850A5B647FE50C144AAF8/66976.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24326() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystal Sliver\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24326,\"icon\":\"https://render.guildwars2.com/file/044EFF43FF7DF27C0C542AAA4E064E0F533E782E/66977.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24327() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystal Fragment\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24327,\"icon\":\"https://render.guildwars2.com/file/43D43127072CF33D58B25E2FCC940435EB3D4548/66978.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24328() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystal Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24328,\"icon\":\"https://render.guildwars2.com/file/2EDD405D1DF17EB01192982A3F9CF59090D7A617/65590.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24329() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystal Core\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24329,\"icon\":\"https://render.guildwars2.com/file/D75C7D66B6589636E00AA45B20EB061305B5C52B/66979.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24330() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crystal Lodestone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":24330,\"icon\":\"https://render.guildwars2.com/file/C10553036839522AAB54425B431E391F76D878AC/66980.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24331() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Soiled Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24331,\"icon\":\"https://render.guildwars2.com/file/40AD50C4C1AABB0562B9F1E6051267F05A344840/434538.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24332() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Foul Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24332,\"icon\":\"https://render.guildwars2.com/file/9B0C2B9E7178D4A2010696936066073A0461AF3A/63277.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24333() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Filthy Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24333,\"icon\":\"https://render.guildwars2.com/file/A87CFBBE42926064C2F6399F68BE06B23FA53109/63275.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24334() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Vile Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24334,\"icon\":\"https://render.guildwars2.com/file/B290F544094427265D049A21425C92F4A324C392/66981.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24335() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Putrid Essence\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24335,\"icon\":\"https://render.guildwars2.com/file/CBC82EA8093AE4F60F0752B179F7CD02DDF5CB33/223781.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24336() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Corrupted Sliver\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24336,\"icon\":\"https://render.guildwars2.com/file/19AA3BEF089B72F09D80E43A210FF4FCF9369345/66982.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24337() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Corrupted Fragment\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24337,\"icon\":\"https://render.guildwars2.com/file/7A492E71E419ECFD94D8A2B1400A09A0C20373CE/66983.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24338() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Corrupted Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24338,\"icon\":\"https://render.guildwars2.com/file/08AF9D2A7576FA66BEC322A859ADA0DFF7BA4B0E/66984.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24339() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Corrupted Core\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24339,\"icon\":\"https://render.guildwars2.com/file/31E8DC797FD7369A2824AAB76D414350FFABED95/66985.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24340() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Corrupted Lodestone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":24340,\"icon\":\"https://render.guildwars2.com/file/CCC31822DA0D7D930D067B17C958A5CB1F4A24A5/66986.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24341() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Bone\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24341,\"icon\":\"https://render.guildwars2.com/file/13F077BA5D5C6324CFCB0A2E39050F24A441190B/66987.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bone Chip\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24342,\"icon\":\"https://render.guildwars2.com/file/0A5B3C374C1A7F07BA3D06162857D1599B01F91D/66988.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24343() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bone Shard\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24343,\"icon\":\"https://render.guildwars2.com/file/E2EC91117128DC5BC0B0FA0267EBBC2429B3556F/66989.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}