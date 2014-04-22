package  de.getsetsociety.gw2readr.v1.item;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.enums.Language;
import de.getsetsociety.gw2readr.v1.item.allitems.json.AllItems;
import de.getsetsociety.gw2readr.v1.item.items.HibernateItemEntityFactory;
import de.getsetsociety.gw2readr.v1.item.items.hibernateentities.Item;
import de.getsetsociety.gw2readr.v1.item.items.interfaces.IBaseItem;
import de.getsetsociety.gw2readr.v1.item.items.json.ItemJson;

public class InitialReader {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("de.getsetsociety.gw2readr");

	private EntityManager em = emf.createEntityManager();

	public static void main(String... args) {
		EntityFactoryProvider.setFactory(new HibernateItemEntityFactory());
		new InitialReader();
	}

	public InitialReader() {
		ObjectMapper mapper = new ObjectMapper();
		String content = "";
		Integer count = 0;
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			List<Integer> items = mapper.readValue(ContentLoader.getItemsUrlContent(), AllItems.class).getItems();

			for (Integer i: items) {
				try {
					//if (em.find(Item.class, i) == null) {

						content = ContentLoader.getItemUrlContent(String.valueOf(i), Language.English);
						ItemJson<? extends Item> item = mapper.readValue(content, ItemJson.class);
						IBaseItem entity = item.getEntity();
						if (em.find(Item.class, i) == null) {
							em.persist(entity);
						} else {
							em.merge(entity);
						}
						
						count++;
						if (count%10 == 0) {
							transaction.commit();
							transaction = em.getTransaction();
							transaction.begin();
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
