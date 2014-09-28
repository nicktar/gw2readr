package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0222 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem50071() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ultimate Citizen's Rescue Bag\",\"description\":\"A reward bag for a good deed.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50071,\"icon\":\"https://render.guildwars2.com/file/1C05EB01613D5F494D0F63D94262E6026E24C954/740280.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50073() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Standard Citizen's Rescue Bag\",\"description\":\"A reward bag for a good deed.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50073,\"icon\":\"https://render.guildwars2.com/file/B7BDA4170AC076B063A97A2267A174E30D0CD01C/740282.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50075() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinal Blades Blueprint Scrap (1/4)\",\"description\":\"Combine all four Blueprint Scraps in the Mystic Forge to obtain the Spinal Blade Pack Blueprint.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":50075,\"icon\":\"https://render.guildwars2.com/file/E5C9F24B201CEF0BC01934D0C37AFEF25B562543/740283.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50076() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinal Blades Blueprint Scrap (2/4)\",\"description\":\"Combine all four Blueprint Scraps in the Mystic Forge to obtain the Spinal Blade Pack Blueprint.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":50076,\"icon\":\"https://render.guildwars2.com/file/4B582DD9C8D66C4B0EFAF6101EE16B552FC10066/740284.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50077() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinal Blades Blueprint Scrap (3/4)\",\"description\":\"Combine all four Blueprint Scraps in the Mystic Forge to obtain the Spinal Blade Pack Blueprint.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":50077,\"icon\":\"https://render.guildwars2.com/file/7A0372CFFEA256BE7A6F0BEA2FCCED786EF71C74/740285.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50078() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinal Blades Blueprint Scrap (4/4)\",\"description\":\"Combine all four Blueprint Scraps in the Mystic Forge to obtain the Spinal Blade Pack Blueprint.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":50078,\"icon\":\"https://render.guildwars2.com/file/3C5BCFBE1C111F1180E10B672ABFAAF83D803D6A/740286.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50079() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinal Blade Pack Blueprint\",\"description\":\"Combine in the Mystic Forge with Blade Shards, Radiant Dust, and Iron Ingots to create a Spinal Blade Pack back item.\n\n<c=@flavor>Backside reads: \\\"Caithe, someday you'll see. Tyria needs me. -Scarlet.\\\"<c>\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50079,\"icon\":\"https://render.guildwars2.com/file/FD3924D533BA33EF1AC0D94C0702D4225821DA3A/740287.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50080() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heirloom Box\",\"description\":\"Contains a choice of 50 Bags of Alliance Supplies or 50 Empyreal Fragments.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50080,\"icon\":\"https://render.guildwars2.com/file/09D608931CD6DF07994A1448D206EDAADE399C7B/740288.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50103() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Magnus's Eye Patch\",\"description\":\"Contains both left and right versions of Magnus's eye patch.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50103,\"icon\":\"https://render.guildwars2.com/file/0891237B76B476424EA05AFF92A55B9397D3FFBA/740296.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50104() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Captain's Airship Pass\",\"description\":\"Gain entry to the Havoc's Heir Airship.\n\n• Quick Travel to All Cities\n• Crafting Stations\n• Bank and Guild Bank Access\n• Mystic Forge\n• Merchants\n• And more! All within easy reach, for those who enjoy the ultimate convenience.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Pve\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50104,\"icon\":\"https://render.guildwars2.com/file/4A4C46AB044116F138A19F1DC75066A69C0A56A2/740297.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Orichalcum Plated Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50342,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50343() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Orichalcum Imbued Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50343,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50347() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50347,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50349() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Hard Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50349,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50351() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50351,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50352() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Elder Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50352,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50353() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50353,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50355() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Mithril Imbued Inscription\",\"description\":\"Used in the crafting of weapons with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50355,\"icon\":\"https://render.guildwars2.com/file/9C1FA22BC16F3C7636CE324901ECD46E9700E9AC/340499.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50358() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Cotton Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50358,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50360() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Linen Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50360,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50362() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Intricate Linen Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50362,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50363() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Silk Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50363,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50364() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Embroidered Silk Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50364,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50366() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Intricate Silk Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":8,\"rarity\":\"Exotic\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50366,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem50367() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ineffable Embroidered Gossamer Insignia\",\"description\":\"Used in the crafting of armor with a flexible nature.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":50367,\"icon\":\"https://render.guildwars2.com/file/A3D8FA093CF830A5F799C742AAC70DE590C21498/699307.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}