package org.example.Leson4;

import java.util.Scanner;

public class Task4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Введіть початок діапазону: ");
            int start = sc.nextInt();

            System.out.print("Введіть кінець діапазону: ");

            int end = sc.nextInt();

            for (int i = start; i <= end; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Fizz Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

            sc.close();
        }
    }

