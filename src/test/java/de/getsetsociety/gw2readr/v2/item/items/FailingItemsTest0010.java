package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0010 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9160() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Healing Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9160,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9161() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Precise Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9161,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9162() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Resilient Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 15 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9162,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9163() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Malign Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9163,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9164() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Healing Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9164,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9165() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Mighty Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9165,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9166() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Precise Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9166,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9167() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Resilient Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9167,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9168() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Vital Embroidered Armor\",\"description\":\"Double-click to unpack a full set of level 20 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9168,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9169() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Ravaging Student Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9169,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9170() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Pillaging Student Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9170,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9171() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Vigorous Student Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9171,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9172() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Student Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9172,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9173() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Strong Student Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9173,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9174() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Hearty Student Armor\",\"description\":\"Double-click to unpack a full set of level 30 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9174,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9175() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Ravaging Student Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9175,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Ravaging Masquerade Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9176,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Rejuvenating Student Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9177,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Rejuvenating Masquerade Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9178,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Student Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9179,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9180() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Honed Masquerade Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9180,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9181() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Pillaging Student Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9181,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9182() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Pillaging Masquerade Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":9182,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9183() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Strong Student Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9183,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9184() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Strong Masquerade Armor\",\"description\":\"Double-click to unpack a full set of level 35 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9184,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}