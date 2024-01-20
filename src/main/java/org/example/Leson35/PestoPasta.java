package org.example.Leson35;

class PestoPasta extends Pasta{
    public PestoPasta() {
        this.type = "Pesto";
        this.sauce = "Basil Pesto";
        this.filling = "Cherry Tomatoes";
        this.toppings = "Pine Nuts";
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Sauce: " + sauce);
        System.out.println("Filling: " + filling);
        System.out.println("Toppings: " + toppings);
    }
}

