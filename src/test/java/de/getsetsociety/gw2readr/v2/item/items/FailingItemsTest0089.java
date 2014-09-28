package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0089 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem21677() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Garment\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21677,\"icon\":\"https://render.guildwars2.com/file/44D1DCE2E113A4C7383EFBDE6A469BCC0C4D5A08/66501.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21678() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bit of Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21678,\"icon\":\"https://render.guildwars2.com/file/CB32E614CDBFE6BCAA18FBAB4D2D3F3FA5634FF9/66851.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21679() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21679,\"icon\":\"https://render.guildwars2.com/file/D9C8AAED4B80010B809E465D90E81634D62EEF16/63137.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21680() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jagged Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21680,\"icon\":\"https://render.guildwars2.com/file/44AD4BA2AC1B1C5B4E78D6B7540E0B150BAB40F3/66831.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21681() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21681,\"icon\":\"https://render.guildwars2.com/file/B0C3CB68AFD818CCEE71023A6744FFDF4A2953B7/63141.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21682() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Salvageable Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21682,\"icon\":\"https://render.guildwars2.com/file/2CAE10E25864EB0BFC040F3209AF04C639EFDD74/66906.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21683() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Valuable Metal Scrap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21683,\"icon\":\"https://render.guildwars2.com/file/1458BD44DB131FB0DC0309EDA4470F2A32364C94/62325.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21684() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rawhide Leather Strap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21684,\"icon\":\"https://render.guildwars2.com/file/093809B04B1CA8973FA8DD3E9C290EB5E306BD00/66502.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21685() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thin Leather Strap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21685,\"icon\":\"https://render.guildwars2.com/file/0003964BB648BBC5F2F80CFE2359AC63BAB17D01/66518.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21686() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coarse Leather Strap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21686,\"icon\":\"https://render.guildwars2.com/file/D3D26AFB27921824303CDE24197016CD5391991B/65680.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21687() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thick Leather Strap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21687,\"icon\":\"https://render.guildwars2.com/file/E8073C31C7F10C66E407F37B316878D0BDB779AB/223665.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21688() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rugged Leather Strap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21688,\"icon\":\"https://render.guildwars2.com/file/BCFCC11836DF3B694C30BE4959C074A7FD6F9EC5/223663.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21689() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hard Leather Strap\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21689,\"icon\":\"https://render.guildwars2.com/file/FC4F514FD17F46CFC0B199CD6341A11F409F29FB/223661.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21690() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brittle Clump of Ore\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21690,\"icon\":\"https://render.guildwars2.com/file/C15F220F0B4DAAE4FEC6673B4B9E3037F9E0114A/63125.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21691() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Weak Clump of Ore\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21691,\"icon\":\"https://render.guildwars2.com/file/0759C04469062C150B34010A15534E21A49A2C55/61968.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21692() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clump of Ore\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21692,\"icon\":\"https://render.guildwars2.com/file/CB32E614CDBFE6BCAA18FBAB4D2D3F3FA5634FF9/66851.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21693() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Laden Clump of Ore\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21693,\"icon\":\"https://render.guildwars2.com/file/FB3FCBE45BCA64961A47E82C3F59F0FE433174F2/66503.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21694() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Loaded Clump of Ore\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21694,\"icon\":\"https://render.guildwars2.com/file/5503A95724C8171E4E2980BFA7A7790A69243E57/223601.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21695() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rich Clump of Ore\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":21695,\"icon\":\"https://render.guildwars2.com/file/2DC13D5674BC1833DB03D102CAC1BF322AE01296/66826.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22325() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Half-Eaten Mass\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":22325,\"icon\":\"https://render.guildwars2.com/file/ABFD7B0F9C370D0CE9F62135066202E649CD2096/223679.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22326() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Decaying Mass\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":10,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":22326,\"icon\":\"https://render.guildwars2.com/file/273A73F21615545861687CCDF514C12490AB08A4/223685.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22327() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fetid Mass\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":22327,\"icon\":\"https://render.guildwars2.com/file/2324F76F1C27B24A260669DEB8749E3339343ACC/66929.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22328() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malodorous Mass\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":22328,\"icon\":\"https://render.guildwars2.com/file/7A5F07EEE54727CA935654C9AA54335045B73D01/223689.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22329() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Half-Digested Mass\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":21,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":22329,\"icon\":\"https://render.guildwars2.com/file/8096979FE3DAD7B2FA726AB2BACAE15C7017F5DB/66859.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem22330() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Regurgitated Mass\",\"description\":\"Salvage Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":22330,\"icon\":\"https://render.guildwars2.com/file/B22E9DD0C5B56F7A40B354644CFF3AD54DE5B321/223691.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}