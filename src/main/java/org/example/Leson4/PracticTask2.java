package org.example.Leson4;

import java.util.Scanner;

public class PracticTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");
        int num = sc.nextInt();
        System.out.println("Enter 1");
        int num1 = sc.nextInt();

        for (int i = num; i < num1; i++ ){
            if (i % 2 == 0 ){
                System.out.println(i);
            }

        }

    }
}
