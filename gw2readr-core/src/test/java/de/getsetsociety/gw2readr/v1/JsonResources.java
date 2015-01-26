package de.getsetsociety.gw2readr.v1;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class JsonResources {

	private static final String BUNDLE_NAME = "de.getsetsociety.gw2readr.v1.json";

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private JsonResources() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
