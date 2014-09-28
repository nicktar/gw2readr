package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0004 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9005() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Ravaging Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9005,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9006() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rejuvenating Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9006,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9007() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Honed Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9007,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9008() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Pillaging Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9008,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9009() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Strong Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9009,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Vigorous Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9010,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9011() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Hearty Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9011,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9013() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Knight's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 55 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9013,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9014() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Cleric's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 60 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9014,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9015() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Explorer's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 60 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9015,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9016() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Berserker's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 60 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9016,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9017() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rampager's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 60 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":50,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9017,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9018() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Carrion Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9018,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9019() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Cleric's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9019,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9020() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Explorer's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9020,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9021() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Berserker's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9021,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9022() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Berserker's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9022,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9023() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Valkyrie Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9023,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9024() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Valkyrie Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9024,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9025() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rampager's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9025,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9026() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Rampager's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9026,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9027() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Knight's Reinforced Scale Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9027,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9028() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Knight's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9028,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9030() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Carrion Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9030,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9031() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Cleric's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9031,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}