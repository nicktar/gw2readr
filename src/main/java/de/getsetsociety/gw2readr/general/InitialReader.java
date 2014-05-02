package  de.getsetsociety.gw2readr.general;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.general.factories.HibernateItemEntityFactory;
import de.getsetsociety.gw2readr.general.factories.HibernateRecipeEntityFactory;
import de.getsetsociety.gw2readr.v1.item.EntityFactoryProvider;
import de.getsetsociety.gw2readr.v1.item.allitems.json.AllItems;
import de.getsetsociety.gw2readr.v1.item.allrecipes.json.AllRecipesReader;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Item;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBaseItem;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;
import de.getsetsociety.gw2readr.v1.item.recipes.RecipeReader;
import de.getsetsociety.gw2readr.v1.item.recipes.hibernateentities.Recipe;

public class InitialReader {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("de.getsetsociety.gw2readr");

	private EntityManager em = emf.createEntityManager();

	public static void main(String... args) {
		EntityFactoryProvider.setItemEntityFactory(new HibernateItemEntityFactory());
		EntityFactoryProvider.setRecipeEntityFactory(new HibernateRecipeEntityFactory());
		new InitialReader();
	}

	public InitialReader() {
		RecipeReader rr = new RecipeReader();
		Integer count = 0;
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
//		for (Integer i: new AllRecipesReader().readAllRecipes()) {
//			Recipe r = (Recipe)rr.readRecipe(i);
//			if (em.find(Recipe.class, i) == null) {
//				em.persist(r);
//			} else {
//				em.merge(r);
//			}
//			if (++count % 100 == 0) {
//				transaction.commit();
//				transaction = em.getTransaction();
//				transaction.begin();
//			}
//		}
		ObjectMapper mapper = new ObjectMapper();
		String content = "";
		try {
			List<Integer> items = mapper.readValue(ContentLoader.getItemsUrlContent(), AllItems.class).getItems();

			for (Integer i: items) {
				try {
					//if (em.find(Item.class, i) == null) {

						content = ContentLoader.getItemUrlContent(String.valueOf(i), Language.English);
						ItemJson<? extends Item> item = mapper.readValue(content, ItemJson.class);
						IBaseItem entity = item.getEntity();
						try {
						if (em.find(Item.class, i) == null) {
							em.persist(entity);
						} else {
							em.merge(entity);
						}
						} catch (PersistenceException e) {
							e.printStackTrace();
						}
						count++;
						if (count%100 == 0) {
							transaction.commit();
							transaction = em.getTransaction();
							transaction.begin();
							System.out.println(count);
						}
						//Thread.sleep(1000);
					//}
				} catch (IOException e) {
					System.out.println(content);
					e.printStackTrace();
				}

			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			System.out.println(count + " items gelesen");
			System.out.println(content);
			if (transaction.isActive() && !transaction.getRollbackOnly()) {
				transaction.commit();
			}
			em.close();
			emf.close();
		}
	}

}
