package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0115 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23716() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Pearl\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23716,\"icon\":\"https://render.guildwars2.com/file/7D70420B60279BB1019EE840FD0B493CB41EF993/66820.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23717() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Runestone Necklace\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":248,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23717,\"icon\":\"https://render.guildwars2.com/file/5029F1056F05432812FCDEB23A06C072F4A7DDFD/455950.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":66},{\"attribute\":\"Precision\",\"modifier\":47},{\"attribute\":\"Toughness\",\"modifier\":47}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23718() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cursed Pirate Ring\",\"description\":\"\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":186,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23718,\"icon\":\"https://render.guildwars2.com/file/0FBD3AE0A86297C46F63C935D622C4BEC601592F/455952.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":50},{\"attribute\":\"Precision\",\"modifier\":35},{\"attribute\":\"Vitality\",\"modifier\":35}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23719() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mariners Compass\",\"description\":\"\",\"type\":\"Trinket\",\"level\":73,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23719,\"icon\":\"https://render.guildwars2.com/file/B5EECF6C94EE36F30533925C9801073A02D29F97/455956.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23724() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Moa Collar\",\"description\":\"<c=@flavor>\\\"Our moas prefer the spiked collars.\\\"<br>—Cassie</c>\",\"type\":\"Trinket\",\"level\":5,\"rarity\":\"Fine\",\"vendor_value\":13,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23724,\"icon\":\"https://render.guildwars2.com/file/BF37B370A2F404A9DBCF773CB7CF536C6A543901/220900.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23725() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Emblem\",\"description\":\"<c=@flavor>\\\"You paid for this in centaur blood.\\\"<br>—Diedra</c>\",\"type\":\"Trinket\",\"level\":6,\"rarity\":\"Fine\",\"vendor_value\":14,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23725,\"icon\":\"https://render.guildwars2.com/file/CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4/60984.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23726() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Skritt Trinket\",\"description\":\"<c=@flavor>\\\"Skritt will steal anything not nailed down, and even then it better be nailed to something big.\\\"<br>—Laborer Cardy</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23726,\"icon\":\"https://render.guildwars2.com/file/21A6C1D3CFEAE3F0C56134B7C5B099FD20E069AB/455957.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23727() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rare Ascalonian Coin\",\"description\":\"<c=@flavor>\\\"The emblem for King Adelbern is barely recognizable, and the writing has been completely worn off.\\\"</c>\",\"type\":\"Trinket\",\"level\":7,\"rarity\":\"Fine\",\"vendor_value\":15,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23727,\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23728() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Claypool Militia Badge\",\"description\":\"<c=@flavor>\\\"Trained Member of the Claypool Militia\\\"</c>\",\"type\":\"Trinket\",\"level\":8,\"rarity\":\"Fine\",\"vendor_value\":17,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23728,\"icon\":\"https://render.guildwars2.com/file/596749EC03A1D6B69F05AF90DE26FBF4B4A15FAA/455942.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23729() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Centaur Arrowhead\",\"description\":\"<c=@flavor>\\\"It's chipped and stained with old blood.\\\"</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23729,\"icon\":\"https://render.guildwars2.com/file/C56364EF0CD5F8D8FE110C9CA93C285E4FEFA7E0/455928.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23730() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Boar Tusk\",\"description\":\"<c=@flavor>\\\"If you think this one is big, you should see the one above the fireplace.\\\"<br>—Hunter Block</c>\",\"type\":\"Trinket\",\"level\":9,\"rarity\":\"Fine\",\"vendor_value\":18,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23730,\"icon\":\"https://render.guildwars2.com/file/A1B34EE0F99DF12B533EC52740DA0CBE55D9F39B/66436.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23731() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Monk's Beer Stein\",\"description\":\"<c=@flavor>\\\"These steins are crafted extra sturdy. They won't break over a bandit's head, and the can block a centaur arrow without leaking any ale.\\\"<br>—Brother Vince</c>\",\"type\":\"Trinket\",\"level\":11,\"rarity\":\"Fine\",\"vendor_value\":20,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23731,\"icon\":\"https://render.guildwars2.com/file/D0D82C22BD0892D55DD12CA00DC453294B312FF2/63146.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23732() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Fish Hook\",\"description\":\"<c=@flavor>\\\"This is my own special hook design that I carve out of dried driftwood.\\\"<br>—Fisherman Will</c>\",\"type\":\"Trinket\",\"level\":10,\"rarity\":\"Fine\",\"vendor_value\":19,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23732,\"icon\":\"https://render.guildwars2.com/file/58CC7A110853DA7E9FD46DD996A6E8640A75B7DF/220901.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23733() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Chewed Dog Whistle\",\"description\":\"<c=@flavor>\\\"Whatever dog got hold of this whistle has really big teeth.\\\"<br>—Paden</c>\",\"type\":\"Trinket\",\"level\":12,\"rarity\":\"Fine\",\"vendor_value\":22,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23733,\"icon\":\"https://render.guildwars2.com/file/7D690B7EED62F5805043C7D4F9A3CE963BED0395/220902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23734() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Rusty Iron Key\",\"description\":\"<c=@flavor>\\\"There's more rust than iron left here.\\\"</c>\",\"type\":\"Trinket\",\"level\":13,\"rarity\":\"Fine\",\"vendor_value\":23,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23734,\"icon\":\"https://render.guildwars2.com/file/9577036D9BF8A120CD02BCF110DDFA416303026A/65712.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":5}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23735() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ettin Nose Ring\",\"description\":\"<c=@flavor>\\\"Ettin ring make you strong!\\\"<br>—Krug</c>\",\"type\":\"Trinket\",\"level\":14,\"rarity\":\"Fine\",\"vendor_value\":24,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23735,\"icon\":\"https://render.guildwars2.com/file/13F31CF8CCBD0C4264D1EB9F5C0137B22CE49C73/63588.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23736() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Petrified Ectoplasm\",\"description\":\"<c=@flavor>\\\"Why did they come here? What were these used for? If only I could find the answers.\\\"<br>—Historian Garrod</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23736,\"icon\":\"https://render.guildwars2.com/file/0CC1D9193269BEE6C56C1AE85EE7960CD81DFF3F/66840.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23737() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Dog Tags\",\"description\":\"<c=@flavor>\\\"The inscription worn and illegible.\\\"</c>\",\"type\":\"Trinket\",\"level\":13,\"rarity\":\"Fine\",\"vendor_value\":36,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23737,\"icon\":\"https://render.guildwars2.com/file/0837FFBB17F349AFE268CC9F1ED22FADCCC49C5C/66836.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23738() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bandit Ring\",\"description\":\"<c=@flavor>\\\"Probably twice-stolen anyhow...\\\"<br>—Waldo</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23738,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23739() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Bandit Emblem\",\"description\":\"<c=@flavor>\\\"Some people think it makes 'em look tougher.\\\"<br>—Waldo</c>\",\"type\":\"Trinket\",\"level\":15,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23739,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Toughness\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23740() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lionscout Medal\",\"description\":\"<c=@flavor>\\\"Trade is life. Thanks.\\\"<br>—Micah</c>\",\"type\":\"Trinket\",\"level\":16,\"rarity\":\"Fine\",\"vendor_value\":25,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23740,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23741() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Centaur Horseshoe\",\"description\":\"<c=@flavor>\\\"Hope it makes you luckier than the centaur it came from.\\\"<br>—Barnaby</c>\",\"type\":\"Trinket\",\"level\":17,\"rarity\":\"Fine\",\"vendor_value\":27,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23741,\"icon\":\"https://render.guildwars2.com/file/925878C913992FD4EF01A5FAE5CB96AF050945A5/63598.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Precision\",\"modifier\":6}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23742() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Glowing Lodestone\",\"description\":\"<c=@flavor>\\\"I've been experimenting with these mysterious stones, and I can assure you I've mostly gotten them figured out...I think.\\\"<br>—Gilli</c>\",\"type\":\"Trinket\",\"level\":18,\"rarity\":\"Fine\",\"vendor_value\":28,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23742,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23743() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Triskell Hook Earrings\",\"description\":\"<c=@flavor>\\\"The hooks are unique to this region. Some people like the way they look.\\\"<br>—Mayor Trisk</c>\",\"type\":\"Trinket\",\"level\":19,\"rarity\":\"Fine\",\"vendor_value\":29,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23743,\"icon\":\"https://render.guildwars2.com/file/99F62C2E0578A7BCBC0AFF644EDD2D079B0A33EC/63597.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23744() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shrunken Head\",\"description\":\"<c=@flavor>\\\"And I thought I had a headache. We don't know what these are made of, but those Ettins drop them all over the place.\\\"<br>—Deputy Jenks</c>\",\"type\":\"Trinket\",\"level\":20,\"rarity\":\"Fine\",\"vendor_value\":30,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23744,\"icon\":\"https://render.guildwars2.com/file/52613CCCD852025DB4367E0996661EBE71B8E001/455958.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}