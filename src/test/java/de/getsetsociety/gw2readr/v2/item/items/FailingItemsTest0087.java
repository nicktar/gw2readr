package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0087 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem21214() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Fighter\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21214,\"icon\":\"https://render.guildwars2.com/file/65A51C02312B93452A6EA9F0BF6BB5240894500D/220735.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Toughness\",\"+50 Power\",\"+65 Toughness\",\"+100 Power\",\"When you use a heal skill you gain 3 stacks of might for 10 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Brawler\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21215() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Scholar\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21215,\"icon\":\"https://render.guildwars2.com/file/4378ABC0415950DAC6A05C76920392D72E242EC2/220736.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Ferocity\",\"+50 Power\",\"+65 Ferocity\",\"+100 Power\",\"+10% damage while your health is above 90%\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Scholar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21216() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Water\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21216,\"icon\":\"https://render.guildwars2.com/file/50C5E3125234FF4525162A052335354D47B50D0F/220737.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+5% Boon Duration\",\"+50 Healing\",\"25% chance when struck to remove a condition. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Healing\",\"+15% Boon Duration; when you use a heal skill, you and nearby allies are healed for a small amount. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21217() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Monk\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21217,\"icon\":\"https://render.guildwars2.com/file/E028F4BC03E9EC36A368712463D824CEC30FCCDA/220738.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+5% Boon Duration\",\"+50 Healing\",\"+10% boon duration; 25% chance when struck to heal for a small amount. <c=@reminder>(Cooldown: 15s)</c>\",\"+100 Healing\",\"+10% Outgoing heal effectiveness to allies.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Monk\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21218() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Nightmare\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21218,\"icon\":\"https://render.guildwars2.com/file/2420347B95791503F2E666E948E825A652095395/220739.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+5% Condition Duration\",\"+50 Condition Damage\",\"+10% Condition Duration\",\"+100 Condition Damage\",\"50% chance when struck to cause fear for 2 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Nightmare\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21219() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Forge\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21219,\"icon\":\"https://render.guildwars2.com/file/0764987FBB1369A74103DE3F1B279C02EA503D02/220740.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+10% Burning Duration\",\"+50 Toughness\",\"+15% Protection Duration\",\"+100 Toughness\",\"When struck below 50% health you gain protection for 10s and burn nearby foes. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Forgeman\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21220() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Baelfire\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21220,\"icon\":\"https://render.guildwars2.com/file/BE044D76F2F1762634B00A5E4216E7B8C104D1FB/220741.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Burning Duration\",\"+50 Power\",\"25% chance to gain vigor for 5 seconds when struck. <c=@reminder>(Cooldown: 25s)</c>\",\"+100 Power\",\"+20% burning duration; 50% chance when struck to cause a fire nova. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Baelfire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21221() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Sanctuary\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21221,\"icon\":\"https://render.guildwars2.com/file/7C142C0B6558D2DCDB01E580A04321302F4F5B40/220742.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+5% Boon Duration\",\"+50 Vitality\",\"25% chance when struck to gain retaliation for 4 seconds.<c=@reminder>(Cooldown: 30s)</c>\",\"+100 Vitality\",\"When struck below 20% health gain stability for 5 seconds. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Sanctuary\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21222() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Orr\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21222,\"icon\":\"https://render.guildwars2.com/file/27245474E83839DC6648F22CF6B5F4B09514DF11/220743.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Poison Duration\",\"+50 Condition Damage\",\"25% chance when struck to cause poison for 10 seconds. <c=@reminder>(Cooldown: 20s)</c>\",\"+100 Condition Damage\",\"+20% poison duration; when struck below 20% health gain quickness for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Orr\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21257() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Nullification\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21257,\"icon\":\"https://render.guildwars2.com/file/B926E1026E6E271D3B9F9A177710E3A8C801FFF3/220744.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9290,\"description\":\"60% Chance on Critical: Remove a Boon<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Nullification\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21258() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Purity\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21258,\"icon\":\"https://render.guildwars2.com/file/C3E907DE24CF72CE490639710F46CDCD917D5B06/220745.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9289,\"description\":\"60% Chance on Hit: Remove a Condition<br><c=@reminder>(Cooldown: 10 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Purity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21269() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Tournament Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21269,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21270() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Tournament Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21270,\"icon\":\"https://render.guildwars2.com/file/730A99AC6A69DD0F5352DAD56A91FC09D76F0D39/62860.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21271() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Tournament Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21271,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21299() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Unidentified Dye\",\"description\":\"Double-click to identify one random dye color which can be unlocked for one of your characters or recycled at the mystic forge.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":21299,\"icon\":\"https://render.guildwars2.com/file/109A6B04C4E577D9266EEDA21CC30E6B800DD452/66587.png\",\"details\":{\"type\":\"GiftBox\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21309() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Copper Free Tournament Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21309,\"icon\":\"https://render.guildwars2.com/file/900B6F07174AEFC96A664AC6115D2DABC90B06B8/66867.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21310() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Gold Free Tournament Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21310,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21311() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Silver Free Tournament Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21311,\"icon\":\"https://render.guildwars2.com/file/730A99AC6A69DD0F5352DAD56A91FC09D76F0D39/62860.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21318() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rabbit Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21318,\"icon\":\"https://render.guildwars2.com/file/73090436997D49C05FAFD4462757971CADC2E6B4/63155.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21319() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deer Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21319,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21320() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Dolyak Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21320,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21321() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Wolf Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21321,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21322() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Tiger Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21322,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21323() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bear Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21323,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21324() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shark Reward Chest\",\"description\":\"Double-click to receive your PvP rewards.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":21324,\"icon\":\"https://render.guildwars2.com/file/666209104CCB024D53359C0EA0A299076E610771/65704.png\",\"details\":{\"type\":\"Default\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}