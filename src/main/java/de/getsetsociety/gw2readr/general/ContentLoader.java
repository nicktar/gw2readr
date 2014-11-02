package de.getsetsociety.gw2readr.general;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import de.getsetsociety.gw2readr.general.enums.Language;

public class ContentLoader {

    public static String getItemUrlContent(String id, Language language) throws MalformedURLException, IOException {
        return readFromV1Url(String.format("item_details.json?item_id=%s&lang=%s", id, language));
    }

    public static String getItemsUrlContent() throws MalformedURLException, IOException {
        return readFromV1Url("items.json");
    }

    public static String getRecipesUrlContent() throws MalformedURLException, IOException {
        return readFromV1Url("recipes.json");
    }

    public static String getRecipeUrlContent(String id) throws MalformedURLException, IOException {
        return readFromV1Url("recipe_details.json?recipe_id=" + id);
    }

    public static String getBuyGemsUrlContent(Integer coins) throws MalformedURLException, IOException {
        return readFromV2Url("commerce/exchange/coins?quantity=" + coins);
    }

    public static String getBuyCoinsUrlContent(Integer gems) throws MalformedURLException, IOException {
        return readFromV2Url("commerce/exchange/gems?quantity=" + gems);
    }

    public static String getRecipeUrlContent(String id, Language language) throws MalformedURLException, IOException {
        return readFromV1Url(String.format("recipe_details.json?recipe_id=%s&lang=%s", id, language));
    }

    public static String getBuildUrlContent() throws MalformedURLException, IOException {
        return readFromV1Url("build.json");
    }

    public static String getColorsUrlContent() throws MalformedURLException, IOException {
        return getColorsUrlContent(Language.English);
    }

    public static String getColorsUrlContent(Language language) throws MalformedURLException, IOException {
        return readFromV1Url("colors.json?lang=" + language);
    }

    public static String getFilesUrlContent() throws MalformedURLException, IOException {
        return readFromV1Url("files.json");
    }

    public static String getWorldsUrlContent(Language language) throws MalformedURLException, IOException {
        return readFromV1Url("world_names.json?lang=" + language);
    }

    public static String readContinentsUrlContent() throws MalformedURLException, IOException {
        return readFromV1Url("continents.json");
    }

    public static String readGuildUrlContent(String guildId, String guildName) throws MalformedURLException, IOException {
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

    private static String readFromV1Url(String urlpart) throws MalformedURLException, IOException {
        return readFromUrl(urlpart, "/v1/");
    }

    private static String readFromV2Url(String urlpart) throws MalformedURLException, IOException {
        return maskControlSequences(readFromUrl(urlpart, "/v2/"));
    }

    private static String readFromUrl(String urlpart, String version)
            throws MalformedURLException, IOException {
        URL url = new URL("https", "api.guildwars2.com", version + urlpart);
        StringWriter writer = new StringWriter();
        IOUtils.copy((InputStream) url.getContent(), writer, "UTF-8");
        return writer.toString();
    }

    public static String maskControlSequences(String input) {
        return input.replaceAll("\n", Matcher.quoteReplacement("\\n"));
    }

}
