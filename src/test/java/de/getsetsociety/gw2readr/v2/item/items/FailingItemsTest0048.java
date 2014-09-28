package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0048 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13311() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13311,\"icon\":\"https://render.guildwars2.com/file/AEB7D5DC7717C851B7C0BE78F7B5F43D485CE7D9/340144.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":13},{\"attribute\":\"Toughness\",\"modifier\":10}]},\"suffix_item_id\":24470,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13312() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13312,\"icon\":\"https://render.guildwars2.com/file/C3AAFFDB0033CB56000B65D7A205066B1E6D44CD/340141.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"CritDamage\",\"modifier\":17}]},\"suffix_item_id\":24481,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13313() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13313,\"icon\":\"https://render.guildwars2.com/file/32B66D3E5C500995FE47E19E737DFC0F5E79A62F/340145.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":13}]},\"suffix_item_id\":24470,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13314() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13314,\"icon\":\"https://render.guildwars2.com/file/75F6EFE257C9A069FBAB7F805DE61FC27746A296/340143.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"CritDamage\",\"modifier\":10}]},\"suffix_item_id\":24481,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13315() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13315,\"icon\":\"https://render.guildwars2.com/file/9E5E9578A1519963DF56DC3E3C34090BF1AE72B0/340146.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":11},{\"attribute\":\"Toughness\",\"modifier\":8}]},\"suffix_item_id\":24470,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13316() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13316,\"icon\":\"https://render.guildwars2.com/file/20233AA00FF0A6C76EC6E61BD49CD098E20C5930/340147.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20}]},\"suffix_item_id\":24479,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13317() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13317,\"icon\":\"https://render.guildwars2.com/file/3F5237329C18757BA8BA455550330EFC0D55AE0C/340148.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":22},{\"attribute\":\"CritDamage\",\"modifier\":16}]},\"suffix_item_id\":24504,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13318() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13318,\"icon\":\"https://render.guildwars2.com/file/501D94F001D15FFA06175965052604F10667270F/340149.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":20}]},\"suffix_item_id\":24538,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13319() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13319,\"icon\":\"https://render.guildwars2.com/file/EA50C6D81DB452079E98617CB72107A11DD01F7E/340150.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":19},{\"attribute\":\"Precision\",\"modifier\":13}]},\"suffix_item_id\":24506,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13320() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13320,\"icon\":\"https://render.guildwars2.com/file/BD559DECB599B8356F9C2C61F7249FBEB3A82908/340151.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":28},{\"attribute\":\"Toughness\",\"modifier\":20}]},\"suffix_item_id\":24487,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13321() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13321,\"icon\":\"https://render.guildwars2.com/file/66C72C4B46B713FF14C895490D0B2B0AE4043C9A/340152.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":26}]},\"suffix_item_id\":24479,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13322() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13322,\"icon\":\"https://render.guildwars2.com/file/7D0C0DF603B5626C2A029CB9323E6FA309E24238/340153.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"CritDamage\",\"modifier\":21}]},\"suffix_item_id\":24504,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13323,\"icon\":\"https://render.guildwars2.com/file/06B7332FD31918E00B7FA643EEE64440FA3A0FCC/340154.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"suffix_item_id\":24538,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13324() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":76,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13324,\"icon\":\"https://render.guildwars2.com/file/B80E107BDDA7080D7D4EE3A078A836911678A50D/340155.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":25},{\"attribute\":\"Precision\",\"modifier\":18}]},\"suffix_item_id\":24506,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13325() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13325,\"icon\":\"https://render.guildwars2.com/file/64ABEE283F98D7581DEE064B06AA3A470BDEC465/340156.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":37},{\"attribute\":\"Toughness\",\"modifier\":26}]},\"suffix_item_id\":24487,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13326() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13326,\"icon\":\"https://render.guildwars2.com/file/6EDDDC25313068BF3FBA470602EE2F930044543B/340157.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"Precision\",\"modifier\":16}]},\"suffix_item_id\":24479,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13327() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13327,\"icon\":\"https://render.guildwars2.com/file/747391F30E296B08E92309D080D5E4D053F0A70B/340158.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"CritDamage\",\"modifier\":13}]},\"suffix_item_id\":24504,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13328() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13328,\"icon\":\"https://render.guildwars2.com/file/737E70F64C0E922A6A79ECF509D40709EF9D9A0A/340159.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":16}]},\"suffix_item_id\":24538,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13329() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13329,\"icon\":\"https://render.guildwars2.com/file/B249748039519017DF62F1A40508CD16C87FB7D0/340160.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Precision\",\"modifier\":11}]},\"suffix_item_id\":24506,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13330() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13330,\"icon\":\"https://render.guildwars2.com/file/78756BF6E0B52BBDC55427AE6B0A0E2D547798D9/340161.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":23},{\"attribute\":\"Toughness\",\"modifier\":16}]},\"suffix_item_id\":24487,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13331() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13331,\"icon\":\"https://render.guildwars2.com/file/20233AA00FF0A6C76EC6E61BD49CD098E20C5930/340147.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":22},{\"attribute\":\"Precision\",\"modifier\":16}]},\"suffix_item_id\":24472,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13332() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13332,\"icon\":\"https://render.guildwars2.com/file/3F5237329C18757BA8BA455550330EFC0D55AE0C/340148.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"CritDamage\",\"modifier\":20}]},\"suffix_item_id\":24482,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13333() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13333,\"icon\":\"https://render.guildwars2.com/file/BD559DECB599B8356F9C2C61F7249FBEB3A82908/340151.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":22},{\"attribute\":\"Toughness\",\"modifier\":16}]},\"suffix_item_id\":24507,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13334() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13334,\"icon\":\"https://render.guildwars2.com/file/E607077D1D6003E515A8466EC73CDDE9B594ADE0/340162.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13335() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":135,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13335,\"icon\":\"https://render.guildwars2.com/file/EA50C6D81DB452079E98617CB72107A11DD01F7E/340150.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":28},{\"attribute\":\"Precision\",\"modifier\":20}]},\"suffix_item_id\":24490,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}