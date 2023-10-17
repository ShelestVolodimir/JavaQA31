package org.example.leson7;

import java.util.Random;
import java.util.Scanner;

public class Hw8 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Зчитуємо розмірність масиву n з клавіатури
    System.out.print("Введіть розмірність масиву n: ");
    int n = scanner.nextInt();

    // Створюємо масив для збереження випадкових літер
    char[] letters = new char[n];

    // Заповнюємо масив випадковими літерами
    Random random = new Random();
    for (int i = 0; i < n; i++) {
        letters[i] = (char) (random.nextInt(26) + 'a'); // Генеруємо випадкову малу латинську літеру
    }

    // Створюємо масив для підрахунку кількості кожної літери
    int[] letterCount = new int[26];

    // Підраховуємо кількість кожної літери
    for (int i = 0; i < n; i++) {
        char currentLetter = letters[i];
        int index = currentLetter - 'a';
        letterCount[index]++;
    }

    // Виводимо літери, які трапляються більше 3 разів
    System.out.println("Літери, які трапляються більше 3 разів:");
    for (int i = 0; i < 26; i++) {
        if (letterCount[i] > 3) {
            char letter = (char) (i + 'a');
            System.out.println(letter + ": " + letterCount[i] + " рази");
        }
    }
}
}
