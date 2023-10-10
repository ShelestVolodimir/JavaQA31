package org.example.Lesson5;

import java.util.Scanner;

public class Hw2ls5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір сторони квадрата: ");
        int size = scanner.nextInt();

        // Виведення незаповненого квадрата
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Перевірка, чи поточний рядок або стовпець - крайній
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Перехід на новий рядок після кожного рядка квадрата
        }

        scanner.close();
    }
}
