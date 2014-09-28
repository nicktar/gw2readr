package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0060 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19526() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Claw\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19526,\"icon\":\"https://render.guildwars2.com/file/3E699C726206FFE04BB02DC1FCB6B66DFD97D8A4/65889.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19527() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dull Claw\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19527,\"icon\":\"https://render.guildwars2.com/file/08CADB0BDBE2F50C2D7AC1EC28CD0FA5FFA9562B/866787.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19528() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dark Stained Claw\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19528,\"icon\":\"https://render.guildwars2.com/file/24C4F92104D7FE4BC238040FA45791201E0102B5/866788.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19529() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brittle Bone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19529,\"icon\":\"https://render.guildwars2.com/file/7D22375A92039A341B79017AF3650BF00B5B9D39/65681.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19530() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crumbling Bone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19530,\"icon\":\"https://render.guildwars2.com/file/3CB12314233A471FFB9DFC5765B8D10A071725F0/866789.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Porous Bone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19531,\"icon\":\"https://render.guildwars2.com/file/EB78CD5CC245EDABD9FAA9A5C518F90BD3F307FA/866790.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19533() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fungus\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19533,\"icon\":\"https://render.guildwars2.com/file/6201C72D18D0B6E55CFA0BFFCE68956BF24661CB/65892.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19534() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Slimy Fungus\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19534,\"icon\":\"https://render.guildwars2.com/file/6201C72D18D0B6E55CFA0BFFCE68956BF24661CB/65892.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19535() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clump of Tar\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19535,\"icon\":\"https://render.guildwars2.com/file/0759C04469062C150B34010A15534E21A49A2C55/61968.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19536() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clump of Pitch\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19536,\"icon\":\"https://render.guildwars2.com/file/0759C04469062C150B34010A15534E21A49A2C55/61968.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19537() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clump of Resin\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19537,\"icon\":\"https://render.guildwars2.com/file/0759C04469062C150B34010A15534E21A49A2C55/61968.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19538() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Fang\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19538,\"icon\":\"https://render.guildwars2.com/file/41E8BD29F70FDAB8C8C865D9321715A66B2110EB/223791.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19539() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dull Fang\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19539,\"icon\":\"https://render.guildwars2.com/file/EF03C2CB11482F4AE5024B59D8AC912E04770C19/866791.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19540() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chipped Fang\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19540,\"icon\":\"https://render.guildwars2.com/file/D8B93E73503C4D1B36AFA5482A63D1457409EC02/866792.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19541() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fin\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19541,\"icon\":\"https://render.guildwars2.com/file/64F70C685719490198B42D4CE7CC6D44FA18F07F/65894.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19542() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tail Fin\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19542,\"icon\":\"https://render.guildwars2.com/file/0F44A406099D093658ABFF3951B3380E7060CEF5/866793.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19543() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Buzzing Crystal\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19543,\"icon\":\"https://render.guildwars2.com/file/045C05C2F83A59FC4B6F15073465C5D3040E4DF5/65674.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19544() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Crystal\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19544,\"icon\":\"https://render.guildwars2.com/file/CCD82DEAF5B09C98135FC37F239163DAAEC65C1A/866794.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19545() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shocking Crystal\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19545,\"icon\":\"https://render.guildwars2.com/file/DC7B02A1EA0EB491BE7E47D55D060B5121D67572/866795.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19546() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Warm Stone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19546,\"icon\":\"https://render.guildwars2.com/file/4637C1D3406AADED7DBC1E01687E3A1DAB4A04FE/62685.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19547() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hot Stone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19547,\"icon\":\"https://render.guildwars2.com/file/E92F13173951063CD1450137FCC6B5A6719ED9D9/866796.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19548() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fire Stone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19548,\"icon\":\"https://render.guildwars2.com/file/1AA53768732347F22758E7795F30EEBBF0EC5F75/866797.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19549() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cool Stone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19549,\"icon\":\"https://render.guildwars2.com/file/422A4A0AAC2CDC1739B47BB8986DA66190ABE933/65895.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19550() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cold Stone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19550,\"icon\":\"https://render.guildwars2.com/file/0E2749F6C1E2464FA77753B83FE774021698D479/866798.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19551() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ice Stone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19551,\"icon\":\"https://render.guildwars2.com/file/C1A913AD114CAEF07A73983F9907F4B3DAA9D22D/866799.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}