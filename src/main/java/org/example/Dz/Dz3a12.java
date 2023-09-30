package org.example.Dz;

import java.util.Scanner;

public class Dz3a12 {
    public static void main(String[] args) {
        System.out.println("Введіть шестизначне число");
        int x = new Scanner(System.in).nextInt();

        int number = x; // Замініть це число на те, яке ви хочете перевірити
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Кількість цифр в числі: " + count);
    }
}
