package de.getsetsociety.gw2readr.v1.item.items;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import de.getsetsociety.gw2readr.v0.item.items.enums.DamageType;
import de.getsetsociety.gw2readr.v0.item.items.enums.InfusionSlotType;
import de.getsetsociety.gw2readr.v0.item.items.enums.ItemFlags;
import de.getsetsociety.gw2readr.v0.item.items.enums.RestrictionType;
import de.getsetsociety.gw2readr.v0.item.items.enums.WeaponType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IWeapon;

public class WeaponTestCreator extends BaseItemTestCreator {

	private boolean needWeapon = true;
	private boolean needInfixUpgrade = true;
	private boolean needNoInfixUpgrade = true;
	private boolean needNoInfusionSlots = true;
	private boolean needNoRestrictions = true;
	private List<WeaponType> neededWeaponTypes = new ArrayList<>(Arrays.asList(WeaponType.values()));
	private List<RestrictionType> neededRestrictions = new ArrayList<>(Arrays.asList(RestrictionType.values()));
	private List<DamageType> neededDamageTypes = new ArrayList<>(Arrays.asList(DamageType.values()));
	private List<ItemFlags> neededFlags = new ArrayList<>(Arrays.asList(ItemFlags.values()));
	private List<InfusionSlotType> neededInfusionSlots = new ArrayList<>(Arrays.asList(InfusionSlotType.values()));
	private static final String TYPE = "Weapon";

	public WeaponTestCreator() throws IOException {
		super("WeaponTest");
	}

	public void createTestCase(String content, IWeapon item) throws IOException {
		boolean needTest = false;
		String testName = TYPE;
		if (needWeapon) {
			needTest = true;
			needWeapon = false;
		}
		if (neededDamageTypes.contains(item.getDamageType())) {
			testName += item.getDamageType() + "Damage";
			needTest = true;
			neededDamageTypes.remove(item.getDamageType());
		}

		if (!item.getFlags().isEmpty()) {
			for (ItemFlags itemFlag : item.getFlags()) {
				if (neededFlags.contains(itemFlag)) {
					testName += itemFlag;
					needTest = true;
					neededFlags.remove(itemFlag);
				}
			}
		}
		if (needNoInfixUpgrade && item.getInfixUpgrade() == null) {
			needTest = true;
			needNoInfixUpgrade = false;
			testName += "NoInfixUpgrade";
		} else if (needInfixUpgrade && item.getInfixUpgrade() != null) {
			needTest = true;
			needInfixUpgrade = false;
			testName += "InfixUpgrade";
		}

		if (!item.getInfusionSlots().isEmpty()) {
			for (InfusionSlotType slot: item.getInfusionSlots()) {
				if (neededInfusionSlots.contains(slot)) {
					needTest = true;
					neededInfusionSlots.remove(slot);
					testName += slot + "Slot";
				}
			}
		} else if (needNoInfusionSlots) {
			needTest = true;
			needNoInfusionSlots = false;
			testName += "NoSlot";
		}

		if (!item.getRestrictions().isEmpty()) {
			for (RestrictionType restriction: item.getRestrictions()) {
				if (neededRestrictions.contains(restriction)) {
					needTest = true;
					neededRestrictions.remove(restriction);
					testName += restriction + "Restriction";
				}
			}
		} else if (needNoRestrictions) {
			needTest = true;
			needNoRestrictions = false;
			testName += "NoRestriction";
		}

		if (neededWeaponTypes.contains(item.getWeaponType())) {
			testName += item.getWeaponType();
			needTest = true;
			neededWeaponTypes.remove(item.getWeaponType());
		}

		if (needTest) {
			createAsserts(content, item, testName);
			testWriter.append("        }\n\n");
		}
	}

	private void createAsserts(String content, IWeapon item, String testName)
			throws IOException {
		createTestCaseHeader(content, item, TYPE, testName);
		super.createTestCase(item);
		getAssertDamageType(item.getDamageType());
		getAssertWeaponType(item.getWeaponType());
		getAssertIntegerField("Defense", item.getDefense());
		getAssertIntegerField("MinPower", item.getMinPower());
		getAssertIntegerField("MaxPower", item.getMaxPower());
		getAssertInfixUpgrade(item.getInfixUpgrade());
		getAssertInfusionSlots(item.getInfusionSlots());
		getAssertSuffixItemId(item.getSuffixItemId(), "");
		getAssertSuffixItemId(item.getSecondarySuffixItemId(), "Secondary");
		testWriter.append("        } catch (Exception e) {\n           e.printStackTrace();\n            fail(\"Unexpected Exception\");\n        }\n\n");

	}

	private void getAssertSuffixItemId(Integer suffixItemId, String infix) throws IOException {
		if (suffixItemId == null) {
			testWriter.append(String.format("            assertNull(item.get%sSuffixItemId());%n", infix));
		} else {
			getAssertIntegerField(infix + "SuffixItemId", suffixItemId);
		}
	}

	private void getAssertInfusionSlots(Set<InfusionSlotType> slots)
			throws IOException {
		if (slots.isEmpty()) {
			testWriter.append(String.format("            assertTrue(item.getInfusionSlots().isEmpty());%n"));
		} else {
			testWriter.append(String.format("            assertEquals(%d, item.getInfusionSlots().size());%n", slots.size()));
			testWriter.append(String.format("            assertTrue(item.getInfusionSlots().containsAll(Arrays.asList(new InfusionSlotType[] {InfusionSlotType.%s})));%n", StringUtils.join(slots, ", InfusionSlotType.")));
		}
	}

	private void getAssertInfixUpgrade(IInfixUpgrade infixUpgrade)
			throws IOException {
		if (infixUpgrade == null) {
			testWriter.append(String.format("            assertNull(item.getInfixUpgrade());%n"));
		} else if (infixUpgrade.getAttributes().isEmpty()){
			testWriter.append(String.format("            assertTrue(item.getInfixUpgrade().getAttributes().isEmpty());%n"));
		} else {
			testWriter.append(String.format("            assertEquals(%d, item.getInfixUpgrade().getAttributes().size());%n", infixUpgrade.getAttributes().size()));
			String ams = "new AttributeModifier(Attribute.%s, %d)";
			List<String> modifiers = new ArrayList<>();
			for (IAttributeModifier am: infixUpgrade.getAttributes()) {
				modifiers.add(String.format(ams, am.getAttribute(), am.getModifier()));
			}
			testWriter.append(String.format("            assertTrue(item.getInfixUpgrade().getAttributes().containsAll(Arrays.asList(new AttributeModifier[] {%s})));%n", StringUtils.join(modifiers, ", ")));
		}
	}

	private void getAssertWeaponType(WeaponType weaponType) throws IOException {
		testWriter.append(String.format("            assertEquals(WeaponType.%s,  item.getWeaponType());%n", weaponType));
	}

	private void getAssertDamageType(DamageType damageType) throws IOException {
		testWriter.append(String.format("            assertEquals(DamageType.%s,  item.getDamageType());%n", damageType));
	}
}