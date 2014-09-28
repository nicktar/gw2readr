package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0136 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem24529() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Talisman of Potency\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24529,\"icon\":\"https://render.guildwars2.com/file/E47C2ABFAB4A69FDED3D45525B009BA868C8DF63/220456.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":161,\"description\":\"+7 Power\n+5 Condition Damage\"},\"attributes\":[]},\"suffix\":\"of Potency\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24530() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Talisman of Mending\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Fine\",\"vendor_value\":34,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24530,\"icon\":\"https://render.guildwars2.com/file/B96598AF72B4076F64F1B9D533DBD47B6F4D12E3/223667.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":189,\"description\":\"+7 Healing\n+5 Vitality\"},\"attributes\":[]},\"suffix\":\"of Mending\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24531() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medallion of the Rabid\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24531,\"icon\":\"https://render.guildwars2.com/file/F53E38DCF21ACB78EA76A2E94E1BDF73AAD903F9/340589.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":82,\"description\":\"+14 Condition Damage\n+10 Precision\n+10 Toughness\"},\"attributes\":[]},\"suffix\":\"of the Rabid\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24532() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crest of the Rabid\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24532,\"icon\":\"https://render.guildwars2.com/file/4F40450DF59CB92FD1A102DD98D6FBEBC39BE1EB/340590.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":155,\"description\":\"+20 Condition Damage\n+14 Precision\n+14 Toughness\"},\"attributes\":[]},\"suffix\":\"of the Rabid\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24533() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Crest of the Shaman\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Rare\",\"vendor_value\":198,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24533,\"icon\":\"https://render.guildwars2.com/file/E612C4D4EBF90B980C33FD33F55CCAE5B60553B8/340591.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":219,\"description\":\"+20 Vitality\n+14 Healing\n+14 Power\"},\"attributes\":[]},\"suffix\":\"of the Shaman\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24534() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amber Pebble\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":8,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24534,\"icon\":\"https://render.guildwars2.com/file/616CA09A677C9B41FCAE746DCD245F04084955D2/220960.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":70,\"description\":\"+3 Condition Damage\"},\"attributes\":[]},\"suffix\":\"of Amber\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24535() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Topaz Nugget\",\"description\":\"Double-click to apply to an item with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":24,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24535,\"icon\":\"https://render.guildwars2.com/file/11B59BBE4A46F32A33542333B128E81545D93418/220961.png\",\"details\":{\"type\":\"Gem\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\",\"Trinket\",\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":261,\"description\":\"+5 Condition Damage\n+2 Precision\"},\"attributes\":[]},\"suffix\":\"of Topaz\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24536() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Adorned Pearl\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24536,\"icon\":\"https://render.guildwars2.com/file/50D128976D7A2BB1374165303D016B0EBE651B13/220962.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":158,\"description\":\"+4 Healing\"},\"attributes\":[]},\"suffix\":\"of Pearl\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24537() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Intricate Sunstone Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":20,\"rarity\":\"Masterwork\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24537,\"icon\":\"https://render.guildwars2.com/file/6445A0687B4B3EDCEC650CFD590B6004FDCD44AA/220963.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":259,\"description\":\"+7 Precision\n+3 Power\"},\"attributes\":[]},\"suffix\":\"of Sunstone\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24538() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gilded Amethyst Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24538,\"icon\":\"https://render.guildwars2.com/file/449D1AF5C8C121F82274B2986B0FF8E81EE90139/220964.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":166,\"description\":\"+9 Power\n+7 Vitality\"},\"attributes\":[]},\"suffix\":\"of Amethyst\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24539() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gilded Sunstone Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":68,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24539,\"icon\":\"https://render.guildwars2.com/file/F6E4F9AC3BC3DF582901AD307C3505E433F879C3/220965.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":174,\"description\":\"+9 Precision\n+7 Power\"},\"attributes\":[]},\"suffix\":\"of Sunstone\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24540() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brilliant Beryl Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24540,\"icon\":\"https://render.guildwars2.com/file/2A9B9AA49028B12F19A6193FB64C22D0209C68F2/220966.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":214,\"description\":\"+18 Power\n+12 Ferocity\n+12 Vitality\"},\"attributes\":[]},\"suffix\":\"of Beryl\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24541() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brilliant Coral Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24541,\"icon\":\"https://render.guildwars2.com/file/C5C1DB0E7D6616E116D714DD66EB6C0FBE7C0BCD/220967.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":222,\"description\":\"+18 Precision\n+12 Condition Damage\n+12 Power\"},\"attributes\":[]},\"suffix\":\"of Coral\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24542() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Brilliant Opal Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":65,\"rarity\":\"Masterwork\",\"vendor_value\":110,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24542,\"icon\":\"https://render.guildwars2.com/file/ED4349FEA4D30BF4B19CF10C316F756226C34F06/220968.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":230,\"description\":\"+18 Precision\n+12 Ferocity\n+12 Power\"},\"attributes\":[]},\"suffix\":\"of Opal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24543() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Beryl Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24543,\"icon\":\"https://render.guildwars2.com/file/62A93E9D5C5D187F9475E3AEAB605ED9F4060D24/220969.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":216,\"description\":\"+25 Power\n+15 Ferocity\n+15 Vitality\"},\"attributes\":[]},\"suffix\":\"of Beryl\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24544() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Coral Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24544,\"icon\":\"https://render.guildwars2.com/file/51D43622617295349C5B7B18941D68BADFFC27F5/220970.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":224,\"description\":\"+25 Precision\n+15 Condition Damage\n+15 Power\"},\"attributes\":[]},\"suffix\":\"of Coral\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24545() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Opal Jewel\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24545,\"icon\":\"https://render.guildwars2.com/file/E9AAE966EC3613B4E00D0BB4ABA7F39DA19D7402/220971.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":232,\"description\":\"+24 Precision\n+15 Ferocity\n+15 Power\"},\"attributes\":[]},\"suffix\":\"of Opal\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24546() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Fire\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24546,\"icon\":\"https://render.guildwars2.com/file/2A086133CE143D2CAC09B12B015B78B4399D1C61/220972.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9443,\"description\":\"50% Chance on Critical: Trigger a Flame Blast for area of effect damage (240 radius). <br><c=@reminder>(Cooldown: 7 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24547() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Fire\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24547,\"icon\":\"https://render.guildwars2.com/file/C37E722CFA07065001DC29BA390E0FCB675D6035/220973.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9280,\"description\":\"50% Chance on Critical: Trigger a Flame Blast for area of effect damage (240 radius). <br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24548() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Fire\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24548,\"icon\":\"https://render.guildwars2.com/file/AFFE7977FCE450E8105EBADA7436050CB7011BDB/220678.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9444,\"description\":\"50% Chance on Critical: Trigger a Flame Blast for area of effect damage (240 radius). <br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24549() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Water\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24549,\"icon\":\"https://render.guildwars2.com/file/B9BF97AC77B0FEBC1BA23CE8A0B9CDA66332580F/220974.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9294,\"description\":\"10% Chance on Hit: Heal nearby allies around your target (180 radius).<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24550() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Water\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24550,\"icon\":\"https://render.guildwars2.com/file/002B0CA39136BA682966BFA6301405245A666C3B/220975.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9445,\"description\":\"20% Chance on Hit: Heal nearby allies around your target (240 radius).<br><c=@reminder>(Cooldown: 7 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24551() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Water\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24551,\"icon\":\"https://render.guildwars2.com/file/F117A4F536901B0C69A618EEEB0DA6BDEB075FD8/220684.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9446,\"description\":\"30% Chance on Hit: Heal nearby allies around your target (360 radius).<br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24552() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Air\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":16,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24552,\"icon\":\"https://render.guildwars2.com/file/AEA3A8CE6023B90761711CBC981732356AD00205/220976.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9291,\"description\":\"50% Chance on Critical: Cause a Lightning Strike<br><c=@reminder>(Cooldown: 7 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem24553() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Air\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":24553,\"icon\":\"https://render.guildwars2.com/file/FF4FD0584B30757CE77CEFC716160AF040437A90/220977.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9447,\"description\":\"50% Chance on Critical: Cause a Lightning Strike<br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}