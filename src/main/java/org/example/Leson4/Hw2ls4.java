package org.example.Leson4;

import java.util.Scanner;

public class Hw2ls4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int palindrom = sc.nextInt();
        System.out.println(palindrom);

        String palStr = String.valueOf(palindrom);

        boolean b = false;


        for (int i = 0, j = palStr.length() - 1; i < j; i++, j--) {
            if (palStr.charAt(i) == palStr.charAt(j)) {
                b = true;
            } else {
                b = false;
                break;
            }
        }


        if (b == true) {
            System.out.println("palindrom");
        } else {
            System.out.println("Not palindrom");
        }
    }
}