package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0070 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19822() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Healing Green Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power.\",\"type\":\"CraftingMaterial\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19822,\"icon\":\"https://render.guildwars2.com/file/736EADBBA1A2C5EFC6479842DE0EC73802FDA9C3/66006.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19823() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Iron Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19823,\"icon\":\"https://render.guildwars2.com/file/59A26603F52FD14371F45C6FACB1F6E754F40CCB/66007.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19824() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Iron Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19824,\"icon\":\"https://render.guildwars2.com/file/7622781019D70BD46564681923E34B56A8372750/340447.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19825() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Iron Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19825,\"icon\":\"https://render.guildwars2.com/file/6E7A5B712373C490B09E202F7643ACA3EFE22E24/340448.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19826() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Soft Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19826,\"icon\":\"https://render.guildwars2.com/file/0AD6B4FD660A6A0DD69A105C9D07A7B298ACF0F4/66010.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19827() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Soft Inscription\",\"description\":\"Used in the crafting of weapons with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19827,\"icon\":\"https://render.guildwars2.com/file/1460300C27B89DBD6251AABF2EF87172491B3E78/340450.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19828() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Soft Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19828,\"icon\":\"https://render.guildwars2.com/file/0FB8A4A10F23BCC812B301FF144D627A6DF2E9F8/66012.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19829() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Soft Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19829,\"icon\":\"https://render.guildwars2.com/file/FFB91D4302155CC1E63327F79250C008D1ABBFAB/340452.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19830() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19830,\"icon\":\"https://render.guildwars2.com/file/33DC1666960799330AA301965108B3359A44B814/66014.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19831() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19831,\"icon\":\"https://render.guildwars2.com/file/57F026524C7E25096923E65004B7BD7E28E20CC0/66015.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19832() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ravaging Steel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19832,\"icon\":\"https://render.guildwars2.com/file/0BDDE8A5247C260FBCE39813BF6F9E44CCFB2398/66016.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19833() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Steel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19833,\"icon\":\"https://render.guildwars2.com/file/3F9CC50A4642620535D0C21E3A71021366029398/340456.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19834() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19834,\"icon\":\"https://render.guildwars2.com/file/34041C64C82EA41FDDDDF9713DFDD407F0242409/66018.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19835() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Steel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19835,\"icon\":\"https://render.guildwars2.com/file/BBC2C4F2E466DD4356BFF5390A2D5661D7577337/66019.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19836() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19836,\"icon\":\"https://render.guildwars2.com/file/72175D3924BE7AE92C4DBE3FD047E01300161461/66020.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19837() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19837,\"icon\":\"https://render.guildwars2.com/file/0D7308FE0231210708F7C5E30604CA50B0A37F6A/66021.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19838() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Hard Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19838,\"icon\":\"https://render.guildwars2.com/file/5EE8FDAFD7C7BBBE5B17FEF1D3A40951F23B0E22/340461.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19839() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Hard Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19839,\"icon\":\"https://render.guildwars2.com/file/4ED5C61EA6037C7735097B29F5D536AD03211A7F/66023.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19840() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Hard Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19840,\"icon\":\"https://render.guildwars2.com/file/B41A05563ECE6C0A4299089949B30567EE0864EE/66024.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Hard Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19841,\"icon\":\"https://render.guildwars2.com/file/9666B76DAD71F8CEE6D9F3020BEF5892D34D7EB2/340464.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19842() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Hard Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":60,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19842,\"icon\":\"https://render.guildwars2.com/file/19B44064AFBA379999D638259C0D223FA7A83714/66026.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19843() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Assassin's Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Power, and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19843,\"icon\":\"https://render.guildwars2.com/file/F494B5672CADF02546F20F2E6704972D2035B64C/340466.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19844,\"icon\":\"https://render.guildwars2.com/file/FF97D8634CA694CCB55D3AF9B2E64144D55E5E11/66028.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19845() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19845,\"icon\":\"https://render.guildwars2.com/file/B7DDF69D762A9B18B497EBE304E247C9079FF51E/340468.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carrion Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Condition Damage, +Power, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19846,\"icon\":\"https://render.guildwars2.com/file/E46C654CBF039030E33768F46B576595E3BFF163/66030.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}