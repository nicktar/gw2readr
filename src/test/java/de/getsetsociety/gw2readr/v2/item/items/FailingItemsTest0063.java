package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0063 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19626() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Fortune\",\"description\":\"A gift of fortune used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19626,\"icon\":\"https://render.guildwars2.com/file/62A0F109C444E275E966B9A903D63FFE99540BAD/455807.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19627() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Nature\",\"description\":\"A gift of nature used to create Kudzu.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19627,\"icon\":\"https://render.guildwars2.com/file/547F34D0DEB3597314A57B6C06E69E4CBE584352/455808.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19628() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unicorn Statue\",\"description\":\"A unicorn statue used to create The Dreamer.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19628,\"icon\":\"https://render.guildwars2.com/file/C3A8D8D8E2DDD1E2C071BBC7BF322CDDD572C570/455809.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19629() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of History\",\"description\":\"A gift of history used to create The Flameseeker Prophecies.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19629,\"icon\":\"https://render.guildwars2.com/file/62FA9F9C0204C105ED0555A2510D573A60C0A1EC/455810.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19630() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Music\",\"description\":\"A gift of music used to create The Minstrel.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19630,\"icon\":\"https://render.guildwars2.com/file/6843F44BDB117AC7DD063EF6E35392B027672C69/455811.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19631() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Darkness\",\"description\":\"A gift of darkness used to create Twilight.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19631,\"icon\":\"https://render.guildwars2.com/file/255A5E0CC05144DD5638D9A8E4A25FA12FA042DA/455812.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19632() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Light\",\"description\":\"A gift of light used to create Sunrise.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19632,\"icon\":\"https://render.guildwars2.com/file/9BBF3A1FF80564570D5569EC7FA8F17858C63EC9/455813.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19633() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Quicksilver\",\"description\":\"A vial of pure quicksilver used to create The Juggernaut.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19633,\"icon\":\"https://render.guildwars2.com/file/F32944C40CF6FC54B204CACDE5071BA0B69BEAFC/455814.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19634() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Liquid Flame\",\"description\":\"A vial of liquid flame used to create Incinerator and Rodgort.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19634,\"icon\":\"https://render.guildwars2.com/file/F9D5E42CEA6EED2DA16E036065E0D6F90E027CF8/455815.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19635() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Entertainment\",\"description\":\"A gift of entertainment used to create legendary weapons Quip and The Moot.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19635,\"icon\":\"https://render.guildwars2.com/file/B76A2E537E10A4BE336CC6B3471CEE0F075AE290/455816.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19636() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Stealth\",\"description\":\"A gift of stealth used to create The Predator\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19636,\"icon\":\"https://render.guildwars2.com/file/6154279FB19D312725F942332F9F50C771D007E3/455817.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19637() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Weather\",\"description\":\"A gift of weather used to create Meteorlogicus.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19637,\"icon\":\"https://render.guildwars2.com/file/070D78427B06100C1203BB280C056BF2FEE2E006/455818.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19638() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Color\",\"description\":\"A gift of color used to create The Bifrost.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19638,\"icon\":\"https://render.guildwars2.com/file/EFADF9A7924FD4F1FB01A6284EEE0CED6F7BA2E4/455819.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19639() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Lightning\",\"description\":\"A gift of lightning used to create Bolt.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19639,\"icon\":\"https://render.guildwars2.com/file/B646B519AB469FF074C25E6C0CC55D5C64F496ED/455820.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19640() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wolf Statue\",\"description\":\"A wolf statue used to create Howler.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19640,\"icon\":\"https://render.guildwars2.com/file/C9462BEC11B14173B2E797101970B658E9BF6044/455821.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19641() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shark Statue\",\"description\":\"A shark statue used to create Kamohoali'i Kotaki.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19641,\"icon\":\"https://render.guildwars2.com/file/446D4F0ABCE4796DAC650D08080010091F26C195/455822.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19642() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eel Statue\",\"description\":\"A eel statue used to create Kraitkin.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19642,\"icon\":\"https://render.guildwars2.com/file/483F21E5CAA0907D0A0FBAD6AFE8C4330D1BF125/455823.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19643() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Water\",\"description\":\"A gift of water used to create Kraitkin.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19643,\"icon\":\"https://render.guildwars2.com/file/0378A7015EEC1B790736276870F1C807447C6D98/455824.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19644() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Kudzu\",\"description\":\"A gift used to create the legendary longbow Kudzu.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19644,\"icon\":\"https://render.guildwars2.com/file/DC0AC5E6785D5EF1FCBEB375B0FFDD08DEDAB562/455825.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19645() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Incinerator\",\"description\":\"A gift used to create the legendary dagger Incinerator.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19645,\"icon\":\"https://render.guildwars2.com/file/780F16CEBCEC0BF6D1F672A3F921ADCCB5A323E3/455826.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19646() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of The Minstrel\",\"description\":\"A gift used to create the legendary focus The Minstrel.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19646,\"icon\":\"https://render.guildwars2.com/file/BF420D11FEDEAF40629A6DB6F60F91A003F1C004/455827.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19647() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Sunrise\",\"description\":\"A gift used to create the legendary greatsword Sunrise\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19647,\"icon\":\"https://render.guildwars2.com/file/01D07FABAE26C0E5240892B00DA7AF90AB0EA022/455828.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19648() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Twilight\",\"description\":\"A gift used to create the legendary greatsword Twilight.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19648,\"icon\":\"https://render.guildwars2.com/file/01D07FABAE26C0E5240892B00DA7AF90AB0EA022/455828.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19649() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of The Juggernaut\",\"description\":\"A gift used to create the legendary hammer The Juggernaut.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19649,\"icon\":\"https://render.guildwars2.com/file/A19029319070C374A6669539EB5C47E3E4E8AF44/455829.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19650() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of The Moot\",\"description\":\"A gift used to create the legendary mace The Moot.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19650,\"icon\":\"https://render.guildwars2.com/file/136D219FD6083A78CA06EB1F1D040BE6AC037BE3/455830.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}