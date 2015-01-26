package de.getsetsociety.gw2readr.v1.factories;

import de.getsetsociety.gw2readr.v1.factories.interfaces.IFileInfoEntityFactory;
import de.getsetsociety.gw2readr.v1.files.entites.FileInfo;
import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;

public class FileInfoEntityFactory implements IFileInfoEntityFactory {

	@Override
	public IFileInfo newFileInfo() {
		return new FileInfo();
	}

}
