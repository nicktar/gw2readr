package de.getsetsociety.gw2readr.v2.commerce.listings.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer;
import de.getsetsociety.gw2readr.v2.factories.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v2.item.items.json.IEntityWrapper;

public class OfferJson implements IEntityWrapper<IOffer> {

	private IOffer entity;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();


	public OfferJson() {
		this.entity = EntityFactoryProvider.getCommerceEntityFactory().newOffer();
	}

	public OfferJson(IOffer entity) {
		this.entity = entity;
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer#getListings()
	 */
	@JsonProperty("listings")
	public Integer getListings() {
		return entity.getListings();
	}

	/**
	 * @param listings
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer#setListings(java.lang.Integer)
	 */
	public void setListings(Integer listings) {
		entity.setListings(listings);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer#getUnitPrice()
	 */
	@JsonProperty("unit_price")
	public Integer getUnitPrice() {
		return entity.getUnitPrice();
	}

	/**
	 * @param unitPrice
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer#setUnitPrice(java.lang.Integer)
	 */
	public void setUnitPrice(Integer unitPrice) {
		entity.setUnitPrice(unitPrice);
	}

	/**
	 * @return
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer#getQuantity()
	 */
	@JsonProperty("quantity")
	public Integer getQuantity() {
		return entity.getQuantity();
	}

	/**
	 * @param quantity
	 * @see de.getsetsociety.gw2readr.v2.commerce.listings.interfaces.IOffer#setQuantity(java.lang.Integer)
	 */
	public void setQuantity(Integer quantity) {
		entity.setQuantity(quantity);
	}

	/**
	 * @return the entity
	 */
	@Override
	public IOffer getEntity() {
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(IOffer entity) {
		this.entity = entity;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}