package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0152 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem35517() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Hearty Student Armor (Master)\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35517,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35518() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Hearty Masquerade Armor (Rare)\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35518,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35519() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Acolyte Armor\",\"description\":\"Double-click to unpack a full set of level 45 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35519,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35520() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Acolyte Armor (Master)\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35520,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35521() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Masquerade Armor (Rare)\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35521,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35522() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Knight's Winged Armor\",\"description\":\"Double-click to unpack a full set of level 55 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35522,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35523() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Knight's Winged Armor (Master)\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35523,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Knight's Masquerade Armor (Rare)\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35524,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35525() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Rejuvenating Outlaw Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35525,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35526() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Hearty Outlaw Armor (Master)\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35526,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35527() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Hearty Noble Armor (Rare)\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35527,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35528() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Leather Armor\",\"description\":\"Double-click to unpack a full set of level 45 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35528,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35529() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Leather Armor (Master)\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35529,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35530() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Noble Armor (Rare)\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35530,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Knight's Rascal Armor\",\"description\":\"Double-click to unpack a full set of level 55 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35531,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35532() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Knight's Rascal Armor (Master)\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35532,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35533() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Knight's Noble Armor (Rare)\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":35533,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35728() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Forge Conduit\",\"description\":\"Double click to open the mystic forge.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":35728,\"icon\":\"https://render.guildwars2.com/file/E4119A622C4ED440B20161BF047ECA0692DE4CBC/486249.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35730() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Casing\",\"description\":\" Used at the mystic forge in Lion's Arch.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":35730,\"icon\":\"https://render.guildwars2.com/file/7979F8D549A605BF6E0DAF0B1D61CA1BE4596AB9/486251.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35731() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Core\",\"description\":\" Used at the mystic forge in Lion's Arch.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":35731,\"icon\":\"https://render.guildwars2.com/file/361FBDD0F7A729A9F6AE02516C9545777942C253/486252.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35732() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Tube\",\"description\":\" Used at the mystic forge in Lion's Arch.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":35732,\"icon\":\"https://render.guildwars2.com/file/0B0A3AFB54084BD72B401F0DDC50A9A551C3E820/486253.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35733() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Essence\",\"description\":\" Used at the mystic forge in Lion's Arch.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":35733,\"icon\":\"https://render.guildwars2.com/file/0B52F7E5AF0409C27AC7D45E77D445FCBAF6075B/486254.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35734() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Nexus\",\"description\":\" Used at the mystic forge in Lion's Arch.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":35734,\"icon\":\"https://render.guildwars2.com/file/5C9415B61AF3B20E08674A794D9D067F19C74439/486255.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35735() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Frame\",\"description\":\" Used at the mystic forge in Lion's Arch.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"NotUpgradeable\"],\"restrictions\":[],\"id\":35735,\"icon\":\"https://render.guildwars2.com/file/6CB10641C2B7FB0568D5239633CD5AAC9CE194E3/486256.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem35736() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Jewel Silver\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":1000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NotUpgradeable\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":35736,\"icon\":\"https://render.guildwars2.com/file/52BCA76299466FD5CD94CAD46FDF051304C71245/67017.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}