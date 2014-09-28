package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0275 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem62963() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Practical Armorsmith's Tools\",\"description\":\"Component for Armorsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62963,\"icon\":\"https://render.guildwars2.com/file/474DCD9F04424901CF34334BBEDD3E385BFA0EEF/866748.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62964() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Armorsmith's Tools\",\"description\":\"Component for Armorsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62964,\"icon\":\"https://render.guildwars2.com/file/0FD7A3BF5766B6CF0BB5B590FC0DDF7B42ECE7BE/866749.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62965() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Armorsmith's Tools\",\"description\":\"Component for Armorsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62965,\"icon\":\"https://render.guildwars2.com/file/D24906E1F1A06C90DE1226E3E1D666AF6E012E00/866750.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62966() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elegant Armorsmith's Tools\",\"description\":\"Component for Armorsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62966,\"icon\":\"https://render.guildwars2.com/file/517CFB77B59949DC4CAA99035D72A67F7596901D/866751.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62967() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Huntsman's Tools\",\"description\":\"Component for Huntsman's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62967,\"icon\":\"https://render.guildwars2.com/file/ACF90EDAA3767B9C363B92310D2BEE48DC04FC70/866732.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62968() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sturdy Artificer's Tools\",\"description\":\"Component for Artificer's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62968,\"icon\":\"https://render.guildwars2.com/file/C807A2C449142D7BFADE15A16962FB0FA3A4AB13/866731.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62969() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Practical Artificer's Tools\",\"description\":\"Component for Artificer's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62969,\"icon\":\"https://render.guildwars2.com/file/EDF2D3E3EBB0D05B3B68FE95C740B7655D945EDC/866733.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62970() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Artificer's Tools\",\"description\":\"Component for Artificer's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62970,\"icon\":\"https://render.guildwars2.com/file/7D9B67CFCA52B00ED5BC7D4A045F14A695757A0A/866752.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62971() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Artificer's Tools\",\"description\":\"Component for Artificer's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62971,\"icon\":\"https://render.guildwars2.com/file/16759F6AD5A297F49D0F564C26B531457836B46B/866753.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62972() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elegant Artificer's Tools\",\"description\":\"Component for Artificer's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62972,\"icon\":\"https://render.guildwars2.com/file/13F6256868B921FDBCEE1340EDB4A3F066BA484B/866754.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62973() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Tailor's Tools\",\"description\":\"Component for Tailor's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62973,\"icon\":\"https://render.guildwars2.com/file/53C241CC0F7DDD2CD6B1F2BB3504491849F60A3D/866755.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62974() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sturdy Tailor's Tools\",\"description\":\"Component for Tailor's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62974,\"icon\":\"https://render.guildwars2.com/file/53C241CC0F7DDD2CD6B1F2BB3504491849F60A3D/866755.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62975() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Practical Tailor's Tools\",\"description\":\"Component for Tailor's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62975,\"icon\":\"https://render.guildwars2.com/file/4DFC51A8A80B630A22ABAF995940EEAB5B2DF833/866756.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62976() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Tailor's Tools\",\"description\":\"Component for Tailor's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62976,\"icon\":\"https://render.guildwars2.com/file/DFB602140E2A7290A81E44B291FADAF6BB383241/866757.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62977() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Tailor's Tools\",\"description\":\"Component for Tailor's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62977,\"icon\":\"https://render.guildwars2.com/file/A318714D9257556CD41856ECE25EC1E2A72EC42B/866758.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62978() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elegant Tailor's Tools\",\"description\":\"Component for Tailor's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62978,\"icon\":\"https://render.guildwars2.com/file/03591E3BC7957E7D615861BBDB6EB0A8BBDE4B72/866759.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62979() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Jeweler's Tools\",\"description\":\"Component for Jeweler's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62979,\"icon\":\"https://render.guildwars2.com/file/ACF90EDAA3767B9C363B92310D2BEE48DC04FC70/866732.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62980() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sturdy Jeweler's Tools\",\"description\":\"Component for Jeweler's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62980,\"icon\":\"https://render.guildwars2.com/file/ACF90EDAA3767B9C363B92310D2BEE48DC04FC70/866732.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62981() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Practical Jeweler's Tools\",\"description\":\"Component for Jeweler's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62981,\"icon\":\"https://render.guildwars2.com/file/10A4911BF714A1D211A1657195FBB3092376D869/866760.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62982() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Jeweler's Tools\",\"description\":\"Component for Jeweler's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62982,\"icon\":\"https://render.guildwars2.com/file/0F4D54730F0C04B9AAA93C17C0C8152BFF5991AC/866734.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62983() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Jeweler's Tools\",\"description\":\"Component for Jeweler's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62983,\"icon\":\"https://render.guildwars2.com/file/4B333F2CAA4D0C3AE93795BDB9CBFA5CF3764F07/866736.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62984() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elegant Jeweler's Tools\",\"description\":\"Component for Jeweler's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62984,\"icon\":\"https://render.guildwars2.com/file/BE57045D0A1A26D62753199934DC3CD20149167A/866735.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62985() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Chef's Tools\",\"description\":\"Component for Chef's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62985,\"icon\":\"https://render.guildwars2.com/file/0D4E4A542C66F3B3ED3A3F393BF34BA2A3A110DE/866761.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62986() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Basic Chef's Tools\",\"description\":\"Component for Chef's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62986,\"icon\":\"https://render.guildwars2.com/file/0D4E4A542C66F3B3ED3A3F393BF34BA2A3A110DE/866761.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62987() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Savory Chef's Tools\",\"description\":\"Component for Chef's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62987,\"icon\":\"https://render.guildwars2.com/file/E2CB1301ECEF0D7DB2A42394F3B4272368A12FE0/866762.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}