package org.example.Leson35;

public class PastaFactory {
    public Pasta createPasta(String pastaType) {
        switch (pastaType.toLowerCase()) {
            case "carbonara":
                return new CarbonaraPasta();
            case "bolognese":
                return new BolognesePasta();
            case "pesto":
                return new PestoPasta();
            default:
                throw new IllegalArgumentException("Invalid pasta type");
        }
    }
}

