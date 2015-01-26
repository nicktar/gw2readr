package de.getsetsociety.gw2readr.v1.colors.hibernateentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor;

@Entity
@Table
public class RgbColor implements IRgbColor {

	private Integer red;
	private Integer green;
	private Integer blue;
	private Integer id;

	public RgbColor() {
		// empty
	}

	public RgbColor(Integer red, Integer green, Integer blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IRgbColor#getRed()
	 */
	@Override
	@Column
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
	@Column
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
	@Column
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
