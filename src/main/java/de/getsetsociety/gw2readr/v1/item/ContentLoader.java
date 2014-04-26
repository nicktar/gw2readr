package  de.getsetsociety.gw2readr.v1.item;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.wicket.util.io.IOUtils;

import de.getsetsociety.gw2readr.general.enums.Language;

public class ContentLoader {
	
	public static String getItemUrlContent(String id, Language language) throws MalformedURLException,IOException {
		return readFromUrl(String.format("item_details.json?item_id=%s&lang=%s", id, language));
	}

	public static String getItemsUrlContent() throws MalformedURLException,IOException {
		return readFromUrl("items.json");
	}
	
	public static String getRecipesUrlContent() throws MalformedURLException,IOException {
		return readFromUrl("recipes.json");
	}

	public static String getRecipeUrlContent(String id) throws MalformedURLException,IOException {
		return readFromUrl("recipe_details.json?recipe_id=" + id);
	}

	public static String getRecipeUrlContent(String id, Language language) throws MalformedURLException,IOException {
		return readFromUrl(String.format("recipe_details.json?recipe_id=%s&lang=%s", id, language));
	}
	
	public static String getBuildUrlContent() throws MalformedURLException, IOException {
		return readFromUrl("build.json");
	}

	private static String readFromUrl(String urlpart) throws MalformedURLException, IOException {
		URL url = new URL("https", "api.guildwars2.com","/v1/" + urlpart);
		StringWriter writer = new StringWriter();
		IOUtils.copy((InputStream) url.getContent(), writer, "UTF-8");
		String content = writer.toString();
		return content;
	}
}
