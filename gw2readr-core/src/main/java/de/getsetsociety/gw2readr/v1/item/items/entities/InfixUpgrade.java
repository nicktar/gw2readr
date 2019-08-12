
package de.getsetsociety.gw2readr.v1.item.items.entities;

import de.getsetsociety.gw2readr.v1.item.items.interfaces.IAttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBuff;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IInfixUpgrade;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class InfixUpgrade implements IInfixUpgrade {

	private Integer id;
	private List<IAttributeModifier> attributes = new ArrayList<>();
	private IBuff buff;
}
