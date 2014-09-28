package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0040 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13111() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Boot Lining\",\"description\":\"Used to craft Iron Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13111,\"icon\":\"https://render.guildwars2.com/file/C01DC25C37F0A8005E4CAE5668E3119DA4640FC4/222870.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13112() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Armguard Panel\",\"description\":\"Used to craft Iron Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13112,\"icon\":\"https://render.guildwars2.com/file/71D4F20A60294C6CA578E00EF10502255A5430D1/222854.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13113() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Pauldron Casing\",\"description\":\"Used to craft Iron Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13113,\"icon\":\"https://render.guildwars2.com/file/C06A10BA569D46089E6FEC069F0B772D0A39B3A7/340089.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13114() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Boot Panel\",\"description\":\"Used to craft Iron Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13114,\"icon\":\"https://render.guildwars2.com/file/05DD07DB6AEFC3F917C40319BB0FDD6D027BEE07/222850.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13115() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Chest Padding\",\"description\":\"Used to craft Iron Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13115,\"icon\":\"https://render.guildwars2.com/file/F3C601B1F1480D05A4180C01C4277FB0AA314DB6/222872.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13116() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Chest Panel\",\"description\":\"Used to craft Iron Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13116,\"icon\":\"https://render.guildwars2.com/file/BAAF1909E8E76690BF0248DC137294B2EDB5B2BC/222852.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13117() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Armguard Lining\",\"description\":\"Used to craft Iron Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13117,\"icon\":\"https://render.guildwars2.com/file/9470F25EEC43272B30D2907ED061E173B9D6E76B/222874.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13118() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Casque Lining\",\"description\":\"Used to craft Iron Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13118,\"icon\":\"https://render.guildwars2.com/file/35E701F7BD931D406DDB9A7511E8A858B5F927BA/222876.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13119() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Casque Casing\",\"description\":\"Used to craft Iron Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13119,\"icon\":\"https://render.guildwars2.com/file/4E55BB99A10C9C724AE35253EC91B780A75F62F3/222856.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13120() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Legging Lining\",\"description\":\"Used to craft Iron Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13120,\"icon\":\"https://render.guildwars2.com/file/5003B506C9FC60A1CE7473B8E24AD4F73F136709/222878.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13121() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Scale Legging Panel\",\"description\":\"Used to craft Iron Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13121,\"icon\":\"https://render.guildwars2.com/file/9BA2163570E4504918E79507375AEE3E40C2DA06/340097.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13122() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Pauldron Lining\",\"description\":\"Used to craft Iron Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13122,\"icon\":\"https://render.guildwars2.com/file/0095BE7DCDBD5C01AFB99359EE54BD55AAA15198/222880.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13123() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Boot Casing\",\"description\":\"Used to craft Steel Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13123,\"icon\":\"https://render.guildwars2.com/file/4F16336FA7AAB2E77D7F78ECBB481367315557FE/222860.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13124() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Pauldron Casing\",\"description\":\"Used to craft Steel Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13124,\"icon\":\"https://render.guildwars2.com/file/75F86703ABBC2B714344D47C09543778B591C232/340100.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13125() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Boot Lining\",\"description\":\"Used to craft Steel Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13125,\"icon\":\"https://render.guildwars2.com/file/E04C704F0F02F6737E53DA203BFA5F3D2FEBD80B/340101.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13126() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Chestplate Padding\",\"description\":\"Used to craft Steel Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13126,\"icon\":\"https://render.guildwars2.com/file/3451075C757D19D3EA15FAC154EFBD39FEC0B9B3/222840.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13127() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Chestplate Panel\",\"description\":\"Used to craft Steel Coats.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13127,\"icon\":\"https://render.guildwars2.com/file/C596061EA5B40064DEF008212746737794219ABD/222862.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13128() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Gauntlet Lining\",\"description\":\"Used to craft Steel Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13128,\"icon\":\"https://render.guildwars2.com/file/B99314F02E6E045D08AA300246FE6753F924AF0F/222842.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13129() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Gauntlet Plates\",\"description\":\"Used to craft Steel Gloves.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13129,\"icon\":\"https://render.guildwars2.com/file/3C2F4BF1A10E1CF6EB537706F7260CAC29B2C35E/222864.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13130() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Helmet Lining\",\"description\":\"Used to craft Steel Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13130,\"icon\":\"https://render.guildwars2.com/file/607CC0AC0D9D3A6DBB7112A864D75574A5437669/222844.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13131() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Helmet Casing\",\"description\":\"Used to craft Steel Helms.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13131,\"icon\":\"https://render.guildwars2.com/file/9504FE5AC044BC369B149C39E5CB26C59909CB39/222866.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13132() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Legging Lining\",\"description\":\"Used to craft Steel Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13132,\"icon\":\"https://render.guildwars2.com/file/08DFD908F4572AE030D8C2C9144AC863B65B990B/222846.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13133() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Legging Panel\",\"description\":\"Used to craft Steel Leggings.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13133,\"icon\":\"https://render.guildwars2.com/file/CBA9C2F00EF9DA6AC51439B50BE2CAC3F29E5469/222868.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13134() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Steel Splint Pauldron Lining\",\"description\":\"Used to craft Steel Shoulders.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13134,\"icon\":\"https://render.guildwars2.com/file/E92BCA4654B36DCEE03E099D0A302A2B9A357336/222848.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13135() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Darksteel Boot Casing\",\"description\":\"Used to craft Darksteel Boots.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":13135,\"icon\":\"https://render.guildwars2.com/file/EEBEA84BC90DF0221ED4A6D9AD3A61B8786F580D/340111.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}