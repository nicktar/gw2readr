package de.getsetsociety.gw2readr.v1.item.items;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v1.item.items.json.BackItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.json.CraftingMaterialJson;
import de.getsetsociety.gw2readr.v1.item.items.json.WeaponJson;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v1.item.items.json.ConsumableJson;


public class CraftingMaterialTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testCraftingMaterial012546() {
        String content = "{\"item_id\":\"12546\",\"name\":\"Lemongrass\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\",\"level\":\"80\",\"rarity\":\"Basic\",\"vendor_value\":\"9\",\"icon_file_id\":\"219490\",\"icon_file_signature\":\"DF5612F93A11DB5F53FECA523F50D15DBF5A9AA5\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[]}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof CraftingMaterialJson);
            ICraftingMaterial item = (ICraftingMaterial) itemJson.getEntity();
            assertEquals(Integer.valueOf(12546),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("Ingredient", item.getDescription());
            assertEquals("Lemongrass", item.getName());
            assertEquals(Integer.valueOf(80),  item.getLevel());
            assertEquals(Integer.valueOf(9),  item.getVendorValue());
            assertEquals(Rarity.Basic, item.getRarity());
            assertTrue(item.getFlags().isEmpty());
            assertTrue(item.getRestrictions().isEmpty());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}
