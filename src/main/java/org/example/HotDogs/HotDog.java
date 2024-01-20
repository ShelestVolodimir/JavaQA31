package org.example.HotDogs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HotDog {
    private List<HotDogRecipe> recipes = new ArrayList<>();
    private List<String> ingredients = new ArrayList<>();
    private static int orderCount = 0; // Змінна для зберігання кількості замовлень

    public void addRecipe(HotDogRecipe recipe) {
        recipes.add(recipe);
    }
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }
    public void cook() {
        System.out.println("Order #" + (++orderCount));
        System.out.println("Cooking hot dog with the following ingredients:");

        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }

        for (HotDogRecipe recipe : recipes) {
            recipe.cook();
        }
        saveToFile();
        calculateDiscount();
    }
    private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("hot_dog_orders.txt", true))) {
            writer.write("Order #" + orderCount + " Ingredients: " + ingredients);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void calculateDiscount() {
        if (orderCount >= 3) {
            double discount = 0.1 * orderCount; // 10% знижка за кожен замовлений хот-дог
            System.out.println("Discount applied: " + discount * 100 + "%");
        }
    }
}

