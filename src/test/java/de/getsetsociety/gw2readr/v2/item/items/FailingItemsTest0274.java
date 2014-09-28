package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0274 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem62377() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Discharging Pole\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":62377,\"icon\":\"https://render.guildwars2.com/file/009BF7054DD8F777207999EC76EA747801A4CA56/62802.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62378() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tuneblade\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":62378,\"icon\":\"https://render.guildwars2.com/file/10DEC3A0EB435E9015260E0C2B34EF2DD36ABEEB/434566.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62379() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Phosphor Brand\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":62379,\"icon\":\"https://render.guildwars2.com/file/A1EBD2A1442009D269D1FF132D5ED342D553411F/62801.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62380() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cragvox\",\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":62380,\"icon\":\"https://render.guildwars2.com/file/C53447B67026644C55327A0C420A16A7A33468CB/62795.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62942() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crafter's Backpack Frame\",\"description\":\"Base frame for all crafter's backpacks. Can be purchased from Master Craftsmen.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62942,\"icon\":\"https://render.guildwars2.com/file/BEF40DDFC9240727741A0704AD04FA01D2DA4E2A/866730.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62943() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Artificer's Tools\",\"description\":\"Component for Artificer's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62943,\"icon\":\"https://render.guildwars2.com/file/C807A2C449142D7BFADE15A16962FB0FA3A4AB13/866731.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62944() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sturdy Huntsman's Tools\",\"description\":\"Component for Huntsman's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62944,\"icon\":\"https://render.guildwars2.com/file/ACF90EDAA3767B9C363B92310D2BEE48DC04FC70/866732.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62945() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Practical Huntsman's Tools\",\"description\":\"Component for Huntsman's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62945,\"icon\":\"https://render.guildwars2.com/file/EDF2D3E3EBB0D05B3B68FE95C740B7655D945EDC/866733.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62946() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Huntsman's Tools\",\"description\":\"Component for Huntsman's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62946,\"icon\":\"https://render.guildwars2.com/file/0F4D54730F0C04B9AAA93C17C0C8152BFF5991AC/866734.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62947() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Huntsman's Tools\",\"description\":\"Component for Huntsman's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62947,\"icon\":\"https://render.guildwars2.com/file/BE57045D0A1A26D62753199934DC3CD20149167A/866735.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62948() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elegant Huntsman's Tools\",\"description\":\"Component for Huntsman's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62948,\"icon\":\"https://render.guildwars2.com/file/4B333F2CAA4D0C3AE93795BDB9CBFA5CF3764F07/866736.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62949() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Weaponsmith's Tools\",\"description\":\"Component for Weaponsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62949,\"icon\":\"https://render.guildwars2.com/file/0DEAEB1B3D9C46C60EE2E10C20EAA0767F047701/866737.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62950() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sturdy Weaponsmith's Tools\",\"description\":\"Component for Weaponsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62950,\"icon\":\"https://render.guildwars2.com/file/0DEAEB1B3D9C46C60EE2E10C20EAA0767F047701/866737.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62951() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Practical Weaponsmith's Tools\",\"description\":\"Component for Weaponsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62951,\"icon\":\"https://render.guildwars2.com/file/5E59C90CE6D0330854D54D9F21A90CCFF334C404/866738.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62952() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Weaponsmith's Tools\",\"description\":\"Component for Weaponsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62952,\"icon\":\"https://render.guildwars2.com/file/4120280F5D69B59A9C3EFF2D6C6902792B18BD0B/866739.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62953() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Weaponsmith's Tools\",\"description\":\"Component for Weaponsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62953,\"icon\":\"https://render.guildwars2.com/file/E13BF69A6B3DD9AB3E1EC7380DC469917CDC9094/866740.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62954() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elegant Weaponsmith's Tools\",\"description\":\"Component for Weaponsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62954,\"icon\":\"https://render.guildwars2.com/file/216A73E100739FA450F39AB33438C2E511C147E8/866741.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62955() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Practical Leatherworker's Tools\",\"description\":\"Component for Leatherworker's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62955,\"icon\":\"https://render.guildwars2.com/file/7D68CDA2A53E2F600911A66F7B44D35E0D77FFD1/866742.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sturdy Leatherworker's Tools\",\"description\":\"Component for Leatherworker's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62956,\"icon\":\"https://render.guildwars2.com/file/13DC57BEDE723D3C1B3ABA6CC84701370FA84633/866743.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Leatherworker's Tools\",\"description\":\"Component for Leatherworker's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62957,\"icon\":\"https://render.guildwars2.com/file/13DC57BEDE723D3C1B3ABA6CC84701370FA84633/866743.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62958() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Leatherworker's Tools\",\"description\":\"Component for Leatherworker's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62958,\"icon\":\"https://render.guildwars2.com/file/F17DF69FC64AD6297AE22AF0DE3801E6090B3EA4/866744.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62959() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ornate Leatherworker's Tools\",\"description\":\"Component for Leatherworker's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62959,\"icon\":\"https://render.guildwars2.com/file/34679052E740E704C6A9206C62DB66FAB960A067/866745.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Elegant Leatherworker's Tools\",\"description\":\"Component for Leatherworker's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":64,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62960,\"icon\":\"https://render.guildwars2.com/file/7230D10C26B51EF5E80CE0B5425E7D12904E0625/866746.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Simple Armorsmith's Tools\",\"description\":\"Component for Armorsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62961,\"icon\":\"https://render.guildwars2.com/file/13332B74A1A42C7420B0040F0911236530086AAC/866747.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem62962() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sturdy Armorsmith's Tools\",\"description\":\"Component for Armorsmith's Backpack\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":62962,\"icon\":\"https://render.guildwars2.com/file/13332B74A1A42C7420B0040F0911236530086AAC/866747.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}