package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0219 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem49657() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoard of the Marionette Warden I\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49657,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49658() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hoard of the Marionette Warden V\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49658,\"icon\":\"https://render.guildwars2.com/file/EC12BE596939FA100394651B5715F33A0046EB36/711847.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49662() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet's Spare Keys\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49662,\"icon\":\"https://render.guildwars2.com/file/E5CFCDEC7DCA7B95DF10094B2241240A783CE1EE/63173.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49663() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bag of Power Core Pieces\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49663,\"icon\":\"https://render.guildwars2.com/file/347216FD06D0C766900E97970335FD3492F9F362/222554.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49664() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Wurm's Golden Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49664,\"icon\":\"https://render.guildwars2.com/file/01E1F97E6302777D4AA225AD04316A7BBB3A620D/711848.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49666() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Wurm's Bronze Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49666,\"icon\":\"https://render.guildwars2.com/file/01E1F97E6302777D4AA225AD04316A7BBB3A620D/711848.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49667() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"The Wurm's Silver Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49667,\"icon\":\"https://render.guildwars2.com/file/01E1F97E6302777D4AA225AD04316A7BBB3A620D/711848.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49669() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Daily Wurm Chest\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49669,\"icon\":\"https://render.guildwars2.com/file/01E1F97E6302777D4AA225AD04316A7BBB3A620D/711848.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49670() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pile of Regurgitated Armor\",\"description\":\"Double-click to open.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Ascended\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49670,\"icon\":\"https://render.guildwars2.com/file/FE2CFC2DF2AA02C24C9FE810119D0539266CDB42/222418.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49724() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Cobalt Great Jungle Wurm Head\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49724,\"icon\":\"https://render.guildwars2.com/file/750804D2EFE9B3370441DDA6B79A39520DA0A4BA/711881.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49782() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Watchwork Mechanism\",\"description\":\"Refined from Watchwork Sprockets.\",\"type\":\"CraftingMaterial\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":49782,\"icon\":\"https://render.guildwars2.com/file/5E979AEEF7D092DCFEF9ADA527BB61F6FF03E811/711882.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49800() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Box of Zealot's Draconic Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49800,\"icon\":\"https://render.guildwars2.com/file/4C264FCC91D1034307CBBD0738656647DD67C467/63227.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49801() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Zealot's Emblazoned Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49801,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49802() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Satchel of Zealot's Exalted Armor\",\"description\":\"Double-click to unpack a full set of level 80 armor.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49802,\"icon\":\"https://render.guildwars2.com/file/04F3F7DD14F20DB1146C0B3B0A54D5A216B55551/63199.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49817() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sprocket Orichalcum Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49817,\"icon\":\"https://render.guildwars2.com/file/1FC536670207B86F58E059010106CF235C501B54/711883.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":90},{\"attribute\":\"Precision\",\"modifier\":64},{\"attribute\":\"Healing\",\"modifier\":64}]},\"suffix_item_id\":49823,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49822() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sprocket Orichalcum Earring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":330,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49822,\"icon\":\"https://render.guildwars2.com/file/142921AD6013C3E40D0E7E0A39036E13C74AB5A2/711884.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":56},{\"attribute\":\"Precision\",\"modifier\":40},{\"attribute\":\"Healing\",\"modifier\":40}]},\"suffix_item_id\":49823,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49823() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Exquisite Watchwork Sprocket\",\"description\":\"Double-click to apply to an accessory, amulet, or ring with an unused upgrade slot.\",\"type\":\"UpgradeComponent\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":264,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":49823,\"icon\":\"https://render.guildwars2.com/file/5E6C20BB53B73C80BB65AA4361293C03C90C6D0B/711885.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Trinket\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":22564,\"description\":\"+25 Power\n+15 Precision\n+15 Healing\"},\"attributes\":[]},\"suffix\":\"of the Zealot\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49824() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sprocket Orichalcum Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"AccountBound\",\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49824,\"icon\":\"https://render.guildwars2.com/file/0EA9000E021BB27FD3BB59595C361347C76B170D/711886.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":67},{\"attribute\":\"Precision\",\"modifier\":48},{\"attribute\":\"Healing\",\"modifier\":48}]},\"suffix_item_id\":49823,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49827() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mini Twisted Watchwork Moa\",\"description\":\"Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"NoMysticForge\",\"NoSell\"],\"restrictions\":[],\"id\":49827,\"icon\":\"https://render.guildwars2.com/file/FBC07804286EDA166D05ABC878400D6476ED01E7/711889.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49828() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Amulet of Triple Curiosity\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":528,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49828,\"icon\":\"https://render.guildwars2.com/file/FF7A0A0FFD6FAC2C14F8151CC7A674B393F735BB/222410.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":90},{\"attribute\":\"Toughness\",\"modifier\":64},{\"attribute\":\"Vitality\",\"modifier\":64}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49836() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Connie's Lost Wedding Ring\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Exotic\",\"vendor_value\":396,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":49836,\"icon\":\"https://render.guildwars2.com/file/251B516BFE4F11714F6EE6172ABF70C306442FB9/220892.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":67},{\"attribute\":\"Toughness\",\"modifier\":48},{\"attribute\":\"Vitality\",\"modifier\":48}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49839() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Scarlet Briar's Journal, 2nd Fragment\",\"description\":\"Double-click to read. Collect all 5 fragments and double-click to assemble the journal.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49839,\"icon\":\"https://render.guildwars2.com/file/420E49DB1E7D3DA8B91DCA15A747B19E1E06B4CD/711899.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Watchwork Code Fragment\",\"description\":\"Double-click to combine 25 code fragments to complete a cypher.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49841,\"icon\":\"https://render.guildwars2.com/file/6BCD47BB2F53FA7D6673EA9AF83F15030E6CC0DC/711901.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Aetherblade Code Fragment\",\"description\":\"Double-click to combine 25 code fragments to complete a cypher.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49844,\"icon\":\"https://render.guildwars2.com/file/95EDF750596722E243D3B6E1D5736308E1520BC0/711904.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem49846() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Molten Code Fragment\",\"description\":\"Double-click to combine 25 code fragments to complete a cypher.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":49846,\"icon\":\"https://render.guildwars2.com/file/39F0696E095E9423AC7F117295DB25C67A1A0A7F/711906.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}