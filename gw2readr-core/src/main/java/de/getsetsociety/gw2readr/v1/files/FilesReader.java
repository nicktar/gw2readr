package de.getsetsociety.gw2readr.v1.files;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class FilesReader {

	private static final Object lock = new Object();
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	/**
	 * TODO find a way to implement this using Jackson Annotations
	 *
	 * @return all File Infos
	 */
	public Map<String, IFileInfo> readFiles() {
		Map<String, Map<String, Object>> tempFiles = null;
		Map<String, IFileInfo> files = new HashMap<>();
		try {
			String content = ContentLoader.getFilesUrlContent();
			tempFiles = OBJECT_MAPPER.readValue(content, LinkedHashMap.class);
			for (Entry<String, Map<String, Object>> e : tempFiles.entrySet()) {
				IFileInfo file = EntityFactoryProvider.getFileInfoEntityFactory().newFileInfo();
				file.setFileId((Integer) e.getValue().get("file_id"));
				file.setSignature((String) e.getValue().get("signature"));
				file.setName(e.getKey());

				files.put(e.getKey(), file);
			}
		} catch (IOException e) {
			LOGGER.error("Caught exception", e);
		}
		return files;
	}

}
