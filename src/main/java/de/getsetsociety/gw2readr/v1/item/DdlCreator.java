package  de.getsetsociety.gw2readr.v1.item;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQLDialect;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities.Ingredient;
import de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities.Recipe;

public class DdlCreator {

	public static void main(String[] args) {
		Configuration conf = new AnnotationConfiguration();
		conf.setProperty(Environment.DIALECT, MySQLDialect.class.getName());
		conf.setProperty("hbm2ddl", "update");
//		conf.addAnnotatedClass(Armor.class);
//		conf.addAnnotatedClass(Buff.class);
//		conf.addAnnotatedClass(InfixUpgrade.class);
//		conf.addAnnotatedClass(AttributeModifier.class);
//		conf.addAnnotatedClass(BackItem.class);
//		conf.addAnnotatedClass(Bag.class);
//		conf.addAnnotatedClass(Consumable.class);
//		conf.addAnnotatedClass(Container.class);
//		conf.addAnnotatedClass(CraftingMaterial.class);
//		conf.addAnnotatedClass(Gizmo.class);
//		conf.addAnnotatedClass(MiniPet.class);
//		conf.addAnnotatedClass(Trinket.class);
//		conf.addAnnotatedClass(Trophy.class);
//		conf.addAnnotatedClass(Weapon.class);
		conf.addAnnotatedClass(Recipe.class);
		conf.addAnnotatedClass(Ingredient.class);
		
		
		SchemaExport e = new SchemaExport(conf);
		e.create(true, false);
	}

}
