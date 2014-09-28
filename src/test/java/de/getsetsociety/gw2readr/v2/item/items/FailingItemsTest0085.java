package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0085 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem21148() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Water\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21148,\"icon\":\"https://render.guildwars2.com/file/F117A4F536901B0C69A618EEEB0DA6BDEB075FD8/220684.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9446,\"description\":\"30% Chance on Hit: Heal nearby allies around your target (360 radius).<br><c=@reminder>(Cooldown: 5 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Water\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21149() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Intelligence\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21149,\"icon\":\"https://render.guildwars2.com/file/1F41DBAFFA5979D7496F2BB9E4D9AE0F2FA4F940/220685.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9421,\"description\":\"Your next three attacks after swapping to this weapon while in combat have a 100% critical chance. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Intelligence\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21150() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Doom\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21150,\"icon\":\"https://render.guildwars2.com/file/6CE4D1D6E5392C4CC8BACA595E3393EBF208BEED/220686.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9442,\"description\":\"Your next attack after you swap to this weapon while in combat inflicts poison (6 seconds).<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Doom\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21151() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Geomancy\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21151,\"icon\":\"https://render.guildwars2.com/file/B79B430645DDF54E6792909A52F5CA40A4911407/220687.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9436,\"description\":\"Inflict bleeding on nearby foes for 10 seconds when you swap to this weapon while in combat.<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Geomancy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21152() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Energy\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21152,\"icon\":\"https://render.guildwars2.com/file/3A064B97AB7D0E1F1250EFB5F06798A8FE623708/220688.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9438,\"description\":\"Gain 50% of your endurance when you swap to this weapon while in combat. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Energy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21153() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Hydromancy\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21153,\"icon\":\"https://render.guildwars2.com/file/B5F3E2021863079919299707290698504B5C7E90/220689.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9430,\"description\":\"Damage nearby foes and chill them for 2 seconds when you swap to this weapon while in combat.<br><c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Hydromancy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21154() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Leeching\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21154,\"icon\":\"https://render.guildwars2.com/file/BC276BC8AD2497A1E5A905CBDB20425CF2133D78/220690.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9420,\"description\":\"Your next attack after swapping to this weapon while in combat steals some health. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Leeching\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21155() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Sigil of Battle\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21155,\"icon\":\"https://render.guildwars2.com/file/A25A5E7D74A6B293B5C6B8EC7EDA1A06C649CBEF/220691.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\",\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\",\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":9424,\"description\":\"Gain 3 stacks of might (20 seconds) when you swap to this weapon while in combat. <c=@reminder>(Cooldown: 9 Seconds)</c>\"},\"attributes\":[]},\"suffix\":\"of Battle\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21170() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Afflicted\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21170,\"icon\":\"https://render.guildwars2.com/file/B952E2BB3ACDF477F4C823655DAC1294C9A12745/220692.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Bleeding Duration\",\"+50 Condition Damage\",\"+15% Poison Duration\",\"+100 Condition Damage\",\"+20% bleeding duration; when you are downed, you create a death nova. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Afflicted\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21171() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Air\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21171,\"icon\":\"https://render.guildwars2.com/file/0A0CF1DD44A26CCC6BF9ADEE623DCED5070901BB/220693.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Ferocity\",\"+10% Swiftness Duration\",\"+50 Ferocity\",\"When you use a heal skill you gain swiftness for 5 seconds. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Ferocity\",\"+20% swiftness duration; 50% chance when struck  to hit the foe with a lightning strike. <c=@reminder>(Cooldown: 20s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Air\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21172() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Balthazar\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21172,\"icon\":\"https://render.guildwars2.com/file/7CEF770BE7E6A5E507B6D98018155CD2395FAD18/220694.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Burning Duration\",\"+50 Condition Damage\",\"+15% burning duration; when you're struck below 20% health gain quickness for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\",\"+100 Condition Damage\",\"+20% burning duration; when you use a heal skill nearby foes are burned for 3 seconds. <c=@reminder>Cooldown: 10s</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Balthazar\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21173() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Centaur\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21173,\"icon\":\"https://render.guildwars2.com/file/37FB0225B2DE715BCB25B02D2914F35DBB080708/220695.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Swiftness Duration\",\"+50 Power\",\"-50% Incoming Cripple Duration\",\"+100 Power\",\"+20% swiftness duration; when you use a heal skill, you and all nearby allies gain swiftness for 10 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Centaur\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21174() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Citadel\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21174,\"icon\":\"https://render.guildwars2.com/file/2647384A4CFBDA013F974944C501E19D092B37A8/220696.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Fury Duration\",\"+50 Power\",\"25% chance when struck to gain fury for 15s. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Power\",\"20% fury duration; 50% chance when struck to summon a bomb. <c=@reminder>(Cooldown: 15s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Citadel\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21175() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Divinity\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21175,\"icon\":\"https://render.guildwars2.com/file/7431F5E2780106172D4A97C863D80BDAAC681FBF/220697.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+8 to All Stats\",\"+10 to all stats\",\"+12 to All Stats\",\"+14 to All Stats\",\"+16 to All Stats\",\"+18 to All Stats\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Divinity\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21176() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Dolyak\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21176,\"icon\":\"https://render.guildwars2.com/file/217571E95C4742460B033E0F5F2B3FB611C9DC4A/220698.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Vitality\",\"+50 Toughness\",\"+65 Vitality\",\"+100 Toughness\",\"Regenerate health every second.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Dolyak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21177() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Dwayna\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21177,\"icon\":\"https://render.guildwars2.com/file/AFB370B09F230D76014E55662924CDFB5AD947A3/220699.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+10% Regeneration Duration\",\"+50 Healing\",\"25% chance when struck to gain regeneration for 10 seconds. <c=@reminder>(Cooldown: 45s)</c>\",\"+100 Healing\",\"+20% regeneration duration; when you use a heal skill, you and all nearby allies gain regeneration for 5 seconds. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Dwayna\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21178() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Eagle\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21178,\"icon\":\"https://render.guildwars2.com/file/2966CB3D97E85EB0E4C33AFB6D1FB63D7304EC97/220700.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+35 Ferocity\",\"+50 Precision\",\"+65 Ferocity\",\"+100 Precision\",\"+6% damage against targets with less than 50% health.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Eagle\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21179() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Earth\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21179,\"icon\":\"https://render.guildwars2.com/file/93A53AB1F304354ED1981AB465BCDD51B2F4D857/220701.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+10% Protection Duration\",\"+50 Toughness\",\"25% chance when struck to gain protection for 3 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Toughness\",\"+20% protection duration; when struck below 20% health you gain a magnetic aura for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Earth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21180() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Fire\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21180,\"icon\":\"https://render.guildwars2.com/file/6967534DA6E09150241DC411B0F4A4B415520FF7/220702.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Might Duration\",\"+50 Power\",\"25% chance when struck to gain might for 10s. <c=@reminder>(Cooldown: 5s)</c>\",\"+100 Power\",\"+20% burning duration; when struck below 80% health you gain a fire aura for 5s. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Fire\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21181() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Flame Legion\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21181,\"icon\":\"https://render.guildwars2.com/file/776392A017E4DA16BF3DCA69292BB31ABA998010/220703.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Burning Duration\",\"+50 Power\",\"25% chance to cause burning for 1s when hit. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Power\",\"+20% burning duration; +7% damage against burning foes.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flame Legion\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21182() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Flock\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21182,\"icon\":\"https://render.guildwars2.com/file/F9D5AFF9E79806AF490FA1E6DD73041D15D401A7/220704.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"15% chance when struck to summon a bird to strike the attacking foe. <c=@reminder>(Cooldown: 10s)</c>\",\"+50 Healing\",\"When the summoned bird strikes a foe, it also inflicts blindness for 5 seconds.\",\"+100 Healing\",\"When you use a heal skill, you and nearby allies are healed for a small amount. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Flock\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21184() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Grenth\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21184,\"icon\":\"https://render.guildwars2.com/file/5930FE034AD9067EC7DF633C683927EB4A0F509F/220706.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Chill Duration\",\"+50 Condition Damage\",\"25% chance when struck to cause chill for 3 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Condition Damage\",\"+20% chill duration; when you use a healing skill nearby foes are chilled for 3 seconds. <c=@reminder>Cooldown: 10s</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Grenth\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21185() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Grove\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21185,\"icon\":\"https://render.guildwars2.com/file/1A4B11313EA4B3076232AAA10D0F2F62A50A6179/220707.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Healing\",\"+10% Protection Duration\",\"+50 Healing\",\"25% chance when struck to gain protection for 4 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Healing\",\"+20% protection duration; 50% chance when struck to root the attacking foe. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Grove\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21186() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Hoelbrak\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21186,\"icon\":\"https://render.guildwars2.com/file/150204B4552ED82CD15204ACC7360198F51F6C13/220708.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Might Duration\",\"+50 Power\",\"25% chance when struck to gain might for 10s. <c=@reminder>(Cooldown: 5s)</c>\",\"+100 Power\",\"+20% might duration; -20% condition duration applied to you.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Hoelbrak\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21187() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Ice\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21187,\"icon\":\"https://render.guildwars2.com/file/B34492445E5F38655FF49B7FB9EFD4DB03A37A90/220709.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+10% Chill Duration\",\"+50 Vitality\",\"25% chance when struck to cause an ice nova. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Vitality\",\"+20% chill duration; +7% damage against chilled foes.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Ice\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}