package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0211 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem46746() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vision Crystal\",\"description\":\"Used in crafting Ascended items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":40,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46746,\"icon\":\"https://render.guildwars2.com/file/4F19A8B4E309C3042358FB194F7190331DEF27EB/631494.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46747() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Thermocatalytic Reagent\",\"description\":\"Used in the crafting of ascended items. Can be purchased from master craftsmen.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":46747,\"icon\":\"https://render.guildwars2.com/file/090DF0E7AFD6AD9A6C9FC31CCE510A05663D0A0E/631495.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46752() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Augur's Stone\",\"description\":\"Used in crafting Ascended items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":320,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":46752,\"icon\":\"https://render.guildwars2.com/file/622C35BD7B48F77C07C94CA3C73F9D9ADBCA4403/631529.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46755() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Traveler's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Exotic\",\"vendor_value\":372,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46755,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":61},{\"attribute\":\"Toughness\",\"modifier\":43},{\"attribute\":\"Vitality\",\"modifier\":43}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46756() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Traveler's Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46756,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46757() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Traveler's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Exotic\",\"vendor_value\":496,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46757,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":81},{\"attribute\":\"Toughness\",\"modifier\":58},{\"attribute\":\"Vitality\",\"modifier\":58}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem46758() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Traveler's Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":46758,\"icon\":\"https://render.guildwars2.com/file/4D9C6F58C20F052359BA5D1D10B9E4B97ED5F012/66791.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47833() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47833,\"icon\":\"https://render.guildwars2.com/file/7A3DBC0EF1F3CCDF939104F1E9BA31AEF80E9277/222560.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47834() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47834,\"icon\":\"https://render.guildwars2.com/file/7A3DBC0EF1F3CCDF939104F1E9BA31AEF80E9277/222560.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47835() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47835,\"icon\":\"https://render.guildwars2.com/file/7A3DBC0EF1F3CCDF939104F1E9BA31AEF80E9277/222560.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47836() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47836,\"icon\":\"https://render.guildwars2.com/file/7A3DBC0EF1F3CCDF939104F1E9BA31AEF80E9277/222560.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Risen Thrall\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47841,\"icon\":\"https://render.guildwars2.com/file/766DB50DA0BB9CF654237342CA0AFF69A4243BFA/638233.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47842() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Risen Brute\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47842,\"icon\":\"https://render.guildwars2.com/file/5E6BDC2A8003E3F810FF0C9375ADB31346C04072/638234.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47843() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Risen Plague Carrier\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47843,\"icon\":\"https://render.guildwars2.com/file/61DE6A44D856B23D9C63EA17CC71DA3EB549040A/638235.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Risen Abomination\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47844,\"icon\":\"https://render.guildwars2.com/file/03B108573C3739B8030D5EF86F5F0D2FC1F618E2/638236.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47845() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Risen Hylek\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":47845,\"icon\":\"https://render.guildwars2.com/file/54C862643766B67646992A650A5FFB3F1A5304B6/638237.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Tequatl the Sunless\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":47846,\"icon\":\"https://render.guildwars2.com/file/EC27BAEDA6062EC26CB8C145B60B725A5F5AB60C/638238.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet's Secret Stash\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47847,\"icon\":\"https://render.guildwars2.com/file/441EF9BAB614527809557206EA5FF3D45A70CBCE/222566.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47870() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tequatl's Hoard\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47870,\"icon\":\"https://render.guildwars2.com/file/FE2CFC2DF2AA02C24C9FE810119D0539266CDB42/222418.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47871() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bone Fragments of Tequatl\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":47871,\"icon\":\"https://render.guildwars2.com/file/D1E6BA44040B5FC54F0905199A506BDAD11D7A59/638362.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47872() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fang of Tequatl\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":47872,\"icon\":\"https://render.guildwars2.com/file/090C47B6BFC5F70B5BA83D3B0F4630A51F07ED34/220642.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Toughness\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47897() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Watchwork Mining Pick\",\"description\":\"Used to mine all metals. Unlimited uses.\n\nHas a small chance to reward a watchwork sprocket on each swing in addition to mining results.\",\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":192,\"default_skin\":2396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47897,\"icon\":\"https://render.guildwars2.com/file/9FE07606DC0F7329DDBE0497293AA7629391040D/711980.png\",\"details\":{\"type\":\"Mining\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47900() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Metallurgic Dye Kit\",\"description\":\"Double-click to gain one random metal-themed color. Includes six exclusive colors.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47900,\"icon\":\"https://render.guildwars2.com/file/C9660719E6A3BCA1A9DB049AAFFD0F96B57AFCEE/699316.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47907() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet's Champions Mini 3-Pack\",\"description\":\"Contains 1 of each of these miniatures:\n• Mini Toxic Warlock\n• Mini Molten Berserker\n• Mini Aetherblade Admiral\n\nEach mini can be activated from your inventory to follow you around the world.\nCombine these three minis in the Mystic Forge with the Mini Mai Trin from the Black Lion Chest to create a Mini Scarlet Briar.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":47907,\"icon\":\"https://render.guildwars2.com/file/0ACE7DECCAA0CFD4A1A879A0EA532BC2E70E7E0F/757484.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem47908() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Superior Rune of the Sunless\",\"description\":\"Double-click to apply to a piece of armor.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\",\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":47908,\"icon\":\"https://render.guildwars2.com/file/01C3E7BA21ACB2220DEF2713DCA6F5C745CD9106/638381.png\",\"details\":{\"type\":\"Rune\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"-5% Incoming Condition Duration\",\"+50 Condition Damage\",\"-10% Incoming Condition Duration\",\"+100 Condition Damage\",\"When you use your elite skill you inflict 1 second of fear and 5 seconds of poison to nearby foes. <c=@reminder>(Cooldown: 45s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Sunless\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}