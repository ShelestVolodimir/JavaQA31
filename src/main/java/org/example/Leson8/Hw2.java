package org.example.Leson8;

import java.util.Scanner;

public class Hw2 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Зчитуємо n з клавіатури
    System.out.print("Введіть позицію n: ");
    int n = scanner.nextInt();

    // Ініціалізуємо рядок і додамо числа до нього
    StringBuilder stringBuilder = new StringBuilder();
    int number = 1;
    while (stringBuilder.length() < n) {
        stringBuilder.append(number);
        number++;
    }

    String result = stringBuilder.toString();

    // Виводимо отриману цифру на позиції n
    if (n <= result.length()) {
        char digit = result.charAt(n - 2); // Враховуємо, що індексація починається з 0
        System.out.println("Цифра на позиції " + n + " - " + digit);
    } else {
        System.out.println("Позиція n перевищує довжину рядка.");
    }
}
}
