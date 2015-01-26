/**
 *
 */
package de.getsetsociety.gw2readr.v2.item.items;

import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.file.Path;
import java.nio.file.Paths;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.general.enums.Language;

/**
 * @author davidh
 *
 */
public class JsonDownloader {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ContentLoader.setProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("ipx01.abit.de", 7000)));
		Path allItemsJson = Paths.get("src/test/resources/de/getsetsociety/gw2readr/v2/item/items", "AllItemsJson.txt");
		if (!allItemsJson.toFile().exists()) {
			allItemsJson.toFile().createNewFile();
		}
		FileWriter writer = null;
		try {
			writer = new FileWriter(allItemsJson.toFile());
			for (int i = 0; i <=202; i++) {
				String content = ContentLoader.getV2ItemByPageUrlContent(Language.English, i, 200);
				content = content.substring(1, content.length() -1) + ",";
				writer.append(content);
			}
		} finally {
			if (writer != null) {
				writer.close();
			}
		}

	}

}
