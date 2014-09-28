package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0019 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem9427() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Oiled Pack\",\"description\":\"8 Slots. If possible, junk items will fill this pack before other empty spaces. The contents of this pack will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9427,\"icon\":\"https://render.guildwars2.com/file/3594D7A234AA05CC1819F9EADB63352A4F453624/63201.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9429() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Equipment Box\",\"description\":\"8 Slots. If possible, weapons and armor will fill this box before other empty spaces. The contents of this box will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9429,\"icon\":\"https://render.guildwars2.com/file/18AB9C1B05A82D5EF6CA4B16E2F7D4309BE705CF/63203.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9430() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Safe Box\",\"description\":\"8 Slots. Items in this box will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9430,\"icon\":\"https://render.guildwars2.com/file/6FA3D6DD063DA3F6C61D7C60C6EF486E5040FEF0/63204.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9437() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Invisible Pack\",\"description\":\"10 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9437,\"icon\":\"https://render.guildwars2.com/file/DF94F2EBFF2EB6FF4B70A512BE28A253F7E207D8/63207.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9439() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Oiled Pack\",\"description\":\"10 Slots. If possible, junk items will fill this pack before other empty spaces. The contents of this pack will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9439,\"icon\":\"https://render.guildwars2.com/file/314EC83508FBFB1863BF903104CECACA283FDB0B/63208.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9444() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Invisible Pack\",\"description\":\"12 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9444,\"icon\":\"https://render.guildwars2.com/file/E7B21222187425EC2C091D05745DB95B0144D608/63211.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9445() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Oiled Pack\",\"description\":\"12 Slots. If possible, junk items will fill this pack before other empty spaces. The contents of this pack will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9445,\"icon\":\"https://render.guildwars2.com/file/B346F840A0E8D92A6AE99B61476C1601912E0D97/63212.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9448() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Invisible Pack\",\"description\":\"15 Slots. Items in this pack will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9448,\"icon\":\"https://render.guildwars2.com/file/F9AB2DC763770E5FD8B70B7E92D8EDEC58540872/63215.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9449() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Oiled Pack\",\"description\":\"15 Slots. If possible, junk items will fill this pack before other empty spaces. The contents of this pack will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9449,\"icon\":\"https://render.guildwars2.com/file/3678F6E7ED982EC19C0EAD42A80B6CB612D7E46A/63216.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9451() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Equipment Box\",\"description\":\"10 Slots. If possible, weapons and armor will fill this box before other empty spaces. The contents of this box will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9451,\"icon\":\"https://render.guildwars2.com/file/72D04673660ECB7FD904680D487030A41106F952/63218.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9454() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Safe Box\",\"description\":\"10 Slots. Items in this box will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9454,\"icon\":\"https://render.guildwars2.com/file/24013DFE2B566468B00C516091DA05F6A4AEF477/63219.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9459() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Equipment Box\",\"description\":\"15 Slots. If possible, weapons and armor will fill this box before other empty spaces. The contents of this box will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9459,\"icon\":\"https://render.guildwars2.com/file/70CA307D3B2B740C71D19CDB20030C51EBE8F6E8/63222.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9462() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Safe Box\",\"description\":\"15 Slots. Items in this box will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9462,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9466() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Safe Box\",\"description\":\"12 Slots. Items in this box will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":43,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9466,\"icon\":\"https://render.guildwars2.com/file/FA45E8AA0647407DAA1604BF3A2B616B25C1AF42/63226.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9468() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Equipment Box\",\"description\":\"12 Slots. If possible, weapons and armor will fill this box before other empty spaces. The contents of this box will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":43,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9468,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9478() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Craftsman's Bag\",\"description\":\"8 Slots. If possible, crafting materials and upgrade components will fill this bag before other empty spaces. The contents of this bag will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9478,\"icon\":\"https://render.guildwars2.com/file/3A1F0BEFA4AD0FC7E2F2E2C6000B747F5BDF109D/219374.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9480() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"8 Slot Invisible Bag\",\"description\":\"8 Slots. Items in this bag will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9480,\"icon\":\"https://render.guildwars2.com/file/647CF53A7C4903C2E09091CBDC4F215834C50A4B/219376.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":8}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9482() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Craftsman's Bag\",\"description\":\"10 Slots. If possible, crafting materials and upgrade components will fill this bag before other empty spaces. The contents of this bag will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9482,\"icon\":\"https://render.guildwars2.com/file/EB59480D5B71744AB0B6EA6492C4C336171F2F05/219378.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9484() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"10 Slot Invisible Bag\",\"description\":\"10 Slots. Items in this bag will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9484,\"icon\":\"https://render.guildwars2.com/file/34D9D09801FE3670606D412F0F4DC7B70F05CC0F/219380.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":10}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9486() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Craftsman's Bag\",\"description\":\"12 Slots. If possible, crafting materials and upgrade components will fill this bag before other empty spaces. The contents of this bag will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9486,\"icon\":\"https://render.guildwars2.com/file/0E6C68650215E57CA60159C0600CF6E5B8E111C8/219382.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9488() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"12 Slot Invisible Bag\",\"description\":\"12 Slots. Items in this bag will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9488,\"icon\":\"https://render.guildwars2.com/file/96084B0726D57A76A209E2E5913403CB9A5B7AFE/219384.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":12}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9491() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Invisible Bag\",\"description\":\"15 Slots. Items in this bag will never appear in a sell-to-vendor list and will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9491,\"icon\":\"https://render.guildwars2.com/file/045EA230DA805F952006F49802F8BEDA07F3C001/219387.png\",\"details\":{\"no_sell_or_sort\":true,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9494() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15 Slot Craftsman's Bag\",\"description\":\"15 Slots. If possible, crafting materials and upgrade components will fill this bag before other empty spaces. The contents of this bag will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9494,\"icon\":\"https://render.guildwars2.com/file/F7B1797155E89F3B1A1B44A344AFECE308E8C3AF/219389.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9566() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Silk Bag\",\"description\":\"18 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9566,\"icon\":\"https://render.guildwars2.com/file/F8230D6D750D7208D68010D87DEBAAB97E51DBDB/219395.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem9567() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"18 Slot Craftsman's Bag\",\"description\":\"18 Slots. If possible, crafting materials and upgrade components will fill this bag before other empty spaces. The contents of this bag will not move when inventory is sorted.\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":9567,\"icon\":\"https://render.guildwars2.com/file/119B6643B4B842BB0DDBE76122D865C2C595B326/433573.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":18}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}