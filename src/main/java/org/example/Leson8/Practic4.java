package org.example.Leson8;

import java.util.Scanner;

public class Practic4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть рядок: ");
    String input = scanner.nextLine().toLowerCase();

    String cleanedInput = input.replaceAll("[^a-zа-я]", "");

    if (isPalindrome(cleanedInput)) {
        System.out.println("Введений рядок є паліндромом.");
    } else {
        System.out.println("Введений рядок не є паліндромом.");
    }
}

    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
