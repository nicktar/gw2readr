package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0088 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem21325() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Phoenix Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21325,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21653() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tattered Pelt\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21653,\"icon\":\"https://render.guildwars2.com/file/0B10F83192919E5CF4C3A5B291BC057607C8C097/66500.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21654() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ripped Pelt\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21654,\"icon\":\"https://render.guildwars2.com/file/91C2601D32F94932E2C2681328634C110475D773/223809.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21655() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Torn Pelt\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21655,\"icon\":\"https://render.guildwars2.com/file/63E475033A69F1966537C09E5610F971CBE6CD02/223811.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21656() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frayed Pelt\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21656,\"icon\":\"https://render.guildwars2.com/file/B4D493BB75261B40DAB7E4F04DD2ED4657965B1B/66516.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21657() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Filthy Pelt\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21657,\"icon\":\"https://render.guildwars2.com/file/43790C1E80641FC93BE57E9179066364C2036AD1/66498.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21658() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Salvageable Pelt\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21658,\"icon\":\"https://render.guildwars2.com/file/04B431EB4569A490F749DA2FEE000E0AB2B1E13D/223821.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21659() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shredded Rag\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21659,\"icon\":\"https://render.guildwars2.com/file/0607B248FDB12D44DF5BDD08649876AFC2F80556/66499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21660() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Worn Rag\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21660,\"icon\":\"https://render.guildwars2.com/file/57A5B274FD2CE09F42C89B5C7C9ACBA22456ED30/223597.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21661() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tattered Hide\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21661,\"icon\":\"https://render.guildwars2.com/file/0B669B05965171E167A5092B0894200BFC0F0AEA/66504.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21662() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soiled Rag\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21662,\"icon\":\"https://render.guildwars2.com/file/5DC21A7B36B74BE252FDC108F7536A0E38212653/223599.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21663() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frayed Rag\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21663,\"icon\":\"https://render.guildwars2.com/file/B4D152120B0FD90CEAB3CC4169E4D19FBE191425/223613.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21664() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ripped Hide\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21664,\"icon\":\"https://render.guildwars2.com/file/30460ABED2580CEAB578CA7327263C6671601A11/66510.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21665() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Torn Rag\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21665,\"icon\":\"https://render.guildwars2.com/file/61CC3C7773B1E5480E3506B2982B304FD0AFC117/223637.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21666() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rag\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21666,\"icon\":\"https://render.guildwars2.com/file/62262B281E2150259DA632944F28EFC608BBD731/223635.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21667() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Torn Hide\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21667,\"icon\":\"https://render.guildwars2.com/file/D8F1504E9FDA39152C7E9CEBDF300D4BC947E60E/66515.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21668() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frayed Hide\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21668,\"icon\":\"https://render.guildwars2.com/file/3A2A0AEE1C1BB0B0D10637E59425AEB04FF10529/66508.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21669() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shredded Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21669,\"icon\":\"https://render.guildwars2.com/file/F7671068669C954C4636BA62061534AF4625974B/223681.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21670() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Filthy Hide\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21670,\"icon\":\"https://render.guildwars2.com/file/1E2A6E06A4F651A097BDF2352EC514DE56250E6D/66509.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21671() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Worn Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21671,\"icon\":\"https://render.guildwars2.com/file/7038A497941372A1FA3F0C9667AE58D1E368CCCE/223699.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21672() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ragged Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21672,\"icon\":\"https://render.guildwars2.com/file/44D1DCE2E113A4C7383EFBDE6A469BCC0C4D5A08/66501.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21673() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Frayed Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21673,\"icon\":\"https://render.guildwars2.com/file/76063254FF6022ED7F4A759601F84BE9F702D05F/66825.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21674() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Torn Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21674,\"icon\":\"https://render.guildwars2.com/file/D1900DBA621E03B250EBD0E41C94BD58275C60E3/66918.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21675() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Discarded Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21675,\"icon\":\"https://render.guildwars2.com/file/F9C13811EF41BE0C2BBBD01D9595CC3D10DB3CC0/223675.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21676() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21676,\"icon\":\"https://render.guildwars2.com/file/44D1DCE2E113A4C7383EFBDE6A469BCC0C4D5A08/66501.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}