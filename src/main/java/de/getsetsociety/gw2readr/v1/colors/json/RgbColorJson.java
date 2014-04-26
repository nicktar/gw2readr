package de.getsetsociety.gw2readr.v1.colors.json;

public class RgbColorJson {

	private Integer red;
	private Integer green;
	private Integer blue;

	public RgbColorJson() {
		// empty
	}

	public RgbColorJson(Integer red, Integer green, Integer blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public Integer getRed() {
		return red;
	}

	public void setRed(Integer red) {
		this.red = red;
	}

	public Integer getGreen() {
		return green;
	}

	public void setGreen(Integer green) {
		this.green = green;
	}

	public Integer getBlue() {
		return blue;
	}

	public void setBlue(Integer blue) {
		this.blue = blue;
	}

}
