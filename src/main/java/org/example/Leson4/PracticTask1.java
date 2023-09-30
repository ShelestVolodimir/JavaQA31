package org.example.Leson4;

import java.util.Scanner;

public class PracticTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int first = sc.nextInt();
        System.out.println("Enter second num");
        int second = sc.nextInt();

        for (int i = first; i < second; i++){ //i+=5
            System.out.println(" i = " + i);
        }
    }
}
