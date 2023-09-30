package org.example.Dz;

import java.util.Scanner;

public class Dz3a4 {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Введіть х");
            int x = new Scanner(System.in).nextInt();

            System.out.println("Введіть y");
            int y = new Scanner(System.in).nextInt();

            if (x == 0 || y == 0) {
                System.out.println("Точка не відноситься ні до якої чверті");
            } else if (x < 0 && y < 0) {
                System.out.println("Точка знаходиться в ІІІ четверті");
            } else if (x > 0 && y > 0) {
                System.out.println("Точка знаходиться в І четверті");
            } else if (x > 0 && y < 0) {
                System.out.println("Точка знаходиться в ІV четверті");
            } else {
                System.out.println("Точка знаходиться в ІI четверті");
            }
        }
    }
}
