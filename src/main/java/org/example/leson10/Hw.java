package org.example.leson10;

import java.util.Arrays;
import java.util.Scanner;

public class Hw {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Введення першого рядка
    System.out.print("Введіть перший рядок: ");
    String str1 = scanner.nextLine();

    // Введення другого рядка
    System.out.print("Введіть другий рядок: ");
    String str2 = scanner.nextLine();

    // Перевірка, чи є рядки анаграмами
    if (areAnagrams(str1, str2)) {
        System.out.println("Yes, рядки є анаграмами.");
    } else {
        System.out.println("No, рядки не є анаграмами.");
    }
}

    // Метод для перевірки, чи є два рядки анаграмами
    public static boolean areAnagrams(String str1, String str2) {
        // Перетворення рядків у масиви символів та видалення пробілів та символів пунктуації
        char[] charArray1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();

        // Сортування масивів
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Порівняння масивів для визначення, чи є анаграмами
        return Arrays.equals(charArray1, charArray2);
    }
}
