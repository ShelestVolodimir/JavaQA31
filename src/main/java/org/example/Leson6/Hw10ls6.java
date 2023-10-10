package org.example.Leson6;

import java.util.Random;
import java.util.Scanner;

public class Hw10ls6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть розмір масиву (n): ");
        int n = sc.nextInt();

        int[] array = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(34);
        }

        int foundIndex = -1;

        for (int i = 1; i < n - 1; i++) {
            if (array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("Початковий масив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        if (foundIndex != -1) {
            System.out.println("Індекс знайденого елемента: " + foundIndex);
        } else {
            System.out.println("Знайдено елемент, який ділиться без остачі на значення елемента зліва і справа.");
        }

    }
}