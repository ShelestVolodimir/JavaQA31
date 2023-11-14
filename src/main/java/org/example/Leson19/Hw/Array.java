package org.example.Leson19.Hw;

public class Array<T extends Comparable<T>> {
    private T[] arr;

    // Конструктор
    public Array(T[] arr) {
        this.arr = arr;
    }

    // Метод для відображення масиву
    public void display() {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Метод для пошуку максимального значення
    public T findMax() {
        if (arr.length == 0) {
            throw new IllegalStateException("Масив порожній.");
        }

        T maxVal = arr[0];
        for (T element : arr) {
            if (element.compareTo(maxVal) > 0) {
                maxVal = element;
            }
        }

        return maxVal;
    }

    // Метод для пошуку мінімального значення
    public T findMin() {
        if (arr.length == 0) {
            throw new IllegalStateException("Масив порожній.");
        }

        T minVal = arr[0];
        for (T element : arr) {
            if (element.compareTo(minVal) < 0) {
                minVal = element;
            }
        }

        return minVal;
    }

    // Метод для підрахунку середнього арифметичного значення
    public double calculateAverage() {
        if (arr.length == 0) {
            throw new IllegalStateException("Масив порожній.");
        }

        double sum = 0;
        for (T element : arr) {
            sum += Double.parseDouble(element.toString());
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        // Приклад використання параметризованого класу Array
        Integer[] intArray = {1, 5, 3, 7, 2};
        Array<Integer> integerArray = new Array<>(intArray);
        System.out.println("Масив цілих чисел:");
        integerArray.display();
        System.out.println("Максимальне значення: " + integerArray.findMax());
        System.out.println("Мінімальне значення: " + integerArray.findMin());
        System.out.println("Середнє арифметичне: " + integerArray.calculateAverage());

        Double[] doubleArray = {2.5, 1.0, 3.5, 2.0, 4.0};
        Array<Double> doubleArrayObject = new Array<>(doubleArray);
        System.out.println("\nМасив дійсних чисел:");
        doubleArrayObject.display();
        System.out.println("Максимальне значення: " + doubleArrayObject.findMax());
        System.out.println("Мінімальне значення: " + doubleArrayObject.findMin());
        System.out.println("Середнє арифметичне: " + doubleArrayObject.calculateAverage());
    }
}
