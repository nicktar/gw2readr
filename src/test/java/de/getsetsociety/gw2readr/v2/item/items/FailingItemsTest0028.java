package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0028 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12811() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Hook\",\"description\":\"Used to craft Earrings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12811,\"icon\":\"https://render.guildwars2.com/file/7472449776AA61ABABA4FB3867F354DB5955E2EE/63392.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12812() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Setting\",\"description\":\"Used to craft Jewelry.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12812,\"icon\":\"https://render.guildwars2.com/file/C9770B0DECDB1B214CB5024942B20506C41D0B68/63393.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12813() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Setting\",\"description\":\"Used to craft Jewelry.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12813,\"icon\":\"https://render.guildwars2.com/file/D6050A4E14C22D9837F934D84034EC6C72D8D2BE/219498.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12814() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Setting\",\"description\":\"Used to craft Jewelry.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12814,\"icon\":\"https://render.guildwars2.com/file/EAA5A0126AEFCF9702F4DD41A3DB27AAAC1C48D9/219499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12815() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Setting\",\"description\":\"Used to craft Jewelry.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12815,\"icon\":\"https://render.guildwars2.com/file/DD02B907A499D37F9A6562EFC2FF0E642FE193A7/219500.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12816() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Setting\",\"description\":\"Used to craft Jewelry.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12816,\"icon\":\"https://render.guildwars2.com/file/18020C480903BFEF6872799519E369F599355D4E/219501.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12817() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Setting\",\"description\":\"Used to craft Jewelry.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12817,\"icon\":\"https://render.guildwars2.com/file/02CC2A2B09AF07F234E02B5B561665A7967B0EDC/63394.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12818() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Chain\",\"description\":\"Used to craft Necklaces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12818,\"icon\":\"https://render.guildwars2.com/file/3DC30F3EFD6EDCD20E6F41631701786F50752007/63395.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12819() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Chain\",\"description\":\"Used to craft Necklaces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12819,\"icon\":\"https://render.guildwars2.com/file/0E9A3EF2E744ABE2E0CC930719BA6DA677B7DA59/219502.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12820() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Chain\",\"description\":\"Used to craft Necklaces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12820,\"icon\":\"https://render.guildwars2.com/file/4C4F5ABF7152B33578CD6C09954C340BA36D9910/219503.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12821() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Chain\",\"description\":\"Used to craft Necklaces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12821,\"icon\":\"https://render.guildwars2.com/file/EE1EAACDB79ECA661EDFD43E95242A027550AC54/219504.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12822() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Chain\",\"description\":\"Used to craft Necklaces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12822,\"icon\":\"https://render.guildwars2.com/file/69A10C0A9C59A3443EFD40126FA760DDCDE13020/219505.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12823() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Chain\",\"description\":\"Used to craft Necklaces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12823,\"icon\":\"https://render.guildwars2.com/file/5729ECC82A4AB53119777A983D7D6C10CD44B493/63396.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12824() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Band\",\"description\":\"Used to craft rings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12824,\"icon\":\"https://render.guildwars2.com/file/F800B0FF794C78700948165FA76A440C6ADB5379/63397.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12825() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Band\",\"description\":\"Used to craft rings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12825,\"icon\":\"https://render.guildwars2.com/file/487BCA37D925AE090EEC08271301BC00E094050D/219506.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12826() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Band\",\"description\":\"Used to craft rings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12826,\"icon\":\"https://render.guildwars2.com/file/017DCE65DE13705008DDA4995239DC3FA1771D7B/219507.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12827() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Band\",\"description\":\"Used to craft rings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12827,\"icon\":\"https://render.guildwars2.com/file/EE24D0CD5257BFE1139D405D405729F2603BFA47/219508.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12828() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Band\",\"description\":\"Used to craft rings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12828,\"icon\":\"https://render.guildwars2.com/file/2FCBA45938A0C3B35F19BBB60408D6F512C00198/219509.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12829() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Band\",\"description\":\"Used to craft rings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12829,\"icon\":\"https://render.guildwars2.com/file/F01AAF097A1DD7E506B991093308F304BE93CDE2/63398.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12830() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Filigree\",\"description\":\"Used to craft Adorned Jewels.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12830,\"icon\":\"https://render.guildwars2.com/file/1CEC3E40EA03D151655C3B2C3795980B43375555/63399.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12831() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Filigree\",\"description\":\"Used to craft Intricate Jewels.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12831,\"icon\":\"https://render.guildwars2.com/file/5BAD05D91263DBAB7D055CEB5DC1410D08756D4B/63400.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12832() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Filigree\",\"description\":\"Used to craft Exquisite Jewels.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12832,\"icon\":\"https://render.guildwars2.com/file/7E782B37157B64B790763917BFCCD39FD89A755F/219510.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12833() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Filigree\",\"description\":\"Used to craft Brilliant Jewels.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12833,\"icon\":\"https://render.guildwars2.com/file/1294775759A0C76252E9CE62F31398EC40361F55/219511.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12834() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Filigree\",\"description\":\"Used to craft Perfect Jewels.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12834,\"icon\":\"https://render.guildwars2.com/file/36716A5309700B989075FD4A74AB94052A0DF01E/219512.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12835() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Filigree\",\"description\":\"Used to craft Ornate Jewels.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12835,\"icon\":\"https://render.guildwars2.com/file/3C3CE4ED3BA315B373C609F3DB57BE73A826315C/219513.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}