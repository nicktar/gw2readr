package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0098 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23277() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Truth\",\"type\":\"Trinket\",\"level\":28,\"rarity\":\"Masterwork\",\"vendor_value\":116,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23277,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":18},{\"attribute\":\"CritDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23278() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Grawl Trinket\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23278,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23279() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hylek Trinket\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23279,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23280() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ogre Trinket\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23280,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23281() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quaggan Trinket\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23281,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23282() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Skritt Trinket\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Masterwork\",\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23282,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23283() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aviator Badge\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23283,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"CritDamage\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23284() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Army Badge\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23284,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"CritDamage\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23285() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Navy Badge\",\"type\":\"Trinket\",\"level\":79,\"rarity\":\"Masterwork\",\"vendor_value\":163,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23285,\"icon\":\"https://render.guildwars2.com/file/927747D7FF36EC5D7807AA80FF307D0A6D78F661/66789.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":45},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"CritDamage\",\"modifier\":32}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23286() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rejuvenating Ring\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23286,\"icon\":\"https://render.guildwars2.com/file/6C5D4CB156F596DD070175D129376A4078567FA7/66796.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":25},{\"attribute\":\"Power\",\"modifier\":18}]},\"suffix_item_id\":24882,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23287() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigorous Ring\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23287,\"icon\":\"https://render.guildwars2.com/file/D27F03019741A10D462836EF38F151A3524F2EB9/66803.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"suffix_item_id\":24881,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23288() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Potent Ring\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23288,\"icon\":\"https://render.guildwars2.com/file/22B2C5C261EAAAC361E49095A5B17CCD584F9333/66802.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"ConditionDamage\",\"modifier\":18}]},\"suffix_item_id\":24877,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23289() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Penetrating ring\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23289,\"icon\":\"https://render.guildwars2.com/file/E043C90604B37D68B90319185F1D6F0301913AC3/66795.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"CritDamage\",\"modifier\":18}]},\"suffix_item_id\":24877,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23290() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stout Ring\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23290,\"icon\":\"https://render.guildwars2.com/file/6BEAA5D8005321DB9D49BAD9BD12DE3B98F3EDA8/66794.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":25},{\"attribute\":\"ConditionDamage\",\"modifier\":18}]},\"suffix_item_id\":24883,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23291() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hearty Ring\",\"type\":\"Trinket\",\"level\":46,\"rarity\":\"Masterwork\",\"vendor_value\":126,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23291,\"icon\":\"https://render.guildwars2.com/file/1CF5CB605A4A16EA25E574B0035296CB35A7380B/66798.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":18}]},\"suffix_item_id\":24881,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23292() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Trinket\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23292,\"icon\":\"https://render.guildwars2.com/file/7857F64D1D299E6350B0FEB4F67B639A4F13926D/66439.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23297() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bent Jotun Crown\",\"description\":\"<c=@flavor>\\\"From a once-proud race.\\\"<br>—Lionguard Nadel</c>\",\"type\":\"Trinket\",\"level\":18,\"rarity\":\"Fine\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23297,\"icon\":\"https://render.guildwars2.com/file/B16EB57C08301C0C0099C7B41F5A1BEEC96B90A8/455895.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23298() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charred Owl Totem\",\"description\":\"<c=@flavor>This object bears Owl's visage and is also slightly singed.</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23298,\"icon\":\"https://render.guildwars2.com/file/D2A40203DC055BDD75783DFDD4BAA39FFE171B05/455896.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23299() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lionguard Patrol Badge\",\"description\":\"<c=@flavor>\\\"Long hours and hard work pays off.\\\"<br>—Haral</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23299,\"icon\":\"https://render.guildwars2.com/file/75B75FFE7557671254F31D0EDD94AEA06643AA02/455894.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23300() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hand Drawn Charcoal Portrait\",\"description\":\"<c=@flavor>\\\"Bulsa's Son\\\"</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23300,\"icon\":\"https://render.guildwars2.com/file/6CB7E9FF07F3C877C4347C5A0BE8F472CA05BDFB/455897.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23301() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giant Wolf Tooth\",\"description\":\"<c=@flavor>\\\"A clean kill.\\\"<br>—Meinolf Njordson</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23301,\"icon\":\"https://render.guildwars2.com/file/A2C0B6089A07CFE9953CB85B04A297A68005090F/66997.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23302() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mortar and Pestle\",\"description\":\"<c=@flavor>Grind it twice.</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23302,\"icon\":\"https://render.guildwars2.com/file/5A51D1547EF42E58C954B756FC129C0F36D6E6BF/455898.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23303() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quaggan Friendship Bracelet\",\"description\":\"<c=@flavor>\\\"oOooo Friend?\\\"—Guard Lugung</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23303,\"icon\":\"https://render.guildwars2.com/file/D204A5DD7F56E2E27ED3CC55A3B83ABBE94CEA4F/455899.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23304() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Snowman Effigy\",\"description\":\"<c=@flavor>\\\"The grawl seemed really attached to these.\\\"<br>—Bolla</c>\",\"type\":\"Trinket\",\"level\":21,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23304,\"icon\":\"https://render.guildwars2.com/file/18C9770ADC423F071A0E385CF3C85BA3B30897F0/455900.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23305() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Little Norn Figurine\",\"description\":\"<c=@flavor>This hand-carved figurine bears a crude resemblance to a norn.</c>\",\"type\":\"Trinket\",\"level\":22,\"rarity\":\"Fine\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23305,\"icon\":\"https://render.guildwars2.com/file/365903EF113AAD5FF6E5F77F1E46CE1072046A3D/63126.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}