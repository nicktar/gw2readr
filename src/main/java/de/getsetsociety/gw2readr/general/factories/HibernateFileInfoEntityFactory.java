package de.getsetsociety.gw2readr.general.factories;

import de.getsetsociety.gw2readr.general.factories.interfaces.IFileInfoEntityFactory;
import de.getsetsociety.gw2readr.v1.files.hibernateentities.FileInfo;
import de.getsetsociety.gw2readr.v1.files.interfaces.IFileInfo;

public class HibernateFileInfoEntityFactory implements IFileInfoEntityFactory {

	@Override
	public IFileInfo newFileInfo() {
		return new FileInfo();
	}

}
