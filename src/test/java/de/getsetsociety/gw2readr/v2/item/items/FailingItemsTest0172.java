package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0172 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39337() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Malign Infusion\",\"description\":\"Double-click to apply to an unused offensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39337,\"icon\":\"https://render.guildwars2.com/file/9A137B0106F9DE9A044596FE95C20D072CA093F3/511840.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Offense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16987,\"description\":\"+4 Condition Damage\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39338() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vital Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39338,\"icon\":\"https://render.guildwars2.com/file/66EC922E1AA5340FB5A63D997D92655775B524AA/511845.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\",\"Utility\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16982,\"description\":\"+4 Vitality\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39339() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Resilient Infusion\",\"description\":\"Double-click to apply to an unused defensive infusion slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":4,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39339,\"icon\":\"https://render.guildwars2.com/file/4DF43AFD06A460A19C90B011D3157BA969AD21CE/511844.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[\"Defense\"],\"infix_upgrade\":{\"buff\":{\"skill_id\":16983,\"description\":\"+4 Toughness\"},\"attributes\":[]},\"suffix\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39341() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Triforge Pendant\",\"description\":\"\\\"True greatness comes for those who have wisdom to do right, the courage to embark, and the power to follow through.\\\" -Logan Thackeray\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Ascended\",\"vendor_value\":660,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"NoSalvage\",\"NotUpgradeable\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39341,\"icon\":\"https://render.guildwars2.com/file/64020C4ACFF155B7EFEE6B1EA9747FF567AEE3FD/66773.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[{\"flags\":[\"Utility\"]}],\"infix_upgrade\":{\"buff\":{\"skill_id\":15750,\"description\":\"+13 Condition Damage\n+13 Precision\n+13 Toughness\n+13 Power\n+13 Vitality\n+13 Healing Power\n+13 Ferocity\"},\"attributes\":[{\"attribute\":\"Power\",\"modifier\":44},{\"attribute\":\"Precision\",\"modifier\":44},{\"attribute\":\"Toughness\",\"modifier\":44},{\"attribute\":\"Vitality\",\"modifier\":44},{\"attribute\":\"Healing\",\"modifier\":44},{\"attribute\":\"ConditionDamage\",\"modifier\":44},{\"attribute\":\"CritDamage\",\"modifier\":44}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39405() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Apothecary's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39405,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39406() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Apothecary's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 75 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":61,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39406,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39407() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Apothecary's Barbaric Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39407,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39408() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Apothecary's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39408,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39409() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Giver's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39409,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39410() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Giver's Scale Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":26,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39410,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39411() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Giver's Splint Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39411,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39412() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Giver's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39412,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39413() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Giver's Gladiator Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39413,\"icon\":\"https://render.guildwars2.com/file/726C070116A6D2DE16E07F4E56001240D70BD097/63223.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39414() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Giver's Student Armor\",\"description\":\"Double-click to unpack a full set of level 25 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":26,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39414,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39415() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Giver's Acolyte Armor\",\"description\":\"Double-click to unpack a full set of level 50 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":86,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39415,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39418() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Apothecary's Exalted Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39418,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39419() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Giver's Exalted Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39419,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39420() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Apothecary's Feathered Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":128,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39420,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39421() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Apothecary's Masquerade Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39421,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39422() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Giver's Masquerade Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39422,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39423() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Apothecary's Emblazoned Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39423,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39426() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Apothecary's Noble Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39426,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39427() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Giver's Emblazoned Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":256,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39427,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39430() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Giver's Noble Armor\",\"description\":\"Double-click to unpack a full set of level 65 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":162,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39430,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39431() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Giver's Noble Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":39431,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}