package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0030 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12861() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Hammer Head\",\"description\":\"Used to craft Hammers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12861,\"icon\":\"https://render.guildwars2.com/file/F09050B9A3B1212A98317990B2A62AF81B9180B5/340021.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12862() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Hammer Head\",\"description\":\"Used to craft Hammers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12862,\"icon\":\"https://render.guildwars2.com/file/EB1C07BCE542B95CD6A2CB4E4D06AF5EA0E678DD/63414.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12863() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Hammer Head\",\"description\":\"Used to craft Hammers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12863,\"icon\":\"https://render.guildwars2.com/file/35B130B12E335577FEDC0DD7209EDBFE6419701D/219520.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12864() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Hammer Head\",\"description\":\"Used to craft Hammers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12864,\"icon\":\"https://render.guildwars2.com/file/B2E9C2ED1C53A6BBFAF30294CEEDF3FAA71B3EBA/340022.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12865() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Hammer Head\",\"description\":\"Used to craft Hammers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12865,\"icon\":\"https://render.guildwars2.com/file/B1EDAEF89239EFA57367EE1817435ADD01CC0BE5/63415.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12866() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Sword Blade\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12866,\"icon\":\"https://render.guildwars2.com/file/97D8BE6CAB8001616D6D32DAFB0E57E1A1B56851/63416.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12867() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Sword Blade\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12867,\"icon\":\"https://render.guildwars2.com/file/5720EF677A93CB4A3E3F0597179ED7250364F50C/340023.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12868() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Sword Blade\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12868,\"icon\":\"https://render.guildwars2.com/file/F09F0FD93B3A77F437A7E0A04B9AD09A303CE323/63402.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12869() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Sword Blade\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12869,\"icon\":\"https://render.guildwars2.com/file/010609F397A94A27D595714320ED340BA8B345E6/219521.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Sword Blade\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12870,\"icon\":\"https://render.guildwars2.com/file/65A82B78415563523AE9C3E4CD22767A58346518/340024.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12871() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Sword Blade\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12871,\"icon\":\"https://render.guildwars2.com/file/FB141B3CB9E7A89EAD66BF9D06FC16233EBE71A6/63417.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12872() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Mace Head\",\"description\":\"Used to craft Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12872,\"icon\":\"https://render.guildwars2.com/file/EC69BD7EE42965F16A520E47C6C14DDBF67EA101/63418.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12873() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Mace Head\",\"description\":\"Used to craft Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12873,\"icon\":\"https://render.guildwars2.com/file/1925A71BBD71ED56263699A6EC5AC0E455A30D38/340025.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12874() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Mace Head\",\"description\":\"Used to craft Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12874,\"icon\":\"https://render.guildwars2.com/file/0D0790661B11731765C1662975789D9E4C072E1C/63419.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12875() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Mace Head\",\"description\":\"Used to craft Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12875,\"icon\":\"https://render.guildwars2.com/file/FD1E5F0FF53A016C0D3D0D42F5B6B21438640EBA/219522.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12876() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Mace Head\",\"description\":\"Used to craft Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12876,\"icon\":\"https://render.guildwars2.com/file/7DDE997E37385869B45D0EB5196E20CC567007F3/340026.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12877() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Mace Head\",\"description\":\"Used to craft Maces.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12877,\"icon\":\"https://render.guildwars2.com/file/0392542240E76665FD0D78BB0C71F1BEE8B4A470/63420.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12878() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Dagger Hilt\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12878,\"icon\":\"https://render.guildwars2.com/file/13AC685E46F8D2764F2DE3580C0D0FEB0A69E939/219523.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12879() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Dagger Hilt\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12879,\"icon\":\"https://render.guildwars2.com/file/2E0B6DF3F9707D0417EF6207096C94A0D2CD6F30/340027.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12880() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Dagger Hilt\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12880,\"icon\":\"https://render.guildwars2.com/file/EE24FBF527793757CF4C401FF27D5754B3B20C3B/63422.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12881() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Dagger Hilt\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12881,\"icon\":\"https://render.guildwars2.com/file/2CE9D542ADB4C1115C5303C3067F283F51CFE525/219524.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12882() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Dagger Hilt\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12882,\"icon\":\"https://render.guildwars2.com/file/9350C0C7122BBCF89B7AB22C42C51430CD684A11/340028.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12883() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Dagger Hilt\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12883,\"icon\":\"https://render.guildwars2.com/file/04C7BE5443C93FAD726FCF58DE7706094F0162D2/219525.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12884() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Greatsword Hilt\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12884,\"icon\":\"https://render.guildwars2.com/file/F02E17B793954195EE41A2515F7F4E7A0F3FD0E1/219526.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12885() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Greatsword Hilt\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12885,\"icon\":\"https://render.guildwars2.com/file/09C01466A4405D0B109011084EE5A55C31B5F7C2/340029.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}