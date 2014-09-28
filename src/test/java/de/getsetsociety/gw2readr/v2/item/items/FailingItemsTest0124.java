package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0124 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Destroyer Core\",\"description\":\"<c=@flavor>This trinket grows hotter when in proximity to destroyers.</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23956,\"icon\":\"https://render.guildwars2.com/file/45ACC107537E9D70776C9F24EDA1DCC26C4AFAB1/63345.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Badge\",\"description\":\"<c=@flavor>\\\"You were just the unpredictable variable we needed to turn the tide of undead. The Vigil will remember your service.\\\" -Jezza</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23957,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":24},{\"attribute\":\"Precision\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23958() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beaded Hylek Bracelet\",\"description\":\"<c=@flavor>\\\"We like to give our friends these!\\\" -Costi Atl</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23958,\"icon\":\"https://render.guildwars2.com/file/CB4C08E43A79550C3F0EFE24B348BAE9FA69F7F9/455978.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":24},{\"attribute\":\"Precision\",\"modifier\":17},{\"attribute\":\"Toughness\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Hylek Fishbone\",\"description\":\"<c=@flavor>\\\"I'm pretty sure these are corruption free.\\\" —Ayomichi</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23959,\"icon\":\"https://render.guildwars2.com/file/BA15960C2DB3FBCFEC0053A9FA6FCA9F3068AAD1/103563.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Undead Ash in a Jar\",\"description\":\"<c=@flavor>\\\"Guaranteed to ward off undead!\\\"—Cuadinti</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23960,\"icon\":\"https://render.guildwars2.com/file/1E024CFC4D47B0D6EA525EE8FC3F9F6BCF2A07A3/455979.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sun God Totem\",\"description\":\"<c=@flavor>\\\"May the sun god's rays warm your back.\\\"—Qoetl</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23961,\"icon\":\"https://render.guildwars2.com/file/E5B6385924CD6935AE02047665AA00EAB622BBE9/455980.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23962() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hylek Scout Telescope\",\"description\":\"<c=@flavor>\\\"The best tribe scouts use this to watch for the undead. Be warned, when the shore looks empty, they rise out of the water.\\\" -Potatlan</c>\",\"type\":\"Trinket\",\"level\":58,\"rarity\":\"Fine\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23962,\"icon\":\"https://render.guildwars2.com/file/BB4BBFA13C551CB0DEE848560B0134E1A877C3C7/434527.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23963() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dented Canthan Chalice\",\"description\":\"<c=@flavor>\\\"If these Canthan chalices were worth something I could have packed up and left long ago.\\\"<br>—Admiral Clarinda Demard</c>\",\"type\":\"Trinket\",\"level\":59,\"rarity\":\"Fine\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23963,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23964() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lionguard Shipwreck Souvieneer\",\"description\":\"<c=@flavor>\\\"These wrecks were from Lion's Arch. I'd not mistake the mark of the Lionguard.\\\" -Danu</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23964,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23965() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dried Poisonous Swamp Fungi\",\"description\":\"<c=@flavor>\\\"It's dried, so the poison won't affect you. Just don't get it wet.\\\"<br>—Laudren</c>\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Fine\",\"vendor_value\":67,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23965,\"icon\":\"https://render.guildwars2.com/file/A3725FE7524F4D983FFB7FE9D263189BB8C2D4F8/65714.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23966() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giant Troll Tooth\",\"description\":\"<c=@flavor>\\\"There are far to many trolls here. Take a tooth from the big one if you wish.\\\" -Quennida</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23966,\"icon\":\"https://render.guildwars2.com/file/4FF5B601B128A15BF1D3BBA215B30AFE0FCA7EAB/223797.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23967() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quaggan Seaweed Doll\",\"description\":\"<c=@flavor>Ugh. It smells funny out of water.</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23967,\"icon\":\"https://render.guildwars2.com/file/E056E8520AD0340197D0060D9D94BC06E812B70B/455981.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23968() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sylvari Warden Wall Watcher Badge\",\"description\":\"<c=@flavor>\\\"We stop the undead advance here at the Caer Brier wall.\\\" -Brannen</c>\",\"type\":\"Trinket\",\"level\":64,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23968,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23969() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twitching Undead Hand\",\"description\":\"<c=@flavor>\\\"Need a hand? Sorry, I don't get out much.\\\"—Kamma</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Fine\",\"vendor_value\":69,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23969,\"icon\":\"https://render.guildwars2.com/file/521747770101EFD0F2DC2AB5ED13110A23D06B60/434528.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":31},{\"attribute\":\"Toughness\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23970() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Badge\",\"description\":\"<c=@flavor>\\\"You were just the unpredictable variable we needed to turn the tide of undead. The Vigil will remember your service.\\\" -Jezza</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Masterwork\",\"vendor_value\":120,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23970,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23971() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beaded Hylek Bracelet\",\"description\":\"<c=@flavor>\\\"We like to give our friends these!\\\" -Costi Atl</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Masterwork\",\"vendor_value\":120,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23971,\"icon\":\"https://render.guildwars2.com/file/CB4C08E43A79550C3F0EFE24B348BAE9FA69F7F9/455978.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Toughness\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23972() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Hylek Fishbone\",\"description\":\"<c=@flavor>\\\"I'm pretty sure these are corruption free.\\\" —Ayomichi</c>\",\"type\":\"Trinket\",\"level\":56,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23972,\"icon\":\"https://render.guildwars2.com/file/BA15960C2DB3FBCFEC0053A9FA6FCA9F3068AAD1/103563.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":27},{\"attribute\":\"Precision\",\"modifier\":19},{\"attribute\":\"Toughness\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23973() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Undead Ash in a Jar\",\"description\":\"<c=@flavor>\\\"Guaranteed to ward off undead!\\\"—Cuadinti</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23973,\"icon\":\"https://render.guildwars2.com/file/1E024CFC4D47B0D6EA525EE8FC3F9F6BCF2A07A3/455979.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23974() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sun God Totem\",\"description\":\"<c=@flavor>\\\"May the sun god's rays warm your back.\\\"—Qoetl</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23974,\"icon\":\"https://render.guildwars2.com/file/E5B6385924CD6935AE02047665AA00EAB622BBE9/455980.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23975() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hylek Scout Telescope\",\"description\":\"<c=@flavor>\\\"The best tribe scouts use this to watch for the undead. Be warned, when the shore looks empty, they rise out of the water.\\\" -Potatlan</c>\",\"type\":\"Trinket\",\"level\":58,\"rarity\":\"Masterwork\",\"vendor_value\":125,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23975,\"icon\":\"https://render.guildwars2.com/file/BB4BBFA13C551CB0DEE848560B0134E1A877C3C7/434527.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23976() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dented Canthan Chalice\",\"description\":\"<c=@flavor>\\\"If these Canthan chalices were worth something I could have packed up and left long ago.\\\"<br>—Admiral Clarinda Demard</c>\",\"type\":\"Trinket\",\"level\":59,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23976,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23977() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lionguard Shipwreck Souvieneer\",\"description\":\"<c=@flavor>\\\"These wrecks were from Lion's Arch. I'd not mistake the mark of the Lionguard.\\\" -Danu</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Masterwork\",\"vendor_value\":130,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23977,\"icon\":\"https://render.guildwars2.com/file/6F2215EB6E98B707DA6214AABF510667A6CE6609/66821.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23978() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dried Poisonous Swamp Fungi\",\"description\":\"<c=@flavor>\\\"It's dried, so the poison won't affect you. Just don't get it wet.\\\"<br>—Laudren</c>\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Masterwork\",\"vendor_value\":133,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23978,\"icon\":\"https://render.guildwars2.com/file/A3725FE7524F4D983FFB7FE9D263189BB8C2D4F8/65714.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Toughness\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23979() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giant Troll Tooth\",\"description\":\"<c=@flavor>\\\"There are far to many trolls here. Take a tooth from the big one if you wish.\\\" -Quennida</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23979,\"icon\":\"https://render.guildwars2.com/file/4FF5B601B128A15BF1D3BBA215B30AFE0FCA7EAB/223797.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":32},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23980() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quaggan Seaweed Doll\",\"description\":\"<c=@flavor>Ugh. It smells funny out of water.</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":130,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23980,\"icon\":\"https://render.guildwars2.com/file/E056E8520AD0340197D0060D9D94BC06E812B70B/455981.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Toughness\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}