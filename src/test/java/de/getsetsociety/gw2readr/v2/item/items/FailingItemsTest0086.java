package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0086 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem21188() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Infiltration\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21188,\"icon\":\"https://render.guildwars2.com/file/F9C62BCFB70106EEBCA33C4AC35352CE2A082F10/220710.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+2% damage against foes with less than 50% health.\",\"+35 Precision\",\"+4% damage against foes with less than 50% health.\",\"+65 Precision\",\"+6% damage against targets with less than 50% health.\",\"When struck below 20% health, cloak for 4 seconds. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Infiltration\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21189() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Krait\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21189,\"icon\":\"https://render.guildwars2.com/file/F0932EF967413023BE0CC1EEF5E2536B2764E65A/220711.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+10% Bleeding Duration\",\"+50 Condition Damage\",\"+15% bleeding duration; 25% chance when struck to cause bleeding for 10 seconds. <c=@reminder>(Cooldown: 15s)</c>\",\"+100 Condition Damage\",\"+20% bleeding duration; when you use your elite skill you inflict bleeding, torment, and poison for 8 seconds to nearby foes. <c=@reminder>(Cooldown: 30s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Krait\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21190() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Lich\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21190,\"icon\":\"https://render.guildwars2.com/file/10324E350DEFA2276F0FD22299D4BAFD00736D18/220712.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+5% Condition Duration\",\"+50 Vitality\",\"+10% Condition Duration\",\"+100 Vitality\",\"50% chance when struck to summon a jagged horror. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Lich\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21191() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Lyssa\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21191,\"icon\":\"https://render.guildwars2.com/file/0A5ED9EE533DC7116A7D50EAAECD5A1FF024ACFE/220713.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+5% Condition Duration\",\"+50 Precision\",\"When you use a heal skill you gain a random boon for 10 seconds. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Precision\",\"When you use an elite skill, convert up to 5 conditions into boons. <c=@reminder>(Cooldown: 45s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Lyssa\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21192() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Melandru\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21192,\"icon\":\"https://render.guildwars2.com/file/66A56E6838D707BBBAD0B8D0091425502F7E3AF4/220714.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Vitality\",\"+50 Toughness\",\"-10% Incoming Condition Duration; -10% Incoming Stun Duration\",\"+100 Toughness\",\"-15% Incoming Condition Duration; -15% Incoming Stun Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Melandru\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21193() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Mercy\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21193,\"icon\":\"https://render.guildwars2.com/file/6866D3A85960F806E67C616E5709F97F0D025F02/220715.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"Gain up to 400 toughness while reviving an ally, based on your level.\",\"+50 Toughness\",\"You resurrect allies with 30% more health.\",\"+100 Toughness\",\"You revive allied players 20% faster.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Mercy\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21194() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Ogre\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21194,\"icon\":\"https://render.guildwars2.com/file/136590B36FFC2053D135743B063405C9A54A9E6A/220716.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Ferocity\",\"+50 Power\",\"25% chance when struck to summon a rock dog. <c=@reminder>(Cooldown: 90s)</c>\",\"+100 Power\",\"+4% damage\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ogre\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21195() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Pack\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21195,\"icon\":\"https://render.guildwars2.com/file/FEF77764F24C0548271F29337268970C092DA5D3/220717.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+10% Swiftness Duration\",\"+50 Power\",\"25% chance when struck to grant nearby allies might, fury, and swiftness for 10s . <c=@reminder>(Cooldown: 20s)</c>\",\"+100 Power\",\"+20% Swiftness Duration; +125 Precision\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Pack\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21197() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Rage\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21197,\"icon\":\"https://render.guildwars2.com/file/5F65FDA9D721B6BA5654E5ED29A42B01C04DF2DA/220719.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Ferocity\",\"+10% Fury Duration\",\"+50 Ferocity\",\"25% chance when struck to gain fury for 15 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Ferocity\",\"+20% fury duration; while under the effects of fury gain +5% damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rage\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21198() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Rata Sum\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21198,\"icon\":\"https://render.guildwars2.com/file/1434C3CEC42A4F0D4861F013B899D9CBFE91E836/220720.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+10% Poison Duration\",\"+50 Precision\",\"+15% Weakness Duration\",\"+100 Precision\",\"+20% poison duration; 50% chance when struck to summon a radiation field. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Rata Sum\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21199() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Svanir\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21199,\"icon\":\"https://render.guildwars2.com/file/65EA9C9AA55EF137657B65CA18EC98581B54DC0F/220721.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+10% Chill Duration\",\"+50 Toughness\",\"-50% Incoming Chill Duration\",\"+100 Toughness\",\"+20% chill duration; when you're struck below 20% health become a block of ice for 5 seconds. <c=@reminder>(Cooldown: 90s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Svanir\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21200() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Speed\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21200,\"icon\":\"https://render.guildwars2.com/file/1ED9421DC70174CA9BBC33075047381C3659C837/220722.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+10% Swiftness Duration\",\"+50 Vitality\",\"25% chance when struck to gain swiftness for 15 seconds. <c=@reminder>(Cooldown: 30s)</c>\",\"+100 Vitality\",\"+20% Swiftness Duration; +25% Movement Speed\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Speed\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21201() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Undead\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21201,\"icon\":\"https://render.guildwars2.com/file/D32651C75E09C23F0ECD234CE8B1C666E032296C/220723.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+35 Toughness\",\"+50 Condition Damage\",\"+65 Toughness\",\"+100 Condition Damage\",\"7% of toughness is converted to condition damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Undead\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21202() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Vampirism\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21202,\"icon\":\"https://render.guildwars2.com/file/F13EECC6AED473604A097A5DBB0861E3410702EF/220724.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"15% chance when struck to cause your next attack to steal life. <c=@reminder>(Cooldown: 25s)</c>\",\"+50 Power\",\"After using your healing skill, your next attack skill steals health. <c=@reminder>(Cooldown: 10s)</c>\",\"+100 Power\",\"When struck below 20% health you become mist. <c=@reminder>(Cooldown: 60s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Vampirism\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21203() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Wurm\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21203,\"icon\":\"https://render.guildwars2.com/file/D0076C2606409FD9AE49C562DD963B7B48B90136/220725.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+35 Ferocity\",\"+50 Vitality\",\"+65 Ferocity\",\"+100 Vitality\",\"7% of vitality is converted to ferocity.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Wurm\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21204() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Necromancer\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21204,\"icon\":\"https://render.guildwars2.com/file/653A411208E7310CDCE628750C39A5C237F5F220/220726.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+35 Vitality\",\"+50 Condition Damage\",\"+65 Vitality\",\"+100 Condition Damage\",\"+20% Fear Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Necromancer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21205() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Mesmer\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21205,\"icon\":\"https://render.guildwars2.com/file/D4099559DA2558F9B172EFB306EE0C942193B66F/220727.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Precision\",\"+50 Power\",\"+65 Precision\",\"+100 Power\",\"+33% Daze Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Mesmer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21206() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Engineer\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21206,\"icon\":\"https://render.guildwars2.com/file/9896142965DE036D05030D04220A036062545B43/220728.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Condition Damage\",\"+50 Toughness\",\"+65 Condition Damage\",\"+100 Toughness\",\"While wielding a conjured weapon, environmental weapons, kits, banners, and stolen items gain +7% damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Engineer\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21207() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Ranger\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21207,\"icon\":\"https://render.guildwars2.com/file/74190770191950B5CD9439B93B487816959E9D3B/220729.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+35 Ferocity\",\"+50 Precision\",\"+65 Ferocity\",\"+100 Precision\",\"+7% damage while you have an active companion.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Ranger\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21208() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Elementalist\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21208,\"icon\":\"https://render.guildwars2.com/file/F321ABCA3954145A4A17046D6170767740674866/220730.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Power\",\"+35 Condition Damage\",\"+50 Power\",\"+65 Condition Damage\",\"+100 Power\",\"+20% Burning Duration; +20% Chill Duration\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Elementalist\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21209() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Thief\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21209,\"icon\":\"https://render.guildwars2.com/file/997AEFF0927F640DE515B4DA516911B3B3B6B9EA/220731.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Precision\",\"+35 Condition Damage\",\"+50 Precision\",\"+65 Condition Damage\",\"+100 Precision\",\"When striking your foe from behind or the side gain +10% damage.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Thief\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21210() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Warrior\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21210,\"icon\":\"https://render.guildwars2.com/file/ACA8355625070B3706CAE0B49B0549CB12123420/220732.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+35 Power\",\"+50 Vitality\",\"+65 Power\",\"+100 Vitality\",\"-20% recharge on weapon swap.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Warrior\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21211() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Guardian\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21211,\"icon\":\"https://render.guildwars2.com/file/AE08720A7849BB97DA0E299C00440EFA5C6B1F98/220733.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Toughness\",\"+35 Healing\",\"+50 Toughness\",\"+65 Healing\",\"+100 Toughness\",\"When you block a foe's attack, burn that foe for 1 second.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Guardian\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21212() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of the Soldier\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21212,\"icon\":\"https://render.guildwars2.com/file/643A3C23647EF27F520860F0EFC7FEEB29766B1A/220734.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Vitality\",\"+35 Toughness\",\"+50 Vitality\",\"+65 Toughness\",\"+100 Vitality\",\"Shouts remove a condition from each affected ally.\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of the Trooper\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem21213() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rune of Adventure\",\"description\":\"\",\"type\":\"UpgradeComponent\",\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,\"game_types\":[\"Pvp\",\"PvpLobby\"],\"flags\":[\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":21213,\"icon\":\"https://render.guildwars2.com/file/F33F44776DFCB0D75B48005904E3C75456C4F5FA/220644.png\",\"details\":{\"type\":\"Default\",\"flags\":[\"HeavyArmor\",\"LightArmor\",\"MediumArmor\"],\"infusion_upgrade_flags\":[],\"bonuses\":[\"+25 Condition Damage\",\"+35 Power\",\"+50 Condition Damage\",\"+65 Power\",\"+100 Condition Damage\",\"When you use a heal skill you gain 50% endurance. <c=@reminder>(Cooldown: 10s)</c>\"],\"infix_upgrade\":{\"attributes\":[]},\"suffix\":\"of Adventure\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}