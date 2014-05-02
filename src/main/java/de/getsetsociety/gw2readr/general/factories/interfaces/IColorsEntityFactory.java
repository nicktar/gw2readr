package de.getsetsociety.gw2readr.general.factories.interfaces;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor;


public interface IColorsEntityFactory {

	public abstract IBaseMaterial newBaseMaterial();

	public abstract IColor newColor();

	public abstract IRgbColor newRgbColor();
	
	public abstract IRgbColor newRgbColor(Integer red, Integer green, Integer blue);

}