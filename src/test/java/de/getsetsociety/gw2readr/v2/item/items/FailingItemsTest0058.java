package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0058 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13561() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":207,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13561,\"icon\":\"https://render.guildwars2.com/file/D27A123155E3183608C152219CB841A1CAF8137E/433727.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":36},{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":26}]},\"suffix_item_id\":24915,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13562() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13562,\"icon\":\"https://render.guildwars2.com/file/0C33BDF04C6EE361CE6F6AB3A9C75A4BA29C0A2C/455626.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":18}]},\"suffix_item_id\":24904,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13563() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13563,\"icon\":\"https://render.guildwars2.com/file/A0DA10F02FA31FD9BC44BFD5C04C6E7AA00FD1E8/455627.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"Power\",\"modifier\":18}]},\"suffix_item_id\":24902,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13564() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13564,\"icon\":\"https://render.guildwars2.com/file/73F0FEDB9C07E2A4E57F0D519EC6B5B8B9BDE5AE/455628.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"CritDamage\",\"modifier\":18}]},\"suffix_item_id\":24901,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13565() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13565,\"icon\":\"https://render.guildwars2.com/file/0C429E0AD299A1A9E058D7714AE4470502EDAB1A/455629.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24903,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13566() {
        try {
        	ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13566,\"icon\":\"https://render.guildwars2.com/file/7794F12B47A8146AA31867B6C93355D2F201E4E6/455630.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":18}]},\"suffix_item_id\":24899,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13567() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13567,\"icon\":\"https://render.guildwars2.com/file/E7D82E50C1BD38CF0A41C9437A0E25F2F095AF80/455631.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"suffix_item_id\":24898,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13568() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Rare\",\"vendor_value\":204,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13568,\"icon\":\"https://render.guildwars2.com/file/59580D095F99B238674EB50F5151DC47DCEDEC71/455632.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":26},{\"attribute\":\"Toughness\",\"modifier\":18}]},\"suffix_item_id\":24900,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13569() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13569,\"icon\":\"https://render.guildwars2.com/file/F6C0382DBC0C16AB1C9DE451F7F564F9FCDD0F23/455633.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":29}]},\"suffix_item_id\":24911,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13570() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Spinel Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13570,\"icon\":\"https://render.guildwars2.com/file/F5E4543AE3AF1609C42B05BC1D7B645353FFF222/455634.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":40},{\"attribute\":\"Power\",\"modifier\":29}]},\"suffix_item_id\":24909,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13571() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13571,\"icon\":\"https://render.guildwars2.com/file/BC50710B63EBBD6D5F02CE07A3BC7F98185A3009/455635.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"CritDamage\",\"modifier\":29}]},\"suffix_item_id\":24908,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13572() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13572,\"icon\":\"https://render.guildwars2.com/file/31F0BC3E5FA4B60D25AE094FFA32340ED02DC141/455636.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24910,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13573() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13573,\"icon\":\"https://render.guildwars2.com/file/6A37B228D85C0B50E621B79F5DF30D0ECD9DBF2F/455637.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":29}]},\"suffix_item_id\":24906,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13574() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13574,\"icon\":\"https://render.guildwars2.com/file/48033AF4B6A26FFBCBB01B4FDBD308D74DF1296A/455638.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"suffix_item_id\":24905,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13575() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Rare\",\"vendor_value\":270,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13575,\"icon\":\"https://render.guildwars2.com/file/C9ACE2F25856A301951E169D0E45C87AE20AE407/455639.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":29}]},\"suffix_item_id\":24907,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13576() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13576,\"icon\":\"https://render.guildwars2.com/file/1A147B53A36CEC3B36EC029E9E7221DA440A54C2/340217.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":58},{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Vitality\",\"modifier\":41}]},\"suffix_item_id\":24913,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13577() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13577,\"icon\":\"https://render.guildwars2.com/file/61C819C08027FA4FC3AA6807005EB3EBDD110734/455640.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":58},{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":41}]},\"suffix_item_id\":24918,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13578() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13578,\"icon\":\"https://render.guildwars2.com/file/5EE109B5BC364A616F6BFE3F5C322A13FE7F0A08/455641.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24916,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13579() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13579,\"icon\":\"https://render.guildwars2.com/file/D4E770C60DBD5206092F71A903D8F3241C6CBAD6/455642.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":58},{\"attribute\":\"CritDamage\",\"modifier\":41},{\"attribute\":\"Vitality\",\"modifier\":41}]},\"suffix_item_id\":24912,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13580() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13580,\"icon\":\"https://render.guildwars2.com/file/609F610E5906737847ABD3E978C550422F975B53/455643.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":58},{\"attribute\":\"Precision\",\"modifier\":41},{\"attribute\":\"CritDamage\",\"modifier\":41}]},\"suffix_item_id\":24917,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13581() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13581,\"icon\":\"https://render.guildwars2.com/file/C291019CAE7F695D68ABB01051FC695C21015BBE/455644.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":58},{\"attribute\":\"ConditionDamage\",\"modifier\":41}]},\"suffix_item_id\":24914,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13582() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Rare\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13582,\"icon\":\"https://render.guildwars2.com/file/D026B0773166567F0A1FF6274E68B1CBEBFFD3E7/455645.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":58},{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":41}]},\"suffix_item_id\":24915,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem18993() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fish Oil\",\"description\":\"A bladder filled with fish oil. This would make excellent fertilizer.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":18993,\"icon\":\"https://render.guildwars2.com/file/B73F53BA2F4BFA1EB8F0FA45F05C9DF542EDE952/65660.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19173() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Energy Crystal\",\"description\":\"This crystal is humming with a faint energy. There was once an inscription, but the only legible part reads \\\"Oo...\\\"\\\"\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19173,\"icon\":\"https://render.guildwars2.com/file/045C05C2F83A59FC4B6F15073465C5D3040E4DF5/65674.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Merchant Remains\",\"description\":\"Remains of a slain Merchant.<br> Event Item.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19179,\"icon\":\"https://render.guildwars2.com/file/D3D26AFB27921824303CDE24197016CD5391991B/65680.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}