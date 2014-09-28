package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0276 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem62988() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Chef's Tools\",\"description\":\"Component for Chef's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62988,\"icon\":\"https://render.guildwars2.com/file/1DAFA97D717FEC755713C57605D94E37EE02F87D/866763.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62989() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gourmet Chef's Tools\",\"description\":\"Component for Chef's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62989,\"icon\":\"https://render.guildwars2.com/file/4407082CFBD97CEB70E56CBE93D1CB45BEDB9B04/866764.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62990() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ambrosial Chef's Tools\",\"description\":\"Component for Chef's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62990,\"icon\":\"https://render.guildwars2.com/file/CB6458A4C83F64062B706B6BC5511E6E167ED3A9/866765.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63269() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mentor's Kit\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63269,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63270() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hero's Chest\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63270,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63272() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Weapon Container\",\"description\":\"Quartermaster Hargrove presents you with a Pact weapon in gratitude of your service.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63272,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63273() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Navy Badge\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63273,\"icon\":\"https://render.guildwars2.com/file/EFA93B27D505AF9433D91B6461F9A1F708FA2834/63601.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63274() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Army Badge\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63274,\"icon\":\"https://render.guildwars2.com/file/5044509F3DB0F391576CCAD891BC654DC5FE79B3/63600.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63275() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aviator Badge\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63275,\"icon\":\"https://render.guildwars2.com/file/AB9731B1DA09D963465D0C9ECD14A6539DA9B44F/66857.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63379() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Loot\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63379,\"icon\":\"https://render.guildwars2.com/file/31B3F3FCE4AC0B24209CAA7AD738B51F766A04E3/619511.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63467() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63467,\"icon\":\"https://render.guildwars2.com/file/B79A06ABD63013093A4ABC380425A439AE48A967/66787.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63468() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63468,\"icon\":\"https://render.guildwars2.com/file/C00439EF2BE3B9E5F86299D9F47E32C0D40AD6C4/63109.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63469() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63469,\"icon\":\"https://render.guildwars2.com/file/9B2F7DF8C5BE57A257D16FB64AD474B63F1FC2AE/66788.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63470() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63470,\"icon\":\"https://render.guildwars2.com/file/7056017FCDF3E273CB3F2ECE66DBE435B25B7631/66786.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63471() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63471,\"icon\":\"https://render.guildwars2.com/file/D82CC45CC9B206AADFD6A9F392426B75115D794B/66790.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63472() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Heart\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63472,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63474() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Pride\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63474,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63475() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Whisper's Power\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63475,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63476() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil's Might\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":124,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63476,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63477() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Weapon Container\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63477,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63478() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Weapon Container\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63478,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63479() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Durmand Priory Weapon Container\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63479,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63596() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Claw Island Keepsake\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Rare\",\"vendor_value\":312,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":63596,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63662() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beginner's Bag of Crafting Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63662,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem63677() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Apprentice's Bag of Crafting Supplies\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":66,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":63677,\"icon\":\"https://render.guildwars2.com/file/C007CABA2A4CA303B10C733246C352276D080762/619524.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}