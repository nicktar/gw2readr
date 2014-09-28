package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0119 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23820() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Half-burned Candle\",\"description\":\"<c=@flavor>A spare light when caught in the dark.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Masterwork\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23820,\"icon\":\"https://render.guildwars2.com/file/69C93931EC7BD70797021CD93EAD1E2C185BCA3B/455969.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":12},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23821() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pristine Gold Ring\",\"description\":\"<c=@flavor>A plain, but well-made piece of jewelry.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23821,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Ring\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23822() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Half-burned Candle\",\"description\":\"<c=@flavor>A spare light when caught in the dark.</c>\",\"type\":\"Trinket\",\"level\":29,\"rarity\":\"Fine\",\"vendor_value\":38,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23822,\"icon\":\"https://render.guildwars2.com/file/69C93931EC7BD70797021CD93EAD1E2C185BCA3B/455969.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":11},{\"attribute\":\"Vitality\",\"modifier\":8}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23823() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Arena Armlet\",\"description\":\"<c=@flavor>Fashionable, yet functional.</c>\",\"type\":\"Trinket\",\"level\":26,\"rarity\":\"Fine\",\"vendor_value\":35,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23823,\"icon\":\"https://render.guildwars2.com/file/55010C3751D7C862064C5E6028CFB527DE376AB5/66847.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":9},{\"attribute\":\"Power\",\"modifier\":7}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23824() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Royal Family's Jewel\",\"description\":\"<c=@flavor>\\\"I doubt the family will miss this!\\\"<br>—Lindi</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23824,\"icon\":\"https://render.guildwars2.com/file/4509BC03FA4ACBABBC103EF655A157CF66CE21AB/455968.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":18},{\"attribute\":\"ConditionDamage\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23825() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Orrian Relic\",\"description\":\"<c=@flavor>\\\"This should help on the journey ahead!\\\"<br>—Arcanist Riagan</c>\",\"type\":\"Trinket\",\"level\":45,\"rarity\":\"Fine\",\"vendor_value\":52,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23825,\"icon\":\"https://render.guildwars2.com/file/7857F64D1D299E6350B0FEB4F67B639A4F13926D/66439.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":18},{\"attribute\":\"Vitality\",\"modifier\":13}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23826() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cane's Approval\",\"description\":\"<c=@flavor>\\\"Couldn't have done better myself. Well, maybe.\\\"—Cane</c>\",\"type\":\"Trinket\",\"level\":34,\"rarity\":\"Fine\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23826,\"icon\":\"https://render.guildwars2.com/file/04E4574ACA48BB6FCF757BDE0AADB207FE7FEB3E/66844.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":13},{\"attribute\":\"ConditionDamage\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23827() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Handwritten Note\",\"description\":\"<c=@flavor>\\\"The centaurs took everything from us, but people like you will help us take it back.\\\"<br>—Anonymous Refugee</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Fine\",\"vendor_value\":42,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23827,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":12},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23828() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honorary Company Membership Badge\",\"description\":\"<c=@flavor>\\\"You're one of us now. Just don't let it go to your head.\\\" —Cap</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Fine\",\"vendor_value\":43,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23828,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":13},{\"attribute\":\"Power\",\"modifier\":9}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23829() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smashed Centaur Catapult Gear\",\"description\":\"<c=@flavor>\\\"One less weapon for the centaur war machine.\\\"</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23829,\"icon\":\"https://render.guildwars2.com/file/FC637AA3031B585F5B025B12670C6CD5A5C1BA51/63130.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":14},{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23830() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Confiscated Bandit Schematics\",\"description\":\"<c=@flavor>A series of crude diagrams which detail the construction and application of a cabbage bomb.</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Fine\",\"vendor_value\":44,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23830,\"icon\":\"https://render.guildwars2.com/file/0DD50C0496765C6395BE623D3E0FA97CD6190649/65711.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23831() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient White Mantle Badge\",\"description\":\"<c=@flavor>The mark of the White Mantle is still visible on the badge's dented face.</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Fine\",\"vendor_value\":45,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23831,\"icon\":\"https://render.guildwars2.com/file/08A9626A09B2BFA8CC08C117BE1BFB113B452313/455970.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":15},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23832() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Trebuchet User's Manual\",\"description\":\"<c=@flavor>Point away from face.</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Fine\",\"vendor_value\":47,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23832,\"icon\":\"https://render.guildwars2.com/file/61220B407C9E62C41223DA0B48CE2F37090FADF9/455971.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23833() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Frying Pan\",\"description\":\"<c=@flavor>\\\"It's either never been used, or it's been licked clean.\\\"</c>\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23833,\"icon\":\"https://render.guildwars2.com/file/09D5CC42680FED30CE9A5AC2EB7EFCA93F522B06/66843.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23834() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Assault Kit\",\"description\":\"<c=@flavor>\\\"Contents: string, paperclip, folding knife, wax...\\\"</c>\",\"type\":\"Trinket\",\"level\":41,\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23834,\"icon\":\"https://render.guildwars2.com/file/21FF236A656E0BAA217C6E2E5AEBD2D1A6E3B7BC/66426.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23835() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Broken Shackles\",\"description\":\"<c=@flavor>Freedom.</c>\",\"type\":\"Trinket\",\"level\":42,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23835,\"icon\":\"https://render.guildwars2.com/file/D901FDEB6501DB1BD9C7F19113BA2DCF91E00E0A/455972.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":27},{\"attribute\":\"Power\",\"modifier\":19}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23836() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Medal of Honor\",\"description\":\"<c=@flavor>\\\"For service above and beyond the call of duty.\\\"</c>\",\"type\":\"Trinket\",\"level\":43,\"rarity\":\"Fine\",\"vendor_value\":80,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23836,\"icon\":\"https://render.guildwars2.com/file/B9595BAFC57D70621D0A0C745C6E475FC540707C/66230.png\",\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":28},{\"attribute\":\"ConditionDamage\",\"modifier\":20}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23837() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Cane's Approval\",\"description\":\"<c=@flavor>\\\"Couldn't have done better myself. Well, maybe.\\\"—Cane</c>\",\"type\":\"Trinket\",\"level\":34,\"rarity\":\"Masterwork\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23837,\"icon\":\"https://render.guildwars2.com/file/04E4574ACA48BB6FCF757BDE0AADB207FE7FEB3E/66844.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":14},{\"attribute\":\"ConditionDamage\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23838() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Handwritten Note\",\"description\":\"<c=@flavor>\\\"The centaurs took everything from us, but people like you will help us take it back.\\\"<br>—Anonymous Refugee</c>\",\"type\":\"Trinket\",\"level\":33,\"rarity\":\"Masterwork\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23838,\"icon\":\"https://render.guildwars2.com/file/61BD98A8976CFF20A17F5FFB9C17215D0DABB697/66824.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":14},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23839() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Honorary Company Membership Badge\",\"description\":\"<c=@flavor>\\\"You're one of us now. Just don't let it go to your head.\\\" -Cap</c>\",\"type\":\"Trinket\",\"level\":35,\"rarity\":\"Masterwork\",\"vendor_value\":85,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23839,\"icon\":\"https://render.guildwars2.com/file/AB7619ACA2CEA6AC0FC25A6BEFE864E91C59E405/66823.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":15},{\"attribute\":\"Power\",\"modifier\":10}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23840() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smashed Centaur Catapult Gear\",\"description\":\"<c=@flavor>\\\"One less weapon for the centaur war machine.\\\"</c>\",\"type\":\"Trinket\",\"level\":36,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23840,\"icon\":\"https://render.guildwars2.com/file/FC637AA3031B585F5B025B12670C6CD5A5C1BA51/63130.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":15},{\"attribute\":\"ConditionDamage\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23841() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Confiscated Bandit Schematics\",\"description\":\"<c=@flavor>A series of crude diagrams which detail the construction and application of a cabbage bomb.</c>\",\"type\":\"Trinket\",\"level\":37,\"rarity\":\"Masterwork\",\"vendor_value\":88,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23841,\"icon\":\"https://render.guildwars2.com/file/0DD50C0496765C6395BE623D3E0FA97CD6190649/65711.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":16},{\"attribute\":\"Power\",\"modifier\":11}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23842() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient White Mantle Badge\",\"description\":\"<c=@flavor>The mark of the White Mantle is still visible on the badge's dented face.</c>\",\"type\":\"Trinket\",\"level\":38,\"rarity\":\"Masterwork\",\"vendor_value\":90,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23842,\"icon\":\"https://render.guildwars2.com/file/08A9626A09B2BFA8CC08C117BE1BFB113B452313/455970.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":16},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23843() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Seraph Trebuchet User's Manual\",\"description\":\"<c=@flavor>Point away from face.</c>\",\"type\":\"Trinket\",\"level\":39,\"rarity\":\"Masterwork\",\"vendor_value\":93,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23843,\"icon\":\"https://render.guildwars2.com/file/61220B407C9E62C41223DA0B48CE2F37090FADF9/455971.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":17},{\"attribute\":\"ConditionDamage\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23844() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Shiny Frying Pan\",\"description\":\"<c=@flavor>\\\"It's either never been used, or it's been licked clean.\\\"</c>\",\"type\":\"Trinket\",\"level\":40,\"rarity\":\"Masterwork\",\"vendor_value\":95,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23844,\"icon\":\"https://render.guildwars2.com/file/09D5CC42680FED30CE9A5AC2EB7EFCA93F522B06/66843.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":17},{\"attribute\":\"Vitality\",\"modifier\":12}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}