package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0049 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13336() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13336,\"icon\":\"https://render.guildwars2.com/file/501D94F001D15FFA06175965052604F10667270F/340149.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"suffix_item_id\":24527,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13337() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13337,\"icon\":\"https://render.guildwars2.com/file/66C72C4B46B713FF14C895490D0B2B0AE4043C9A/340152.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"Precision\",\"modifier\":21}]},\"suffix_item_id\":24472,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13338() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13338,\"icon\":\"https://render.guildwars2.com/file/7D0C0DF603B5626C2A029CB9323E6FA309E24238/340153.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"suffix_item_id\":24482,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13339() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13339,\"icon\":\"https://render.guildwars2.com/file/64ABEE283F98D7581DEE064B06AA3A470BDEC465/340156.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":21}]},\"suffix_item_id\":24507,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13340() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13340,\"icon\":\"https://render.guildwars2.com/file/5AA810CBC8E96A072417ECC144151A13173D7A6F/340163.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13341() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":180,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13341,\"icon\":\"https://render.guildwars2.com/file/B80E107BDDA7080D7D4EE3A078A836911678A50D/340155.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":26}]},\"suffix_item_id\":24490,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":76,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13342,\"icon\":\"https://render.guildwars2.com/file/06B7332FD31918E00B7FA643EEE64440FA3A0FCC/340154.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":25},{\"attribute\":\"Vitality\",\"modifier\":18}]},\"suffix_item_id\":24527,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13343() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13343,\"icon\":\"https://render.guildwars2.com/file/6EDDDC25313068BF3FBA470602EE2F930044543B/340157.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"Precision\",\"modifier\":13}]},\"suffix_item_id\":24472,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13344() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13344,\"icon\":\"https://render.guildwars2.com/file/747391F30E296B08E92309D080D5E4D053F0A70B/340158.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"CritDamage\",\"modifier\":16}]},\"suffix_item_id\":24482,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13345() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lapis Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13345,\"icon\":\"https://render.guildwars2.com/file/78756BF6E0B52BBDC55427AE6B0A0E2D547798D9/340161.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":18},{\"attribute\":\"Toughness\",\"modifier\":13}]},\"suffix_item_id\":24507,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13346() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13346,\"icon\":\"https://render.guildwars2.com/file/09D170233E67A85321B09CCC6813EF7B652978FD/340164.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24539,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13347() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13347,\"icon\":\"https://render.guildwars2.com/file/B249748039519017DF62F1A40508CD16C87FB7D0/340160.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":23},{\"attribute\":\"Precision\",\"modifier\":16}]},\"suffix_item_id\":24490,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13348() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13348,\"icon\":\"https://render.guildwars2.com/file/737E70F64C0E922A6A79ECF509D40709EF9D9A0A/340159.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"suffix_item_id\":24527,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13349() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13349,\"icon\":\"https://render.guildwars2.com/file/E607077D1D6003E515A8466EC73CDDE9B594ADE0/340162.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24503,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13350() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":76,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13350,\"icon\":\"https://render.guildwars2.com/file/5AA810CBC8E96A072417ECC144151A13173D7A6F/340163.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24503,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13351() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Gold Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13351,\"icon\":\"https://render.guildwars2.com/file/09D170233E67A85321B09CCC6813EF7B652978FD/340164.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24503,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13352() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":41,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13352,\"icon\":\"https://render.guildwars2.com/file/E9DAA6594C05A1BB170C54D6742B1495E54D2716/340131.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"suffix_item_id\":24501,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13353() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pearl Copper Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13353,\"icon\":\"https://render.guildwars2.com/file/B86C9D0425335B1F5EDC0FA736F3F9D17B781EEE/340165.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":7}]},\"suffix_item_id\":24500,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13354() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pearl Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13354,\"icon\":\"https://render.guildwars2.com/file/37CAB869081423B1F04E191F07E54E1CFD0B64AD/340166.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12}]},\"suffix_item_id\":24500,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13355() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13355,\"icon\":\"https://render.guildwars2.com/file/444B15719C76D95D4B320727B9245C511FF406A9/340137.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"suffix_item_id\":24501,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13356() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pearl Copper Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13356,\"icon\":\"https://render.guildwars2.com/file/FFC3670E6611E5B03C04196CFE15739C2EB5C630/340167.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":6}]},\"suffix_item_id\":24500,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13357() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":25,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13357,\"icon\":\"https://render.guildwars2.com/file/1EEFA765BB211A5A42C84E28F35DCA0A4DA8C00B/340135.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":9},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"suffix_item_id\":24501,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13358() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Iron Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Masterwork\",\"vendor_value\":63,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13358,\"icon\":\"https://render.guildwars2.com/file/16B2A4F155EB737271041C79124F2BDC537300D2/63603.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":9}]},\"suffix_item_id\":24466,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13359() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiger's Eye Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13359,\"icon\":\"https://render.guildwars2.com/file/0D57CD3405090FE1050D9556471C3906A3076777/340132.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":12}]},\"suffix_item_id\":24467,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13360() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malachite Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13360,\"icon\":\"https://render.guildwars2.com/file/53B62E070C00D9B268F7B72CE30806076A09172B/340136.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":12}]},\"suffix_item_id\":24466,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}