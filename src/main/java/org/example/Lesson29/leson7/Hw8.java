package org.example.Lesson29.leson7;

import java.util.Random;
import java.util.Scanner;

public class Hw8 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Введіть розмірність масиву n: ");
    int n = scanner.nextInt();

    char[] letters = new char[n];

    Random random = new Random();
    for (int i = 0; i < n; i++) {
        letters[i] = (char) (random.nextInt(26) + 'a');
    }

    int[] letterCount = new int[26];

    for (int i = 0; i < n; i++) {
        char currentLetter = letters[i];
        int index = currentLetter - 'a';
        letterCount[index]++;
    }

    System.out.println("Літери, які трапляються більше 3 разів:");
    for (int i = 0; i < 26; i++) {
        if (letterCount[i] > 3) {
            char letter = (char) (i + 'a');
            System.out.println(letter + ": " + letterCount[i] + " рази");
        }
    }
}
}
