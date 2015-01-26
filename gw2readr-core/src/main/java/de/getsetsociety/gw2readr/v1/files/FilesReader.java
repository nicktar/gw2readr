package de.getsetsociety.gw2readr.v1.files;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;

public class FilesReader {

	private final static transient Logger logger = Logger.getLogger(FilesReader.class); 
	private static final Object lock = new Object();
	private volatile static ObjectMapper mapper;
	{{
		if (mapper == null) {
			synchronized (lock) {
				if (mapper == null) {
					mapper = new ObjectMapper();
				}
			}
		}
	}}

	/**
	 * TODO find a way to implement this using Jackson Annotations
	 * @return all File Infos
	 */
	@SuppressWarnings("unchecked")
	public Map<String, IFileInfo> readFiles() {
		Map<String, Map<String, Object>> tempFiles = null;
		Map<String, IFileInfo> files = new HashMap<String, IFileInfo>();
		try {
			String content = ContentLoader.getFilesUrlContent();
			tempFiles = mapper.readValue(content, LinkedHashMap.class); 
			for (Entry<String, Map<String, Object>> e: tempFiles.entrySet()) {
				IFileInfo file = EntityFactoryProvider.getFileInfoEntityFactory().newFileInfo();
				file.setFileId((Integer)e.getValue().get("file_id"));
				file.setSignature((String)e.getValue().get("signature"));
				file.setName(e.getKey());
				
				files.put(e.getKey(), file);
			}
		} catch (IOException e) {
			logger.error("Caught exception", e);
		}
		return files;
	}

}
