package de.getsetsociety.gw2readr.v1.item.items;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.getsetsociety.gw2readr.v0.item.items.enums.ConsumableType;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IConsumable;

public class ConsumableTestCreator extends BaseItemTestCreator {

	private boolean needConsumable = true;
	private List<ConsumableType> neededConsumableTypes = new ArrayList<>(Arrays.asList(ConsumableType.values()));
	private static final String TYPE = "Consumable";

	public ConsumableTestCreator() throws IOException {
		super("ConsumableTest");
	}

	public void createTestCase(String content, IConsumable item) throws IOException {
		boolean needTest = false;
		String testName = TYPE;
		if (needConsumable) {
			needTest = true;
			needConsumable = false;
		}
		if (neededConsumableTypes.contains(item.getConsumableType())) {
			needTest = true;
			neededConsumableTypes.remove(item.getConsumableType());
			testName += item.getConsumableType();
		}
		if (needTest) {
			createTestCaseHeader(content, item, TYPE, testName);
			super.createTestCase(item);
			getAssertIntegerField("DurationMs", item.getDurationMs());
			getAssertIntegerField("RecipeId", item.getRecipeId());
			getAssertIntegerField("ColorId", item.getColorId());
			testWriter.append(String.format("            assertEquals(ConsumableType.%s, item.getConsumableType());%n", item.getConsumableType()));
			testWriter.append("        } catch (Exception e) {\n           e.printStackTrace();\n            fail(\"Unexpected Exception\");\n        }\n    }\n\n");

		}

	}
}