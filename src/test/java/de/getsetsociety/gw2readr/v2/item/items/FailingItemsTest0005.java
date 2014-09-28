package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0005 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9032() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Explorer's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9032,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9033() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Carrion Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 70 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9033,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9034() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Valkyrie Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 70 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9034,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9035() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Knight's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 70 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9035,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9036() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Cleric's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 75 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":61,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9036,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9037() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Explorer's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 75 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":61,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9037,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9038() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Berserker's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 75 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":61,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9038,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9039() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rampager's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 75 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":61,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9039,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9040() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Carrion Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9040,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9041() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Cleric's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9041,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9042() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Explorer's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9042,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9043() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Carrion Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9043,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9044() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Cleric's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9044,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9045() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Explorer's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9045,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9046() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Berserker's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9046,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9047() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Berserker's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9047,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9048() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Valkyrie Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9048,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9049() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Valkyrie Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9049,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9050() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rampager's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9050,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9051() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rampager's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9051,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9052() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Knight's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9052,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9053() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Knight's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9053,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9054() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Carrion Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9054,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9055() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Cleric's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9055,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9056() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Explorer's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9056,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}