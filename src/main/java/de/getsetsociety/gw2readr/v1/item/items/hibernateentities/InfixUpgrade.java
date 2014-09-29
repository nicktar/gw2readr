
package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseAttributeModifier;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;

@Table
@Entity
public class InfixUpgrade implements IBaseInfixUpgrade<Attribute> {

	private Integer id;
	private List<IBaseAttributeModifier<Attribute>> attributes = new ArrayList<>();
	private IBaseBuff buff;

	@Id
	@Column
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#getAttributes()
	 */
	@Override
	@OneToMany(cascade=CascadeType.ALL, targetEntity=AttributeModifier.class)
	public List<IBaseAttributeModifier<Attribute>> getAttributes(){
		return this.attributes;
	}
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#setAttributes(java.util.List)
	 */
	@Override
	public void setAttributes(List<IBaseAttributeModifier<Attribute>> attributes){
		this.attributes = attributes;
	}

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#getBuff()
	 */
	@Override
	@ManyToOne(targetEntity=Buff.class, cascade=CascadeType.ALL)
	public IBaseBuff getBuff() {
		return buff;
	}
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#setBuff(de.getsetsociety.armory.items.IBuff)
	 */
	@Override
	public void setBuff(IBaseBuff buff) {
		this.buff = buff;
	}
}
