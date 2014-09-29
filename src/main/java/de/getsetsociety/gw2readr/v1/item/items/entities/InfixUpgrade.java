
package de.getsetsociety.gw2readr.v1.item.items.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseAttributeModifier;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseBuff;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBaseInfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.enums.Attribute;

public class InfixUpgrade implements IBaseInfixUpgrade<Attribute> {

	private List<IBaseAttributeModifier<Attribute>> attributes = new ArrayList<>();
	private IBaseBuff buff;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#getAttributes()
	 */
	@Override
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
