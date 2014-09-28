package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0067 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bolt of Wool\",\"description\":\"Refined from Scraps.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19740,\"icon\":\"https://render.guildwars2.com/file/E9BB423BDD0D54E33B020DAFFAFBE6F75A62F003/63545.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cotton Scrap\",\"description\":\"Refine into Bolts.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19741,\"icon\":\"https://render.guildwars2.com/file/3C013701E6252F3F100D2559BE4E47546CE1E82F/65957.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19742() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bolt of Cotton\",\"description\":\"Refined from Scraps.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19742,\"icon\":\"https://render.guildwars2.com/file/2EA1366176E09ECFCA1E93441ACAEF10E7C93B7A/63542.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19743() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Linen Scrap\",\"description\":\"Refine into Bolts.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19743,\"icon\":\"https://render.guildwars2.com/file/28536CD63C63047DA7DA9F7923923461DCFC5860/65958.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19744() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bolt of Linen\",\"description\":\"Refined from Scraps.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19744,\"icon\":\"https://render.guildwars2.com/file/7CD96276BF2094F5A17EB520DAA5123F04023102/63575.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19745() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gossamer Scrap\",\"description\":\"Refine into Bolts.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19745,\"icon\":\"https://render.guildwars2.com/file/0CB2040408D0789690575FFE3532F3C34B693C6F/340417.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19746() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bolt of Gossamer\",\"description\":\"Refined from Scraps.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19746,\"icon\":\"https://render.guildwars2.com/file/7FBA68B71DB805E416315067DD0DDEEB204CFC65/63577.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19747() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bolt of Silk\",\"description\":\"Refined from Scraps.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19747,\"icon\":\"https://render.guildwars2.com/file/17570FF5167A03B42605BEE44AFFF0547E07C0F4/65960.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19748() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silk Scrap\",\"description\":\"Refine into Bolts.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19748,\"icon\":\"https://render.guildwars2.com/file/021DA825F2092327B1C6BC09EC77BD5DE5B4770D/65961.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19750() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lump of Coal\",\"description\":\"Used with Iron to refine Steel. Can be purchased from Master Craftsmen.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19750,\"icon\":\"https://render.guildwars2.com/file/3728DC6E10FA4DADCD3B0918A70FAE9DEA96BDD4/65962.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19757() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elder Wood Dowel\",\"description\":\"Fashioned from Wood Planks and used to craft Inscriptions.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19757,\"icon\":\"https://render.guildwars2.com/file/BDEAEB0F2A28614313386FD41E07F1D10E4B5775/455860.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19758() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Wood Dowel\",\"description\":\"Fashioned from Wood Planks and used to craft Inscriptions.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19758,\"icon\":\"https://render.guildwars2.com/file/0C6871D2069E2C074A93E205C9C7097DBF0E9D13/65963.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19759() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Wood Dowel\",\"description\":\"Fashioned from Wood Planks and used to craft Inscriptions.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19759,\"icon\":\"https://render.guildwars2.com/file/0ED51B6C95431412A501BD9A79CBF22346C2E2B1/455861.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seasoned Wood Dowel\",\"description\":\"Fashioned from Wood Planks and used to craft Inscriptions.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19760,\"icon\":\"https://render.guildwars2.com/file/69121409E63DCD081F220E1C0DFED9D5A240BD74/65964.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19761() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Soft Wood Dowel\",\"description\":\"Fashioned from Wood Planks and used to craft Inscriptions.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19761,\"icon\":\"https://render.guildwars2.com/file/7EF260ECA9BAF72DF10A7FCDC9564E9ADF5C23C0/65965.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19762() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19762,\"icon\":\"https://render.guildwars2.com/file/4267B067A172D2413318C2E0BFF608B12A79C9BC/65966.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19763() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Green Inscription\",\"description\":\"Used in the crafting of weapons with +Power.\",\"type\":\"CraftingMaterial\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19763,\"icon\":\"https://render.guildwars2.com/file/220AA995B67C5A624D5447910644BC057FB3A7CE/65967.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19764() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Hard Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19764,\"icon\":\"https://render.guildwars2.com/file/ACDA52EE71C72C3580FEFB51071398D2A29A0202/340419.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19765() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Soft Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19765,\"icon\":\"https://render.guildwars2.com/file/BAC925032A62E33A770E2EAB0DE754E8DAC4607D/65969.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19766() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Berserker's Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19766,\"icon\":\"https://render.guildwars2.com/file/433A0372D7FD3A3100EEE6DFDE1A1A9774F049A9/65970.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19767() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Bronze Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power.\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19767,\"icon\":\"https://render.guildwars2.com/file/A42A35BB267169F756C675CA0D7E1C0FE40C9652/65971.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19768() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Steel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19768,\"icon\":\"https://render.guildwars2.com/file/B3280BB8AEF10E010B68D7EA6D5FBA562DF2D73A/65972.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19769() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Iron Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19769,\"icon\":\"https://render.guildwars2.com/file/DA49EEAA3146BCF6D84F0142CB249E2A11FFAB1D/65973.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19770() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Strong Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19770,\"icon\":\"https://render.guildwars2.com/file/EB90FBAD3BB9BC396905F861D4EAAB2A036FA1ED/65974.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19771() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19771,\"icon\":\"https://render.guildwars2.com/file/7D5EC6D40473910BA8D7194C4BE15EDCB7CEF8B6/65975.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}