package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0223 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem50368() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Intricate Gossamer Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50368,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54604() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Invisible Bag\",\"description\":\"8 Slots, Items in this box will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54604,\"icon\":\"https://render.guildwars2.com/file/647CF53A7C4903C2E09091CBDC4F215834C50A4B/219376.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54651() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearthfriend\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54651,\"icon\":\"https://render.guildwars2.com/file/3A589D3C7DEF91572159A33E324A4E975CCC011D/575182.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54672() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Teardrawer\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54672,\"icon\":\"https://render.guildwars2.com/file/2F11C70CBD6B7CDFF2D21CD611CC4202DDB8BFED/575168.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54680() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Swordshame\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54680,\"icon\":\"https://render.guildwars2.com/file/9F17F1EBFCCFA5D4C5CE70090F67D961E5F024C8/575178.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54685() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Li'l Letter Opener\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54685,\"icon\":\"https://render.guildwars2.com/file/BDAAF7437FD44F2AA7592F0A1EC5F9EEC690F635/66164.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54686() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ram's Sigh\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54686,\"icon\":\"https://render.guildwars2.com/file/F464B3A80B0EFF2105630C0E48BBC6C5CA1CB651/66224.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54688() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ram's Sigh\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54688,\"icon\":\"https://render.guildwars2.com/file/F464B3A80B0EFF2105630C0E48BBC6C5CA1CB651/66224.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54689() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Processional Flame\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54689,\"icon\":\"https://render.guildwars2.com/file/5B92FF4408386F02FB75F2034F2DCDBF53DDA206/66218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54690() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Processional Flame\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54690,\"icon\":\"https://render.guildwars2.com/file/5B92FF4408386F02FB75F2034F2DCDBF53DDA206/66218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54691() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Processional Flame\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54691,\"icon\":\"https://render.guildwars2.com/file/5B92FF4408386F02FB75F2034F2DCDBF53DDA206/66218.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54693() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moa Carver\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54693,\"icon\":\"https://render.guildwars2.com/file/4208D4020193450C234C0DC55F7EFCFAB236007B/66216.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54694() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moa Carver\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54694,\"icon\":\"https://render.guildwars2.com/file/4208D4020193450C234C0DC55F7EFCFAB236007B/66216.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54695() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moa Carver\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54695,\"icon\":\"https://render.guildwars2.com/file/4208D4020193450C234C0DC55F7EFCFAB236007B/66216.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54696() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moa Carver\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54696,\"icon\":\"https://render.guildwars2.com/file/4208D4020193450C234C0DC55F7EFCFAB236007B/66216.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54697() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Supplejack\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54697,\"icon\":\"https://render.guildwars2.com/file/FA1C40555C74D2BAAED3729F7B2560F517E2171A/66214.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54698() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Supplejack\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54698,\"icon\":\"https://render.guildwars2.com/file/FA1C40555C74D2BAAED3729F7B2560F517E2171A/66214.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54700() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Supplejack\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54700,\"icon\":\"https://render.guildwars2.com/file/FA1C40555C74D2BAAED3729F7B2560F517E2171A/66214.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54701() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Improvised Bulwark\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54701,\"icon\":\"https://render.guildwars2.com/file/7DB35F1B7E15540C901650FE08B635FC7F01C852/66208.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54702() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Improvised Bulwark\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54702,\"icon\":\"https://render.guildwars2.com/file/7DB35F1B7E15540C901650FE08B635FC7F01C852/66208.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54703() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Improvised Bulwark\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54703,\"icon\":\"https://render.guildwars2.com/file/7DB35F1B7E15540C901650FE08B635FC7F01C852/66208.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54705() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Weftwand\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54705,\"icon\":\"https://render.guildwars2.com/file/40539A620E4FF85EEE0D104BBE234E185142A2CC/66202.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54706() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Weftwand\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54706,\"icon\":\"https://render.guildwars2.com/file/40539A620E4FF85EEE0D104BBE234E185142A2CC/66202.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54707() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Weftwand\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54707,\"icon\":\"https://render.guildwars2.com/file/40539A620E4FF85EEE0D104BBE234E185142A2CC/66202.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem54708() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Weftwand\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":54708,\"icon\":\"https://render.guildwars2.com/file/40539A620E4FF85EEE0D104BBE234E185142A2CC/66202.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}