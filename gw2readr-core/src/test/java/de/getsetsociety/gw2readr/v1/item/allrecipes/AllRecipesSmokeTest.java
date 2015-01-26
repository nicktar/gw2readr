package de.getsetsociety.gw2readr.v1.item.allrecipes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import de.getsetsociety.gw2readr.v1.item.allrecipes.json.AllRecipesReader;

public class AllRecipesSmokeTest {
	
	@Test
	public void testLoadAllRecipeIdsWithoutException() {
		List<Integer> allIds = null;
		try {
			allIds = new AllRecipesReader().readAllRecipes();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Unexpected Exception");
		}
		assertNotNull(allIds);
		
	}
}
