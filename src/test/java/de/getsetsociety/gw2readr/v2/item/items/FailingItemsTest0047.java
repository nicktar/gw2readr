package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0047 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem13286() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malachite Copper Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13286,\"icon\":\"https://render.guildwars2.com/file/E0E02D0F0F9CBBF590392777391AD3E0C5FE706B/340134.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":6}]},\"suffix_item_id\":24466,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13287() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Turquoise Copper Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13287,\"icon\":\"https://render.guildwars2.com/file/66FE1DD749059B3B6E2F6DC4F5195CEC0F5C07B9/340133.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":8}]},\"suffix_item_id\":24485,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13288() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Garnet Copper Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13288,\"icon\":\"https://render.guildwars2.com/file/2C934ED19C1834224C460DC62CB17992D6130205/340128.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":8}]},\"suffix_item_id\":24483,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13289() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiger's Eye Copper Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13289,\"icon\":\"https://render.guildwars2.com/file/0F53BA0A018029BC2453FC245659FC9D66A3472A/340121.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":8}]},\"suffix_item_id\":24488,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13290() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malachite Copper Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13290,\"icon\":\"https://render.guildwars2.com/file/E0E02D0F0F9CBBF590392777391AD3E0C5FE706B/340134.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":8}]},\"suffix_item_id\":24480,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13291() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13291,\"icon\":\"https://render.guildwars2.com/file/1EEFA765BB211A5A42C84E28F35DCA0A4DA8C00B/340135.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":10}]},\"suffix_item_id\":24484,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13292() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13292,\"icon\":\"https://render.guildwars2.com/file/060CA40EF7AA13BA3FC6B7E0DC93DC52B3A42A90/340129.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24537,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13293() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malachite Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13293,\"icon\":\"https://render.guildwars2.com/file/53B62E070C00D9B268F7B72CE30806076A09172B/340136.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":13}]},\"suffix_item_id\":24480,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13294() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amethyst Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13294,\"icon\":\"https://render.guildwars2.com/file/444B15719C76D95D4B320727B9245C511FF406A9/340137.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"suffix_item_id\":24484,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13295() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Pendant\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13295,\"icon\":\"https://render.guildwars2.com/file/489E7C7ADB0F4274BDAC1AA202F8E439F6DA5BDB/340127.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24537,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13296() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Turquoise Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":96,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13296,\"icon\":\"https://render.guildwars2.com/file/BA77541A56E7F639CCC5A379F4662EA2C55420BE/340120.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":13}]},\"suffix_item_id\":24485,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13297() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sunstone Silver Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13297,\"icon\":\"https://render.guildwars2.com/file/97403B01953F402E37A9BA5C539C0C9EF9AB4BB3/340125.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"suffix_item_id\":24537,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13298() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13298,\"icon\":\"https://render.guildwars2.com/file/C91B26DAC0E9C2B60F0C1E18ED35E0B39F3F4B20/63594.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":15}]},\"suffix_item_id\":24470,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13299() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13299,\"icon\":\"https://render.guildwars2.com/file/925878C913992FD4EF01A5FAE5CB96AF050945A5/63598.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":12}]},\"suffix_item_id\":24469,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13300() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13300,\"icon\":\"https://render.guildwars2.com/file/925878C913992FD4EF01A5FAE5CB96AF050945A5/63598.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":12}]},\"suffix_item_id\":24470,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13301() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13301,\"icon\":\"https://render.guildwars2.com/file/BBDC689B77692D9118AD3C64B0D53AF045D21ACD/340138.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"Precision\",\"modifier\":10}]},\"suffix_item_id\":24469,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13302() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13302,\"icon\":\"https://render.guildwars2.com/file/BBDC689B77692D9118AD3C64B0D53AF045D21ACD/340138.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"Precision\",\"modifier\":12}]},\"suffix_item_id\":24478,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13303() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13303,\"icon\":\"https://render.guildwars2.com/file/5D310F0FB51CFDD7244B0174B7C4932AFE07711E/340139.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"CritDamage\",\"modifier\":10}]},\"suffix_item_id\":24468,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13304() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13304,\"icon\":\"https://render.guildwars2.com/file/E1AB01F843A06E16C2221B0E1194AAC1793311A0/340140.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"Precision\",\"modifier\":13}]},\"suffix_item_id\":24469,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13305() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":136,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13305,\"icon\":\"https://render.guildwars2.com/file/E1AB01F843A06E16C2221B0E1194AAC1793311A0/340140.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"Precision\",\"modifier\":17}]},\"suffix_item_id\":24478,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13306() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":62,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13306,\"icon\":\"https://render.guildwars2.com/file/C3AAFFDB0033CB56000B65D7A205066B1E6D44CD/340141.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"CritDamage\",\"modifier\":13}]},\"suffix_item_id\":24468,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13307() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13307,\"icon\":\"https://render.guildwars2.com/file/A7C83AA32426C04450D6634C04CED8709D22033E/340142.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"Precision\",\"modifier\":8}]},\"suffix_item_id\":24469,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13308() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Carnelian Silver Stud\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13308,\"icon\":\"https://render.guildwars2.com/file/A7C83AA32426C04450D6634C04CED8709D22033E/340142.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"Precision\",\"modifier\":10}]},\"suffix_item_id\":24478,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13309() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Fine\",\"vendor_value\":39,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13309,\"icon\":\"https://render.guildwars2.com/file/75F6EFE257C9A069FBAB7F805DE61FC27746A296/340143.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":11},{\"attribute\":\"CritDamage\",\"modifier\":8}]},\"suffix_item_id\":24468,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem13310() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Peridot Silver Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":102,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":13310,\"icon\":\"https://render.guildwars2.com/file/5D310F0FB51CFDD7244B0174B7C4932AFE07711E/340139.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"CritDamage\",\"modifier\":12}]},\"suffix_item_id\":24481,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}