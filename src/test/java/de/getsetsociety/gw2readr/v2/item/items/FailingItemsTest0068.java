package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0068 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19772() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise Bronze Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Precision.\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19772,\"icon\":\"https://render.guildwars2.com/file/038001E45CB002442FFD124D4DEB02B374BC8059/65976.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19773() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Knight's Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness, +Power, and +Precision.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19773,\"icon\":\"https://render.guildwars2.com/file/939AEF75385E73F6DEFB635ED8B4680CBD0F426E/340425.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19774() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Steel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19774,\"icon\":\"https://render.guildwars2.com/file/B0E65E276EA7CF2D27CCEE7B69ABFE5DAF3FC8D5/340426.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19775() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rampager's Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Precision, +Condition Damage, and +Power.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19775,\"icon\":\"https://render.guildwars2.com/file/AB49649A3F02991A4656150E062E9771D1073A01/340427.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19776() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise Green Inscription\",\"description\":\"Used in the crafting of weapons with +Precision.\",\"type\":\"CraftingMaterial\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19776,\"icon\":\"https://render.guildwars2.com/file/7B17B5191DEBE62A08E6C0BF61752B0219D5C0B0/65980.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19777() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honed Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with +Power and +Ferocity.\",\"type\":\"CraftingMaterial\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19777,\"icon\":\"https://render.guildwars2.com/file/1F6D0B6F68CC9411FB690CD99FA0CCBCEC957BFD/340428.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19778() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19778,\"icon\":\"https://render.guildwars2.com/file/35EB4C9BBB459B0A220B050253CCC9FFFED6C4A9/340429.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19779() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vital Bronze Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19779,\"icon\":\"https://render.guildwars2.com/file/0D384FF8B90DBB321A5BBC95EF36373D4DF47CD8/65983.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19780() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Darksteel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19780,\"icon\":\"https://render.guildwars2.com/file/2BCF946005C0ADB864311D110907F840A209AB0F/340430.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19781() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Steel Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19781,\"icon\":\"https://render.guildwars2.com/file/AA0CFAFE171FF27AD9C201026EF676FFD3C1779B/65985.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19782() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cleric's Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Healing Power, +Power, and +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19782,\"icon\":\"https://render.guildwars2.com/file/70053CAC9762557D7D07F87FF90233623D340607/340432.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19783() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vital Green Inscription\",\"description\":\"Used in the crafting of weapons with +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19783,\"icon\":\"https://render.guildwars2.com/file/11C41A3B69CA387A774794060824CBD923A4413A/65987.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19784() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Mithril Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":33,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19784,\"icon\":\"https://render.guildwars2.com/file/BA0E14B6A36752745197D3FC473F49F54051CBB5/340433.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19785() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient Bronze Plated Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":12,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19785,\"icon\":\"https://render.guildwars2.com/file/5C00C4111804157C6AB0A9100E011F0D7AD5AC5E/65989.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19786() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valkyrie Elder Inscription\",\"description\":\"Used in the crafting of weapons with +Power, +Ferocity, and +Vitality.\",\"type\":\"CraftingMaterial\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19786,\"icon\":\"https://render.guildwars2.com/file/7FD7D1B369017FCA36FC7AD52B4DB8B6393630FA/340434.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19787() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient Green Inscription\",\"description\":\"Used in the crafting of weapons with +Toughness.\",\"type\":\"CraftingMaterial\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19787,\"icon\":\"https://render.guildwars2.com/file/5194A159DC0A3F7C4F9C1397D5FFA22A635B4090/65991.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19788() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hunter's Seasoned Inscription\",\"description\":\"Used in the crafting of weapons with +Precision and +Power.\",\"type\":\"CraftingMaterial\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19788,\"icon\":\"https://render.guildwars2.com/file/5D1352041AA26791056ED492F1D9019CEBFA2D66/340435.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19789() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Wool Thread\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19789,\"icon\":\"https://render.guildwars2.com/file/72553F1D20D469715EBE7A61BE015A4E790D0136/65682.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19790() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Gossamer Thread\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19790,\"icon\":\"https://render.guildwars2.com/file/B7CFD70F53A845E4ED1212040C18C123FC172910/65959.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19791() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Silk Thread\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19791,\"icon\":\"https://render.guildwars2.com/file/F0AAA7E7242CCE6707AABB0197B262991AC0F396/65993.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19792() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Jute Thread\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19792,\"icon\":\"https://render.guildwars2.com/file/C7C2E54962F3A20745FF94DFBC1BFF11CF9DEA5E/65994.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19793() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Linen Thread\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19793,\"icon\":\"https://render.guildwars2.com/file/38044072CE390CF9D036AE514E45A0047F7AD0CE/65995.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19794() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spool of Cotton Thread\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19794,\"icon\":\"https://render.guildwars2.com/file/CA4D34A3DC110C25E39F290EA020070E0D006B08/65996.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19795() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mighty Jute Insignia\",\"description\":\"Used in the crafting of armor with +Power.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19795,\"icon\":\"https://render.guildwars2.com/file/9B2BCD0478DD3E19FE9D0DF6305BB89B6C9A2234/65997.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19796() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Precise Jute Insignia\",\"description\":\"Used in the crafting of armor with +Precision.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19796,\"icon\":\"https://render.guildwars2.com/file/A361355E0AD9FC2872D3B0DEC22B23A00BA19D25/65998.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}