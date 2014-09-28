package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0117 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23770() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Pirate Rum Cork\",\"description\":\"<c=@flavor>Smells lucky.</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23770,\"icon\":\"https://render.guildwars2.com/file/EC0FD4E67CDCE50B0D9A0F6AC8754CC04D11D9D1/455963.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":20},{\"attribute\":\"Power\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23771() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Pirate Rum Cork\",\"description\":\"<c=@flavor>Smells lucky.</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23771,\"icon\":\"https://render.guildwars2.com/file/EC0FD4E67CDCE50B0D9A0F6AC8754CC04D11D9D1/455963.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":22},{\"attribute\":\"Power\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23772() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cannon Fuse\",\"description\":\"<c=@flavor>Store in a dry, cool place.</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23772,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":22},{\"attribute\":\"ConditionDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23773() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cannon Fuse\",\"description\":\"<c=@flavor>Store in a dry, cool place.</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Fine\",\"vendor_value\":54,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23773,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":20},{\"attribute\":\"ConditionDamage\",\"modifier\":14}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23774() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Note\",\"description\":\"<c=@flavor>\\\"B2 12 89 12 92\\\"</c>\",\"type\":\"Trinket\",\"level\":48,\"rarity\":\"Masterwork\",\"vendor_value\":108,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23774,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23775() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order of Whispers Secret Note\",\"description\":\"<c=@flavor>\\\"B2 12 89 12 92\\\"</c>\",\"type\":\"Trinket\",\"level\":49,\"rarity\":\"Fine\",\"vendor_value\":55,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23775,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":20},{\"attribute\":\"ConditionDamage\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23776() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rusty Trident Tip\",\"description\":\"<c=@flavor>\\\"Either the quaggan used it backward or this one didn't fit.\\\"<br>—Scholar Sharpslash</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23776,\"icon\":\"https://render.guildwars2.com/file/C56364EF0CD5F8D8FE110C9CA93C285E4FEFA7E0/455928.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":21},{\"attribute\":\"ConditionDamage\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23777() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rusty Trident Tip\",\"description\":\"<c=@flavor>\\\"Either the quaggan used it backward or this one didn't fit.\\\"<br>—Scholar Sharpslash</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23777,\"icon\":\"https://render.guildwars2.com/file/C56364EF0CD5F8D8FE110C9CA93C285E4FEFA7E0/455928.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23778() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Krytan Jewelry\",\"description\":\"<c=@flavor>This piece is elaborate in ways not seen in modern jewelry design.</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Masterwork\",\"vendor_value\":164,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23778,\"icon\":\"https://render.guildwars2.com/file/5DA4511B575EB91FF66118E676DFB10D61677316/455964.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":32},{\"attribute\":\"ConditionDamage\",\"modifier\":23}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23779() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Krytan Jewelry\",\"description\":\"<c=@flavor>This piece is elaborate in ways not seen in modern jewelry design.</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":82,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23779,\"icon\":\"https://render.guildwars2.com/file/5DA4511B575EB91FF66118E676DFB10D61677316/455964.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":29},{\"attribute\":\"ConditionDamage\",\"modifier\":21}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23780() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deactivated Dredge Mine\",\"description\":\"<c=@flavor>This weapon is deactivated, but still possesses an explosive core. Do not drop.</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23780,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":21},{\"attribute\":\"Power\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23781() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Deactivated Dredge Mine\",\"description\":\"<c=@flavor>This weapon is deactivated, but still possesses an explosive core. Do not drop.</c>\",\"type\":\"Trinket\",\"level\":50,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23781,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23782() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Scout Medal\",\"description\":\"<c=@flavor>\\\"It's amazing what you can find in a old Skritt cave.\\\"<br>—Crusader Aisling</c>\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Fine\",\"vendor_value\":57,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23782,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":22},{\"attribute\":\"Vitality\",\"modifier\":15}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23783() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vigil Scout Medal\",\"description\":\"<c=@flavor>\\\"It's amazing what you can find in a old Skritt cave.\\\"<br>—Crusader Aisling</c>\",\"type\":\"Trinket\",\"level\":51,\"rarity\":\"Masterwork\",\"vendor_value\":113,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23783,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":24},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23784() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Purified Ocean Water\",\"description\":\"<c=@flavor>A vial of bluest water.</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Masterwork\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23784,\"icon\":\"https://render.guildwars2.com/file/17116576C478FE08481E1F010C991A0BBEE92339/222408.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":25},{\"attribute\":\"Power\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23785() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vial of Purified Ocean Water\",\"description\":\"<c=@flavor>A vial of bluest water.</c>\",\"type\":\"Trinket\",\"level\":53,\"rarity\":\"Fine\",\"vendor_value\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23785,\"icon\":\"https://render.guildwars2.com/file/17116576C478FE08481E1F010C991A0BBEE92339/222408.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":23},{\"attribute\":\"Power\",\"modifier\":16}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23786() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Firefly in a Jar\",\"description\":\"<c=@flavor>The insect inside this vessel glows brightly.</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Masterwork\",\"vendor_value\":118,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23786,\"icon\":\"https://render.guildwars2.com/file/2C49060C264F6843174B279C28A442F15A41C5D4/455965.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"ConditionDamage\",\"modifier\":18}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23787() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Firefly in a Jar\",\"description\":\"<c=@flavor>The insect inside this vessel glows brightly.</c>\",\"type\":\"Trinket\",\"level\":54,\"rarity\":\"Fine\",\"vendor_value\":59,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23787,\"icon\":\"https://render.guildwars2.com/file/2C49060C264F6843174B279C28A442F15A41C5D4/455965.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":23},{\"attribute\":\"ConditionDamage\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23788() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rare Jungle Orchid\",\"description\":\"<c=@flavor>This rare flower grows in the deep jungle.</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Fine\",\"vendor_value\":60,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23788,\"icon\":\"https://render.guildwars2.com/file/0BAE2308BCFF130946D96CECB70793156BBFB456/66529.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":24},{\"attribute\":\"Toughness\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":17}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23789() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rare Jungle Orchid\",\"description\":\"<c=@flavor>This rare flower grows in the deep jungle.</c>\",\"type\":\"Trinket\",\"level\":55,\"rarity\":\"Masterwork\",\"vendor_value\":120,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23789,\"icon\":\"https://render.guildwars2.com/file/0BAE2308BCFF130946D96CECB70793156BBFB456/66529.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":26},{\"attribute\":\"Toughness\",\"modifier\":19},{\"attribute\":\"Vitality\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23790() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Memoirs of Captain Greywind\",\"description\":\"<c=@flavor>\\\"Because the surrounding area is so dangerous, I have taken it upon myself to provide training to all of Ascalon. As a friend of the settlement, you may train under me as well.\\\"<br>—Captain Greywind</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Fine\",\"vendor_value\":38,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23790,\"icon\":\"https://render.guildwars2.com/file/09D5CC42680FED30CE9A5AC2EB7EFCA93F522B06/66843.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":11},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23791() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Memoirs of Captain Greywind, Unabridged\",\"description\":\"<c=@flavor>\\\"I didn't like leaving them behind to distract the White Mantle army, but Ascalonian soldiers are survivors first and foremost. I'm sure they'll turn up.\\\"<br>—Captain Greywind</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Masterwork\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23791,\"icon\":\"https://render.guildwars2.com/file/DBF694D7189D1005B29106DD453326DB69222A18/65636.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23792() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Vollym Forget-Me-Not\",\"description\":\"<c=@flavor>\\\"Another day, perhaps.\\\"<br>—Vollym</c>\",\"type\":\"Trinket\",\"level\":26,\"rarity\":\"Fine\",\"vendor_value\":35,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23792,\"icon\":\"https://render.guildwars2.com/file/04E4574ACA48BB6FCF757BDE0AADB207FE7FEB3E/66844.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":9},{\"attribute\":\"Vitality\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23793() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Enscribed Vollym Forget-Me-Not\",\"description\":\"<c=@flavor>\\\"You've got some bite after all—just not enough to best the best.\\\"<br>—Vollym</c>\",\"type\":\"Trinket\",\"level\":26,\"rarity\":\"Masterwork\",\"vendor_value\":70,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23793,\"icon\":\"https://render.guildwars2.com/file/6BBDDFC94C6DFAC00C400EA7E56739E769050AB9/66845.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23794() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Milton's Silver Apple Corer\",\"description\":\"<c=@flavor>\\\"Never worry about swallowing an apple seed ever again!\\\"<br>—Eilla</c>\",\"type\":\"Trinket\",\"level\":30,\"rarity\":\"Masterwork\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23794,\"icon\":\"https://render.guildwars2.com/file/42F9E4E9540B6E90F00E403E286F61AB34D47553/66846.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}