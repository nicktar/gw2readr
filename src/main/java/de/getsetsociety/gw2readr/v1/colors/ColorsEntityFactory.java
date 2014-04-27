package de.getsetsociety.gw2readr.v1.colors;

import de.getsetsociety.gw2readr.v1.colors.entities.BaseMaterial;
import de.getsetsociety.gw2readr.v1.colors.entities.Color;
import de.getsetsociety.gw2readr.v1.colors.entities.RgbColor;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColorsEntityFactory;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor;

public class ColorsEntityFactory implements IColorsEntityFactory {
	
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.IColorsEntityFactory#newBaseMaterial()
	 */
	@Override
	public IBaseMaterial newBaseMaterial() {
		return new BaseMaterial();
	}
	
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.IColorsEntityFactory#newColor()
	 */
	@Override
	public IColor newColor() {
		return new Color();
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.IColorsEntityFactory#newRgbColor()
	 */
	@Override
	public IRgbColor newRgbColor() {
		return new RgbColor();
	}

	@Override
	public IRgbColor newRgbColor(Integer red, Integer green, Integer blue) {
		return new RgbColor(red, green, blue);
	}
}
