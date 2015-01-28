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
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v1.item.items.json.BagJson;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.v1.item.items.json.ContainerJson;
import de.getsetsociety.gw2readr.v0.item.items.enums.ContainerType;


public class BackItemsTest {

    private ObjectMapper mapper = ObjectMapperProvider.getMapper();

    @Test
    public void testBackItem062904() {
        String content = "{\"item_id\":\"62904\",\"name\":\"Sturdy Huntsman's Backpack\",\"description\":\"This equipment can hold an additional upgrade. Unequip this backpack to use it as a crafting ingredient. Using this as a crafting ingredient will destroy any upgrades held within.\",\"type\":\"Back\",\"level\":\"15\",\"rarity\":\"Masterwork\",\"vendor_value\":\"52\",\"icon_file_id\":\"866602\",\"icon_file_signature\":\"AE1F972FF09104A04E96AA7B354823EA79BDCC29\",\"default_skin\":\"2310\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoSalvage\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"back\":{\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
        try {
            ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
            assertNotNull(itemJson);
            assertTrue(itemJson instanceof BackItemJson);
            IBackItem item = (IBackItem) itemJson.getEntity();
            assertEquals(Integer.valueOf(62904),  item.getId());
            assertTrue(item.getAvailableInActivity());
            assertTrue(item.getAvailableInDungeon());
            assertTrue(item.getAvailableInPvE());
            assertFalse(item.getAvailableInPvP());
            assertFalse(item.getAvailableInPvPLobby());
            assertTrue(item.getAvailableInWvW());
            assertEquals("This equipment can hold an additional upgrade. Unequip this backpack to use it as a crafting ingredient. Using this as a crafting ingredient will destroy any upgrades held within.", item.getDescription());
            assertEquals("Sturdy Huntsman's Backpack", item.getName());
            assertEquals(Integer.valueOf(15),  item.getLevel());
            assertEquals(Integer.valueOf(52),  item.getVendorValue());
            assertEquals(Rarity.Masterwork, item.getRarity());
            assertEquals(4,  item.getFlags().size());
            assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.AccountBound})));
            assertTrue(item.getRestrictions().isEmpty());
        } catch (Exception e) {
           e.printStackTrace();
            fail("Unexpected Exception");
        }
    }

}
