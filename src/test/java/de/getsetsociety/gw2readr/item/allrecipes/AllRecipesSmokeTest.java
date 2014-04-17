package de.getsetsociety.gw2readr.item.allrecipes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import de.getsetsociety.gw2readr.item.allrecipes.json.AllRecipesReader;

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
