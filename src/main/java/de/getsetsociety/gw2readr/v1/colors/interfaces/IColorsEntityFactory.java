package de.getsetsociety.gw2readr.v1.colors.interfaces;


public interface IColorsEntityFactory {

	public abstract IBaseMaterial newBaseMaterial();

	public abstract IColor newColor();

	public abstract IRgbColor newRgbColor();
	
	public abstract IRgbColor newRgbColor(Integer red, Integer green, Integer blue);

}