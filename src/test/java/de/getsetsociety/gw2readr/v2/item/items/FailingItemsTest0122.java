package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0122 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23906() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twitchok's Blueprints\",\"description\":\"<c=@flavor>\\\"What do you mean, 'it's just a bunch of scribbles?'\\\"<br>—Twitchok</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23906,\"icon\":\"https://render.guildwars2.com/file/027D1D382447933D074BE45F405EA1F379471DEB/63127.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twitchok's Blueprints\",\"description\":\"<c=@flavor>\\\"I'm positive this will work. Unlike the last few...\\\"<br>—Twitchok</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":53,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23907,\"icon\":\"https://render.guildwars2.com/file/027D1D382447933D074BE45F405EA1F379471DEB/63127.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Worm Food\",\"description\":\"<c=@flavor>\\\"Good for worms, and good for you!\\\"<br>—Sneckit</c>\",\"type\":\"Trinket\",\"level\":18,\"rarity\":\"Fine\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23908,\"icon\":\"https://render.guildwars2.com/file/10ACE47195709F69F366026507FEB0080DF39BE7/63194.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23909() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Worm Food\",\"description\":\"<c=@flavor>\\\"Tasty! Try it and see!\\\"<br>—Sneckit</c>\",\"type\":\"Trinket\",\"level\":18,\"rarity\":\"Masterwork\",\"vendor_value\":55,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23909,\"icon\":\"https://render.guildwars2.com/file/10ACE47195709F69F366026507FEB0080DF39BE7/63194.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23910() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Destroyer Trap\",\"description\":\"<c=@flavor>\\\"Only works once, but at least it works!\\\"<br>—Bordekka</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23910,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23911() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Destroyer Trap\",\"description\":\"<c=@flavor>\\\"Destroyers came; we were ready.\\\"<br>—Bordekka</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23911,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23912() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Half-Melted Amulet\",\"description\":\"<c=@flavor>\\\"Almost fire resistant. Almost.\\\"<br>—Bordekka</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23912,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Half-Melted Amulet\",\"description\":\"<c=@flavor>\\\"This one lasted longer than the rest.\\\"<br>—Bordekka</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23913,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23914() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Medal of Honor\",\"description\":\"<c=@flavor>\\\"Only those who go above and beyond the call of duty earn the right to wear these.\\\"<br>—Goran</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23914,\"icon\":\"https://render.guildwars2.com/file/090BC3B0D80614C50918DC3AB402D196A6581FEA/63606.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23915() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Medal of Honor\",\"description\":\"<c=@flavor>\\\"Some folks just survive in modern warfare. People who thrive in it wear these.\\\"<br>—Goran</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23915,\"icon\":\"https://render.guildwars2.com/file/090BC3B0D80614C50918DC3AB402D196A6581FEA/63606.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23916() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Medal of Stealth\",\"description\":\"<c=@flavor>\\\"Sneaking up on someone is easy. Keeping others from noticing you is the hard part.\\\"<br>—Morina</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23916,\"icon\":\"https://render.guildwars2.com/file/090BC3B0D80614C50918DC3AB402D196A6581FEA/63606.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23917() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Medal of Stealth\",\"description\":\"<c=@flavor>\\\"Being quiet means staying alive.\\\"<br>—Morina</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23917,\"icon\":\"https://render.guildwars2.com/file/090BC3B0D80614C50918DC3AB402D196A6581FEA/63606.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23918() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Petrified Wind Rider Eye\",\"description\":\"<c=@flavor>\\\"Amazingly well preserved.\\\"<br>—Aidem</c>\",\"type\":\"Trinket\",\"level\":21,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23918,\"icon\":\"https://render.guildwars2.com/file/184C485B0B02A71C47E8C0596B31B56B98EEFA15/66854.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23919() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Petrified Wind Rider Eye\",\"description\":\"<c=@flavor>\\\"It almost looks like it's watching you.\\\"<br>—Aidem</c>\",\"type\":\"Trinket\",\"level\":21,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23919,\"icon\":\"https://render.guildwars2.com/file/184C485B0B02A71C47E8C0596B31B56B98EEFA15/66854.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Button\",\"description\":\"<c=@flavor>\\\"Not shiny enough for me. Might be good for you.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23920,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23921() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Shackle\",\"description\":\"<c=@flavor>\\\"Too bad we can't put them back on the people that made them.\\\"<br>—Coydd</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23921,\"icon\":\"https://render.guildwars2.com/file/D901FDEB6501DB1BD9C7F19113BA2DCF91E00E0A/455972.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23922() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Shackle\",\"description\":\"<c=@flavor>\\\"Fortunately, they're poorly constructed.\\\"<br>—Coydd</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23922,\"icon\":\"https://render.guildwars2.com/file/D901FDEB6501DB1BD9C7F19113BA2DCF91E00E0A/455972.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23923() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Button\",\"description\":\"<c=@flavor>\\\"Was hoping to get weapons or food. Got this instead.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23923,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23924() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Buckle\",\"description\":\"<c=@flavor>\\\"Almost perfect size to throw.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23924,\"icon\":\"https://render.guildwars2.com/file/AB7FF652290457B0B0EEA492A93E4490BDBE3C66/66855.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23925() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Buckle\",\"description\":\"<c=@flavor>\\\"I bet these are really important. Not to me, though.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23925,\"icon\":\"https://render.guildwars2.com/file/AB7FF652290457B0B0EEA492A93E4490BDBE3C66/66855.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23926() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Shoelace\",\"description\":\"<c=@flavor>\\\"Let's see them run after us now!\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23926,\"icon\":\"https://render.guildwars2.com/file/ED39933DE93BCA0FD95DE66C77BC4F7C36B000A7/66856.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23927() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Shoelace\",\"description\":\"<c=@flavor>\\\"You need these more than I do. I don't wear shoes.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23927,\"icon\":\"https://render.guildwars2.com/file/ED39933DE93BCA0FD95DE66C77BC4F7C36B000A7/66856.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23928() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Shell\",\"description\":\"<c=@flavor>\\\"If only we had a way to fire them back.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23928,\"icon\":\"https://render.guildwars2.com/file/DD6DE7677627FB2163C80467C31C9D185C6A07A8/63442.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23929() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Shell\",\"description\":\"<c=@flavor>\\\"They won't be using these on us anytime soon.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23929,\"icon\":\"https://render.guildwars2.com/file/DD6DE7677627FB2163C80467C31C9D185C6A07A8/63442.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23930() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Bandit Fork\",\"description\":\"<c=@flavor>\\\"This is the smallest trident I've ever seen.\\\"<br>—Hua'racche</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23930,\"icon\":\"https://render.guildwars2.com/file/155A060E0EEA20E6F354B19BA8E00E760AAD44ED/66817.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}