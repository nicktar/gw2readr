package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0125 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23981() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sylvari Warden Wall Watcher Badge\",\"description\":\"<c=@flavor>\\\"We stop the undead advance here at the Caer Brier wall.\\\" -Brannen</c>\",\"type\":\"Trinket\",\"level\":64,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23981,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23982() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Twitching Undead Hand\",\"description\":\"<c=@flavor>\\\"Need a hand? Sorry, I don't get out much.\\\"—Kamma</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23982,\"icon\":\"https://render.guildwars2.com/file/521747770101EFD0F2DC2AB5ED13110A23D06B60/434528.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23983() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Troll Tooth Necklace\",\"description\":\"<c=@flavor>\\\"Trolls attack anything that comes near and eat almost anything. Their teeth are very strong, but make a nice necklace.\\\" -Quennida</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23983,\"icon\":\"https://render.guildwars2.com/file/201607919EC5C8670DE04FD6049B0F08BB2F6EAC/434519.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":32},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23984() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Troll Tooth Necklace\",\"description\":\"<c=@flavor>\\\"Trolls attack anything that comes near and eat almost anything. Their teeth are very strong, but make a nice necklace.\\\" -Quennida</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23984,\"icon\":\"https://render.guildwars2.com/file/201607919EC5C8670DE04FD6049B0F08BB2F6EAC/434519.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23985() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of the Sun-God\",\"description\":\"<c=@flavor>\\\"The ring of the Sun-God will bring you power and perception.\\\"—Qoetl</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23985,\"icon\":\"https://render.guildwars2.com/file/0A6434C23AAD2A6CFA3F07027DE3CF4BB50509D3/455982.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23986() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring of the Sun-God\",\"description\":\"<c=@flavor>\\\"The ring of the Sun-God will bring you power and perception.\\\"—Qoetl</c>\",\"type\":\"Trinket\",\"level\":57,\"rarity\":\"Masterwork\",\"vendor_value\":123,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23986,\"icon\":\"https://render.guildwars2.com/file/0A6434C23AAD2A6CFA3F07027DE3CF4BB50509D3/455982.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23987() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beaded Hylek Necklace\",\"description\":\"A beaded Hylek Necklace\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23987,\"icon\":\"https://render.guildwars2.com/file/65770137636D08197409DB2ECBF49F3DB877D80E/455983.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23988() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Commendation for Logistics Excellence\",\"description\":\"<c=@flavor>\\\"For getting what we needed to where we needed it, despite the hardship.\\\"<br>—Explorer Pentt</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Fine\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23988,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23989() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Asura Crystal Matrix\",\"description\":\"<c=@flavor>\\\"Scholar told me all about matrixes and arcane stuffs. I couldn't listen because of how shiny this shiny is.\\\"<br>—Sik'klak</c>\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Fine\",\"vendor_value\":67,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23989,\"icon\":\"https://render.guildwars2.com/file/6403060B50D222D6DF6B1479A34EA7930A401914/66581.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23990() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Early Asura Relief Rubbing\",\"description\":\"<c=@flavor>\\\"These patterns must date all the way back to when Orr was still a thriving place.\\\"</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23990,\"icon\":\"https://render.guildwars2.com/file/EED00CA379DA7F7D03D567085FFFBF1226B53CDA/223707.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23991() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Battle Guide: Risen\",\"description\":\"<c=@flavor>\\\"If you know where to point the edge of your blade—you have read enough.\\\"<br>—Vigil Tactician Blazefur</c>\",\"type\":\"Trinket\",\"level\":64,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23991,\"icon\":\"https://render.guildwars2.com/file/3F6CB379076A94CCB0709E77EE9ACE4674EFB671/223713.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Toughness\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23992() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Weapon Blueprints\",\"description\":\"<c=@flavor>\\\"I don't expect you to understand the details, just the high level genius behind these designs.\\\"<br>—Whispers Creator Pixtor</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Fine\",\"vendor_value\":69,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23992,\"icon\":\"https://render.guildwars2.com/file/3051F33C563C03799510BF6160E591D134D1167A/220454.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23993() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Code\",\"description\":\"<c=@flavor>\\\"Break, Blaze, Judgment, Sabotage\\\"</c>\",\"type\":\"Trinket\",\"level\":66,\"rarity\":\"Fine\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23993,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Toughness\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23994() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Stolen Launch Codes\",\"description\":\"<c=@flavor>\\\"These seem to be expired. Not good for launch anything but a conversation.\\\"<br>—Lightbringer Krentch</c>\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Fine\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23994,\"icon\":\"https://render.guildwars2.com/file/EED00CA379DA7F7D03D567085FFFBF1226B53CDA/223707.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":32},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23995() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Marching Orders\",\"description\":\"<c=@flavor>\\\"A good soldier follows orders. A great soldier doesn't question them.\\\"<br>—Zara</c>\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Fine\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23995,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23996() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mop Of Avenging\",\"description\":\"<c=@flavor>\\\"Pollution clean-up efforts are often tiresome, thankless affairs. You need a friend in times like these. So, here you go.\\\"<br>—Carmel</c>\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Fine\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23996,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23997() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eco Mission Statement\",\"description\":\"<c=@flavor>\\\"I don't know much about the Inquest or technology, but you don't need to know anything to make a difference.\\\"<br>—Environmental Activist Jenrys</c>\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Fine\",\"vendor_value\":73,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23997,\"icon\":\"https://render.guildwars2.com/file/71C3E41504629B331DE205F705720392D49CBE0E/223721.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":34},{\"attribute\":\"Toughness\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23998() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Experimental Golem Core\",\"description\":\"<c=@flavor>\\\"This one was successful—unlike the experiment of me coming out here..\\\"<br>—Krewe Apprentice Blork</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Fine\",\"vendor_value\":69,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23998,\"icon\":\"https://render.guildwars2.com/file/F23608C7DE13B2BC903D3F6EB9734B423E96A6CB/66967.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Toughness\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23999() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Commendation for Logistics Excellence\",\"description\":\"<c=@flavor>\\\"For getting what we needed to where we needed it, despite the hardship.\\\"<br>—Explorer Pentt</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Masterwork\",\"vendor_value\":130,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23999,\"icon\":\"https://render.guildwars2.com/file/F4486E0A6651C27F5D720CFF30D8A9CA33A855C7/66808.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24000() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Asura Crystal Matrix\",\"description\":\"<c=@flavor>\\\"Scholar told me all about matrixes and arcane stuffs. I couldn't listen because of how shiny this shiny is.\\\"<br>—Sik'klak</c>\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Masterwork\",\"vendor_value\":133,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24000,\"icon\":\"https://render.guildwars2.com/file/6403060B50D222D6DF6B1479A34EA7930A401914/66581.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Toughness\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24001() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Early Asura Relief Rubbing\",\"description\":\"<c=@flavor>\\\"These patterns must date all the way back to when Orr was still a thriving place.\\\"</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24001,\"icon\":\"https://render.guildwars2.com/file/EED00CA379DA7F7D03D567085FFFBF1226B53CDA/223707.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":32},{\"attribute\":\"Toughness\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24002() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Battle Guide: Risen\",\"description\":\"<c=@flavor>\\\"If you know where to point the edge of your blade - you have read enough.\\\"<br>—Vigil Tactician Blazefur</c>\",\"type\":\"Trinket\",\"level\":64,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24002,\"icon\":\"https://render.guildwars2.com/file/3F6CB379076A94CCB0709E77EE9ACE4674EFB671/223713.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Toughness\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24003() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Weapon Blueprints\",\"description\":\"<c=@flavor>\\\"I don't expect you to understand the details, just the high level genius behind these designs.\\\"<br>—Whispers Creator Plxtor</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24003,\"icon\":\"https://render.guildwars2.com/file/3051F33C563C03799510BF6160E591D134D1167A/220454.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24004() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Experimental Golem Core\",\"description\":\"<c=@flavor>\\\"This one was successful—unlike the experiment of me coming out here..\\\"<br>—Krewe Apprentice Blork</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24004,\"icon\":\"https://render.guildwars2.com/file/F23608C7DE13B2BC903D3F6EB9734B423E96A6CB/66967.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":24},{\"attribute\":\"Toughness\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24005() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Code\",\"description\":\"<c=@flavor>\\\"Break, Blaze, Judgment, Sabotage\\\"</c>\",\"type\":\"Trinket\",\"level\":66,\"rarity\":\"Masterwork\",\"vendor_value\":140,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":24005,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":34},{\"attribute\":\"Precision\",\"modifier\":24},{\"attribute\":\"Toughness\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}