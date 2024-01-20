package org.example.Leson35;

public class Main {
    public static void main(String[] args) {
    PastaFactory pastaFactory = new PastaFactory();

    Pasta carbonara = pastaFactory.createPasta("Carbonara");
    carbonara.displayInfo();

    Pasta bolognese = pastaFactory.createPasta("Bolognese");
    bolognese.displayInfo();

    Pasta pesto = pastaFactory.createPasta("Pesto");
    pesto.displayInfo();
}
}

