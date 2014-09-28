package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0083 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem20835() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Phoenix Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20835,\"icon\":\"https://render.guildwars2.com/file/FA53FDE67AB9FE0D6632301269ECA119AD4809DF/66782.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20836() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dragon Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20836,\"icon\":\"https://render.guildwars2.com/file/FA53FDE67AB9FE0D6632301269ECA119AD4809DF/66782.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20837() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Free Tournament Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20837,\"icon\":\"https://render.guildwars2.com/file/FA53FDE67AB9FE0D6632301269ECA119AD4809DF/66782.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20838() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Consumable Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20838,\"icon\":\"https://render.guildwars2.com/file/027D1D382447933D074BE45F405EA1F379471DEB/63127.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20839() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arcane Orb\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20839,\"icon\":\"https://render.guildwars2.com/file/4D59B95AC418420104F20E9739785D43F36BAF26/66922.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20840() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Boots Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20840,\"icon\":\"https://render.guildwars2.com/file/DFA36C6D9E7650C75D01C5B523D74334DBD9B751/219664.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Coat Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20841,\"icon\":\"https://render.guildwars2.com/file/F3C601B1F1480D05A4180C01C4277FB0AA314DB6/222872.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20842() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Gloves Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20842,\"icon\":\"https://render.guildwars2.com/file/F8A1387F1AA09AEE7C5BC7B20DE0B7E73D34A120/63530.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20843() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Helm Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20843,\"icon\":\"https://render.guildwars2.com/file/4E55BB99A10C9C724AE35253EC91B780A75F62F3/222856.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Leggings Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20844,\"icon\":\"https://render.guildwars2.com/file/5003B506C9FC60A1CE7473B8E24AD4F73F136709/222878.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20845() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Boots Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20845,\"icon\":\"https://render.guildwars2.com/file/DFA36C6D9E7650C75D01C5B523D74334DBD9B751/219664.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Coat Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20846,\"icon\":\"https://render.guildwars2.com/file/F3C601B1F1480D05A4180C01C4277FB0AA314DB6/222872.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20847() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Gloves Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20847,\"icon\":\"https://render.guildwars2.com/file/F8A1387F1AA09AEE7C5BC7B20DE0B7E73D34A120/63530.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20848() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Helm Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20848,\"icon\":\"https://render.guildwars2.com/file/4E55BB99A10C9C724AE35253EC91B780A75F62F3/222856.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20849() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Leggings Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20849,\"icon\":\"https://render.guildwars2.com/file/5003B506C9FC60A1CE7473B8E24AD4F73F136709/222878.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20850() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Medium Pauldron Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20850,\"icon\":\"https://render.guildwars2.com/file/1F4FEF6F41C299A7461763AC21D448464919D9B9/63525.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20851() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Heavy Pauldron Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20851,\"icon\":\"https://render.guildwars2.com/file/1F4FEF6F41C299A7461763AC21D448464919D9B9/63525.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20852() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eldritch Scroll\",\"description\":\"A powerful scroll used in the Mystic Forge.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Legendary\",\"vendor_value\":640,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20852,\"icon\":\"https://render.guildwars2.com/file/57B5F0CE02092248CDA26C7A54EF01EE2209A5FC/434427.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem20853() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Paid Tournament Token\",\"description\":\"Used by the Mystic Forge to produce PvP items.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":6,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20853,\"icon\":\"https://render.guildwars2.com/file/FA53FDE67AB9FE0D6632301269ECA119AD4809DF/66782.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21044() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hero's Band\",\"description\":\"<c=@flavor>\\\"Heroes are made from ordinary people put in extraordinary circumstances.\\\"</c>\",\"type\":\"Trinket\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21044,\"icon\":\"https://render.guildwars2.com/file/489C92790E5FAB0CBC6F4DF006929DE2496E7A7D/398647.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":2},{\"attribute\":\"Precision\",\"modifier\":2},{\"attribute\":\"Toughness\",\"modifier\":2},{\"attribute\":\"Vitality\",\"modifier\":2},{\"attribute\":\"CritDamage\",\"modifier\":2},{\"attribute\":\"Healing\",\"modifier\":2},{\"attribute\":\"ConditionDamage\",\"modifier\":2}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21047() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Miniature Rytlock\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":21047,\"icon\":\"https://render.guildwars2.com/file/795ED1B945A29EC3E3066797DF57FFB25ABAA631/340551.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21048() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Golem Banker\",\"description\":\"Double-click to access your account bank from anywhere. Reusable.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21048,\"icon\":\"https://render.guildwars2.com/file/244608C3097CD11527B67F1013F959072D277F15/340548.png\",\"details\":{\"type\":\"RentableContractNpc\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21092() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Strength\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21092,\"icon\":\"https://render.guildwars2.com/file/F33F44776DFCB0D75B48005904E3C75456C4F5FA/220644.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Might Duration\",\"+50 Power\",\"+15% might duration; 25% chance when struck to gain might for 5 seconds. <c=@reminder>(Cooldown: 5s)</c>\",\"+100 Power\",\"+20% might duration; +5% damage while under the effects of might.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Strength\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21121() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Agony\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21121,\"icon\":\"https://render.guildwars2.com/file/BAF34EB051D118F8A7C1645E0D940ED0660E6269/220658.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9313,\"description\":\"Increase Inflicted Bleeding Duration: 20%\"},\"attributes\":[]},\"suffix\":\"of Agony\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21122() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Smoldering\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21122,\"icon\":\"https://render.guildwars2.com/file/60AAB7109E5D679901E00DC066774EE5FB3E6052/220659.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9314,\"description\":\"Increase Inflicted Burning Duration: 20%\"},\"attributes\":[]},\"suffix\":\"of Smoldering\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}