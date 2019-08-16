package de.getsetsociety.gw2readr.v2.item.items;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.getsetsociety.gw2readr.v0.item.items.enums.ArmorType;
import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ContainerType;
import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.GatheringType;
import de.getsetsociety.gw2readr.v0.item.items.enums.GizmoType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ToolType;
import de.getsetsociety.gw2readr.v0.item.items.enums.TrinketType;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentFlag;
import de.getsetsociety.gw2readr.v0.item.items.enums.UpgradeComponentType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeightClass;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;
import de.getsetsociety.gw2readr.v2.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.entities.Buff;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IArmor;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBackItem;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBag;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IConsumable;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IContainer;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ICraftingMaterial;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGathering;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IGizmo;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IMiniPet;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITool;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrait;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrinket;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.ITrophy;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IUpgradeComponent;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v2.item.items.json.ArmorJson;
import de.getsetsociety.gw2readr.v2.item.items.json.BackItemJson;
import de.getsetsociety.gw2readr.v2.item.items.json.BagJson;
import de.getsetsociety.gw2readr.v2.item.items.json.ConsumableJson;
import de.getsetsociety.gw2readr.v2.item.items.json.ContainerJson;
import de.getsetsociety.gw2readr.v2.item.items.json.CraftingMaterialJson;
import de.getsetsociety.gw2readr.v2.item.items.json.GatheringJson;
import de.getsetsociety.gw2readr.v2.item.items.json.GizmoJson;
import de.getsetsociety.gw2readr.v2.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v2.item.items.json.MiniPetJson;
import de.getsetsociety.gw2readr.v2.item.items.json.ToolJson;
import de.getsetsociety.gw2readr.v2.item.items.json.TraitJson;
import de.getsetsociety.gw2readr.v2.item.items.json.TrinketJson;
import de.getsetsociety.gw2readr.v2.item.items.json.TrophyJson;
import de.getsetsociety.gw2readr.v2.item.items.json.UpgradeComponentJson;
import de.getsetsociety.gw2readr.v2.item.items.json.WeaponJson;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestItems {

	private static ObjectMapper mapper = new ObjectMapper();

	/**
	 * Tests readability of the demo Json-Reply found on the wiki
	 * Object is a Weapon (Lvl.44 Masterwork Longbow, worth 120 coins, power 385-452 with Power(62) and
	 * Precision(44) stats, no infusions, no restrictions, no secondary suffix)
	 */
	@Test
	public void testDemoJson() {
		String content = "{\"name\":\"Strong Soft Wood Longbow of Fire\",\"description\":\"\","
				+ "\"type\":\"Weapon\",\"level\":44,\"rarity\":\"Masterwork\",\"vendor_value\":120,"
				+ "\"default_skin\":\"3942\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\""
				+ "flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"id\":28445,"
				+ "\"icon\":\"https://render.guildwars2.com/file/C6110F52DF5AFE0F00A56F9E143E9732176DDDE9/65015.png\","
				+ "\"details\":{\"type\":\"LongBow\",\"damage_type\":\"Physical\",\"min_power\":385,"
				+ "\"max_power\":452,\"defense\":0,\"infusion_slots\":[],"
				+ "\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":62},"
				+ "{\"attribute\":\"Precision\",\"modifier\":44}]},\"suffix_item_id\":24547"
				+ ",\"secondary_suffix_item_id\":\"\"}}";
		IWeapon entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting WeaponJson, got " + item.getClass().getCanonicalName(), item instanceof WeaponJson);
			entity = ((WeaponJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			fail("Unexpected Exception");
		}
		assertEquals("Strong Soft Wood Longbow of Fire", entity.getName());
		assertEquals("", entity.getDescription());
		assertEquals(Integer.valueOf(44), entity.getLevel());
		assertEquals(Rarity.MASTERWORK, entity.getRarity());
		assertEquals(Integer.valueOf(120), entity.getVendorValue());
		assertEquals(Integer.valueOf(3942), entity.getDefaultSkin());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
		assertEquals(1, entity.getFlags().size());
		assertTrue("Item Should be 'SoulbindOnUse'", entity.getFlags().contains(ItemFlags.SoulBindOnUse));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(28445), entity.getId());
		assertEquals("https://render.guildwars2.com/file/C6110F52DF5AFE0F00A56F9E143E9732176DDDE9/65015.png", entity.getIcon());
        assertEquals(WeaponType.LONGBOW, entity.getWeaponType());
        assertEquals(DamageType.PHYSICAL, entity.getDamageType());
		assertEquals(Integer.valueOf(385), entity.getMinPower());
		assertEquals(Integer.valueOf(452), entity.getMaxPower());
		assertEquals(Integer.valueOf(0), entity.getDefense());
		assertTrue(entity.getInfusionSlots().isEmpty());
		assertEquals(2, entity.getInfixUpgrade().getAttributes().size());
		AttributeModifier attributeModifier1 = new AttributeModifier();
		attributeModifier1.setAttribute(Attribute.Precision);
		attributeModifier1.setModifier(44);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1));
		AttributeModifier attributeModifier2 = new AttributeModifier();
		attributeModifier2.setAttribute(Attribute.Power);
		attributeModifier2.setModifier(62);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier2));
		assertEquals(Integer.valueOf(24547), entity.getSuffixItemId());
		assertNull(entity.getSecondarySuffixItemId());
	}

	/**
	 * Tests the readability of Item 57
	 * The Object is a BackItem (Lvl.0 Basic Soullbound on Aquire and on use Back Item, worth 16 coins
	 * with Vitality(4) and Toughness(3) stats)
	 */
	@Test
	public void testReadingBackItem57() {
		String content = "{\"name\":\"Hearty Back Brace\",\"description\":\"This equipment goes under armor and "
				+ "can hold an additional upgrade.\",\"type\":\"Back\",\"level\":0,\"rarity\":\"Basic\","
				+ "\"vendor_value\":16,\"default_skin\":\"2329\","
				+ "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":57,"
				+ "\"icon\":\"https://render.guildwars2.com/file/6CF800ACB923E42F6CA40832C80694C7E0E9CB4D/61005.png\","
				+ "\"details\":{\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":"
				+ "[{\"attribute\":\"Vitality\",\"modifier\":4},"
				+ "{\"attribute\":\"Toughness\",\"modifier\":3}]},\"secondary_suffix_item_id\":\"\"}}";
		IBackItem entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting BackItemJson, got " + item.getClass().getCanonicalName(), item instanceof BackItemJson);
			entity = ((BackItemJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().size() + " unassigned values found", item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			fail("Unexpected Exception");
		}
		assertEquals("Hearty Back Brace", entity.getName());
		assertEquals("This equipment goes under armor and can hold an additional upgrade.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.BASIC, entity.getRarity());
		assertEquals(Integer.valueOf(16), entity.getVendorValue());
		assertEquals(Integer.valueOf(2329), entity.getDefaultSkin());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
		assertEquals(2, entity.getFlags().size());
		assertTrue("Item Should be 'SoulbindOnUse'", entity.getFlags().contains(ItemFlags.SoulBindOnUse));
		assertTrue("Item Should be 'SoulbindOnAquire'", entity.getFlags().contains(ItemFlags.SoulbindOnAcquire));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(57), entity.getId());
		assertNull(entity.getSecondarySuffixItemId());
		assertEquals("https://render.guildwars2.com/file/6CF800ACB923E42F6CA40832C80694C7E0E9CB4D/61005.png", entity.getIcon());
		assertTrue(entity.getInfusionSlots().isEmpty());
		assertEquals(2, entity.getInfixUpgrade().getAttributes().size());
		AttributeModifier attributeModifier1 = new AttributeModifier();
		attributeModifier1.setAttribute(Attribute.Vitality);
		attributeModifier1.setModifier(4);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1));
		AttributeModifier attributeModifier2 = new AttributeModifier();
		attributeModifier2.setAttribute(Attribute.Toughness);
		attributeModifier2.setModifier(3);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier2));
		assertNull(entity.getSuffixItemId());

	}

	/**
	 * Tests readability of Item 70
	 * The object is an Armor (Lvl.0 Basic Medium Coat with defense 25 worth 6 coins with Power(4) stats
	 * that's not upgradeable)
	 */
	@Test
	public void testReadingArmor70() {
		String content = "{\"name\":\"Mighty Studded Coat\",\"type\":\"Armor\",\"level\":0,\"rarity\":\"Basic\","
				+ "\"vendor_value\":6,\"default_skin\":\"17\",\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"NotUpgradeable\"],\"restrictions\":[],\"id\":70,\"icon\":\"https://render.guildwars2.com/"
				+ "file/5050F9A0AAA5324F0501B7944876F0FA29DCEB97/61008.png\",\"details\":{\"type\":\"Coat\","
				+ "\"weight_class\":\"Medium\",\"defense\":25,\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":"
				+ "[{\"attribute\":\"Power\",\"modifier\":4}]},\"secondary_suffix_item_id\":\"\"}}";
		IArmor entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ArmorJson, got " + item.getClass().getCanonicalName(), item instanceof ArmorJson);
			entity = ((ArmorJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().size() + " unassigned values found", item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			fail("Unexpected Exception");
		}
		assertEquals("Mighty Studded Coat", entity.getName());
		assertNull(entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.BASIC, entity.getRarity());
		assertEquals(Integer.valueOf(6), entity.getVendorValue());
		assertEquals(Integer.valueOf(17), entity.getDefaultSkin());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
		assertEquals(1, entity.getFlags().size());
		assertTrue("Item Should be 'NotUpgradeable'", entity.getFlags().contains(ItemFlags.NotUpgradeable));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(70), entity.getId());
		assertEquals("https://render.guildwars2.com/file/5050F9A0AAA5324F0501B7944876F0FA29DCEB97/61008.png", entity.getIcon());
		assertTrue(entity.getInfusionSlots().isEmpty());
		assertEquals(1, entity.getInfixUpgrade().getAttributes().size());
		AttributeModifier attributeModifier1 = new AttributeModifier();
		attributeModifier1.setAttribute(Attribute.Power);
		attributeModifier1.setModifier(4);
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(attributeModifier1));
		assertNull(entity.getSuffixItemId());
		assertEquals(ArmorType.Coat, entity.getArmorType());
		assertEquals(WeightClass.Medium, entity.getWeightClass());
		assertEquals(Integer.valueOf(25), entity.getDefense());
		assertNull(entity.getSecondarySuffixItemId());
	}

	/**
	 * Tests the readability of Item 2
	 * The object is a Consumable (Lvl. 0 Basic Assassin Pill that can't be sold, is soul bound on aquire and on use
	 * and of type Food
	 */
	@Test
	public void testConsumable2() {
		String content = "{\"name\":\"Assassin Pill\",\"description\":\"Take this pill to participate in the next round of Assassin\","
				+ "\"type\":\"Consumable\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":0,"
				+ "\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],"
				+ "\"id\":2,"
				+ "\"icon\":\"https://render.guildwars2.com/file/ED903431B97968C79AEC7FB21535FC015DBB0BBA/60981.png\","
				+ "\"details\":{\"type\":\"Food\"}}";
		IConsumable entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ConsumableJson, got " + item.getClass().getCanonicalName(), item instanceof ConsumableJson);
			entity = ((ConsumableJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			fail("Unexpected Exception");
		}
		assertEquals("Assassin Pill", entity.getName());
		assertEquals("Take this pill to participate in the next round of Assassin", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.BASIC, entity.getRarity());
		assertEquals(Integer.valueOf(0), entity.getVendorValue());
		assertEquals(Integer.valueOf(2), entity.getId());
		assertFalse("Item should not be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
		assertEquals(3, entity.getFlags().size());
		assertTrue("Item Should be 'NoSell'", entity.getFlags().contains(ItemFlags.NoSell));
		assertTrue("Item Should be 'SoulbindOnAcquire'", entity.getFlags().contains(ItemFlags.SoulbindOnAcquire));
		assertTrue("Item Should be 'SoulBindOnUse'", entity.getFlags().contains(ItemFlags.SoulBindOnUse));

		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(2), entity.getId());
		assertEquals("https://render.guildwars2.com/file/ED903431B97968C79AEC7FB21535FC015DBB0BBA/60981.png", entity.getIcon());
		assertEquals(ConsumableType.Food, entity.getConsumableType());
	}

	@Test
	public void testUpgradeComponent24654() {
		String content = "{\"name\":\"Superior Sigil of Destroyer Slaying\",\"description\":"
				+ "\"Double-click to apply to a weapon.\",\"type\":\"UpgradeComponent\",\"level\":60,\"rarity\":\"Exotic\","
				+ "\"vendor_value\":216,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],"
				+ "\"restrictions\":[],\"id\":24654,"
				+ "\"icon\":\"https://render.guildwars2.com/file/656ABB62BBEC39BC24D002FBE19EFCE953ABEDCD/221036.png\","
				+ "\"details\":{\"type\":\"Sigil\",\"flags\":[\"Axe\",\"LongBow\",\"ShortBow\",\"Dagger\",\"Focus\","
				+ "\"Greatsword\",\"Hammer\",\"Harpoon\",\"Mace\",\"Pistol\",\"Rifle\",\"Scepter\",\"Shield\",\"Speargun\","
				+ "\"Staff\",\"Sword\",\"Torch\",\"Trident\",\"Warhorn\"],\"infusion_upgrade_flags\":[],"
				+ "\"infix_upgrade\":{\"buff\":{\"skill_id\":9343,\"description\":\"+10% Damage vs. Destroyers\"},"
				+ "\"attributes\":[]},\"suffix\":\"of Destroyer Slaying\"}}";
		IUpgradeComponent entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ConsumableJson, got " + item.getClass().getCanonicalName(), item instanceof UpgradeComponentJson);
			entity = ((UpgradeComponentJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Superior Sigil of Destroyer Slaying", entity.getName());
		assertEquals("Double-click to apply to a weapon.", entity.getDescription());
		assertEquals(Integer.valueOf(60), entity.getLevel());
		assertEquals(Rarity.EXOTIC, entity.getRarity());
		assertEquals(Integer.valueOf(216), entity.getVendorValue());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals(Integer.valueOf(24654), entity.getId());
		assertEquals("https://render.guildwars2.com/file/656ABB62BBEC39BC24D002FBE19EFCE953ABEDCD/221036.png", entity.getIcon());
		assertEquals(UpgradeComponentType.Sigil, entity.getUpgradeComponentType());
        List<UpgradeComponentFlag> upgradeComponentFlags = Arrays.asList(UpgradeComponentFlag.Axe, UpgradeComponentFlag.LongBow, UpgradeComponentFlag.ShortBow,
                UpgradeComponentFlag.Dagger, UpgradeComponentFlag.Focus, UpgradeComponentFlag.Greatsword,
                UpgradeComponentFlag.Hammer, UpgradeComponentFlag.Harpoon, UpgradeComponentFlag.Mace,
                UpgradeComponentFlag.Pistol, UpgradeComponentFlag.Rifle, UpgradeComponentFlag.Scepter,
                UpgradeComponentFlag.Shield, UpgradeComponentFlag.Speargun, UpgradeComponentFlag.Staff,
                UpgradeComponentFlag.Sword, UpgradeComponentFlag.Torch, UpgradeComponentFlag.Trident,
                UpgradeComponentFlag.Warhorn);
		assertEquals(upgradeComponentFlags.size(), entity.getUpgradeComponentFlags().size());
		assertTrue("Item should contain all these Upgrade flags.", entity.getUpgradeComponentFlags()
				.containsAll(upgradeComponentFlags));
		assertTrue(entity.getInfusionUpgradeFlags().isEmpty());
		assertNotNull(entity.getInfixUpgrade());
		IBaseBuff buff = entity.getInfixUpgrade().getBuff();
		assertNotNull(buff);
		assertTrue(buff instanceof Buff);
		assertEquals(Integer.valueOf(9343), buff.getSkillId());
		assertEquals("+10% Damage vs. Destroyers", buff.getDescription());
		assertTrue("Item shouldn't have attributes.", entity.getInfixUpgrade().getAttributes().isEmpty());
		assertTrue("Item shouldn't have Flags.", entity.getFlags().isEmpty());
		assertEquals("of Destroyer Slaying", entity.getSuffix());
	}

	@Test
	public void testTrophy8123() {
		String content = "{\"name\":\"Race Track Voucher\",\"description\":"
				+ "\"Redeem this for your winnings by talking to Tigg.\",\"type\":\"Trophy\",\"level\":0,"
				+ "\"rarity\":\"Exotic\",\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"NotUpgradeable\",\"AccountBindOnUse\"],"
				+ "\"restrictions\":[],\"id\":8123,"
				+ "\"icon\":\"https://render.guildwars2.com/file/0FF3F1E574DCDEFA2CC60E04B22BF5291273EDC3/62856.png\"}";
		ITrophy entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting TrophyJson, got " + item.getClass().getCanonicalName(), item instanceof TrophyJson);
			entity = ((TrophyJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Race Track Voucher", entity.getName());
		assertEquals("Redeem this for your winnings by talking to Tigg.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.EXOTIC, entity.getRarity());
		assertEquals(Integer.valueOf(50), entity.getVendorValue());
		assertEquals(Integer.valueOf(8123), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.AccountBound, ItemFlags.NoSalvage,
                ItemFlags.NoSell, ItemFlags.NotUpgradeable, ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/0FF3F1E574DCDEFA2CC60E04B22BF5291273EDC3/62856.png", entity.getIcon());
	}

	@Test
	public void testContainer8468() {
		String content = "{\"name\":\"Zephyrite Rescue Pack\",\"description\":"
				+ "\"Double-click to receive the following items: 1 Speed Booster, 1 Zephyrite Color Swatch: Red, "
				+ "15 Black Lion Keys, 1 Aviator Cap Skin, 250 Piles of Sand.\",\"type\":\"Container\",\"level\":0,"
				+ "\"rarity\":\"Rare\",\"vendor_value\":129,\"game_types\":[\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoMysticForge\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],"
				+ "\"restrictions\":[],\"id\":8468,"
				+ "\"icon\":\"https://render.guildwars2.com/file/B80BE438007179E12B18B5EBDFCB1C61E2605DD6/824921.png\","
				+ "\"details\":{\"type\":\"Default\"}}";
		IContainer entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ContainerJson, got " + item.getClass().getCanonicalName(), item instanceof ContainerJson);
			entity = ((ContainerJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Zephyrite Rescue Pack", entity.getName());
		assertEquals("Double-click to receive the following items: 1 Speed Booster, 1 Zephyrite Color Swatch: Red, 15 Black Lion Keys, 1 Aviator Cap Skin, 250 Piles of Sand.",
				entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.RARE, entity.getRarity());
		assertEquals(Integer.valueOf(129), entity.getVendorValue());
		assertEquals(Integer.valueOf(8468), entity.getId());
		assertFalse("Item should not be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.AccountBound, ItemFlags.NoMysticForge,
                ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/B80BE438007179E12B18B5EBDFCB1C61E2605DD6/824921.png", entity.getIcon());
		assertEquals(ContainerType.Default, entity.getContainerType());
	}

	@Test
	public void testBag8932() {
		String content = "{\"name\":\"Starter Backpack\",\"description\":\"A 20 slot bag for beginning characters.\","
				+ "\"type\":\"Bag\",\"level\":0,\"rarity\":\"Basic\",\"vendor_value\":11,"
				+ "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"NoSell\",\"SoulbindOnAcquire\",\"SoulBindOnUse\"],\"restrictions\":[],\"id\":8932,"
				+ "\"icon\":\"https://render.guildwars2.com/file/80E36806385691D4C0910817EF2A6C2006AEE353/61755.png\","
				+ "\"details\":{\"no_sell_or_sort\":false,\"size\":20}}";
		IBag entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting BagJson, got " + item.getClass().getCanonicalName(), item instanceof BagJson);
			entity = ((BagJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Starter Backpack", entity.getName());
		assertEquals("A 20 slot bag for beginning characters.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.BASIC, entity.getRarity());
		assertEquals(Integer.valueOf(11), entity.getVendorValue());
		assertEquals(Integer.valueOf(8932), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NoSell, ItemFlags.SoulbindOnAcquire,
                ItemFlags.SoulBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/80E36806385691D4C0910817EF2A6C2006AEE353/61755.png", entity.getIcon());
		assertFalse(entity.isNoSellOrSort());
		assertEquals(Integer.valueOf(20), entity.getSize());
	}

	@Test
	public void testCraftingMaterial12128() {
		String content = "{\"name\":\"Omnomberry\",\"description\":\"Ingredient\",\"type\":\"CraftingMaterial\","
				+ "\"level\":80,\"rarity\":\"Basic\",\"vendor_value\":9,"
				+ "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],\"flags\":[],\"restrictions\":[],"
				+ "\"id\":12128,"
				+ "\"icon\":\"https://render.guildwars2.com/file/9C5457B024D9152906D808A53BFF67539BB94FA0/219396.png\"}";
		ICraftingMaterial entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting CraftingMaterialJson, got " + item.getClass().getCanonicalName(), item instanceof CraftingMaterialJson);
			entity = ((CraftingMaterialJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Omnomberry", entity.getName());
		assertEquals("Ingredient", entity.getDescription());
		assertEquals(Integer.valueOf(80), entity.getLevel());
		assertEquals(Rarity.BASIC, entity.getRarity());
		assertEquals(Integer.valueOf(9), entity.getVendorValue());
		assertEquals(Integer.valueOf(12128), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
		assertTrue(entity.getFlags().isEmpty());
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/9C5457B024D9152906D808A53BFF67539BB94FA0/219396.png", entity.getIcon());
	}

	@Test
	public void testTrinket13267() {
		String content = "{\"name\":\"Turquoise Copper Amulet\",\"description\":\"\",\"type\":\"Trinket\",\"level\":20,"
				+ "\"rarity\":\"Fine\",\"vendor_value\":48,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"HideSuffix\"],\"restrictions\":[],\"id\":13267,"
				+ "\"icon\":\"https://render.guildwars2.com/file/BA77541A56E7F639CCC5A379F4662EA2C55420BE/340120.png\","
				+ "\"details\":{\"type\":\"Amulet\",\"infusion_slots\":[],\"infix_upgrade\":"
				+ "{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":12}]},\"suffix_item_id\":24465,"
				+ "\"secondary_suffix_item_id\":\"\"}}";
		ITrinket entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting TrinketJson, got " + item.getClass().getCanonicalName(), item instanceof TrinketJson);
			entity = ((TrinketJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Turquoise Copper Amulet", entity.getName());
		assertEquals("", entity.getDescription());
		assertEquals(Integer.valueOf(20), entity.getLevel());
		assertEquals(Rarity.FINE, entity.getRarity());
		assertEquals(Integer.valueOf(48), entity.getVendorValue());
		assertEquals(Integer.valueOf(13267), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.HideSuffix);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/BA77541A56E7F639CCC5A379F4662EA2C55420BE/340120.png", entity.getIcon());
		assertEquals(TrinketType.Amulet, entity.getTrinketType());
		assertTrue(entity.getInfusionSlots().isEmpty());
		AttributeModifier am = new AttributeModifier();
		am.setAttribute(Attribute.Vitality);
		am.setModifier(12);
		assertNotNull(entity.getInfixUpgrade());
		assertNotNull(entity.getInfixUpgrade().getAttributes());
		assertEquals(1, entity.getInfixUpgrade().getAttributes().size());
		assertTrue(entity.getInfixUpgrade().getAttributes().contains(am));
		assertEquals(Integer.valueOf(24465), entity.getSuffixItemId());
		assertNull(entity.getSecondarySuffixItemId());
	}

	@Test
	public void testTrophy19976() {
		String content = "{\"name\":\"Mystic Coin\","
				+ "\"description\":\"Coins are used to create high level weapons at the mystic forge in Lion's Arch. \\n"
				+ "Part of Zommoros' favorite trades.\",\"type\":\"Trophy\",\"level\":0,\"rarity\":\"Rare\","
				+ "\"vendor_value\":50,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"NoSalvage\",\"NoSell\"],\"restrictions\":[],\"id\":19976,"
				+ "\"icon\":\"https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png\"}";
		ITrophy entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting TrophyJson, got " + item.getClass().getCanonicalName(), item instanceof TrophyJson);
			entity = ((TrophyJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Mystic Coin", entity.getName());
		assertEquals("Coins are used to create high level weapons at the mystic forge in Lion's Arch. \nPart of Zommoros' favorite trades.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.RARE, entity.getRarity());
		assertEquals(Integer.valueOf(50), entity.getVendorValue());
		assertEquals(Integer.valueOf(19976), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NoSalvage, ItemFlags.NoSell);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/AB0317DF5B0E1BA47436A5420248660765154C08/62864.png", entity.getIcon());
	}

	@Test
	public void testGizmo19980() {
		String content = "{\"name\":\"Black Lion Chest Key\","
				+ "\"description\":\"This key will unlock one Black Lion Chest containing random Gem Store merchandise, "
				+ "including some rare items not sold separately.\\n\\n Black Lion Chests can be found randomly on enemies "
				+ "or bought from the trading post.\",\"type\":\"Gizmo\",\"level\":0,\"rarity\":\"Fine\","
				+ "\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],"
				+ "\"restrictions\":[],\"id\":19980,"
				+ "\"icon\":\"https://render.guildwars2.com/file/207BDD31BC494A07A0A1691705079100066D3F2F/414998.png\","
				+ "\"details\":{\"type\":\"ContainerKey\"}}";
		IGizmo entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting GizmoJson, got " + item.getClass().getCanonicalName(), item instanceof GizmoJson);
			entity = ((GizmoJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Black Lion Chest Key", entity.getName());
		assertEquals("This key will unlock one Black Lion Chest containing random Gem Store merchandise, including some rare items not sold separately.\n\n Black Lion Chests can be found randomly on enemies or bought from the trading post.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.FINE, entity.getRarity());
		assertEquals(Integer.valueOf(0), entity.getVendorValue());
		assertEquals(Integer.valueOf(19980), entity.getId());
		assertFalse("Item should not be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertTrue("Item should be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.AccountBound, ItemFlags.NoSalvage, ItemFlags.NoSell,
                ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/207BDD31BC494A07A0A1691705079100066D3F2F/414998.png", entity.getIcon());
		assertEquals(GizmoType.ContainerKey, entity.getGizmoType());
	}

	@Test
	public void testTool19986() {
		String content = "{\"name\":\"Black Lion Salvage Kit\","
				+ "\"description\":\"Double-click then select an item in your inventory to salvage for crafting materials. "
				+ "100% chance of recovering upgrades. 50% chance to get rarer materials.\",\"type\":\"Tool\","
				+ "\"level\":0,\"rarity\":\"Exotic\",\"vendor_value\":0,"
				+ "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],"
				+ "\"restrictions\":[],\"id\":19986,"
				+ "\"icon\":\"https://render.guildwars2.com/file/2204EE5D7B1F7BEE9261CBAE3BF1DB5B027EE607/66551.png\","
				+ "\"details\":{\"type\":\"Salvage\",\"charges\":25}}";
		ITool entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ToolJson, got " + item.getClass().getCanonicalName(), item instanceof ToolJson);
			entity = ((ToolJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Black Lion Salvage Kit", entity.getName());
		assertEquals("Double-click then select an item in your inventory to salvage for crafting materials. 100% chance of recovering upgrades. 50% chance to get rarer materials.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.EXOTIC, entity.getRarity());
		assertEquals(Integer.valueOf(0), entity.getVendorValue());
		assertEquals(Integer.valueOf(19986), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertTrue("Item should be available in PvP", entity.getAvailableInPvP());
		assertTrue("Item should be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.AccountBound, ItemFlags.NoSalvage, ItemFlags.NoSell,
                ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/2204EE5D7B1F7BEE9261CBAE3BF1DB5B027EE607/66551.png", entity.getIcon());
		assertEquals(ToolType.Salvage, entity.getToolType());
		assertEquals(Integer.valueOf(25), entity.getCharges());
	}

	@Test
	public void testMiniPet20117() {
		String content = "{\"name\":\"Mini Bandit Bruiser\","
				+ "\"description\":\"Double-click to summon this miniature to follow you around. "
				+ "Only one miniature may be in use at a time.\",\"type\":\"MiniPet\",\"level\":0,\"rarity\":\"Masterwork\","
				+ "\"vendor_value\":100,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],"
				+ "\"flags\":[\"NoSell\"],\"restrictions\":[],\"id\":20117,"
				+ "\"icon\":\"https://render.guildwars2.com/file/D3F3C5BA926B0990FC30C0AAD37A3D57190B0B08/66056.png\"}";
		IMiniPet entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting MiniPetJson, got " + item.getClass().getCanonicalName(), item instanceof MiniPetJson);
			entity = ((MiniPetJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Mini Bandit Bruiser", entity.getName());
		assertEquals("Double-click to summon this miniature to follow you around. Only one miniature may be in use at a time.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.MASTERWORK, entity.getRarity());
		assertEquals(Integer.valueOf(100), entity.getVendorValue());
		assertEquals(Integer.valueOf(20117), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertTrue("Item should be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NoSell);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/D3F3C5BA926B0990FC30C0AAD37A3D57190B0B08/66056.png", entity.getIcon());
	}

	@Test
	public void testContainer20313() {
		String content = "{\"name\":\"Black Lion Chest (Unlocked)\","
				+ "\"description\":\"Contains a random booster plus two more random items from the Black Lion Trading "
				+ "Company warehouse.\\nThese may include weapon tickets redeemable for unique skins and other rare items "
				+ "not available anywhere else.\",\"type\":\"Container\",\"level\":0,\"rarity\":\"Fine\","
				+ "\"vendor_value\":0,\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"PvpLobby\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],"
				+ "\"restrictions\":[],\"id\":20313,"
				+ "\"icon\":\"https://render.guildwars2.com/file/48E4CEEAEEF8F3419A63D4F6295AB77136B86656/711974.png\","
				+ "\"details\":{\"type\":\"OpenUI\"}}";
		IContainer entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ContainerJson, got " + item.getClass().getCanonicalName(), item instanceof ContainerJson);
			entity = ((ContainerJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Black Lion Chest (Unlocked)", entity.getName());
		assertEquals("Contains a random booster plus two more random items from the Black Lion Trading Company warehouse.\nThese may include weapon tickets redeemable for unique skins and other rare items not available anywhere else.",
				entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.FINE, entity.getRarity());
		assertEquals(Integer.valueOf(0), entity.getVendorValue());
		assertEquals(Integer.valueOf(20313), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertTrue("Item should be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.AccountBound, ItemFlags.NoSell,
                ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/48E4CEEAEEF8F3419A63D4F6295AB77136B86656/711974.png", entity.getIcon());
		assertEquals(ContainerType.OpenUI, entity.getContainerType());
	}

	@Test
	public void testGathering20324() {
		String content = "{\"name\":\"Black Lion Harvesting Sickle\","
				+ "\"description\":\"Extremely efficient at gathering resources and uncovering rare components.\","
				+ "\"type\":\"Gathering\",\"level\":0,\"rarity\":\"Rare\",\"vendor_value\":0,\"default_skin\":2385,"
				+ "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[],\"id\":20324,"
				+ "\"icon\":\"https://render.guildwars2.com/file/BD0DC17564A9BC9B2354EAB2122F086DBF699D15/526356.png\","
				+ "\"details\":{\"type\":\"Foraging\"}}";
		IGathering entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting GatheringJson, got " + item.getClass().getCanonicalName(), item instanceof GatheringJson);
			entity = ((GatheringJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Black Lion Harvesting Sickle", entity.getName());
		assertEquals("Extremely efficient at gathering resources and uncovering rare components.", entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.RARE, entity.getRarity());
		assertEquals(Integer.valueOf(2385), entity.getDefaultSkin());
		assertEquals(Integer.valueOf(0), entity.getVendorValue());
		assertEquals(Integer.valueOf(20324), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.AccountBound, ItemFlags.NoSell,
                ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
		assertTrue(entity.getRestrictions().isEmpty());
		assertEquals("https://render.guildwars2.com/file/BD0DC17564A9BC9B2354EAB2122F086DBF699D15/526356.png", entity.getIcon());
		assertEquals(GatheringType.Foraging, entity.getGatheringType());
	}

	@Test
	public void testContainer54813() {
		String content = "{\"name\":\"Francisca\","
				+ "\"description\":\"A mysteriously light and well-balanced weapon that seems malleable to your "
				+ "wishes. Double-click to choose what form it should take.\",\"type\":\"Container\","
				+ "\"level\":0,\"rarity\":\"Masterwork\",\"vendor_value\":0,"
				+ "\"game_types\":[\"Activity\",\"Dungeon\",\"Pve\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoSell\",\"AccountBindOnUse\"],"
				+ "\"restrictions\":[\"Ranger\"],\"id\":54813,"
				+ "\"icon\":\"https://render.guildwars2.com/file/1B9503F466E464B34620340FEC65CFE7BBC69231/534278.png\","
				+ "\"details\":{\"type\":\"Default\"}}";
		IContainer entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting ContainerJson, got " + item.getClass().getCanonicalName(), item instanceof ContainerJson);
			entity = ((ContainerJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Francisca", entity.getName());
		assertEquals("A mysteriously light and well-balanced weapon that seems malleable to your wishes. Double-click to choose what form it should take.",
				entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.MASTERWORK, entity.getRarity());
		assertEquals(Integer.valueOf(0), entity.getVendorValue());
		assertEquals(Integer.valueOf(54813), entity.getId());
		assertTrue("Item should be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertFalse("Item should not be available in PvP", entity.getAvailableInPvP());
		assertFalse("Item should not be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.AccountBound, ItemFlags.NoSell, ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
        List<RestrictionType> restrictions = Arrays.asList(RestrictionType.Ranger);
		assertEquals(restrictions.size(), entity.getRestrictions().size());
		assertTrue(restrictions.containsAll(entity.getRestrictions()));
		assertEquals("https://render.guildwars2.com/file/1B9503F466E464B34620340FEC65CFE7BBC69231/534278.png", entity.getIcon());
		assertEquals(ContainerType.Default, entity.getContainerType());
	}

	@Test
	public void testTrait65841() {
		String content = "{\"name\":\"Trait Guide [Prismatic Understanding]\",\"type\":\"Trait\",\"level\":0,"
				+ "\"rarity\":\"Rare\",\"vendor_value\":0,\"game_types\":[\"Dungeon\",\"Pve\",\"Pvp\",\"PvpLobby\",\"Wvw\"],"
				+ "\"flags\":[\"AccountBound\",\"NoSalvage\",\"NoSell\",\"AccountBindOnUse\"],\"restrictions\":[\"Mesmer\"],"
				+ "\"id\":65841,"
				+ "\"icon\":\"https://render.guildwars2.com/file/2DFB4EDF0408A8604100BB6A510D215CE637B03C/780409.png\"}";
		ITrait entity = null;
		try {
			ItemJson<?> item = mapper.readValue(content, ItemJson.class);
			assertNotNull(item);
			assertTrue("Expecting TraitJson, got " + item.getClass().getCanonicalName(), item instanceof TraitJson);
			entity = ((TraitJson) item).getEntity();
			assertNotNull(entity);
			assertTrue(item.getAdditionalProperties().isEmpty());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertEquals("Trait Guide [Prismatic Understanding]", entity.getName());
		assertNull(entity.getDescription());
		assertEquals(Integer.valueOf(0), entity.getLevel());
		assertEquals(Rarity.RARE, entity.getRarity());
		assertEquals(Integer.valueOf(0), entity.getVendorValue());
		assertEquals(Integer.valueOf(65841), entity.getId());
		assertFalse("Item should not be available in Activity", entity.getAvailableInActivity());
		assertTrue("Item should be available in Dungeon", entity.getAvailableInDungeon());
		assertTrue("Item should be available in PVE", entity.getAvailableInPvE());
		assertTrue("Item should be available in WvW", entity.getAvailableInWvW());
		assertTrue("Item should be available in PvP", entity.getAvailableInPvP());
		assertTrue("Item should be available in PvP Lobby", entity.getAvailableInPvPLobby());
        List<ItemFlags> flags = Arrays.asList(ItemFlags.NoSell, ItemFlags.AccountBound, ItemFlags.NoSalvage,
                ItemFlags.AccountBindOnUse);
		assertEquals(flags.size(), entity.getFlags().size());
		assertTrue(flags.containsAll(entity.getFlags()));
        List<RestrictionType> restrictions = Arrays.asList(RestrictionType.Mesmer);
		assertEquals(restrictions.size(), entity.getRestrictions().size());
		assertTrue(restrictions.containsAll(entity.getRestrictions()));
		assertEquals("https://render.guildwars2.com/file/2DFB4EDF0408A8604100BB6A510D215CE637B03C/780409.png", entity.getIcon());
	}


}
