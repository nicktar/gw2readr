package de.getsetsociety.gw2readr.v1.item.items;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ObjectMapperProvider;
import de.getsetsociety.gw2readr.v0.item.items.enums.Attribute;
import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.Rarity;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v1.item.items.entities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.items.json.WeaponJson;


public class WeaponTest {

	private ObjectMapper mapper = ObjectMapperProvider.getMapper();

	@Test
	public void testWeaponPhysicalDamageAccountBindOnUseNoSellHideSuffixNoMysticForgeAccountBoundInfixUpgradeNoSlotNoRestrictionHammer052998() {
		String content = "{\"item_id\":\"52998\",\"name\":\"Deserter's Pulse Hammer\",\"type\":\"Weapon\",\"level\":\"34\",\"rarity\":\"Masterwork\",\"vendor_value\":\"105\",\"icon_file_id\":\"60991\",\"icon_file_signature\":\"C5B365D6105F76470106A61F4AB96F3E39D10E18\",\"default_skin\":\"5222\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Hammer\",\"damage_type\":\"Physical\",\"min_power\":\"356\",\"max_power\":\"402\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"50\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"36\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(52998),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Deserter's Pulse Hammer", item.getName());
			assertEquals(Integer.valueOf(34),  item.getLevel());
			assertEquals(Integer.valueOf(105),  item.getVendorValue());
			assertEquals(Rarity.Masterwork, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.HideSuffix, ItemFlags.NoMysticForge, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Hammer,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(356),  item.getMinPower());
			assertEquals(Integer.valueOf(402),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 50), new AttributeModifier(Attribute.Toughness, 36)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponSoulBindOnUseLongBow038875() {
		String content = "{\"item_id\":\"38875\",\"name\":\"Tribal Bow\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"396\",\"icon_file_id\":\"67297\",\"icon_file_signature\":\"A51ADB360705467301EC46B62D39BECFDEDE4810\",\"default_skin\":\"5195\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"LongBow\",\"damage_type\":\"Physical\",\"min_power\":\"920\",\"max_power\":\"1080\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(38875),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Tribal Bow", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(396),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(2,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.LongBow,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(920),  item.getMinPower());
			assertEquals(Integer.valueOf(1080),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponPistol026706() {
		String content = "{\"item_id\":\"26706\",\"name\":\"Dragonshot\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"264\",\"icon_file_id\":\"67327\",\"icon_file_signature\":\"01FE541CE063E197C43D4B233408E1B66C46BD4D\",\"default_skin\":\"5177\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Pistol\",\"damage_type\":\"Physical\",\"min_power\":\"876\",\"max_power\":\"1029\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"90\"},\n{\"attribute\":\"Precision\",\"modifier\":\"64\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"64\"}]},\"suffix_item_id\":\"24630\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(26706),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Dragonshot", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(264),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(2,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Pistol,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(876),  item.getMinPower());
			assertEquals(Integer.valueOf(1029),  item.getMaxPower());
			assertEquals(3, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 90), new AttributeModifier(Attribute.Precision, 64), new AttributeModifier(Attribute.Toughness, 64)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(24630),  item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponWarhorn026920() {
		String content = "{\"item_id\":\"26920\",\"name\":\"Honed Soft Wood Warhorn\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"32\",\"rarity\":\"Fine\",\"vendor_value\":\"32\",\"icon_file_id\":\"65530\",\"icon_file_signature\":\"5A0593B5164DE87591029323F7D90775D716001D\",\"default_skin\":\"3907\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Warhorn\",\"damage_type\":\"Physical\",\"min_power\":\"243\",\"max_power\":\"269\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"19\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"14\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(26920),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Honed Soft Wood Warhorn", item.getName());
			assertEquals(Integer.valueOf(32),  item.getLevel());
			assertEquals(Integer.valueOf(32),  item.getVendorValue());
			assertEquals(Rarity.Fine, item.getRarity());
			assertTrue(item.getFlags().isEmpty());
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Warhorn,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(243),  item.getMinPower());
			assertEquals(Integer.valueOf(269),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 19), new AttributeModifier(Attribute.CritDamage, 14)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponSword029051() {
		String content = "{\"item_id\":\"29051\",\"name\":\"Mighty Sword\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"4\",\"rarity\":\"Basic\",\"vendor_value\":\"5\",\"icon_file_id\":\"66216\",\"icon_file_signature\":\"4208D4020193450C234C0DC55F7EFCFAB236007B\",\"default_skin\":\"3873\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Sword\",\"damage_type\":\"Physical\",\"min_power\":\"117\",\"max_power\":\"129\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"4\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(29051),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Mighty Sword", item.getName());
			assertEquals(Integer.valueOf(4),  item.getLevel());
			assertEquals(Integer.valueOf(5),  item.getVendorValue());
			assertEquals(Rarity.Basic, item.getRarity());
			assertTrue(item.getFlags().isEmpty());
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Sword,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(117),  item.getMinPower());
			assertEquals(Integer.valueOf(129),  item.getMaxPower());
			assertEquals(1, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 4)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponStaff034330() {
		String content = "{\"item_id\":\"34330\",\"name\":\"Ravaging Glyphic Staff\",\"type\":\"Weapon\",\"level\":\"21\",\"rarity\":\"Fine\",\"vendor_value\":\"36\",\"icon_file_id\":\"62802\",\"icon_file_signature\":\"009BF7054DD8F777207999EC76EA747801A4CA56\",\"default_skin\":\"5237\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Staff\",\"damage_type\":\"Physical\",\"min_power\":\"230\",\"max_power\":\"259\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"25\"},\n{\"attribute\":\"Precision\",\"modifier\":\"18\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(34330),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Ravaging Glyphic Staff", item.getName());
			assertEquals(Integer.valueOf(21),  item.getLevel());
			assertEquals(Integer.valueOf(36),  item.getVendorValue());
			assertEquals(Rarity.Fine, item.getRarity());
			assertTrue(item.getFlags().isEmpty());
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Staff,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(230),  item.getMinPower());
			assertEquals(Integer.valueOf(259),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 25), new AttributeModifier(Attribute.Precision, 18)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponGreatsword053029() {
		String content = "{\"item_id\":\"53029\",\"name\":\"Vagabond's Problem Solver\",\"type\":\"Weapon\",\"level\":\"14\",\"rarity\":\"Masterwork\",\"vendor_value\":\"63\",\"icon_file_id\":\"66762\",\"icon_file_signature\":\"D8325BBDF9DDCA3F422531492B0CEC7BA34C9ACB\",\"default_skin\":\"5218\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Greatsword\",\"damage_type\":\"Physical\",\"min_power\":\"231\",\"max_power\":\"255\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"23\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"17\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(53029),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Vagabond's Problem Solver", item.getName());
			assertEquals(Integer.valueOf(14),  item.getLevel());
			assertEquals(Integer.valueOf(63),  item.getVendorValue());
			assertEquals(Rarity.Masterwork, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.HideSuffix, ItemFlags.NoMysticForge, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Greatsword,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(231),  item.getMinPower());
			assertEquals(Integer.valueOf(255),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 23), new AttributeModifier(Attribute.Toughness, 17)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponNoSalvageOffenseSlotTrident046985() {
		String content = "{\"item_id\":\"46985\",\"name\":\"Hronk's Trident\",\"description\":\"<c=@flavor>Crafted in the style of the renowned asuran genius, Hronk.</c>\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Ascended\",\"vendor_value\":\"10000\",\"icon_file_id\":\"632283\",\"icon_file_signature\":\"1FC7B1F52AB19197A5019B59F4053AD0E0E6054A\",\"default_skin\":\"4144\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoSalvage\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Trident\",\"damage_type\":\"Physical\",\"min_power\":\"950\",\"max_power\":\"1050\",\"defense\":\"0\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},\n{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"188\"},\n{\"attribute\":\"Precision\",\"modifier\":\"134\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"134\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(46985),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("<c=@flavor>Crafted in the style of the renowned asuran genius, Hronk.</c>", item.getDescription());
			assertEquals("Hronk's Trident", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(10000),  item.getVendorValue());
			assertEquals(Rarity.Ascended, item.getRarity());
			assertEquals(4,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSalvage, ItemFlags.HideSuffix, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Trident,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(950),  item.getMinPower());
			assertEquals(Integer.valueOf(1050),  item.getMaxPower());
			assertEquals(3, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Healing, 188), new AttributeModifier(Attribute.Precision, 134), new AttributeModifier(Attribute.Vitality, 134)})));
			assertEquals(1, item.getInfusionSlots().size());
			assertTrue(item.getInfusionSlots().containsAll(Arrays.asList(new InfusionSlotType[] {InfusionSlotType.Offense})));
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponSoulbindOnAcquire031594() {
		String content = "{\"item_id\":\"31594\",\"name\":\"Tainted Glyphic Maul\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"396\",\"icon_file_id\":\"455718\",\"icon_file_signature\":\"1BD56E11A0350D930E1E611EC212F2AC6C7404EF\",\"default_skin\":\"4516\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Hammer\",\"damage_type\":\"Physical\",\"min_power\":\"985\",\"max_power\":\"1111\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(31594),  item.getId());
			assertFalse(item.getAvailableInActivity());
			assertFalse(item.getAvailableInDungeon());
			assertFalse(item.getAvailableInPvE());
			assertTrue(item.getAvailableInPvP());
			assertTrue(item.getAvailableInPvPLobby());
			assertFalse(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Tainted Glyphic Maul", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(396),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(3,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.NoSell, ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Hammer,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(985),  item.getMinPower());
			assertEquals(Integer.valueOf(1111),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponAxe052664() {
		String content = "{\"item_id\":\"52664\",\"name\":\"Vagabond's Tarnished Hewer\",\"type\":\"Weapon\",\"level\":\"26\",\"rarity\":\"Masterwork\",\"vendor_value\":\"60\",\"icon_file_id\":\"62850\",\"icon_file_signature\":\"775ED24CE0C0F5749BAD66DD9778BDE4DA37AF4A\",\"default_skin\":\"5192\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Axe\",\"damage_type\":\"Physical\",\"min_power\":\"260\",\"max_power\":\"317\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"19\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"14\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(52664),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Vagabond's Tarnished Hewer", item.getName());
			assertEquals(Integer.valueOf(26),  item.getLevel());
			assertEquals(Integer.valueOf(60),  item.getVendorValue());
			assertEquals(Rarity.Masterwork, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.HideSuffix, ItemFlags.NoMysticForge, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Axe,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(260),  item.getMinPower());
			assertEquals(Integer.valueOf(317),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 19), new AttributeModifier(Attribute.Toughness, 14)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponShortBow063679() {
		String content = "{\"item_id\":\"63679\",\"name\":\"Rejuvenating Hard Wood Short Bow\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"40\",\"rarity\":\"Masterwork\",\"vendor_value\":\"114\",\"icon_file_id\":\"67068\",\"icon_file_signature\":\"0EFDC626FD430DA00CD9240C95EC6DF0500DB45E\",\"default_skin\":\"3990\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"ShortBow\",\"damage_type\":\"Physical\",\"min_power\":\"349\",\"max_power\":\"386\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Healing\",\"modifier\":\"55\"},\n{\"attribute\":\"Power\",\"modifier\":\"39\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(63679),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Rejuvenating Hard Wood Short Bow", item.getName());
			assertEquals(Integer.valueOf(40),  item.getLevel());
			assertEquals(Integer.valueOf(114),  item.getVendorValue());
			assertEquals(Rarity.Masterwork, item.getRarity());
			assertEquals(2,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.ShortBow,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(349),  item.getMinPower());
			assertEquals(Integer.valueOf(386),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Healing, 55), new AttributeModifier(Attribute.Power, 39)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponScepter034391() {
		String content = "{\"item_id\":\"34391\",\"name\":\"Ravaging Glyphic Scepter\",\"type\":\"Weapon\",\"level\":\"46\",\"rarity\":\"Fine\",\"vendor_value\":\"42\",\"icon_file_id\":\"62814\",\"icon_file_signature\":\"B0E409A76215A744756C7E98790F9B06F1489F1F\",\"default_skin\":\"5061\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Scepter\",\"damage_type\":\"Physical\",\"min_power\":\"359\",\"max_power\":\"405\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"30\"},\n{\"attribute\":\"Precision\",\"modifier\":\"21\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(34391),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Ravaging Glyphic Scepter", item.getName());
			assertEquals(Integer.valueOf(46),  item.getLevel());
			assertEquals(Integer.valueOf(42),  item.getVendorValue());
			assertEquals(Rarity.Fine, item.getRarity());
			assertTrue(item.getFlags().isEmpty());
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Scepter,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(359),  item.getMinPower());
			assertEquals(Integer.valueOf(405),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 30), new AttributeModifier(Attribute.Precision, 21)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponSpeargun031026() {
		String content = "{\"item_id\":\"31026\",\"name\":\"Berserker's Speargun\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Basic\",\"vendor_value\":\"50\",\"icon_file_id\":\"66246\",\"icon_file_signature\":\"491298E66504934335705E5091CCCF29C2925B47\",\"default_skin\":\"3858\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSalvage\"],\"restrictions\":[],\"weapon\":{\"type\":\"Speargun\",\"damage_type\":\"Physical\",\"min_power\":\"551\",\"max_power\":\"609\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"108\"},\n{\"attribute\":\"Precision\",\"modifier\":\"77\"},\n{\"attribute\":\"CritDamage\",\"modifier\":\"77\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(31026),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Berserker's Speargun", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(50),  item.getVendorValue());
			assertEquals(Rarity.Basic, item.getRarity());
			assertEquals(1,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NoSalvage})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Speargun,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(551),  item.getMinPower());
			assertEquals(Integer.valueOf(609),  item.getMaxPower());
			assertEquals(3, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 108), new AttributeModifier(Attribute.Precision, 77), new AttributeModifier(Attribute.CritDamage, 77)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponMace041540() {
		String content = "{\"item_id\":\"41540\",\"name\":\"Sentinel's Pearl Bludgeoner\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"264\",\"icon_file_id\":\"67776\",\"icon_file_signature\":\"4C3C6AA7923B3B4CF2BBF37505D71A146A21FA4A\",\"default_skin\":\"4075\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Mace\",\"damage_type\":\"Physical\",\"min_power\":\"895\",\"max_power\":\"1010\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":\"90\"},\n{\"attribute\":\"Power\",\"modifier\":\"64\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"64\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(41540),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Sentinel's Pearl Bludgeoner", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(264),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(1,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Mace,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(895),  item.getMinPower());
			assertEquals(Integer.valueOf(1010),  item.getMaxPower());
			assertEquals(3, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Vitality, 90), new AttributeModifier(Attribute.Power, 64), new AttributeModifier(Attribute.Toughness, 64)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponHarpoon046840() {
		String content = "{\"item_id\":\"46840\",\"name\":\"Occam's Impaler\",\"description\":\"<c=@flavor>Crafted in the style of the renowned Sylvari smith, Occam.</c>\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Ascended\",\"vendor_value\":\"10000\",\"icon_file_id\":\"631961\",\"icon_file_signature\":\"3623A0FC9F062FFF6B9F0C4BB00D3745037306B6\",\"default_skin\":\"4161\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoSalvage\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Harpoon\",\"damage_type\":\"Physical\",\"min_power\":\"950\",\"max_power\":\"1050\",\"defense\":\"0\",\"infusion_slots\":[{\"flags\":[\"Offense\"]},\n{\"flags\":[\"Offense\"]}],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"188\"},\n{\"attribute\":\"Power\",\"modifier\":\"134\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"134\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(46840),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("<c=@flavor>Crafted in the style of the renowned Sylvari smith, Occam.</c>", item.getDescription());
			assertEquals("Occam's Impaler", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(10000),  item.getVendorValue());
			assertEquals(Rarity.Ascended, item.getRarity());
			assertEquals(4,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSalvage, ItemFlags.HideSuffix, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Harpoon,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(950),  item.getMinPower());
			assertEquals(Integer.valueOf(1050),  item.getMaxPower());
			assertEquals(3, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 188), new AttributeModifier(Attribute.Power, 134), new AttributeModifier(Attribute.Vitality, 134)})));
			assertEquals(1, item.getInfusionSlots().size());
			assertTrue(item.getInfusionSlots().containsAll(Arrays.asList(new InfusionSlotType[] {InfusionSlotType.Offense})));
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponTorch029404() {
		String content = "{\"item_id\":\"29404\",\"name\":\"Exterminator Torch\",\"description\":\"<c=@flavor>\\\"Great for cleaning out grawl.\\\"<br>—Etta</c>\",\"type\":\"Weapon\",\"level\":\"9\",\"rarity\":\"Fine\",\"vendor_value\":\"14\",\"icon_file_id\":\"63136\",\"icon_file_signature\":\"FA56C5DD5D7494F25D980E432BA129F44209ED0E\",\"default_skin\":\"3890\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"HideSuffix\",\n\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Torch\",\"damage_type\":\"Physical\",\"min_power\":\"141\",\"max_power\":\"165\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Vitality\",\"modifier\":\"7\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(29404),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("<c=@flavor>\"Great for cleaning out grawl.\"<br>—Etta</c>", item.getDescription());
			assertEquals("Exterminator Torch", item.getName());
			assertEquals(Integer.valueOf(9),  item.getLevel());
			assertEquals(Integer.valueOf(14),  item.getVendorValue());
			assertEquals(Rarity.Fine, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulBindOnUse, ItemFlags.HideSuffix})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Torch,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(141),  item.getMinPower());
			assertEquals(Integer.valueOf(165),  item.getMaxPower());
			assertEquals(1, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Vitality, 7)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponShield054171() {
		String content = "{\"item_id\":\"54171\",\"name\":\"Vagabond's Immutabilis\",\"type\":\"Weapon\",\"level\":\"51\",\"rarity\":\"Rare\",\"vendor_value\":\"141\",\"icon_file_id\":\"434774\",\"icon_file_signature\":\"A2B7C080B75DCC1C65DB50746CB0E90356240667\",\"default_skin\":\"5207\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"HideSuffix\",\n\"NoMysticForge\",\n\"NoSell\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Shield\",\"damage_type\":\"Physical\",\"min_power\":\"447\",\"max_power\":\"504\",\"defense\":\"32\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"44\"},\n{\"attribute\":\"Toughness\",\"modifier\":\"32\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(54171),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Vagabond's Immutabilis", item.getName());
			assertEquals(Integer.valueOf(51),  item.getLevel());
			assertEquals(Integer.valueOf(141),  item.getVendorValue());
			assertEquals(Rarity.Rare, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.HideSuffix, ItemFlags.NoMysticForge, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Shield,  item.getWeaponType());
			assertEquals(Integer.valueOf(32),  item.getDefense());
			assertEquals(Integer.valueOf(447),  item.getMinPower());
			assertEquals(Integer.valueOf(504),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 44), new AttributeModifier(Attribute.Toughness, 32)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponDagger033197() {
		String content = "{\"item_id\":\"33197\",\"name\":\"Orrian Dagger of Earth\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Masterwork\",\"vendor_value\":\"132\",\"icon_file_id\":\"779957\",\"icon_file_signature\":\"1DBE7D479EB96C5D99A0ED0E3702BFE118D7F80E\",\"default_skin\":\"5093\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Dagger\",\"damage_type\":\"Physical\",\"min_power\":\"761\",\"max_power\":\"808\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"24558\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(33197),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Orrian Dagger of Earth", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(132),  item.getVendorValue());
			assertEquals(Rarity.Masterwork, item.getRarity());
			assertEquals(2,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Dagger,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(761),  item.getMinPower());
			assertEquals(Integer.valueOf(808),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(24558),  item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponNotUpgradeableTwoHandedToy043092() {
		String content = "{\"item_id\":\"43092\",\"name\":\"Bloody Prince's Staff Toy\",\"description\":\"Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item.\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"648159\",\"icon_file_signature\":\"DCAA16650655B79ADDAD02B44B590EA9397AD3DE\",\"default_skin\":\"3245\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"NotUpgradeable\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"TwoHandedToy\",\"damage_type\":\"Physical\",\"min_power\":\"0\",\"max_power\":\"0\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(43092),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertTrue(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item.", item.getDescription());
			assertEquals("Bloody Prince's Staff Toy", item.getName());
			assertEquals(Integer.valueOf(0),  item.getLevel());
			assertEquals(Integer.valueOf(0),  item.getVendorValue());
			assertEquals(Rarity.Rare, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NotUpgradeable, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.NoMysticForge, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.TwoHandedToy,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(0),  item.getMinPower());
			assertEquals(Integer.valueOf(0),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponRifle028035() {
		String content = "{\"item_id\":\"28035\",\"name\":\"Strong Iron Rifle\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"56\",\"rarity\":\"Fine\",\"vendor_value\":\"74\",\"icon_file_id\":\"62700\",\"icon_file_signature\":\"167018D742BBF5120BE4ACE80DE5B049089D20F2\",\"default_skin\":\"4092\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[],\"restrictions\":[],\"weapon\":{\"type\":\"Rifle\",\"damage_type\":\"Physical\",\"min_power\":\"487\",\"max_power\":\"595\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"Power\",\"modifier\":\"79\"},\n{\"attribute\":\"Precision\",\"modifier\":\"56\"}]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(28035),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("Strong Iron Rifle", item.getName());
			assertEquals(Integer.valueOf(56),  item.getLevel());
			assertEquals(Integer.valueOf(74),  item.getVendorValue());
			assertEquals(Rarity.Fine, item.getRarity());
			assertTrue(item.getFlags().isEmpty());
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Rifle,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(487),  item.getMinPower());
			assertEquals(Integer.valueOf(595),  item.getMaxPower());
			assertEquals(2, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.Power, 79), new AttributeModifier(Attribute.Precision, 56)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponFocus034132() {
		String content = "{\"item_id\":\"34132\",\"name\":\"Carrion Tribal Focus of Accuracy\",\"type\":\"Weapon\",\"level\":\"78\",\"rarity\":\"Exotic\",\"vendor_value\":\"256\",\"icon_file_id\":\"67309\",\"icon_file_signature\":\"7524FEB6CFE0FB59E8FA97B1D7AFB27FB0CBFEC9\",\"default_skin\":\"5183\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Focus\",\"damage_type\":\"Physical\",\"min_power\":\"805\",\"max_power\":\"855\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[{\"attribute\":\"ConditionDamage\",\"modifier\":\"86\"},\n{\"attribute\":\"Power\",\"modifier\":\"62\"},\n{\"attribute\":\"Vitality\",\"modifier\":\"62\"}]},\"suffix_item_id\":\"24618\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(34132),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Carrion Tribal Focus of Accuracy", item.getName());
			assertEquals(Integer.valueOf(78),  item.getLevel());
			assertEquals(Integer.valueOf(256),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(1,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Focus,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(805),  item.getMinPower());
			assertEquals(Integer.valueOf(855),  item.getMaxPower());
			assertEquals(3, item.getInfixUpgrade().getAttributes().size());
			assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {new AttributeModifier(Attribute.ConditionDamage, 86), new AttributeModifier(Attribute.Power, 62), new AttributeModifier(Attribute.Vitality, 62)})));
			assertTrue(item.getInfusionSlots().isEmpty());
			assertEquals(Integer.valueOf(24618),  item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponToy020262() {
		String content = "{\"item_id\":\"20262\",\"name\":\"Frying Pan\",\"description\":\"Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item.\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Fine\",\"vendor_value\":\"0\",\"icon_file_id\":\"220578\",\"icon_file_signature\":\"511DBF081277C7D470EE5322A1F5377460F95E0C\",\"default_skin\":\"3187\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\",\n\"Wvw\"],\"flags\":[\"AccountBound\",\n\"NoMysticForge\",\n\"NoSell\",\n\"NotUpgradeable\",\n\"AccountBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Toy\",\"damage_type\":\"Physical\",\"min_power\":\"0\",\"max_power\":\"0\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(20262),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertTrue(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("Town clothes can no longer be equipped separately.\n\nSpeak to a Black Lion Armor Trader to exchange this for a portable bundle item.", item.getDescription());
			assertEquals("Frying Pan", item.getName());
			assertEquals(Integer.valueOf(0),  item.getLevel());
			assertEquals(Integer.valueOf(0),  item.getVendorValue());
			assertEquals(Rarity.Fine, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.NotUpgradeable, ItemFlags.AccountBindOnUse, ItemFlags.NoSell, ItemFlags.NoMysticForge, ItemFlags.AccountBound})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.Toy,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(0),  item.getMinPower());
			assertEquals(Integer.valueOf(0),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponFireDamage049202() {
		String content = "{\"item_id\":\"49202\",\"name\":\"Rodgort\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"100000\",\"icon_file_id\":\"456027\",\"icon_file_signature\":\"B1D6CB3AB4017633280ACDB36470F46829FDDD13\",\"default_skin\":\"4665\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Torch\",\"damage_type\":\"Fire\",\"min_power\":\"789\",\"max_power\":\"926\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(49202),  item.getId());
			assertFalse(item.getAvailableInActivity());
			assertFalse(item.getAvailableInDungeon());
			assertFalse(item.getAvailableInPvE());
			assertTrue(item.getAvailableInPvP());
			assertTrue(item.getAvailableInPvPLobby());
			assertFalse(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Rodgort", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(100000),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(4,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Fire,  item.getDamageType());
			assertEquals(WeaponType.Torch,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(789),  item.getMinPower());
			assertEquals(Integer.valueOf(926),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponLargeBundle049935() {
		String content = "{\"item_id\":\"49935\",\"name\":\"Enchanted Broom\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Rare\",\"vendor_value\":\"0\",\"icon_file_id\":\"499494\",\"icon_file_signature\":\"306AC2AA3648170B137FFF57030C5AD550F2615F\",\"default_skin\":\"3689\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"PvpLobby\"],\"flags\":[\"NoMysticForge\",\n\"NoSell\",\n\"NotUpgradeable\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"LargeBundle\",\"damage_type\":\"Physical\",\"min_power\":\"0\",\"max_power\":\"0\",\"defense\":\"0\",\"infusion_slots\":[],\"infix_upgrade\":{\"buff\":{\"skill_id\":\"23133\"},\"attributes\":[]},\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(49935),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertTrue(item.getAvailableInPvPLobby());
			assertFalse(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Enchanted Broom", item.getName());
			assertEquals(Integer.valueOf(0),  item.getLevel());
			assertEquals(Integer.valueOf(0),  item.getVendorValue());
			assertEquals(Rarity.Rare, item.getRarity());
			assertEquals(5,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.NotUpgradeable, ItemFlags.NoSell, ItemFlags.SoulBindOnUse, ItemFlags.NoMysticForge})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Physical,  item.getDamageType());
			assertEquals(WeaponType.LargeBundle,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(0),  item.getMinPower());
			assertEquals(Integer.valueOf(0),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponIceDamage049185() {
		String content = "{\"item_id\":\"49185\",\"name\":\"Frostfang\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"100000\",\"icon_file_id\":\"456009\",\"icon_file_signature\":\"0F9C08DE12ADD1082A103DC6EF7401281B23985E\",\"default_skin\":\"4674\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Axe\",\"damage_type\":\"Ice\",\"min_power\":\"857\",\"max_power\":\"1048\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(49185),  item.getId());
			assertFalse(item.getAvailableInActivity());
			assertFalse(item.getAvailableInDungeon());
			assertFalse(item.getAvailableInPvE());
			assertTrue(item.getAvailableInPvP());
			assertTrue(item.getAvailableInPvPLobby());
			assertFalse(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Frostfang", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(100000),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(4,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Ice,  item.getDamageType());
			assertEquals(WeaponType.Axe,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(857),  item.getMinPower());
			assertEquals(Integer.valueOf(1048),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponLightningDamage049197() {
		String content = "{\"item_id\":\"49197\",\"name\":\"Meteorlogicus\",\"type\":\"Weapon\",\"level\":\"80\",\"rarity\":\"Exotic\",\"vendor_value\":\"100000\",\"icon_file_id\":\"456020\",\"icon_file_signature\":\"AC940BF377C5D3EF13B2060D53EF19F1BC34BE48\",\"default_skin\":\"4673\",\"game_types\":[\"Pvp\",\n\"PvpLobby\"],\"flags\":[\"NoSalvage\",\n\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"Scepter\",\"damage_type\":\"Lightning\",\"min_power\":\"895\",\"max_power\":\"1010\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(49197),  item.getId());
			assertFalse(item.getAvailableInActivity());
			assertFalse(item.getAvailableInDungeon());
			assertFalse(item.getAvailableInPvE());
			assertTrue(item.getAvailableInPvP());
			assertTrue(item.getAvailableInPvPLobby());
			assertFalse(item.getAvailableInWvW());
			assertNull(item.getDescription());
			assertEquals("Meteorlogicus", item.getName());
			assertEquals(Integer.valueOf(80),  item.getLevel());
			assertEquals(Integer.valueOf(100000),  item.getVendorValue());
			assertEquals(Rarity.Exotic, item.getRarity());
			assertEquals(4,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.NoSalvage, ItemFlags.NoSell, ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Lightning,  item.getDamageType());
			assertEquals(WeaponType.Scepter,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(895),  item.getMinPower());
			assertEquals(Integer.valueOf(1010),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

	@Test
	public void testWeaponChokingDamageSmallBundle000006() {
		String content = "{\"item_id\":\"6\",\"name\":\"((Assassin Coin Bundle))\",\"description\":\"\",\"type\":\"Weapon\",\"level\":\"0\",\"rarity\":\"Basic\",\"vendor_value\":\"0\",\"icon_file_id\":\"60984\",\"icon_file_signature\":\"CC2E01E0F566A6EEF4F2EC2B19AA7A3E1FEFB1B4\",\"default_skin\":\"2809\",\"game_types\":[\"Activity\",\n\"Dungeon\",\n\"Pve\",\n\"Wvw\"],\"flags\":[\"NoSell\",\n\"SoulbindOnAcquire\",\n\"SoulBindOnUse\"],\"restrictions\":[],\"weapon\":{\"type\":\"SmallBundle\",\"damage_type\":\"Choking\",\"min_power\":\"105\",\"max_power\":\"117\",\"defense\":\"0\",\"infusion_slots\":[],\"suffix_item_id\":\"\",\"secondary_suffix_item_id\":\"\"}}";
		try {
			ItemJson<?> itemJson = mapper.readValue(content, ItemJson.class);
			assertNotNull(itemJson);
			assertTrue(itemJson instanceof WeaponJson);
			IWeapon item = (IWeapon) itemJson.getEntity();
			assertEquals(Integer.valueOf(6),  item.getId());
			assertTrue(item.getAvailableInActivity());
			assertTrue(item.getAvailableInDungeon());
			assertTrue(item.getAvailableInPvE());
			assertFalse(item.getAvailableInPvP());
			assertFalse(item.getAvailableInPvPLobby());
			assertTrue(item.getAvailableInWvW());
			assertEquals("", item.getDescription());
			assertEquals("((Assassin Coin Bundle))", item.getName());
			assertEquals(Integer.valueOf(0),  item.getLevel());
			assertEquals(Integer.valueOf(0),  item.getVendorValue());
			assertEquals(Rarity.Basic, item.getRarity());
			assertEquals(3,  item.getFlags().size());
			assertTrue(item.getFlags().containsAll(Arrays.asList(new ItemFlags[] {ItemFlags.SoulbindOnAcquire, ItemFlags.NoSell, ItemFlags.SoulBindOnUse})));
			assertTrue(item.getRestrictions().isEmpty());
			assertEquals(DamageType.Choking,  item.getDamageType());
			assertEquals(WeaponType.SmallBundle,  item.getWeaponType());
			assertEquals(Integer.valueOf(0),  item.getDefense());
			assertEquals(Integer.valueOf(105),  item.getMinPower());
			assertEquals(Integer.valueOf(117),  item.getMaxPower());
			assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());
			assertTrue(item.getInfusionSlots().isEmpty());
			assertNull(item.getSuffixItemId());
			assertNull(item.getSecondarySuffixItemId());
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}

	}

}
