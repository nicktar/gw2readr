package de.getsetsociety.gw2readr.v1.colors.entities;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor;

public class RgbColor implements IRgbColor {

	private Integer red;
	private Integer green;
	private Integer blue;

	public RgbColor() {
		// empty
	}

	public RgbColor(Integer red, Integer green, Integer blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IRgbColor#getRed()
	 */
	@Override
	public Integer getRed() {
		return red;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IRgbColor#setRed(java.lang.Integer)
	 */
	@Override
	public void setRed(Integer red) {
		this.red = red;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IRgbColor#getGreen()
	 */
	@Override
	public Integer getGreen() {
		return green;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IRgbColor#setGreen(java.lang.Integer)
	 */
	@Override
	public void setGreen(Integer green) {
		this.green = green;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IRgbColor#getBlue()
	 */
	@Override
	public Integer getBlue() {
		return blue;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IRgbColor#setBlue(java.lang.Integer)
	 */
	@Override
	public void setBlue(Integer blue) {
		this.blue = blue;
	}

}
