package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0110 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23591() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Carving\",\"description\":\"<c=@flavor>\\\"With a hero like you around, the Flame Legion doesn't stand a chance.\\\"<br>—Corva Sharpclaw</c>\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Fine\",\"vendor_value\":67,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23591,\"icon\":\"https://render.guildwars2.com/file/F1E34A739E0061F3DE6AFAB9C85D750807A2FBD6/455940.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":20},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23592() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup God Icon\",\"description\":\"<c=@flavor>\\\"Great power in mountain skull. We make small mountain you hold in hand.\\\"<br>—Wupwup Chief</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23592,\"icon\":\"https://render.guildwars2.com/file/91040F2DCCA407B67D6FBE4E3CB16666A568353B/455941.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23593() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Pet Grub\",\"description\":\"<c=@flavor>\\\"Take good care of this tiny little friend.\\\"<br>—Tarstar Chief</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23593,\"icon\":\"https://render.guildwars2.com/file/4B6335F27DC9F99177A86E74C962C271CE753E0F/67003.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23594() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nrocroc Pressed Prickleberry Friendship Flower\",\"description\":\"<c=@flavor>\\\"You are true friend of the Nrocroc.\\\"<br>—Nrocroc Chief</c>\",\"type\":\"Trinket\",\"level\":64,\"rarity\":\"Fine\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23594,\"icon\":\"https://render.guildwars2.com/file/38A1090B134F7A003A4693EB107D7C5A421CEF5F/66920.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Toughness\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23595() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shadowcleft Covert Operations Badge\",\"description\":\"<c=@flavor>\\\"Impressive.\\\"<br>—Solita Miststalker</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Fine\",\"vendor_value\":69,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23595,\"icon\":\"https://render.guildwars2.com/file/3EAA067B1D4E9553C13A74060D7B020E311AD251/220893.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23596() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kodan Enduring Scroll\",\"description\":\"<c=@flavor>\\\"Balance in all things.\\\"<br>—Enduring Protector</c>\",\"type\":\"Trinket\",\"level\":66,\"rarity\":\"Fine\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23596,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Toughness\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23597() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Experimental Grenade Pin\",\"description\":\"<c=@flavor>\\\"This pin might be a little too tactical.\\\"<br>—Tactician Lyan</c>\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Fine\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23597,\"icon\":\"https://render.guildwars2.com/file/9577036D9BF8A120CD02BCF110DDFA416303026A/65712.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":32},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23598() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Compass\",\"description\":\"<c=@flavor>\\\"The mission isn't done until you come home.\\\"<br>—Brencis Quickblood</c>\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Fine\",\"vendor_value\":72,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23598,\"icon\":\"https://render.guildwars2.com/file/EBD59BA85FFDAEF4D604FEAD74FA03DCDD0D2CF8/220894.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23599() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Covert Demolition Field Guide FM-29B\",\"description\":\"<c=@flavor>\\\"What you think you know can kill you just a quickly as what you don't.\\\"<br>—Sava Quicksnarl</c>\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Fine\",\"vendor_value\":73,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23599,\"icon\":\"https://render.guildwars2.com/file/AC51A891D812FB67DF72B851280E6B96A2A2B940/220887.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":34},{\"attribute\":\"Toughness\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23600() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Amulet\",\"type\":\"Trinket\",\"level\":66,\"rarity\":\"Fine\",\"vendor_value\":112,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23600,\"icon\":\"https://render.guildwars2.com/file/DF9241172DF9C848E29039F0A3E6FEDEE5B5134B/220895.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":50},{\"attribute\":\"Toughness\",\"modifier\":36},{\"attribute\":\"Vitality\",\"modifier\":36}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23601() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup Warthog Necklace\",\"description\":\"<c=@flavor>\\\"Friends of the Wupwup are friends of the warthog.\\\"<br>—Wupwup Chief</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Fine\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23601,\"icon\":\"https://render.guildwars2.com/file/090C47B6BFC5F70B5BA83D3B0F4630A51F07ED34/220642.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":47},{\"attribute\":\"Precision\",\"modifier\":34},{\"attribute\":\"Toughness\",\"modifier\":34}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23602() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Spy Ring\",\"description\":\"<c=@flavor>\\\"Flame. Dark. Shadow. Burn.\\\"<br>—Secret Code 872SQ</c>\",\"type\":\"Trinket\",\"level\":69,\"rarity\":\"Fine\",\"vendor_value\":87,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23602,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23603() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Amulet\",\"type\":\"Trinket\",\"level\":66,\"rarity\":\"Masterwork\",\"vendor_value\":224,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23603,\"icon\":\"https://render.guildwars2.com/file/DF9241172DF9C848E29039F0A3E6FEDEE5B5134B/220895.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":55},{\"attribute\":\"Toughness\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23604() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Legion Badge\",\"description\":\"<c=@flavor>\\\"That tar would set us back if not for your leadership. We have a fighting chance thanks to you.\\\"<br>—Legionnaire Kress Rustmaw</c>\",\"type\":\"Trinket\",\"level\":60,\"rarity\":\"Masterwork\",\"vendor_value\":130,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23604,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":30},{\"attribute\":\"Precision\",\"modifier\":21},{\"attribute\":\"Vitality\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23605() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Legionnaire Assault Badge\",\"description\":\"<c=@flavor>\\\"With a hero like you around the Flame Legion here wont last long.\\\"<br>—Legionnaire Neverburn</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Masterwork\",\"vendor_value\":130,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23605,\"icon\":\"https://render.guildwars2.com/file/596749EC03A1D6B69F05AF90DE26FBF4B4A15FAA/455942.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23606() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tar Removal Tool\",\"description\":\"<c=@flavor>\\\"These are far too dangerous to refill. It is nice to look at though. \\\"<br>—Engineer Verutum</c>\",\"type\":\"Trinket\",\"level\":61,\"rarity\":\"Masterwork\",\"vendor_value\":130,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23606,\"icon\":\"https://render.guildwars2.com/file/B73F53BA2F4BFA1EB8F0FA45F05C9DF542EDE952/65660.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23607() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Flame Legion Carving\",\"description\":\"<c=@flavor>\\\"With a hero like you around, the Flame Legion doesn't stand a chance.\\\"<br>-Corva Sharpclaw</c>\",\"type\":\"Trinket\",\"level\":62,\"rarity\":\"Masterwork\",\"vendor_value\":133,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23607,\"icon\":\"https://render.guildwars2.com/file/F1E34A739E0061F3DE6AFAB9C85D750807A2FBD6/455940.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":31},{\"attribute\":\"Precision\",\"modifier\":22},{\"attribute\":\"Toughness\",\"modifier\":22}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23608() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup God Icon\",\"description\":\"<c=@flavor>\\\"Great power in mountain skull. We make small mountain you hold in hand.\\\"<br>—Wupwup Chief</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23608,\"icon\":\"https://render.guildwars2.com/file/91040F2DCCA407B67D6FBE4E3CB16666A568353B/455941.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":32},{\"attribute\":\"Toughness\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23609() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiny Pet Grub\",\"description\":\"<c=@flavor>\\\"Take good care of this tiny little friend.\\\"<br>—Tarstar Chief</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23609,\"icon\":\"https://render.guildwars2.com/file/4B6335F27DC9F99177A86E74C962C271CE753E0F/67003.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":32},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23610() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wupwup Warthog Necklace\",\"description\":\"<c=@flavor>\\\"Friends of the Wupwup are friends of the warthog.\\\"<br>—Wupwup Chief</c>\",\"type\":\"Trinket\",\"level\":63,\"rarity\":\"Masterwork\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23610,\"icon\":\"https://render.guildwars2.com/file/090C47B6BFC5F70B5BA83D3B0F4630A51F07ED34/220642.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51},{\"attribute\":\"Precision\",\"modifier\":36},{\"attribute\":\"Toughness\",\"modifier\":36}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23611() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Nrocroc Pressed Prickleberry Friendship Flower\",\"description\":\"<c=@flavor>\\\"You are true friend of the Nrocroc.\\\"<br>—Nrocroc Chief</c>\",\"type\":\"Trinket\",\"level\":64,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23611,\"icon\":\"https://render.guildwars2.com/file/38A1090B134F7A003A4693EB107D7C5A421CEF5F/66920.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":23},{\"attribute\":\"Toughness\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23612() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shadowcleft Covert Operations Badge\",\"description\":\"<c=@flavor>\\\"Impressive.\\\"<br>—Solita Miststalker</c>\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":138,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23612,\"icon\":\"https://render.guildwars2.com/file/3EAA067B1D4E9553C13A74060D7B020E311AD251/220893.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23613() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kodan Enduring Scroll\",\"description\":\"<c=@flavor>\\\"Balance in all things.\\\"<br>—Enduring Protector</c>\",\"type\":\"Trinket\",\"level\":66,\"rarity\":\"Masterwork\",\"vendor_value\":140,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23613,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":34},{\"attribute\":\"Precision\",\"modifier\":24},{\"attribute\":\"Toughness\",\"modifier\":24}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23614() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Experimental Grenade Pin\",\"description\":\"<c=@flavor>\\\"This pin might be a little too tactical.\\\"<br>—Tactician Lyan</c>\",\"type\":\"Trinket\",\"level\":67,\"rarity\":\"Masterwork\",\"vendor_value\":140,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23614,\"icon\":\"https://render.guildwars2.com/file/9577036D9BF8A120CD02BCF110DDFA416303026A/65712.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":35},{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":25}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23615() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ash Legion Compass\",\"description\":\"<c=@flavor>\\\"The mission isn't done until you come home.\\\"<br>—Brencis Quickblood</c>\",\"type\":\"Trinket\",\"level\":68,\"rarity\":\"Masterwork\",\"vendor_value\":143,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23615,\"icon\":\"https://render.guildwars2.com/file/EBD59BA85FFDAEF4D604FEAD74FA03DCDD0D2CF8/220894.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":36},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}