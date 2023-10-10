package org.example.Leson4;

import java.util.Scanner;

public class Hw1ls4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть число a: ");
        int a = sc.nextInt();

        System.out.print("Введіть число b: ");
        int b = sc.nextInt();

        System.out.print("Введіть число c: ");
        int c = sc.nextInt();

        System.out.println("Числа, які є одночасно кратними " + a + ", " + b + " і " + c + " від 0 до 100000:");
        for (int i = 0; i <= 100000; i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                System.out.println(i);
            }
        }
    }
}

