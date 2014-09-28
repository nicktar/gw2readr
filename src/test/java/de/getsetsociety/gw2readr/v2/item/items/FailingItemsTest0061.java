package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0061 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19552() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glob of Globby Goo\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19552,\"icon\":\"https://render.guildwars2.com/file/A9900F02F8CB0CB124FD5E94979855BDBEDA77F7/65897.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19553() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glob of Globby Goop\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19553,\"icon\":\"https://render.guildwars2.com/file/B0A9EAD20E75D3966D922334B3324DB30BD96619/866800.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19554() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glob of Globby Gloop\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19554,\"icon\":\"https://render.guildwars2.com/file/217DAAE092C21CAFE4F2625C1C12F3B156FA099B/866801.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19557() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Liquified Goo\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19557,\"icon\":\"https://render.guildwars2.com/file/443E16BEEF0B0D0240A4442AFCAB924B22C77B30/65898.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19558() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spider Leg\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19558,\"icon\":\"https://render.guildwars2.com/file/655258C8EA581EFA37F845D3F4CAFEE309AD19A9/65899.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19559() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hairy Spider Leg\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19559,\"icon\":\"https://render.guildwars2.com/file/4D6672475102A06E25B9FD73A2BC056F204E2446/866802.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19560() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Prickly Spider Leg\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19560,\"icon\":\"https://render.guildwars2.com/file/C073A92412AAEAC961C6BF760721BDBA3D44457C/866803.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19561() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Patch of Fur\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19561,\"icon\":\"https://render.guildwars2.com/file/3DB4A867BC18AD1D7BFE1C91EC9EC7C1B13B7F01/65900.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19562() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scrap of Fur\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19562,\"icon\":\"https://render.guildwars2.com/file/DC0BDB1C090D465E1FD9D01E3E11BB063CB3C549/866804.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19563() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Clump of Fur\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19563,\"icon\":\"https://render.guildwars2.com/file/53154D0B25AB0BC3BE5C7AC5A5B2EFB3770E94BE/866805.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19564() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seashell\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19564,\"icon\":\"https://render.guildwars2.com/file/BC3B1852C800AF7632AFA2CCC8957A913B443EB8/65901.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19565() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shell\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19565,\"icon\":\"https://render.guildwars2.com/file/20B0FF7F181DA54610050DD9DCAEB3B4CA41F508/866806.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19566() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spiral Shell\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19566,\"icon\":\"https://render.guildwars2.com/file/6209BCE97065DA04315CDCF62DFBF4BD05203FA2/866807.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19567() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoof\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19567,\"icon\":\"https://render.guildwars2.com/file/04D35A310FE5C1E63F0A19D177FFF07BF20BD315/65722.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19568() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoof\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19568,\"icon\":\"https://render.guildwars2.com/file/D374A2E8D5251D4505C26C40DB9C2DE508CC4BCC/866808.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19569() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoof\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19569,\"icon\":\"https://render.guildwars2.com/file/F8D89AA327B3020DCC62CF995245D4AD90916FF7/866809.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19570() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pebble\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19570,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gravel\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19571,\"icon\":\"https://render.guildwars2.com/file/0D6AE55445EB2307096D75E84C7EC8B3D4BBE942/866810.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19572() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stone\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19572,\"icon\":\"https://render.guildwars2.com/file/7B06ED1024070C05FBA8E7AA0B6B96464DBE9E6F/866811.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19573() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Needle\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19573,\"icon\":\"https://render.guildwars2.com/file/DAAC35DF1CECCF5F9B37A5F1EE9CF83E1BFEB048/65903.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19574() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Barb\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19574,\"icon\":\"https://render.guildwars2.com/file/732B53F634167656D01FBACFA0D9D0470C58924A/866812.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19575() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spike\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19575,\"icon\":\"https://render.guildwars2.com/file/32DEA7F7667497BF6F630A50AF0FD20F19DF634C/866813.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19576() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mangled Talon\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19576,\"icon\":\"https://render.guildwars2.com/file/EF7A6002355DA725FC9E29A85496271A0A0EF95A/65904.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19577() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Talon\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":9,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19577,\"icon\":\"https://render.guildwars2.com/file/ADC33FED51B1BB647D1132A1663E1DA6D5A59DD5/866814.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19578() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sharp Talon\",\"description\":\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19578,\"icon\":\"https://render.guildwars2.com/file/5813DB5867C20B31490CFB58D1C2C5F2CB41164E/866815.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}