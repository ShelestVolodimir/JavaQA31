package org.example.Leson3;

import java.util.Scanner;

public class Dz312 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Введіть шестизначне число (номер квитка): ");
    int number = sc.nextInt();

    if (isLuckyTicket(number)) {
        System.out.println("Так");
    } else {
        System.out.println("Ні");
    }

}

    public static boolean isLuckyTicket(int number) {
        if (number < 100000 || number > 999999) {
            return false;
        }

        int a = number / 100000;
        int b = (number / 10000) % 10;
        int c = (number / 1000) % 10;
        int a1 = (number / 100) % 10;
        int b1 = (number / 10) % 10;
        int c1 = number % 10;

        return (a + b + c) == (a1 + b1 + c1);
    }
}

