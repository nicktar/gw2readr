package de.getsetsociety.gw2readr.v1.item.items;

import java.io.IOException;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBackItem;

public class BackItemTestCreator extends BaseItemTestCreator {

	private boolean needBackItem = true;
	private static final String TYPE = "BackItem";

	public BackItemTestCreator() throws IOException {
		super("BackItemsTest");
	}

	public void createTestCase(String content, IBackItem item) throws IOException {
		if (needBackItem) {
			createTestCaseHeader(content, item, TYPE, TYPE);
			super.createTestCase(item);
			testWriter.append("        } catch (Exception e) {\n           e.printStackTrace();\n            fail(\"Unexpected Exception\");\n        }\n    }\n\n");
			needBackItem = false;
		}
	}
}