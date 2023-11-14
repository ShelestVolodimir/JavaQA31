package org.example.Lesson20;

public class GeometryCalculator {
    private static int calculationCount = 0;

    // Статичний метод для підрахунку площі трикутника за формулою Герона
    public static double calculateTriangleArea(double a, double b, double c) {
        calculationCount++;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Статичний метод для підрахунку площі прямокутника
    public static double calculateRectangleArea(double length, double width) {
        calculationCount++;
        return length * width;
    }

    // Статичний метод для підрахунку площі квадрата
    public static double calculateSquareArea(double side) {
        calculationCount++;
        return side * side;
    }

    // Статичний метод для підрахунку площі ромба
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        calculationCount++;
        return (diagonal1 * diagonal2) / 2;
    }

    // Статичний метод для отримання кількості підрахунків площі
    public static int getCalculationCount() {
        return calculationCount;
    }

    public static void main(String[] args) {
        // Приклад використання класу GeometryCalculator
        double triangleArea = GeometryCalculator.calculateTriangleArea(3, 4, 5);
        System.out.println("Площа трикутника: " + triangleArea);

        double rectangleArea = GeometryCalculator.calculateRectangleArea(6, 8);
        System.out.println("Площа прямокутника: " + rectangleArea);

        double squareArea = GeometryCalculator.calculateSquareArea(5);
        System.out.println("Площа квадрата: " + squareArea);

        double rhombusArea = GeometryCalculator.calculateRhombusArea(6, 8);
        System.out.println("Площа ромба: " + rhombusArea);

        int calculationCount = GeometryCalculator.getCalculationCount();
        System.out.println("Кількість підрахунків площі: " + calculationCount);
    }
}
