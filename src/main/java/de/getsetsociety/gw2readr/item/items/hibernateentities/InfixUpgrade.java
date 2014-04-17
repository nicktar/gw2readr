
package de.getsetsociety.gw2readr.item.items.hibernateentities;

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

import de.getsetsociety.gw2readr.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.item.items.interfaces.IInfixUpgrade;

@Table
@Entity
public class InfixUpgrade implements IInfixUpgrade {
	
	private Integer id;
   	private List<IAttributeModifier> attributes = new ArrayList<>();
   	private IBuff buff; 

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
	public List<IAttributeModifier> getAttributes(){
		return this.attributes;
	}
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#setAttributes(java.util.List)
	 */
	@Override
	public void setAttributes(List<IAttributeModifier> attributes){
		this.attributes = attributes;
	}
	
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#getBuff()
	 */
	@Override
	@ManyToOne(targetEntity=Buff.class, cascade=CascadeType.ALL)
	public IBuff getBuff() {
		return buff;
	}
	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#setBuff(de.getsetsociety.armory.items.IBuff)
	 */
	@Override
	public void setBuff(IBuff buff) {
		this.buff = buff;
	}
}
