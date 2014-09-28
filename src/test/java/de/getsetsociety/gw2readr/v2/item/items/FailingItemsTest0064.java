package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0064 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19651() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Quip\",\"description\":\"A gift used to create the legendary pistol Quip.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19651,\"icon\":\"https://render.guildwars2.com/file/C4CE12E8D701F767F47113911EA80DBF78485C75/455831.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19652() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Meteorlogicus\",\"description\":\"A gift used to create the legendary scepter Meteorlogicus.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19652,\"icon\":\"https://render.guildwars2.com/file/969BCDF249650D93DE26E30A0411782861026267/455832.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19653() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of The Flameseeker Prophecies\",\"description\":\"A gift used to create the legendary shield The Flameseeker Prophecies.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19653,\"icon\":\"https://render.guildwars2.com/file/2CC3D8EBB4FB1B4BE0BA0AF65C082FC6C6A3DB1C/455833.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19654() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of The Bifrost\",\"description\":\"A gift used to create the legendary staff The Bifrost.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19654,\"icon\":\"https://render.guildwars2.com/file/38C9C5C8F3725C196149C01FAD009C9707080B92/455834.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19655() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Bolt\",\"description\":\"A gift used to create the legendary sword Bolt.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19655,\"icon\":\"https://render.guildwars2.com/file/F13FE7EA3950E529C163EBE008F379287194B5B6/455835.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19656() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Rodgort\",\"description\":\"A gift used to create the legendary torch Rodgort.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19656,\"icon\":\"https://render.guildwars2.com/file/BD08C20160BB5E2D9375A42D56D04D067E6F3515/455836.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19657() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Kamohoali'i Kotaki\",\"description\":\"A gift used to create the legendary spear Kamohoali'i Kotaki.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19657,\"icon\":\"https://render.guildwars2.com/file/631E98DE7861920225511F250476D5341BD20CEE/455837.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19658() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Kraitkin\",\"description\":\"A gift used to create the legendary tridant Kraitkin\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19658,\"icon\":\"https://render.guildwars2.com/file/E27B5358FB714E78445F04AAFC32673578433899/455838.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19659() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Frenzy\",\"description\":\"A gift used to create the legendary harpoon gun Frenzy.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19659,\"icon\":\"https://render.guildwars2.com/file/6AC101F5EA0FD3459E404D2FE0FA0F3B942046DE/455839.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19660() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of The Dreamer\",\"description\":\"A gift used to create the legendary short bow \\\"the Dreamer.\\\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19660,\"icon\":\"https://render.guildwars2.com/file/5190BC2AC64FE8C2FF92C5F9606C3E0302CBB873/455840.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19661() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of The Predator\",\"description\":\"A gift used to create the legendary rifle The Predator.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19661,\"icon\":\"https://render.guildwars2.com/file/27949D47E6F534574AAFE2D07BF20303729F94A5/455841.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19662() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Howler\",\"description\":\"A gift used to create the legendary warhorn Howler.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19662,\"icon\":\"https://render.guildwars2.com/file/7E450749DC2EA72121C4D5DD4BEDB90AD5CD47B2/455842.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19663() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bottle of Elonian Wine\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":313,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"id\":19663,\"icon\":\"https://render.guildwars2.com/file/CC720B5A5810A84FD97AB00FA43F1679C48074DE/455843.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19664() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Ascalon\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19664,\"icon\":\"https://render.guildwars2.com/file/733301420DAC0DAE9206BCA4F727DB1EC6551C71/455844.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19665() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of the Nobleman\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19665,\"icon\":\"https://render.guildwars2.com/file/AD73C36D337024C95E60AAA86F0A2EB931F80114/455845.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19666() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of the Forgeman\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19666,\"icon\":\"https://render.guildwars2.com/file/074D017C2DC674DD5E58FA355C5A20E6FE07C57E/455846.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19667() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Thorns\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19667,\"icon\":\"https://render.guildwars2.com/file/EB06C0AEBB6320F9E4DAF65321369198DDE143EF/455847.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19668() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Baelfire\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19668,\"icon\":\"https://render.guildwars2.com/file/1F251A126A7A1808DE7D0E49EC02CCCD280F4CD6/455848.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19669() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Zhaitan\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19669,\"icon\":\"https://render.guildwars2.com/file/4F5B03DDC8BE16069C3D2C530C1DC84916CDBB58/455849.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19670() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of the Sanctuary\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19670,\"icon\":\"https://render.guildwars2.com/file/987AF62023C20D28BE9810D1BAD8757A3D39480C/455850.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19671() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Knowledge\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19671,\"icon\":\"https://render.guildwars2.com/file/ACABBD3F193534D4A0C0239491DC0F95F209DEB8/455851.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19672() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Might\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19672,\"icon\":\"https://render.guildwars2.com/file/2F41032550D4024E184FAD6C1C0C14E53A09BCEA/455852.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19673() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Magic\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19673,\"icon\":\"https://render.guildwars2.com/file/992EC43FA1317BED252DB9D09905C601160B0E01/455853.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19674() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gift of Mastery\",\"description\":\"A gift used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19674,\"icon\":\"https://render.guildwars2.com/file/D4E560D3197437F0010DB4B6B2DBEA7D58E9DC27/455854.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19675() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystic Clover\",\"description\":\"Used to create legendary weapons.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":19675,\"icon\":\"https://render.guildwars2.com/file/FE9DC3E10D4B2AE16DADEB07CF28A058570E2EF3/455855.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}