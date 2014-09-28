package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0126 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24006() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Launch Codes\",\"description\":\"<c=@flavor>\\\"These seem to be expired. Not good for launch anything but a conversation.\\\"<br>—Lightbringer Krentch</c>\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Masterwork\",\"vendor_value\":140,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24006,\"icon\":\"https://render.guildwars2.com/file/EED00CA379DA7F7D03D567085FFFBF1226B53CDA/223707.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":35},{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":25}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24007() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marching Orders\",\"description\":\"<c=@flavor>\\\"A good soldier follows orders. A great soldier doesn't question them.\\\"<br>—Zara</c>\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Masterwork\",\"vendor_value\":143,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24007,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":36},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24008() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mop Of Avenging\",\"description\":\"<c=@flavor>\\\"Pollution clean-up efforts are often tiresome, thankless affairs. You need a friend in times like these. So, here you go.\\\"<br>—Carmel</c>\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Masterwork\",\"vendor_value\":143,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24008,\"icon\":\"https://render.guildwars2.com/file/6403060B50D222D6DF6B1479A34EA7930A401914/66581.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":36},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24009() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eco Mission Statement\",\"description\":\"<c=@flavor>\\\"I don't know much about the Inquest or technology, but you don't need to know anything to make a difference.\\\"<br>—Environmental Activist Jenrys</c>\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Masterwork\",\"vendor_value\":145,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24009,\"icon\":\"https://render.guildwars2.com/file/71C3E41504629B331DE205F705720392D49CBE0E/223721.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24010() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Blessing Of Mellaggan\",\"description\":\"\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24010,\"icon\":\"https://render.guildwars2.com/file/6403060B50D222D6DF6B1479A34EA7930A401914/66581.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24013() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Exotic\",\"vendor_value\":312,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24013,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Vitality\",\"modifier\":31}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24014() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Exotic\",\"vendor_value\":354,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24014,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":55},{\"attribute\":\"Toughness\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24015() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24015,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24016() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24016,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24017() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Exotic\",\"vendor_value\":472,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24017,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":73},{\"attribute\":\"Toughness\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24019() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Accessory\",\"description\":\"\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":260,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24019,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24020() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Accessory\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Exotic\",\"vendor_value\":295,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24020,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24021() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Accessory\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24021,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24027() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Accessory\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":3790,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24027,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":49},{\"attribute\":\"Toughness\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24030() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":4919,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24030,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":79},{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Vitality\",\"modifier\":56}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24039() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":3790,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24039,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24055() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":1386,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24055,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":73},{\"attribute\":\"Toughness\",\"modifier\":52},{\"attribute\":\"Vitality\",\"modifier\":52}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24063() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Invader's Accessory\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":1068,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24063,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Toughness\",\"modifier\":33},{\"attribute\":\"Vitality\",\"modifier\":33}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24080() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Turret Parts\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24080,\"icon\":\"https://render.guildwars2.com/file/730A99AC6A69DD0F5352DAD56A91FC09D76F0D39/62860.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24081() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Block of Ice\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24081,\"icon\":\"https://render.guildwars2.com/file/422A4A0AAC2CDC1739B47BB8986DA66190ABE933/65895.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24084() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chunk of Unrefined Dredge Ore\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24084,\"icon\":\"https://render.guildwars2.com/file/FB3FCBE45BCA64961A47E82C3F59F0FE433174F2/66503.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24085() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Serenity Temple Artifact\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24085,\"icon\":\"https://render.guildwars2.com/file/D943C2C2FAF64BB44119B7D55EB4944760B4BFD5/65702.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24087() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crackling Lodestone\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24087,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24094() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Submarine Part\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24094,\"icon\":\"https://render.guildwars2.com/file/CEEADBBEA8CCF7D00B57D71D60E04811E0AAF6DB/66863.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24096() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Siege Weapon Piece\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24096,\"icon\":\"https://render.guildwars2.com/file/1458BD44DB131FB0DC0309EDA4470F2A32364C94/62325.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}