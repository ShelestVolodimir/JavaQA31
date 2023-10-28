package org.example.Leson13;

import java.util.Random;
import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Введіть розмірність масиву (n): ");
    int n = scanner.nextInt();

    int[][] array = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            array[i][j] = random.nextInt(100);
        }
    }

    System.out.println("Масив:");

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(array[i][j] + "\t");
        }
        System.out.println();
    }

    int minElement = array[0][0];
    int maxElement = array[0][0];
    int minRow = 0;
    int minColumn = 0;
    int maxRow = 0;
    int maxColumn = 0;

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (array[i][j] < minElement) {
                minElement = array[i][j];
                minRow = i;
                minColumn = j;
            }
            if (array[i][j] > maxElement) {
                maxElement = array[i][j];
                maxRow = i;
                maxColumn = j;
            }
        }
    }

    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;

    System.out.println("Найменший елемент: " + minElement + " (рядок " + minRow + ", стовпець " + minColumn + ")");
    System.out.println("Найбільший елемент: " + maxElement + " (рядок " + maxRow + ", стовпець " + maxColumn + ")");
    System.out.println("Час виконання: " + executionTime + " мс");
}
}
