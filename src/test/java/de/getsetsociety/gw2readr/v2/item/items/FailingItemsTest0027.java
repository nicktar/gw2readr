package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0027 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem12746() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Red Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Red spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12746,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12747() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Yellow Dye\",\"description\":\"Double-click to identify a Common, Uncommon or Rare Dye from the Yellow spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12747,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12748() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Blue Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Blue spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12748,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12749() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Brown Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Brown spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12749,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12750() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Gray Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Gray spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12750,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12751() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Green Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Green spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12751,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12752() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Orange Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Orange spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12752,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12753() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Purple Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Purple spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12753,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12754() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Red Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Red spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12754,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12755() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Yellow Dye\",\"description\":\"Double-click to identify a Common or Uncommon Dye from the Yellow spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12755,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12756() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Blue Dye\",\"description\":\"Double-click to identify a Common Dye from the Blue spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12756,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12757() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Brown Dye\",\"description\":\"Double-click to identify a Common Dye from the Brown spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12757,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12758() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Gray Dye\",\"description\":\"Double-click to identify a Common Dye from the Gray spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12758,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12759() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Green Dye\",\"description\":\"Double-click to identify a Common Dye from the Green spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12759,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12760() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Orange Dye\",\"description\":\"Double-click to identify a Common Dye from the Orange spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12760,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12761() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Purple Dye\",\"description\":\"Double-click to identify a Common Dye from the Purple spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12761,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12762() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Red Dye\",\"description\":\"Double-click to identify a Common Dye from the Red spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12762,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12763() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Yellow Dye\",\"description\":\"Double-click to identify a Common Dye from the Yellow spectrum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":12763,\"icon\":\"https://render.guildwars2.com/file/09206A087606CFC674AC19E1E5CCADB6B3302061/66601.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12795() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lemons in Bulk\",\"description\":\"Double-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12795,\"icon\":\"https://render.guildwars2.com/file/A4473978E5491976B94B7BDACC556899300EB1A8/340002.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12801() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Buttermilk in Bulk\",\"description\":\"Double-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":12801,\"icon\":\"https://render.guildwars2.com/file/45DEC339940909B0D562AB5A7C4D69A4AAAC72C0/340008.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12806() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Hook\",\"description\":\"Used to craft Earrings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12806,\"icon\":\"https://render.guildwars2.com/file/937808956C97A2B86366FA625E16C19CC050599A/63391.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12807() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Hook\",\"description\":\"Used to craft Earrings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12807,\"icon\":\"https://render.guildwars2.com/file/062715067FF243E2FFE26011A1CCE53F6115CF74/219494.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12808() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mithril Hook\",\"description\":\"Used to craft Earrings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12808,\"icon\":\"https://render.guildwars2.com/file/150169E128399268B770AF420607F0B65AB8A0F3/219495.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12809() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orichalcum Hook\",\"description\":\"Used to craft Earrings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12809,\"icon\":\"https://render.guildwars2.com/file/3CC4E23004C5BAB9D0CCDAB10C47E8E86098F6D9/219496.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem12810() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Platinum Hook\",\"description\":\"Used to craft Earrings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":12810,\"icon\":\"https://render.guildwars2.com/file/58FABBC61DCF22DA54263BA6016E040612BC1AD2/219497.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}