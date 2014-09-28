package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0183 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem43778() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Celestial Emblazoned Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43778,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43779() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Celestial Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43779,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43863() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Quartz Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43863,\"icon\":\"https://render.guildwars2.com/file/D7C5796FDD530ADD310318DD12CA48B533EA9A64/455591.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":32},{\"attribute\":\"Precision\",\"modifier\":32},{\"attribute\":\"Toughness\",\"modifier\":32},{\"attribute\":\"Vitality\",\"modifier\":32},{\"attribute\":\"Healing\",\"modifier\":32},{\"attribute\":\"ConditionDamage\",\"modifier\":32},{\"attribute\":\"CritDamage\",\"modifier\":32}]},\"suffix_item_id\":43866,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43864() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Quartz Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43864,\"icon\":\"https://render.guildwars2.com/file/41D90B0C700B16E8E2F507CCBCBF01FD09991A23/433705.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26},{\"attribute\":\"Healing\",\"modifier\":26},{\"attribute\":\"ConditionDamage\",\"modifier\":26},{\"attribute\":\"CritDamage\",\"modifier\":26}]},\"suffix_item_id\":43866,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43865() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Charged Quartz Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43865,\"icon\":\"https://render.guildwars2.com/file/4E0CA54266C349A1C5301C7B0D93747842ECC5C3/455605.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":42},{\"attribute\":\"Vitality\",\"modifier\":42},{\"attribute\":\"Healing\",\"modifier\":42},{\"attribute\":\"ConditionDamage\",\"modifier\":42},{\"attribute\":\"CritDamage\",\"modifier\":42}]},\"suffix_item_id\":43866,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43866() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Charged Quartz Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43866,\"icon\":\"https://render.guildwars2.com/file/34F10CA528BCE2DEAE4D129522A7AF356CFB4932/220938.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":19635,\"description\":\"+12 Condition Damage\n+12 Precision\n+12 Toughness\n+12 Power\n+12 Vitality\n+12 Healing Power\n+12 Ferocity\"},\"attributes\":[]},\"suffix\":\"of the Sky\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43900() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Support Token\",\"description\":\"Support a candidate: Ellen Kiel or Evon Gnashblade. Spend this token at one of the support boxes in Zephyr Sanctum, and let your voice be heard.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":114,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43900,\"icon\":\"https://render.guildwars2.com/file/6458560D02DE1834053B485C952FC9F5C6DDA103/607528.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43901() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zephyr Sanctum Model\",\"description\":\"Double-click to view a model of Zephyr Sanctum. Only usable in cities.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Pve\",\"PvpLobby\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\",\"NoUnderwater\"],\"restrictions\":[],\"id\":43901,\"icon\":\"https://render.guildwars2.com/file/94FC570E99745898370D2706F6BCAB5E4BCAEE56/603262.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43913() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Loot Bag\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43913,\"icon\":\"https://render.guildwars2.com/file/EBC5CEC199D1E51B02756A1C796A65E9D24F04B5/63171.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43920() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Zephyr Sanctum Supply Box\",\"description\":\"Contains various supplies from Zephyr Sanctum.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43920,\"icon\":\"https://render.guildwars2.com/file/42DB7C943734DA460A6BBC6E3316E9E6F71A70B3/603286.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43921() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Kookoochoo the Incredulous\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43921,\"icon\":\"https://render.guildwars2.com/file/A03FF19805074B03562105FC070D5274C079C407/603288.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43922() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Peggellegg the \\\"Pirate\\\"\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43922,\"icon\":\"https://render.guildwars2.com/file/55E4FD4BD3D94017E74FF69AADA32E460126FB02/603289.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43923() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Poowulpi the Persnicketous\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43923,\"icon\":\"https://render.guildwars2.com/file/447D54C54839CE0AD2D3E5C95F1F74E373CB2CCE/603290.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43925() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fortune Scrap\",\"description\":\"Take fortune scraps to a Black Lion Weapons Specialist or a Fortune Scrap Vendor to pick between a variety of Zephyrite goods.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43925,\"icon\":\"https://render.guildwars2.com/file/5847083C1AE80A50D91CB5EC440D3FEC16A5127A/603305.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43926() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Golden Fortune Scrap\",\"description\":\"Take fortune scraps to a Black Lion Weapons Specialist or a Fortune Scrap Vendor to pick between a variety of Zephyrite goods.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43926,\"icon\":\"https://render.guildwars2.com/file/EBAF0EE72E08A258E6AF3E036A12673001160A59/603306.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43933() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tequatl Rising Mini Pack\",\"description\":\"Double-click to receive a miniature Risen Brute, Risen Thrall, and Risen Plague Carrier.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43933,\"icon\":\"https://render.guildwars2.com/file/4650A9266F5B46EC65BAE174E65DDC2FC07E0D4C/638378.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43935() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deathly Dye Kit\",\"description\":\"Double-click to gain a random deathly dye color. Includes a chance at 1 of 6 exclusive colors.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":43935,\"icon\":\"https://render.guildwars2.com/file/0F617A0610A0EA5048CA07D602BCF91E059E9048/638379.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43936() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"PvP Achievement Rewards\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":43936,\"icon\":\"https://render.guildwars2.com/file/D4689A91050D6BF3F5594E0E2D136B966C4A25E2/66868.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43937() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43937,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43938() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43938,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43956() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ellen Kiel Representation Button\",\"description\":\"Double-click to show your support for Ellen Kiel.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":43956,\"icon\":\"https://render.guildwars2.com/file/DD55B010B2E8CF720F5B7255CC021331931FF431/607543.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43957() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Evon Gnashblade Representation Button\",\"description\":\"Double-click to show your support for Evon Gnashblade.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":43957,\"icon\":\"https://render.guildwars2.com/file/263C0B931946D2AFA2A61BD1FF0765FD63E6CC04/607544.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43960() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Splendid Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43960,\"icon\":\"https://render.guildwars2.com/file/730A99AC6A69DD0F5352DAD56A91FC09D76F0D39/62860.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43961() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Splendid Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43961,\"icon\":\"https://render.guildwars2.com/file/730A99AC6A69DD0F5352DAD56A91FC09D76F0D39/62860.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem43966() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Coins\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":43966,\"icon\":\"https://render.guildwars2.com/file/3BF274D1A323C002CDCFE80724912CDB7C78ABEE/62857.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}