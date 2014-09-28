package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0029 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12836() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Greatsword Blade\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12836,\"icon\":\"https://render.guildwars2.com/file/1BEC4C47031D054BD0F2CB1CADD134754A7E2F4B/63401.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12837() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Greatsword Blade\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12837,\"icon\":\"https://render.guildwars2.com/file/1B24CBB72F0BEF2FD2B6A89D3475F890B535DF71/340013.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12838() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Greatsword Blade\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12838,\"icon\":\"https://render.guildwars2.com/file/F09F0FD93B3A77F437A7E0A04B9AD09A303CE323/63402.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12839() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Greatsword Blade\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12839,\"icon\":\"https://render.guildwars2.com/file/0DD0EA9C9ABCF71BC5490C33BBCA1FBF04A37C48/219514.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12840() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Greatsword Blade\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12840,\"icon\":\"https://render.guildwars2.com/file/070F67DC773003F9385218320BDBAECA7AA433E6/340014.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Greatsword Blade\",\"description\":\"Used to craft Greatswords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12841,\"icon\":\"https://render.guildwars2.com/file/E30602C762A4F8A17D061264D3D2FED24C9CE840/63403.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12842() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Sword Hilt\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12842,\"icon\":\"https://render.guildwars2.com/file/0FA91E0CC0ECD62EBCD26AB701BC7F7807E049EE/219515.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12843() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Sword Hilt\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12843,\"icon\":\"https://render.guildwars2.com/file/55F6F993A850A9EE07AAFD52D60D213BEC0CB121/340015.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Sword Hilt\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12844,\"icon\":\"https://render.guildwars2.com/file/25293101ECCA39A3A194030BD67190DE3E994DD0/63405.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12845() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Sword Hilt\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12845,\"icon\":\"https://render.guildwars2.com/file/069FC02B07765643A02AF8A292B701A0FB15EAB4/219516.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Sword Hilt\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12846,\"icon\":\"https://render.guildwars2.com/file/C075571EC1D65BA9FDAB9BB340FB691898CC27B2/340016.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Sword Hilt\",\"description\":\"Used to craft Swords.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12847,\"icon\":\"https://render.guildwars2.com/file/7F02A3EDBB63E3F41C79A41CE2BE1AD93C04F0E3/219517.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12848() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Axe Blade\",\"description\":\"Used to craft Axes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12848,\"icon\":\"https://render.guildwars2.com/file/506326940E5A1F0FE92EB6AB18F10EF4336FA71D/63407.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12849() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Axe Blade\",\"description\":\"Used to craft Axes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12849,\"icon\":\"https://render.guildwars2.com/file/440E00F9B5E326A009A640C7A4E90464AEA60138/340017.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12850() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Axe Blade\",\"description\":\"Used to craft Axes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12850,\"icon\":\"https://render.guildwars2.com/file/D8BC642E4901B980082E576021BC21C7FBFD00F2/63408.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12851() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Axe Blade\",\"description\":\"Used to craft Axes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12851,\"icon\":\"https://render.guildwars2.com/file/6CB70CE2519E6874AA057EEA09B35AAB3ACE722F/219518.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12852() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Axe Blade\",\"description\":\"Used to craft Axes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12852,\"icon\":\"https://render.guildwars2.com/file/332ED0171D2EA7A30D2B93E82813F543A45D637D/340018.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12853() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Axe Blade\",\"description\":\"Used to craft Axes.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12853,\"icon\":\"https://render.guildwars2.com/file/DBCC9A65ED3100B5CB6572049C1F6E39186F576B/63409.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12854() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Dagger Blade\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12854,\"icon\":\"https://render.guildwars2.com/file/7DC9DC7A21803D19CD9FF87561CC983FF608C71C/63410.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12855() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Dagger Blade\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12855,\"icon\":\"https://render.guildwars2.com/file/17C7044D04ED70010DDAAB51BC563D38CFD5EC7D/340019.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12856() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Dagger Blade\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12856,\"icon\":\"https://render.guildwars2.com/file/1346D75B7B4E0639C2782853D59CBE1C19472B75/63411.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12857() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Dagger Blade\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12857,\"icon\":\"https://render.guildwars2.com/file/1730B01251EEC330C9DD5B97CC7701E66F03CFA3/219519.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12858() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Dagger Blade\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12858,\"icon\":\"https://render.guildwars2.com/file/7F0EC84DF64A7939B40E1DCEDC5D06FFFD9FAC92/340020.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12859() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Dagger Blade\",\"description\":\"Used to craft Daggers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12859,\"icon\":\"https://render.guildwars2.com/file/0C03A8DDC52279EF2F7A0214AE067B0CFA4C1178/63412.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12860() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bronze Hammer Head\",\"description\":\"Used to craft Hammers.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12860,\"icon\":\"https://render.guildwars2.com/file/E0B3940B1A25F6A6C7536DB6077346AF9E1ACF22/63413.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}