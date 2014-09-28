package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0129 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24259() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Piece of Undead\",\"description\":\"This gruesome limb once belonged to one of Zhaitan's undead minions. The asura harvesting team can use this body part for experiments.\nEvent Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24259,\"icon\":\"https://render.guildwars2.com/file/65DDCA4E950159DD14757B02C4B747663B1C18A1/67001.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24264() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Breeze Rider Essence\",\"description\":\"Magical dust from a breezerider. Rixt thinks this is what gives them their ability to fly. He might be interested in this.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24264,\"icon\":\"https://render.guildwars2.com/file/C3D939F37F5CEDB9463F35CB0CEA441A06400F10/66933.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24265() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Encryption Crystal\",\"description\":\"This crystal contains information that will help Frazz gain control of Bauxite Alchemicals faster.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24265,\"icon\":\"https://render.guildwars2.com/file/045C05C2F83A59FC4B6F15073465C5D3040E4DF5/65674.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24272() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Glittering Dust\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24272,\"icon\":\"https://render.guildwars2.com/file/F438A5EFB89C4ED6F8A04FE6E7060D05C294C4C6/434532.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24273() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Shimmering Dust\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24273,\"icon\":\"https://render.guildwars2.com/file/33653CA0C67796BE03A22B5AE3197D0564376700/434533.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24274() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Radiant Dust\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24274,\"icon\":\"https://render.guildwars2.com/file/3F95D5E3E1B07294C7625B36004F6AE76C05E117/434534.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24275() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Luminous Dust\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24275,\"icon\":\"https://render.guildwars2.com/file/DDCA6504E718CA6DFF08F1483A2F356D0F4AEB4A/434535.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24276() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Incandescent Dust\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24276,\"icon\":\"https://render.guildwars2.com/file/3501C2BBADF95BE5F14E31484850E851EFCA33CB/434536.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24277() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Crystalline Dust\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24277,\"icon\":\"https://render.guildwars2.com/file/080D00670558CD9E580D5662030394B2206E92A6/434537.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24278() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Venom Sac\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24278,\"icon\":\"https://render.guildwars2.com/file/C40532E544D99B9A92B703131409390EF36E513A/66934.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24279() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Venom Sac\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24279,\"icon\":\"https://render.guildwars2.com/file/0C04FDFF465A682BB080F272E9DB3DBC0637113D/66935.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24280() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Venom Sac\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24280,\"icon\":\"https://render.guildwars2.com/file/6D1AB79FCCD5E673A0220A39C56E45081B426019/66936.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24281() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Full Venom Sac\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24281,\"icon\":\"https://render.guildwars2.com/file/FE3D2BD0B88077ACE7E808504A3ACB0C4EDAD8D5/66937.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24282() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Potent Venom Sac\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24282,\"icon\":\"https://render.guildwars2.com/file/EA6A4C91F561EC5667947AEFE4CA436D0631CBE3/66938.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24283() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Powerful Venom Sac\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24283,\"icon\":\"https://render.guildwars2.com/file/543EC37900EA2A57E77FA891193A48D66AA224AB/66939.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24284() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Scale\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24284,\"icon\":\"https://render.guildwars2.com/file/129C3E6801966212018033D29B23ABAF5A712615/66940.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24285() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Scale\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24285,\"icon\":\"https://render.guildwars2.com/file/EE0C5C5917BE5B0F1569134E40E80399FFC73E17/66941.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24286() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scale\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24286,\"icon\":\"https://render.guildwars2.com/file/14C880782A481EE8051BDB176E542AF55C6CE663/66942.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24287() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smooth Scale\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24287,\"icon\":\"https://render.guildwars2.com/file/95F72F7A1A3D6D01751148FF3D0D9709366F203B/66943.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24288() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Scale\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24288,\"icon\":\"https://render.guildwars2.com/file/F94ECFFF0FA9C321C108DA34E777B27B0AC9D5F8/66944.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24289() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Armored Scale\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24289,\"icon\":\"https://render.guildwars2.com/file/7061C82F4F9D0C585742F545C40A0F06BE0154DC/66527.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24290() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Weak Blood\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":3,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24290,\"icon\":\"https://render.guildwars2.com/file/C0FB13FB0EDEA8E56676A05F80E3FDC5E92E98E1/66945.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24291() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Thin Blood\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24291,\"icon\":\"https://render.guildwars2.com/file/3008755732C166F3ACF87CC044779C5D95D25896/66946.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24292() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Blood\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24292,\"icon\":\"https://render.guildwars2.com/file/7D0B2A322001D999514908D519590D9B5D04DB35/66947.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24293() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Thick Blood\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24293,\"icon\":\"https://render.guildwars2.com/file/5103E44DB05DE7A9579C98037332294DB209CB72/66948.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}