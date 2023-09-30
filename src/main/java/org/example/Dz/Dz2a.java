package org.example.Dz;

import java.util.Scanner;

public class Dz2a {
    public static void main(String[] args) {


        while (true) {
            System.out.println("Введіть годину (від 0 23 включно)");
            int hour = new Scanner(System.in).nextInt();

            if (hour < 0 || hour > 23) {
                System.out.println("Ви ввели не коректний час");

            } else if (hour >= 4 && hour <= 10){
                System.out.println("Добрий ранок");
            } else if (hour >=11 && hour <= 17){
                System.out.println("Добрий день");
            } else if (hour >= 18 && hour <= 22){
                System.out.println("Доброго вечора");
            } else {
                System.out.println("Доброй ночи");
            }
        }
    }
}
