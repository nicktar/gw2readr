package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0167 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem38204() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Rune of Altruism\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":5,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38204,\"icon\":\"https://render.guildwars2.com/file/311A36D9165FFBDDE3A123EC937F450A3D1C2C99/526276.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+10 Healing\",\"When you use a heal skill, grant might to nearby allies for 8 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Altruism\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38205() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Rune of Altruism\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38205,\"icon\":\"https://render.guildwars2.com/file/F9C1923B2DE1309830DE0B0302F35A9D7BC8D099/526277.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+15 Healing\",\"When you use a heal skill, grant 2 stacks of might to nearby allies for 8 seconds. <c=@reminder>(Cooldown: 10s)</c>\",\"+30 Healing\",\"+6% Boon Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Altruism\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38206() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of Altruism\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":65,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38206,\"icon\":\"https://render.guildwars2.com/file/054CCE66F235B4DCAF1213389203BFFDE43004E7/526278.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"When you use a heal skill, grant 3 stacks of might to nearby allies for 8 seconds. <c=@reminder>(Cooldown: 10s)</c>\",\"+50 Healing\",\"+10% Boon Duration\",\"+100 Healing\",\"When you use a heal skill, grant fury to nearby allies for 5 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Altruism\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38216() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bowl of Ice Cream Base\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38216,\"icon\":\"https://render.guildwars2.com/file/010E650C71750F112E18D248D0E445E017E8425F/526285.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38289() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38289,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38290() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Large Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38290,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38291() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Giant Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":32,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":38291,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38292() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Minor Sigil of Generosity\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":58,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38292,\"icon\":\"https://render.guildwars2.com/file/6055C84FED6DA52A142EC76213A7BCFF189EF0A2/526286.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16507,\"description\":\"20% chance to transfer a condition to your foe on a critical hit. <br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Generosity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38293() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Major Sigil of Generosity\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":39,\"rarity\":\"Rare\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38293,\"icon\":\"https://render.guildwars2.com/file/02F25535F136E1CD1301A74CC6B7CD6AFEDFE0A8/526287.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16508,\"description\":\"40% chance to transfer a condition to your foe on a critical hit. <br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Generosity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38294() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Sigil of Generosity\",\"description\":\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38294,\"icon\":\"https://render.guildwars2.com/file/19487F3F01F76165F79D0DCAEF3E7E3FFF5DFEFA/526288.png\",\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":16509,\"description\":\"60% chance to transfer a condition to your foe on a critical hit. <br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Generosity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38298() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"15-Slot Gift Box\",\"description\":\"15 Slots\",\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38298,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"no_sell_or_sort\":false,\"size\":15}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38300() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mystical Cog\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38300,\"icon\":\"https://render.guildwars2.com/file/651122397EE3CAF0043D1518A1FF6ED301AD689A/526289.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38301() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wad of Enchanted Stuffing\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38301,\"icon\":\"https://render.guildwars2.com/file/2802D4663E9A265B06214F5D2C345C7A77C725FD/526290.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38302() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Drop of Magic Glue\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":1,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":38302,\"icon\":\"https://render.guildwars2.com/file/250601FE36D69F0B3A3DA6BA06803BB0BC725806/526291.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38303() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Princess Doll Frame\",\"description\":\"Combine in the mystic forge with 250 mystical cogs, wads of enchanted stuffing, and drops of magic glue to make a Princess Doll mini pet.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38303,\"icon\":\"https://render.guildwars2.com/file/B60AC1EEB420A51201FBB6EE782E9D7BED0B9953/526292.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38304() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toy Soldier Frame\",\"description\":\"Combine in the mystic forge with 250 mystical cogs, wads of enchanted stuffing, and drops of magic glue to make a Toy Soldier mini pet.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38304,\"icon\":\"https://render.guildwars2.com/file/C1DB05E30670C2674BC24C0471E65E7529C6AFF6/526293.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38305() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plush Griffon Frame\",\"description\":\"Combine in the mystic forge with 250 mystical cogs, wads of enchanted stuffing, and drops of magic glue to make a Plush Griffon mini pet.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38305,\"icon\":\"https://render.guildwars2.com/file/D84AD05917ED08B5B00531E150F20724552CD8F7/526294.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38306() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ventari Frame\",\"description\":\"Combine in the mystic forge with 250 mystical cogs, wads of enchanted stuffing, and drops of magic glue to make a Toy Ventari mini pet.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38306,\"icon\":\"https://render.guildwars2.com/file/6C269CE120AE1609536CFBD8785F9EAD949B69DB/526295.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38307() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Toy Golem Frame\",\"description\":\"Combine in the mystic forge with 250 mystical cogs, wads of enchanted stuffing, and drops of magic glue to make a Toy Golem mini pet.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38307,\"icon\":\"https://render.guildwars2.com/file/F7CC0CA4D3D36709BC391AF5364DB572EB3709A4/526296.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38309() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Personalized Wintersday Gift\",\"description\":\"<c=@flavor>Your name is on the tag. What a nice gift. Double-click to open.</c>\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":7,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38309,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38310() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38310,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38311() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38311,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38312() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38312,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38313() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38313,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem38314() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Small Wintersday Gift\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":38314,\"icon\":\"https://render.guildwars2.com/file/420CE6DF804B1429750A115F9B6CEDA504A036F4/526220.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}