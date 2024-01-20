package org.example.HotDogs;

public class Main {
    public static void main(String[] args) {
    HotDog hotDog = new HotDog();

    // Обираємо стандартні рецепти
    hotDog.addRecipe(() -> System.out.println("Cooking sausage"));
    hotDog.addRecipe(() -> System.out.println("Adding ketchup"));
    hotDog.addRecipe(() -> System.out.println("Adding mustard"));

    // Додаємо інгредієнти на вибір користувача
    hotDog.addIngredient("Mayonnaise");
    hotDog.addIngredient("Onion");
    hotDog.addIngredient("Chili");

    // Приготувати хот-дог
    hotDog.cook();
}
}

