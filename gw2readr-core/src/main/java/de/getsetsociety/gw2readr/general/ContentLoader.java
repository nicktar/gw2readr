package de.getsetsociety.gw2readr.general;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.regex.Matcher;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import de.getsetsociety.gw2readr.general.enums.Language;

public class ContentLoader {

    private static Proxy proxy;

    public static String getV1ItemUrlContent(String id, Language language) throws IOException {
        return readFromV1Url(String.format("item_details.json?item_id=%s&lang=%s", id, language));
    }

    public static String getV2ItemUrlContent(Language language, Integer id) throws IOException {
        return readFromV2Url(String.format("items/%s?lang=%s", id, language));
    }

    public static String getV2ItemUrlContent(Language language, Collection<Integer> ids) throws IOException {
        return readFromV2Url(String.format("items?lang=%s&ids=%s", language, StringUtils.join(ids, ",")));
    }

    public static String getV2ItemUrlContent(Language language, Integer... ids) throws IOException {
        return readFromV2Url(String.format("items/%s?lang=%s", StringUtils.join(ids, ","), language));
    }

    public static String getV2ItemByPageUrlContent(Language language, Integer pageNumber, Integer pageSize) throws IOException {
        return readFromV2Url(String.format("items?lang=%s&page=%s&page_size=%s", language, pageNumber, pageSize));
    }

    public static String getV1ItemsUrlContent() throws IOException {
        return readFromV1Url("items.json");
    }

    public static String getRecipesUrlContent() throws IOException {
        return readFromV1Url("recipes.json");
    }

    public static String getRecipeUrlContent(String id) throws IOException {
        return readFromV1Url("recipe_details.json?recipe_id=" + id);
    }

    public static String getBuyGemsUrlContent(Integer coins) throws IOException {
        return readFromV2Url("commerce/exchange/coins?quantity=" + coins);
    }

    public static String getBuyCoinsUrlContent(Integer gems) throws IOException {
        return readFromV2Url("commerce/exchange/gems?quantity=" + gems);
    }

    public static String getRecipeUrlContent(String id, Language language) throws IOException {
        return readFromV1Url(String.format("recipe_details.json?recipe_id=%s&lang=%s", id, language));
    }

    public static String getBuildUrlContent() throws IOException {
        return readFromV1Url("build.json");
    }

    public static String getColorsUrlContent() throws IOException {
        return getColorsUrlContent(Language.English);
    }

    public static String getColorsUrlContent(Language language) throws IOException {
        return readFromV1Url("colors.json?lang=" + language);
    }

    public static String getFilesUrlContent() throws IOException {
        return readFromV1Url("files.json");
    }

    public static String getWorldsUrlContent(Language language) throws IOException {
        return readFromV1Url("world_names.json?lang=" + language);
    }

    public static String readContinentsUrlContent() throws IOException {
        return readFromV1Url("continents.json");
    }

    public static String readGuildUrlContent(String guildId, String guildName) throws IOException {
        StringBuilder urlpart = new StringBuilder("guild_details.json");
        if (StringUtils.isNoneBlank(guildId)) {
            urlpart.append("?guild_id=").append(guildId);
        } else if (StringUtils.isNoneBlank(guildName)) {
            urlpart.append("?guild_name=").append(guildId);
        } else {
            throw new IllegalArgumentException("One of guildId or guildName has to be supplied and be not empty or blank.");
        }
        return readFromV1Url(urlpart.toString());
    }

    private static String readFromV1Url(String urlpart) throws IOException {
        return readFromUrl(urlpart, "/v1/");
    }

    private static String readFromV2Url(String urlpart) throws IOException {
        return readFromUrl(urlpart, "/v2/");
    }

    private static String readFromUrl(String urlpart, String version) throws IOException {
        URL url = new URL("https", "api.guildwars2.com", version + urlpart);
        StringWriter writer = new StringWriter();
        if (proxy == null) {
            IOUtils.copy((InputStream) url.getContent(), writer, "UTF-8");
        } else {
            URLConnection uc = url.openConnection(proxy);
            IOUtils.copy((InputStream) uc.getContent(), writer, "UTF-8");
        }
        return writer.toString();
    }

	public static String maskControlSequences(String input) {
		return input.replaceAll("\n", Matcher.quoteReplacement("\\n"));
	}

	/**
	 * @param proxy the proxy to set
	 */
	public static void setProxy(Proxy proxy) {
		ContentLoader.proxy = proxy;
	}

}
