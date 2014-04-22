package de.getsetsociety.gw2readr.v1.item.items.hibernateentities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import de.getsetsociety.gw2readr.v1.item.items.enums.UpgradeComponentFlag;
import static org.junit.Assert.*;

public class LoadItem21134Test {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("de.getsetsociety.gw2readr");

	private EntityManager em = emf.createEntityManager();
	
	@Test
	public void testLoading() {
		UpgradeComponent uc = em.find(UpgradeComponent.class, 21134);
		assertNotNull(uc);
		assertNotNull(uc.getUpgradeComponentFlags());
		for (UpgradeComponentFlag f: uc.getUpgradeComponentFlags()) {
			System.out.println(f.ordinal());
		}
	}

	
	@Test
	public void testEnum() {
		for (UpgradeComponentFlag uc: UpgradeComponentFlag.values()) {
			System.out.println(uc.ordinal() + " - " + uc.name());
		}
	}
}
