
package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v0.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v0.item.items.interfaces.IInfixUpgrade;

public class InfixUpgrade implements IInfixUpgrade {

	private List<IAttributeModifier> attributes = new ArrayList<>();
	private IBuff buff;

	/* (non-Javadoc)
	 * @see de.getsetsociety.gw2readr.entities.IInfixUpgrade#getAttributes()
	 */
	@Override
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
