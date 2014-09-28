package de.getsetsociety.gw2readr.v2.item.items;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;

public class FailingItemsTest0112 {

    private static ObjectMapper mapper = new ObjectMapper();
    
    @Test
    public void testItem23641() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Signed Pact Agreement\",\"description\":\"<c=@flavor>\\\"We printed extra copies in case any disagreements came up in the field. This way we are all on the same page.\\\"<br>—Agent Crandle</c>\",\"type\":\"Trinket\",\"level\":71,\"rarity\":\"Fine\",\"vendor_value\":74,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23641,\"icon\":\"https://render.guildwars2.com/file/7D70420B60279BB1019EE840FD0B493CB41EF993/66820.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":35},{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":25}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23642() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Golem Cannon Blueprint\",\"description\":\"<c=@flavor>\\\"In case I don't make it, this will prove I was a genius!\\\"<br>—Explorer Trebb</c>\",\"type\":\"Trinket\",\"level\":72,\"rarity\":\"Fine\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23642,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":36},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23643() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trebuchet Counterweight\",\"description\":\"<c=@flavor>\\\"The greater the strike, the greater the counterblow.\\\"<br>—Crusader Vilborg</c>\",\"type\":\"Trinket\",\"level\":71,\"rarity\":\"Fine\",\"vendor_value\":74,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23643,\"icon\":\"https://render.guildwars2.com/file/DDFC7DCF675C04A73B069D0F78E92793656102A0/66819.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":35},{\"attribute\":\"Precision\",\"modifier\":25},{\"attribute\":\"Toughness\",\"modifier\":25}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23644() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Emerald Orrian Spoon\",\"description\":\"<c=@flavor>\\\"These are pretty. So pretty.\\\"<br>—Recruit Tochacatl</c>\",\"type\":\"Trinket\",\"level\":73,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23644,\"icon\":\"https://render.guildwars2.com/file/BD131BC9280FED2C9547067D98E7180213F2BAE6/434523.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Toughness\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23645() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Goldenlight Hallow Lab Test Results\",\"description\":\"<c=@flavor>\\\"Normally only krewe members get to see these, but seeing how you helped generate the more interesting data points you can have them.\\\"<br>—Krewe Leader Seesa</c>\",\"type\":\"Trinket\",\"level\":72,\"rarity\":\"Fine\",\"vendor_value\":75,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23645,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":36},{\"attribute\":\"Precision\",\"modifier\":26},{\"attribute\":\"Vitality\",\"modifier\":26}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23646() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mechanical Golem Eye\",\"description\":\"<c=@flavor>\\\"So many shiny things when they blow up on landing.\\\"<br>—Explorer Grretergrret</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23646,\"icon\":\"https://render.guildwars2.com/file/3F6CD0D1A067BA497C550CFBC5DB06F69C143FA1/455944.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Toughness\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23647() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kamekeck War Paint\",\"description\":\"<c=@flavor>\\\"Most powerful paint. Powerful magic for powerful battle.\\\"<br>—Marksman Kamekeck</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23647,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":37},{\"attribute\":\"Toughness\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23648() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order Of Whispers Tactical Operations Manual\",\"description\":\"<c=@flavor>\\\"Who ever planned this operation should have read this first—who destroys a perfectly good gate?\\\"<br>—Agent Siobhan</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23648,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23649() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Letter Home\",\"description\":\"<c=@flavor>\\\"I don't ever open these, but maybe one day they will find their way to the right people. It might be morbid, but I look at it as a sign of hope.\\\"<br>—Arcanist Repth</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Fine\",\"vendor_value\":77,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23649,\"icon\":\"https://render.guildwars2.com/file/F2E1C224261C70C4D95E3A4B94B662750CA5D360/65726.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":37},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23650() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Explorer's Medal\",\"description\":\"<c=@flavor>\\\"Pure fury, pure warrior wrath. Can you feel it?\\\"<br>—Tactician Deathstrider</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Fine\",\"vendor_value\":78,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23650,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":38},{\"attribute\":\"Toughness\",\"modifier\":27},{\"attribute\":\"Vitality\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23651() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Signed Pact Agreement\",\"description\":\"<c=@flavor>\\\"We printed extra copies in case any disagreements came up in the field. This way we are all on the same page.\\\"<br>—Agent Crandle</c>\",\"type\":\"Trinket\",\"level\":71,\"rarity\":\"Masterwork\",\"vendor_value\":148,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23651,\"icon\":\"https://render.guildwars2.com/file/7D70420B60279BB1019EE840FD0B493CB41EF993/66820.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23652() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Trebuchet Counterweight\",\"description\":\"<c=@flavor>\\\"The greater the strike, the greater the counterblow.\\\"<br>—Crusader Vilborg</c>\",\"type\":\"Trinket\",\"level\":71,\"rarity\":\"Masterwork\",\"vendor_value\":148,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23652,\"icon\":\"https://render.guildwars2.com/file/DDFC7DCF675C04A73B069D0F78E92793656102A0/66819.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":38},{\"attribute\":\"Precision\",\"modifier\":27},{\"attribute\":\"Toughness\",\"modifier\":27}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23653() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Golem Cannon Blueprint\",\"description\":\"<c=@flavor>\\\"In case I don't make it, this will prove I was a genius!\\\"<br>—Explorer Trebb</c>\",\"type\":\"Trinket\",\"level\":72,\"rarity\":\"Masterwork\",\"vendor_value\":150,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23653,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":39},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23654() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Goldenlight Hallow Lab Test Results\",\"description\":\"<c=@flavor>\\\"Normally only krewe members get to see these, but seeing how you helped generate the more interesting data points you can have them.\\\"<br>—Krewe Leader Seesa</c>\",\"type\":\"Trinket\",\"level\":72,\"rarity\":\"Masterwork\",\"vendor_value\":150,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23654,\"icon\":\"https://render.guildwars2.com/file/2BD5FC4332E7236F46282C5BEDCC0F2CE97A905E/65589.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":39},{\"attribute\":\"Precision\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23655() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Emerald Orrian Spoon\",\"description\":\"<c=@flavor>\\\"These are pretty. So pretty.\\\"<br>—Recruit Tochacatl</c>\",\"type\":\"Trinket\",\"level\":73,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23655,\"icon\":\"https://render.guildwars2.com/file/BD131BC9280FED2C9547067D98E7180213F2BAE6/434523.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":40},{\"attribute\":\"Toughness\",\"modifier\":28},{\"attribute\":\"Vitality\",\"modifier\":28}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23656() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Mechanical Golem Eye\",\"description\":\"<c=@flavor>\\\"So many shiny things when they many blow up on landing.\\\"<br>—Explorer Grretergrret</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23656,\"icon\":\"https://render.guildwars2.com/file/3F6CD0D1A067BA497C550CFBC5DB06F69C143FA1/455944.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23657() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Kamekeck War Paint\",\"description\":\"<c=@flavor>\\\"Most powerful paint. Powerful magic for powerful battle.\\\"<br>—Marksman Kamekeck</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23657,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":29},{\"attribute\":\"Vitality\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23658() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Order Of Whispers Tactical Operations Manual\",\"description\":\"<c=@flavor>\\\"Who ever planned this operation should have read this first—who destroys a perfectly good gate?\\\"<br>—Agent Siobhan</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23658,\"icon\":\"https://render.guildwars2.com/file/0A402568104F5BE5BC644665653302005F6266CF/66800.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23659() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Letter Home\",\"description\":\"<c=@flavor>\\\"I don't ever open these, but maybe one day they will find their way to the right people. It might be morbid but I look at it as a sign of hope.\\\"<br>—Pact Arcanist Repth</c>\",\"type\":\"Trinket\",\"level\":74,\"rarity\":\"Masterwork\",\"vendor_value\":153,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23659,\"icon\":\"https://render.guildwars2.com/file/F2E1C224261C70C4D95E3A4B94B662750CA5D360/65726.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":41},{\"attribute\":\"Precision\",\"modifier\":29},{\"attribute\":\"Toughness\",\"modifier\":29}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23660() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Priory Explorer's Medal\",\"description\":\"<c=@flavor>\\\"Pure fury, pure warrior wrath. Can you feel it?\\\"<br>—Tactician Deathstrider</c>\",\"type\":\"Trinket\",\"level\":75,\"rarity\":\"Masterwork\",\"vendor_value\":155,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23660,\"icon\":\"https://render.guildwars2.com/file/510AABA4DA240FFD6C0572975B04CDB56D5BD960/65902.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":41},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23661() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Lucky Rabbit's Foot\",\"description\":\"<c=@flavor>\\\"Poor rabbits. We will need more of this luck if we are to succeed.\\\"<br>—Lightbringer Ives</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23661,\"icon\":\"https://render.guildwars2.com/file/FA53FDE67AB9FE0D6632301269ECA119AD4809DF/66782.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Toughness\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23662() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Hardened Tar Elemental Core\",\"description\":\"<c=@flavor>\\\"We finally got it to harden! Now we just need to figure out...you know...what to do with it.\\\"<br>—Scholar Merla</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23662,\"icon\":\"https://render.guildwars2.com/file/CD641E313C19ACDDAE34CDC52B48181EC763089F/63110.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23663() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Pact Sextant\",\"description\":\"<c=@flavor>\\\"Together.\\\"<br>—Pact Motto</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23663,\"icon\":\"https://render.guildwars2.com/file/F3BEB3B77A2B25D3687675021B99EF3E0CCF6AE9/66837.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":42},{\"attribute\":\"Precision\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23664() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Ancient Orrian Spoon\",\"description\":\"<c=@flavor>\\\"Seems they had fancy spoons too. Well, that answers that question.\\\"<br>—Tactician Almonia</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23664,\"icon\":\"https://render.guildwars2.com/file/6B5A2D46DBDF9E100FD33909466FA3D46801EC31/434524.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

    @Test
    public void testItem23665() {
        try {
            ItemJson item = mapper.readValue("{\"name\":\"Smashed Golem Crystal\",\"description\":\"<c=@flavor>\\\"These still have a little residual arcane energy. We are going to need every little magical scrap and crumb to defeat Zhaitan.\\\"<br>—Scholar Blix</c>\",\"type\":\"Trinket\",\"level\":80,\"rarity\":\"Fine\",\"vendor_value\":83,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[\"HideSuffix\",\"NoSalvage\",\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":23665,\"icon\":\"https://render.guildwars2.com/file/BF37B370A2F404A9DBCF773CB7CF536C6A543901/220900.png\",\"details\":{\"type\":\"Accessory\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":42},{\"attribute\":\"Toughness\",\"modifier\":30},{\"attribute\":\"Vitality\",\"modifier\":30}]},\"secondary_suffix_item_id\":\"\"}}", ItemJson.class);
            assertNotNull(item);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}