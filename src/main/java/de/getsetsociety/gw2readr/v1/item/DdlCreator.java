package  de.getsetsociety.gw2readr.v1.item;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQLDialect;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Armor;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.AttributeModifier;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.BackItem;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Bag;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Buff;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Consumable;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Container;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.CraftingMaterial;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Gizmo;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.InfixUpgrade;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.MiniPet;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Trinket;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Trophy;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Weapon;

public class DdlCreator {

	public static void main(String[] args) {
		Configuration conf = new AnnotationConfiguration();
		conf.setProperty(Environment.DIALECT, MySQLDialect.class.getName());
		conf.setProperty("hbm2ddl", "update");
		conf.addAnnotatedClass(Armor.class);
		conf.addAnnotatedClass(Buff.class);
		conf.addAnnotatedClass(InfixUpgrade.class);
		conf.addAnnotatedClass(AttributeModifier.class);
		conf.addAnnotatedClass(BackItem.class);
		conf.addAnnotatedClass(Bag.class);
		conf.addAnnotatedClass(Consumable.class);
		conf.addAnnotatedClass(Container.class);
		conf.addAnnotatedClass(CraftingMaterial.class);
		conf.addAnnotatedClass(Gizmo.class);
		conf.addAnnotatedClass(MiniPet.class);
		conf.addAnnotatedClass(Trinket.class);
		conf.addAnnotatedClass(Trophy.class);
		conf.addAnnotatedClass(Weapon.class);
		
		
		SchemaExport e = new SchemaExport(conf);
		e.create(true, false);
	}

}
