package org.example.Dz;

import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Напишіть якесь число = ");
            int num = scanner.nextInt();
            String weekDay = switch (num) {
                case 1 -> "Понеділок";
                case 2 -> "Вівторок";
                case 3 -> "Середа";
                case 4 -> "Четвер";
                case 5 -> "П'ятниця";
                case 6 -> "Субота";
                case 7 -> "Неділя";
                default -> "Error";
            };
            System.out.println(weekDay);
        }



    }

}
