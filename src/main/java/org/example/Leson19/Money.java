package org.example.Leson19;

public class Money {private long hryvnia;
    private byte kopecks;

    public Money(long hryvnia, byte kopecks) {
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    public long getHryvnia() {
        return hryvnia;
    }

    public void setHryvnia(long hryvnia) {
        this.hryvnia = hryvnia;
    }

    public byte getKopecks() {
        return kopecks;
    }

    public void setKopecks(byte kopecks) {
        this.kopecks = kopecks;
    }

    public void display() {
        System.out.println(hryvnia + "," + String.format("%02d", kopecks));
    }

    public Money add(Money other) {
        long sumHryvnia = this.hryvnia + other.hryvnia;
        int sumKopecks = this.kopecks + other.kopecks;

        if (sumKopecks >= 100) {
            sumHryvnia++;
            sumKopecks -= 100;
        }

        return new Money(sumHryvnia, (byte) sumKopecks);
    }

    public Money subtract(Money other) {
        long diffHryvnia = this.hryvnia - other.hryvnia;
        int diffKopecks = this.kopecks - other.kopecks;

        if (diffKopecks < 0) {
            diffHryvnia--;
            diffKopecks += 100;
        }

        return new Money(diffHryvnia, (byte) diffKopecks);
    }

    public Money divide(int divisor) {
        long resultHryvnia = this.hryvnia / divisor;
        int resultKopecks = (int) ((this.hryvnia % divisor * 100 + this.kopecks) / divisor);

        return new Money(resultHryvnia, (byte) resultKopecks);
    }

    public Money divide(double divisor) {
        double totalKopecks = this.hryvnia * 100 + this.kopecks;
        double result = totalKopecks / divisor;

        long resultHryvnia = (long) (result / 100);
        int resultKopecks = (int) (result % 100);

        return new Money(resultHryvnia, (byte) resultKopecks);
    }

    public Money multiply(double factor) {
        double totalKopecks = this.hryvnia * 100 + this.kopecks;
        double result = totalKopecks * factor;

        long resultHryvnia = (long) (result / 100);
        int resultKopecks = (int) (result % 100);

        return new Money(resultHryvnia, (byte) resultKopecks);
    }

    public boolean equals(Money other) {
        return this.hryvnia == other.hryvnia && this.kopecks == other.kopecks;
    }

    public boolean greaterThan(Money other) {
        return (this.hryvnia > other.hryvnia) || (this.hryvnia == other.hryvnia && this.kopecks > other.kopecks);
    }

    public boolean lessThan(Money other) {
        return (this.hryvnia < other.hryvnia) || (this.hryvnia == other.hryvnia && this.kopecks < other.kopecks);
    }

    public static void main(String[] args) {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 25);

        // Додавання
        Money sum = money1.add(money2);
        System.out.print("Додавання: ");
        sum.display();

        // Віднімання
        Money difference = money1.subtract(money2);
        System.out.print("Віднімання: ");
        difference.display();

        // Ділення суми на ціле число
        Money division = money1.divide(2);
        System.out.print("Ділення на ціле число: ");
        division.display();

        // Ділення суми на дробове число
        Money divisionDouble = money1.divide(2.5);
        System.out.print("Ділення на дробове число: ");
        divisionDouble.display();

        // Множення на дробове число
        Money multiplication = money1.multiply(1.5);
        System.out.print("Множення на дробове число: ");
        multiplication.display();

        // Порівняння
        System.out.println("Порівняння:");

        if (money1.equals(money2)) {
            System.out.println("Рівні");
        } else {
            System.out.println("Різні");
        }

        if (money1.greaterThan(money2)) {
            System.out.println("money1 більше за money2");
        } else {
            System.out.println("money1 менше або рівне money2");
        }

        if (money1.lessThan(money2)) {
            System.out.println("money1 менше за money2");
        } else {
            System.out.println("money1 більше або рівне money2");
        }
    }
}
