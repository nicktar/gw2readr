package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0173 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem39467() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Breath of Kralkatorrik\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39467,\"icon\":\"https://render.guildwars2.com/file/071410D26DC8480BA014C84A05EC7BE4DA0FDA5A/219373.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":40}]},\"suffix_item_id\":24532,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39468() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commissar's Manifesto\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39468,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":56},{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":40}]},\"suffix_item_id\":24922,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39469() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eternal Ice\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39469,\"icon\":\"https://render.guildwars2.com/file/9B7092DEEB52B2F5F89F60030DC50CF1A5F6F7E1/66870.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"ConditionDamage\",\"modifier\":40}]},\"suffix_item_id\":24921,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39470() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sam\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39470,\"icon\":\"https://render.guildwars2.com/file/FC652099E73BB298DA24FB644E050D3EFBC1592D/220905.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"suffix_item_id\":24923,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39471() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rotbeard's Treasure\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39471,\"icon\":\"https://render.guildwars2.com/file/0D04C8CF44F1B1441697C35255CE62D76EE12D79/223723.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":40}]},\"suffix_item_id\":24532,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39472() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Symbol of the Inquest\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39472,\"icon\":\"https://render.guildwars2.com/file/0CF21678B07362BA78CB40B24804CBF8702AB42C/223705.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Precision\",\"modifier\":56},{\"attribute\":\"ConditionDamage\",\"modifier\":40}]},\"suffix_item_id\":24921,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39473() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ulgoth's Tail\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39473,\"icon\":\"https://render.guildwars2.com/file/F2B2A7B638C8789C01EAB5C1A657D42D3DB77BCF/66896.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"CritDamage\",\"modifier\":40},{\"attribute\":\"Vitality\",\"modifier\":40}]},\"suffix_item_id\":24919,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39474() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"All Seeing\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39474,\"icon\":\"https://render.guildwars2.com/file/5192966328AD06F3A33812C0C3056CDD1E9EBC66/66848.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"suffix_item_id\":24514,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39475() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pendant of Arah\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39475,\"icon\":\"https://render.guildwars2.com/file/4A1710690160563572BA3E7046DDB7B2A7C7B116/222382.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"Precision\",\"modifier\":64},{\"attribute\":\"CritDamage\",\"modifier\":64}]},\"suffix_item_id\":24924,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39476() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Star of Dwayna\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39476,\"icon\":\"https://render.guildwars2.com/file/E81974AFE544A89E0F9F9D08A87DD06594C10561/66772.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":90},{\"attribute\":\"Power\",\"modifier\":64},{\"attribute\":\"Toughness\",\"modifier\":64}]},\"suffix_item_id\":24925,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39477() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Balthazar's Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39477,\"icon\":\"https://render.guildwars2.com/file/DED65F5701125755C725ACC8B10CFAEF6DD8201E/340170.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"CritDamage\",\"modifier\":48}]},\"suffix_item_id\":24924,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39478() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Circle of Arah\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39478,\"icon\":\"https://render.guildwars2.com/file/273079FEFEC8AAD9484B1A67E6DF0E57FD02A7CA/63614.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"suffix_item_id\":24920,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39479() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dwayna's Embrace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39479,\"icon\":\"https://render.guildwars2.com/file/D77EC84E46F4BFBF162537FE3D195C1B53C1BF40/414995.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"suffix_item_id\":24518,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39480() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Melandru's Bloom\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39480,\"icon\":\"https://render.guildwars2.com/file/B77BF8FA6B4A257F1369462457F354A238F80378/414996.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":67},{\"attribute\":\"ConditionDamage\",\"modifier\":48},{\"attribute\":\"Healing\",\"modifier\":48}]},\"suffix_item_id\":24533,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39481() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rhendak's Signet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39481,\"icon\":\"https://render.guildwars2.com/file/E04D922A65ADFF4029465095F0FB1A487108C2C3/414997.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"CritDamage\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"suffix_item_id\":24919,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39482() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Bane\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39482,\"icon\":\"https://render.guildwars2.com/file/DED65F5701125755C725ACC8B10CFAEF6DD8201E/340170.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Power\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"suffix_item_id\":24920,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39483() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Signet of Grenth\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":39483,\"icon\":\"https://render.guildwars2.com/file/1CF5CB605A4A16EA25E574B0035296CB35A7380B/66798.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"Toughness\",\"modifier\":48}]},\"suffix_item_id\":24532,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39495() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pink Quaggan Backpack Set\",\"description\":\"This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\nDouble-click to unpack and bind this item to your account.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":39495,\"icon\":\"https://render.guildwars2.com/file/36CA911D490A80F0C1CD68FA4EB3F1959107F095/543793.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39499() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Green Quaggan Backpack Set\",\"description\":\"Double-click to unpack. This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39499,\"icon\":\"https://render.guildwars2.com/file/B52F95961926230B3C30B49603BDB53C4CCD31AB/543799.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39503() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cheetah Charr Backpack Set\",\"description\":\"This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\nDouble-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":39503,\"icon\":\"https://render.guildwars2.com/file/D00402250E4A2328CE0547970BAEF3E9BB9C9A78/543805.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39507() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiger Charr Backpack Set\",\"description\":\"This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\nDouble-click to unpack and bind this item to your account.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":39507,\"icon\":\"https://render.guildwars2.com/file/0635984C98AA7E079FAAD7AD4723A73D30EAFD64/543813.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39511() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Plush Charr Backpack Set\",\"description\":\"This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\nDouble-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39511,\"icon\":\"https://render.guildwars2.com/file/93FE6D582B9877ED617FFFE2F94977A4A83E2C13/543823.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39515() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Covert Charr Backpack Set\",\"description\":\"This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\nDouble-click to unpack.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39515,\"icon\":\"https://render.guildwars2.com/file/CA781E1CBE1F0D674B7BDFFF5BF845157C5C035A/543827.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39520() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Warrior Quaggan Backpack Set\",\"description\":\"Double-click to unpack. This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":39520,\"icon\":\"https://render.guildwars2.com/file/ADE839C7FBDE9B18EE07E21FD4B8AC7BA06E29EE/543837.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem39524() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Quaggan Killer Whale Backpack Set\",\"description\":\"Double-click to unpack. This backpack cover comes with a simple back strap to wear if you don't have another back-slot item.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":39524,\"icon\":\"https://render.guildwars2.com/file/0E0A5B152003A6CE0A6B04163E096E1929D85213/543849.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}