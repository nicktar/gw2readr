package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0128 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24195() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Piece of Scrap Metal\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24195,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24196() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toxin Antidote\",\"description\":\"Antidote for a poisonous toxin.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24196,\"icon\":\"https://render.guildwars2.com/file/1E27AFC874C5490E1C2C54EC5CB87A0E3E5645A8/63062.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24197() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tattered Armor\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24197,\"icon\":\"https://render.guildwars2.com/file/D1900DBA621E03B250EBD0E41C94BD58275C60E3/66918.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24198() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shrinkcap Spore\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24198,\"icon\":\"https://render.guildwars2.com/file/02C8490298FE3913CDF15B30126275DBC8FD94F9/66919.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24199() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lashtail Devourer Egg\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24199,\"icon\":\"https://render.guildwars2.com/file/4A58480BE6669B605E909F44EAE64896DB030CDD/62389.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24200() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gear Crank\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24200,\"icon\":\"https://render.guildwars2.com/file/EEA4CFB52C08E67E9461A09F3C040D20CE94FA09/66816.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24205() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Earth Elemental Core\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24205,\"icon\":\"https://render.guildwars2.com/file/4D59B95AC418420104F20E9739785D43F36BAF26/66922.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24207() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ettin Refuse\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24207,\"icon\":\"https://render.guildwars2.com/file/8096979FE3DAD7B2FA726AB2BACAE15C7017F5DB/66859.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24209() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blob of Toxin\",\"description\":\"Apprentice Jameson needs these samples to devise an antitoxin.<br>Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24209,\"icon\":\"https://render.guildwars2.com/file/A8016DED106A6FA84D506A794EF1BAFA5B0CF8B6/63061.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24210() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Griffon Claw\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24210,\"icon\":\"https://render.guildwars2.com/file/CC5D3AC6029BEC702869A8BCB2730A77EB976F28/66435.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24211() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chunk of Dolyak Meat\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24211,\"icon\":\"https://render.guildwars2.com/file/B552F79D6B020EAECFC237B9DABD0DE275C30D08/66923.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24214() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flying Cow Token\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10000,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24214,\"icon\":\"https://render.guildwars2.com/file/07D9452FC00EC9A9803BC5540AC9346D4E69E73F/66818.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24219() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Defense Plans\",\"description\":\"Information on the patrols around the mine and the dredge defensive capabilities. Grimarr Molesmasher, outside of Molensk, could probably use these.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24219,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24220() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Raven Egg\",\"description\":\"A raven egg that must have fallen out of a roost. Return it to honor Raven.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24220,\"icon\":\"https://render.guildwars2.com/file/5FC1B2D9C0BC0365CB6E5C943D2E7E1F58520241/63158.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24222() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Battle Plans\",\"description\":\"Drawn up by the Flame Legion. This could be invaluable if it were to fall into the right hands.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24222,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24223() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Badge\",\"description\":\"The badge of a fallen Seraph soldier—Sergeant Rane is collecting these.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24223,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24227() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Inquest Golem Part\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24227,\"icon\":\"https://render.guildwars2.com/file/F0BCB5025A7F6893BB100246D6620B114F2FE1EC/63156.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24234() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Piece of Charr Scrap Metal\",\"description\":\"Metal salvaged from Sapper's Delve. Vanguard Scout Holt in Hautclaire Vale might find this useful.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24234,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24242() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heart of Fire\",\"description\":\"The smoldering heart of an elder imp of fire.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24242,\"icon\":\"https://render.guildwars2.com/file/45ACC107537E9D70776C9F24EDA1DCC26C4AFAB1/63345.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24243() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fragment of Earth\",\"description\":\"A small piece of an Earth Elemental. You can feel intense power radiating from it.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24243,\"icon\":\"https://render.guildwars2.com/file/4D59B95AC418420104F20E9739785D43F36BAF26/66922.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24244() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Burning Ember\",\"description\":\"Holding this mass feels like your hand is on fire.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24244,\"icon\":\"https://render.guildwars2.com/file/4AA6F8CB30973B9A6E4C310124EFB5BFF42036E5/63273.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24245() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heart of Darkness\",\"description\":\"The corrupting heart of an elder imp of shadow.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24245,\"icon\":\"https://render.guildwars2.com/file/E903F3B3231E04D148E1E16C0FB17AB0482C5934/223767.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24249() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Volcanic Earth Elemental Core\",\"description\":\"The core of a volcano-dwelling earth elemental. Ambr's lab wants these for their golem experiments. It looks like three cores will power an inactive golem.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24249,\"icon\":\"https://render.guildwars2.com/file/2232AA41E3DF20EB249C0B6D10BC0D37FF6C0E3D/66963.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24250() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Alpha Inquest Control Key\",\"description\":\"The Order of Whispers can use this key to hamper Inquest efforts in this area.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24250,\"icon\":\"https://render.guildwars2.com/file/65FBCE0135DB611C23720F4ECA9D06A516DAC33E/66811.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24251() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beta Inquest Control Key\",\"description\":\"The Order of Whispers can use this key to hamper Inquest efforts in this area.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24251,\"icon\":\"https://render.guildwars2.com/file/7537B90409D128790AB1E66DB6C6C67F90FE2D96/415004.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}