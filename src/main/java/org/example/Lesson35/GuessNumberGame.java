package org.example.Lesson35;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вгадайте число від 0 до 100.");
        System.out.print("Загадайте своє число: ");
        int userNumber = scanner.nextInt();


        int min = 0;
        int max = 100;

        int computerGuess;
        String question;

        do {
            computerGuess = (min + max) / 2;

            System.out.println("Число більше, менше чи дорівнює " + computerGuess + "?");
            System.out.print("Введіть '>', '<' або '=': ");
            scanner.nextLine();
            question = scanner.nextLine();

            if (question.equals(">")) {
                min = computerGuess + 1;
            } else if (question.equals("<")) {
                max = computerGuess - 1;
            }

        } while (!question.equals("="));

        System.out.println("Комп'ютер вгадав ваше число: " + computerGuess);

        scanner.close();
    }
}
