package de.getsetsociety.gw2readr.v1.item.items;

import java.io.IOException;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.ICraftingMaterial;

public class CraftingMaterialTestCreator extends BaseItemTestCreator {

	private boolean needCraftingMaterial = true;
	private static final String TYPE = "CraftingMaterial";

	public CraftingMaterialTestCreator() throws IOException {
		super("CraftingMaterialTest");
	}

	public void createTestCase(String content, ICraftingMaterial item) throws IOException {
		if (needCraftingMaterial) {
			createTestCaseHeader(content, item, TYPE, TYPE);
			super.createTestCase(item);
			testWriter.append("        } catch (Exception e) {\n           e.printStackTrace();\n            fail(\"Unexpected Exception\");\n        }\n    }\n\n");
			needCraftingMaterial = false;
		}
	}
}