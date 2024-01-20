package org.example.Leson35;

class BolognesePasta extends Pasta {
    public BolognesePasta() {
        this.type = "Bolognese";
        this.sauce = "Tomato and Meat Sauce";
        this.filling = "Ground Beef";
        this.toppings = "Grated Mozzarella";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Sauce: " + sauce);
        System.out.println("Filling: " + filling);
        System.out.println("Toppings: " + toppings);
    }
}
