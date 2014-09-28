package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0051 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13386() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13386,\"icon\":\"https://render.guildwars2.com/file/17A4904CFD0A5A0170FAD6DC4862E4E242163000/340178.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"CritDamage\",\"modifier\":29}]},\"suffix_item_id\":24877,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13387() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13387,\"icon\":\"https://render.guildwars2.com/file/0CDB480C650819522971EE3A5935C37D02465C28/340179.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":40},{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":29}]},\"suffix_item_id\":24882,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13388() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13388,\"icon\":\"https://render.guildwars2.com/file/7A7C23BE34282AF9ED95071C1C5FFF2698954922/340174.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"CritDamage\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"suffix_item_id\":24883,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13389() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13389,\"icon\":\"https://render.guildwars2.com/file/DF289E07ECF4DB4259221A7254C39F64E077B806/340175.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":40},{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"suffix_item_id\":24878,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13390() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13390,\"icon\":\"https://render.guildwars2.com/file/A63DDCC729BEB8D65AB380DFA828EEB7D3642E0E/340176.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":40},{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":29}]},\"suffix_item_id\":24881,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13391() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13391,\"icon\":\"https://render.guildwars2.com/file/AFD464ACC9983536FE5C7E573BD2DBF69233B837/340177.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"ConditionDamage\",\"modifier\":29}]},\"suffix_item_id\":24879,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13392() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Platinum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":165,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13392,\"icon\":\"https://render.guildwars2.com/file/EB7A24B9BE7A6D44D955DAFFB239CE750A2AFEB2/340180.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24880,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13393() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13393,\"icon\":\"https://render.guildwars2.com/file/0A98291C24FEB21E96915AD12E545852C5932CE4/340181.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"suffix_item_id\":24492,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13394() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13394,\"icon\":\"https://render.guildwars2.com/file/197A25D77A0E463D0955CA9501EBB724EBD6B85F/340182.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Precision\",\"modifier\":39}]},\"suffix_item_id\":24493,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13395() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13395,\"icon\":\"https://render.guildwars2.com/file/11A306F1ABD6036732D7FEB89E4E057726182068/340183.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":55},{\"attribute\":\"CritDamage\",\"modifier\":39},{\"attribute\":\"Vitality\",\"modifier\":39}]},\"suffix_item_id\":24540,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13396() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13396,\"icon\":\"https://render.guildwars2.com/file/BE7590E5B655EA1B566CF42CF70115C280C6D504/340184.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":55},{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Toughness\",\"modifier\":39}]},\"suffix_item_id\":24495,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13397() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13397,\"icon\":\"https://render.guildwars2.com/file/CE291D544423D3090EFAD37315E4CEC6E0F366A6/340185.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24542,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13398() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13398,\"icon\":\"https://render.guildwars2.com/file/C21332B562690EA9B67E24C06B1472C4BB0CDA6B/340186.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":46},{\"attribute\":\"Precision\",\"modifier\":33},{\"attribute\":\"CritDamage\",\"modifier\":33}]},\"suffix_item_id\":24474,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13399() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13399,\"icon\":\"https://render.guildwars2.com/file/BE7590E5B655EA1B566CF42CF70115C280C6D504/340184.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":46},{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Toughness\",\"modifier\":33}]},\"suffix_item_id\":24475,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13400() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Beryl Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":89,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13400,\"icon\":\"https://render.guildwars2.com/file/11A306F1ABD6036732D7FEB89E4E057726182068/340183.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"CritDamage\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"suffix_item_id\":24519,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13401() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":89,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13401,\"icon\":\"https://render.guildwars2.com/file/0A98291C24FEB21E96915AD12E545852C5932CE4/340181.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"suffix_item_id\":24511,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13402() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Emerald Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":70,\"rarity\":\"Fine\",\"vendor_value\":89,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13402,\"icon\":\"https://render.guildwars2.com/file/197A25D77A0E463D0955CA9501EBB724EBD6B85F/340182.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":41},{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":29}]},\"suffix_item_id\":24473,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13403() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13403,\"icon\":\"https://render.guildwars2.com/file/C21332B562690EA9B67E24C06B1472C4BB0CDA6B/340186.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":55},{\"attribute\":\"Precision\",\"modifier\":39},{\"attribute\":\"CritDamage\",\"modifier\":39}]},\"suffix_item_id\":24494,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13404() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13404,\"icon\":\"https://render.guildwars2.com/file/FB5AFB560BBBC07E28BBA8BF1152C55061CF092B/340187.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":33},{\"attribute\":\"Precision\",\"modifier\":46},{\"attribute\":\"ConditionDamage\",\"modifier\":33}]},\"suffix_item_id\":24509,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13405() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13405,\"icon\":\"https://render.guildwars2.com/file/CE291D544423D3090EFAD37315E4CEC6E0F366A6/340185.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24521,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13406() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Coral Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Masterwork\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13406,\"icon\":\"https://render.guildwars2.com/file/FB5AFB560BBBC07E28BBA8BF1152C55061CF092B/340187.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Precision\",\"modifier\":55},{\"attribute\":\"ConditionDamage\",\"modifier\":39}]},\"suffix_item_id\":24541,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13407() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chrysocola Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13407,\"icon\":\"https://render.guildwars2.com/file/0A98291C24FEB21E96915AD12E545852C5932CE4/340181.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42}]},\"suffix_item_id\":24920,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13408() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sapphire Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13408,\"icon\":\"https://render.guildwars2.com/file/BE7590E5B655EA1B566CF42CF70115C280C6D504/340184.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":59},{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42}]},\"suffix_item_id\":24925,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13409() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Opal Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13409,\"icon\":\"https://render.guildwars2.com/file/CE291D544423D3090EFAD37315E4CEC6E0F366A6/340185.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13410() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ruby Mithril Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":297,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13410,\"icon\":\"https://render.guildwars2.com/file/6BD6B25FF31D0F7EDE9202F6086E72A03FF6B86C/455583.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":59},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"suffix_item_id\":24924,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}