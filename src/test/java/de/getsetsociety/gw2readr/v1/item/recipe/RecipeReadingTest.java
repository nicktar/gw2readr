package de.getsetsociety.gw2readr.v1.item.recipe;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.getsetsociety.gw2readr.general.ContentLoader;
import de.getsetsociety.gw2readr.v1.item.allrecipes.json.AllRecipesReader;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.Disciplines;
import de.getsetsociety.gw2readr.v1.item.recipes.enums.RecipeType;
import de.getsetsociety.gw2readr.v1.item.recipes.interfaces.IRecipe;
import de.getsetsociety.gw2readr.v1.item.recipes.json.RecipeJson;

public class RecipeReadingTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testReadingRecipe2940() {
        String content = null;
        RecipeJson recipeJson = null;
        try {
            content = ContentLoader.getRecipeUrlContent(String.valueOf(2940));
            recipeJson = mapper.readValue(content, RecipeJson.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected Exception");
        }
        assertNotNull(recipeJson);
        IRecipe recipe = recipeJson.getEntity();
        assertEquals(Integer.valueOf(2940), recipe.getId());
        assertEquals(RecipeType.Dessert, recipe.getType());
        assertEquals(Integer.valueOf(12314), recipe.getOutputItemId());
        assertEquals(Integer.valueOf(2), recipe.getOutputItemCount());
        assertEquals(Integer.valueOf(150), recipe.getMinRating());
        assertEquals(Integer.valueOf(1000), recipe.getTimeToCraftMs());
        assertEquals(1, recipe.getDisciplines().size());
        assertTrue(recipe.getDisciplines().contains(Disciplines.Chef));
        assertTrue(recipe.getFlags().isEmpty());
        assertEquals(2, recipe.getIngredients().size());

        for (Entry<String, Object> e : recipeJson.getAdditionalProperties().entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

    public void testReadAll() {
        Integer startAt = 7316;
        Integer read = 0;
        List<Integer> readAllRecipes = new AllRecipesReader().readAllRecipes();
        int skipped = readAllRecipes.indexOf(startAt);
        List<Integer> recipesToRead = readAllRecipes.subList(skipped, readAllRecipes.size());
        for (Integer i : recipesToRead) {
            read++;
            String content = null;
            RecipeJson recipeJson = null;
            try {
                content = ContentLoader.getRecipeUrlContent(String.valueOf(i));
                recipeJson = mapper.readValue(content, RecipeJson.class);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                System.out.println(content);
                fail(String.format("Unexpected Exception after %d skipped and %d read recipes", skipped, read));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(content);
                fail(String.format("Unexpected Exception after %d skipped and %d read recipes. Content:\n%s", skipped, read, content));
            }
            assertNotNull(recipeJson);
        }
    }
}
