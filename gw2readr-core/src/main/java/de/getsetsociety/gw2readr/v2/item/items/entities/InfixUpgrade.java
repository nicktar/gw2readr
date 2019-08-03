
package de.getsetsociety.gw2readr.v2.item.items.entities;

import java.util.ArrayList;
import java.util.List;

import de.getsetsociety.gw2readr.v2.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v2.item.items.interfaces.IInfixUpgrade;
import lombok.Data;

@Data
public class InfixUpgrade implements IInfixUpgrade {

	private Integer id;
	private List<IAttributeModifier> attributes = new ArrayList<>();
	private IBuff buff;
}
