package de.getsetsociety.gw2readr.v1.map.continents.hibernateentities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v1.map.continents.interfaces.IContinent;

/**
 * Continent Entity
 *
 */
@Entity
@Table
public class Continent implements IContinent {
	
	private Integer id;
	private String name;
	private Integer continentXDim;
	private Integer continentYDim;
	private Integer minZoom;
	private Integer maxZoom;
	private List<Integer> floors = new ArrayList<Integer>();

	/**
	 * @return the id
	 */
	@Id
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#getName()
	 */
	@Override
	@Column
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#getContinentXDim()
	 */
	@Override
	@Column
	public Integer getContinentXDim() {
		return continentXDim;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#setContinentXDim(java.lang.Integer)
	 */
	@Override
	public void setContinentXDim(Integer continentXDim) {
		this.continentXDim = continentXDim;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#getContinentYDim()
	 */
	@Override
	@Column
	public Integer getContinentYDim() {
		return continentYDim;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#setContinentYDim(java.lang.Integer)
	 */
	@Override
	public void setContinentYDim(Integer continentYDim) {
		this.continentYDim = continentYDim;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#getMinZoom()
	 */
	@Override
	@Column
	public Integer getMinZoom() {
		return minZoom;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#setMinZoom(java.lang.Integer)
	 */
	@Override
	public void setMinZoom(Integer minZoom) {
		this.minZoom = minZoom;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#getMaxZoom()
	 */
	@Override
	@Column
	public Integer getMaxZoom() {
		return maxZoom;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#setMaxZoom(java.lang.Integer)
	 */
	@Override
	public void setMaxZoom(Integer maxZoom) {
		this.maxZoom = maxZoom;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#getFloors()
	 */
	@Override
	@ElementCollection(targetClass=Integer.class)
	public List<Integer> getFloors() {
		return floors;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.v1.map.continents.entities.IContinent#setFloors(java.util.List)
	 */
	@Override
	public void setFloors(List<Integer> floors) {
		this.floors = floors;
	}

}
