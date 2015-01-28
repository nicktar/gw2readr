package de.getsetsociety.gw2readr.v1.colors.entities;

import de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IColor;
import de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor;

public class Color implements IColor {

	private Integer id;
	private String name;
	private IRgbColor baseRgb;
	private IBaseMaterial leather;
	private IBaseMaterial cloth;
	private IBaseMaterial metal;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#getId()
	 */
	@Override
	public Integer getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#getBaseRgb()
	 */
	@Override
	public IRgbColor getBaseRgb() {
		return baseRgb;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#setBaseRgb(de.getsetsociety.gw2readr.v1.colors.interfaces.IRgbColor)
	 */
	@Override
	public void setBaseRgb(IRgbColor baseRgb) {
		this.baseRgb = baseRgb;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#getLeather()
	 */
	@Override
	public IBaseMaterial getLeather() {
		return leather;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#setLeather(de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial)
	 */
	@Override
	public void setLeather(IBaseMaterial leather) {
		this.leather = leather;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#getCloth()
	 */
	@Override
	public IBaseMaterial getCloth() {
		return cloth;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#setCloth(de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial)
	 */
	@Override
	public void setCloth(IBaseMaterial cloth) {
		this.cloth = cloth;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#getMetal()
	 */
	@Override
	public IBaseMaterial getMetal() {
		return metal;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.colors.entites.IColor#setMetal(de.getsetsociety.gw2readr.v1.colors.interfaces.IBaseMaterial)
	 */
	@Override
	public void setMetal(IBaseMaterial metal) {
		this.metal = metal;
	}

}
