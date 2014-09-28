package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0120 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23845() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Assault Kit\",\"description\":\"<c=@flavor>\\\"Contents: string, paperclip, folding knife, wax...\\\"</c>\",\"type\":\"Trinket\",\"level\":41,\"rarity\":\"Masterwork\",\"vendor_value\":95,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23845,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":18},{\"attribute\":\"Power\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Shackles\",\"description\":\"<c=@flavor>Freedom.</c>\",\"type\":\"Trinket\",\"level\":42,\"rarity\":\"Masterwork\",\"vendor_value\":156,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23846,\"icon\":\"https://render.guildwars2.com/file/D901FDEB6501DB1BD9C7F19113BA2DCF91E00E0A/455972.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Power\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Medal of Honor\",\"description\":\"<c=@flavor>\\\"For service above and beyond the call of duty.\\\"</c>\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Masterwork\",\"vendor_value\":160,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23847,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":30},{\"attribute\":\"ConditionDamage\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23848() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Companion's Ring\",\"description\":\"<c=@flavor>The inscription on the inside reads: \\\"Because the Cap said so.\\\"</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Masterwork\",\"vendor_value\":105,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23848,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23849() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Centaur Bandit Treaty Document\",\"description\":\"<c=@flavor>In place of signatures, the last page has hoofprint and a handprint marked in blood.</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23849,\"icon\":\"https://render.guildwars2.com/file/F2E1C224261C70C4D95E3A4B94B662750CA5D360/65726.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23850() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rata Sum Cease And Desist Order\",\"description\":\"<c=@flavor>Only a few words on this document are legible: \\\"...ordered to cease and desist all experiments within the city of Rata Sum...in defiance of this order are...banishment.\\\"</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23850,\"icon\":\"https://render.guildwars2.com/file/F2E1C224261C70C4D95E3A4B94B662750CA5D360/65726.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":15},{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23851() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny-beaded Junk Necklace\",\"description\":\"<c=@flavor>While it is shiny, it being a necklace is tenuous at best.</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Masterwork\",\"vendor_value\":148,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23851,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":27},{\"attribute\":\"ConditionDamage\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23852() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shining Blade\",\"description\":\"<c=@flavor>An accurate description of this tiny pocket knife.</c>\",\"type\":\"Trinket\",\"level\":41,\"rarity\":\"Masterwork\",\"vendor_value\":95,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23852,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23853() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Missing Person Flier\",\"description\":\"<c=@flavor>Below a portrait, the flier reads: \\\"Samm Volkman, last seen in the vicinity of Greenflin Plateau.\\\"</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Masterwork\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23853,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23854() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Ring\",\"description\":\"<c=@flavor>\\\"Beneath an ornate crest, the name D'Alessio is inscribed in flowing script.\\\"</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23854,\"icon\":\"https://render.guildwars2.com/file/A3473FFC3353576C2EF60C5A9CC47CDA6AB562C1/63613.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23855() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Ring\",\"description\":\"<c=@flavor>\\\"Beneath an ornate crest, the name D'Alessio is inscribed in flowing script.\\\"</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23855,\"icon\":\"https://render.guildwars2.com/file/A3473FFC3353576C2EF60C5A9CC47CDA6AB562C1/63613.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23856() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arcane Council Petition\",\"description\":\"<c=@flavor>\\\"Sign below to support removing Dr. Bleent from the Arcane Council.\\\"</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23856,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23858() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Antique Golem Head\",\"description\":\"<c=@flavor>\\\"This ancient golem head clearly substantiates the progress of asuran engineering.\\\"<br>—Shoon</c>\",\"type\":\"Trinket\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23858,\"icon\":\"https://render.guildwars2.com/file/2EAE6B226FCDB8ECAAD148E7A4FA49FB0973BC51/66822.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23862() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deputy Peacemaker Badge\",\"description\":\"<c=@flavor>\\\"This badge confers upon you all of the responsibilites of a peacemaker with none of the credit.\\\"<br>—Peacemaker Owta</c>\",\"type\":\"Trinket\",\"level\":13,\"rarity\":\"Fine\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23862,\"icon\":\"https://render.guildwars2.com/file/5192966328AD06F3A33812C0C3056CDD1E9EBC66/66848.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23863() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lightning Jar\",\"description\":\"<c=@flavor>\\\"The jar seems to retain a remarkable amount of heat.\\\"<br>—Ahjj</c>\",\"type\":\"Trinket\",\"level\":12,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23863,\"icon\":\"https://render.guildwars2.com/file/300EBE9F22AFB676E4ED372BB8D493233831BCBB/455973.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23864() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragonfly-Wing Earrings\",\"description\":\"<c=@flavor>\\\"Careful. The wings will tickle your neck if you move your head too fast.\\\"<br>—Huelic</c>\",\"type\":\"Trinket\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23864,\"icon\":\"https://render.guildwars2.com/file/D3FE514BA79872205D325A94E7C17E45BCAE3CC2/455974.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23866() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Asura Gate Harmonizing Crystal\",\"description\":\"<c=@flavor>\\\"Always triple-check the resonance frequency. The smallest error may have unforeseen consequences.\\\"<br>—Asura Gate Technician's Guide</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23866,\"icon\":\"https://render.guildwars2.com/file/EBAC58106E97F3739FD94A1D4799017355110F7A/66850.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23867() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hylek Totem\",\"description\":\"<c=@flavor>This totem is carved with inscriptions depicting the Hylek sun god.</c>\",\"type\":\"Trinket\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":19,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23867,\"icon\":\"https://render.guildwars2.com/file/CF9CBA3BB925A59501C6B61E9E46007BEC254947/63142.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23868() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Jar of Ooze\",\"description\":\"<c=@flavor>\\\"Warning: Keep tightly sealed. Some kinetic agitation is to be expected.\\\"</c>\",\"type\":\"Trinket\",\"level\":5,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23868,\"icon\":\"https://render.guildwars2.com/file/2801B02C780CA1F2B32D674039EAE6260C4133DB/455975.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23869() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Irradiated Skritt Shiny Thing\",\"description\":\"<c=@flavor>\\\"It's quite shiny, isn't it?\\\"<br>—Krew Leader Pachoo</c>\",\"type\":\"Trinket\",\"level\":14,\"rarity\":\"Fine\",\"vendor_value\":24,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23869,\"icon\":\"https://render.guildwars2.com/file/21A6C1D3CFEAE3F0C56134B7C5B099FD20E069AB/455957.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gyra's Radiation Detector\",\"description\":\"<c=@flavor>\\\"When it starts making noises, that means it's time to run.\\\"<br>—Researcher Borpp</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23870,\"icon\":\"https://render.guildwars2.com/file/6403060B50D222D6DF6B1479A34EA7930A401914/66581.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23872() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hylek-Slayer Badge\",\"description\":\"<c=@flavor>\\\"Awarded by the Lionguard for valor in fighting the hylek.\\\"</c>\",\"type\":\"Trinket\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":19,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23872,\"icon\":\"https://render.guildwars2.com/file/07D9452FC00EC9A9803BC5540AC9346D4E69E73F/66818.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23873() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skritt Research Footage\",\"description\":\"<c=@flavor>This recording shows skritt engaging in some questionable behavior.</c>\",\"type\":\"Trinket\",\"level\":7,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23873,\"icon\":\"https://render.guildwars2.com/file/B6745C0DA4CB49665746CA04022E244606115B9F/65628.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23879() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mysterious Floating Rocks\",\"description\":\"<c=@flavor>\\\"Maybe you'll run into someone that knows why these are floating.\\\"<br>—Warden Brulians</c>\",\"type\":\"Trinket\",\"level\":5,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23879,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23880() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thorn Bracelet\",\"description\":\"<c=@flavor>\\\"Coming from the darkness they just grow like that.\\\"<br>—Alarin</c>\",\"type\":\"Trinket\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23880,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}