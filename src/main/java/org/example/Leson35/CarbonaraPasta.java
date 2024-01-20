package org.example.Leson35;

class CarbonaraPasta extends Pasta {
    public CarbonaraPasta() {
        this.type = "Carbonara";
        this.sauce = "Creamy Alfredo";
        this.filling = "Bacon";
        this.toppings = "Parmesan Cheese";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Sauce: " + sauce);
        System.out.println("Filling: " + filling);
        System.out.println("Toppings: " + toppings);
    }
}
