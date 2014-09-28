package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0059 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem19182() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dolyak Sinew\",\"description\":\"This tough sinew can be turned into thread by Seamstress Aina.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Junk\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19182,\"icon\":\"https://render.guildwars2.com/file/72553F1D20D469715EBE7A61BE015A4E790D0136/65682.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19186() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hylek Armor\",\"description\":\"This armor was most likely stolen from the local hylek. It should be returned to Yoal east of Titan's Staircase.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19186,\"icon\":\"https://render.guildwars2.com/file/9E18F2CA80B88003787B9A619B34E5D2BDB1B9BA/65683.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19189() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Caledon Lavender\",\"description\":\"This flower is used by sylvari for medicine. Harvester Mavad near Aron's Waypoint could likely use it.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19189,\"icon\":\"https://render.guildwars2.com/file/B1077A6F5D6A7D5350B4B237EB06A9F1F5CB054C/63334.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19216() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kelp\",\"description\":\"The hylek use this plant for reducing toxicity in their bodies. A hylek village should be nearby where someone can make use of this.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19216,\"icon\":\"https://render.guildwars2.com/file/B1077A6F5D6A7D5350B4B237EB06A9F1F5CB054C/63334.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19217() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Supplies\",\"description\":\"Someone in the nearby Pact base to the north would like this.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":2,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],\"id\":19217,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19228() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dredge Tank Blueprints\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19228,\"icon\":\"https://render.guildwars2.com/file/0DD50C0496765C6395BE623D3E0FA97CD6190649/65711.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19229() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dwarven Key\",\"description\":\"Event Item. Looks like it would open a very old lock.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":19229,\"icon\":\"https://render.guildwars2.com/file/9577036D9BF8A120CD02BCF110DDFA416303026A/65712.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19271() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Special Root\",\"description\":\"Event Item\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":19271,\"icon\":\"https://render.guildwars2.com/file/1224FC7CC403630C47CF4A98167937B05841ED6E/65715.png\"}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19337() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Commissar's Manifesto\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19337,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19338() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Breath of Kralkatorrik\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19338,\"icon\":\"https://render.guildwars2.com/file/071410D26DC8480BA014C84A05EC7BE4DA0FDA5A/219373.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19339() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Symbol of the Inquest\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19339,\"icon\":\"https://render.guildwars2.com/file/0CF21678B07362BA78CB40B24804CBF8702AB42C/223705.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19340() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rotbeard's Treasure\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19340,\"icon\":\"https://render.guildwars2.com/file/0D04C8CF44F1B1441697C35255CE62D76EE12D79/223723.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19341() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pendant of Arah\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":132,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19341,\"icon\":\"https://render.guildwars2.com/file/4A1710690160563572BA3E7046DDB7B2A7C7B116/222382.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":68}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19342() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"All Seeing\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":132,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19342,\"icon\":\"https://render.guildwars2.com/file/5192966328AD06F3A33812C0C3056CDD1E9EBC66/66848.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":68}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19343() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Star of Dwayna\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":132,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19343,\"icon\":\"https://render.guildwars2.com/file/E81974AFE544A89E0F9F9D08A87DD06594C10561/66772.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":68}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19344() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sentinel's Bane\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19344,\"icon\":\"https://render.guildwars2.com/file/DED65F5701125755C725ACC8B10CFAEF6DD8201E/340170.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19345() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Circle of Arah\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19345,\"icon\":\"https://render.guildwars2.com/file/273079FEFEC8AAD9484B1A67E6DF0E57FD02A7CA/63614.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19346() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Balthazar's Band\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19346,\"icon\":\"https://render.guildwars2.com/file/DED65F5701125755C725ACC8B10CFAEF6DD8201E/340170.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19347() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dwayna's Embrace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19347,\"icon\":\"https://render.guildwars2.com/file/D77EC84E46F4BFBF162537FE3D195C1B53C1BF40/414995.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19348() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Melandru's Bloom\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19348,\"icon\":\"https://render.guildwars2.com/file/B77BF8FA6B4A257F1369462457F354A238F80378/414996.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19349() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Signet of Grenth\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19349,\"icon\":\"https://render.guildwars2.com/file/1CF5CB605A4A16EA25E574B0035296CB35A7380B/66798.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19350() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Eternal Ice\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19350,\"icon\":\"https://render.guildwars2.com/file/9B7092DEEB52B2F5F89F60030DC50CF1A5F6F7E1/66870.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19351() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sam\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19351,\"icon\":\"https://render.guildwars2.com/file/FC652099E73BB298DA24FB644E050D3EFBC1592D/220905.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19352() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ulgoth's Tail\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19352,\"icon\":\"https://render.guildwars2.com/file/F2B2A7B638C8789C01EAB5C1A657D42D3DB77BCF/66896.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem19353() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rhendak's Signet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":99,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":19353,\"icon\":\"https://render.guildwars2.com/file/E04D922A65ADFF4029465095F0FB1A487108C2C3/414997.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":51}]},\"suffix_item_id\":24534,\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}