package org.example.esson9;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        /*
        Введіть рядок з клавіатури. Врядку мають бутислова, які можуть
        бути роздільні пробілами або двокрапками. Обчисліть кількість
        слів в рядку, в яких парна кількість літер.
        */
            Scanner scanner = new Scanner(System.in);

            // Введення рядку з клавіатури
            System.out.print("Введіть рядок: ");
            String inputStr = scanner.nextLine();

            // Розділити рядок на слова, використовуючи пробіли і двокрапки як роздільники
            String[] words = inputStr.split("[\\s:]+");  // Роздільники - пробіл і двокрапка

            // Ініціалізувати лічильник слів з парною кількістю літер
            int count = 0;

            // Перевірка кожного слова
            for (String word : words) {
                // Перевірка, чи кількість літер у слові парна
                if (word.length() % 2 == 0) {
                    count++;
                }
            }

            // Виведення результату
            System.out.println("Кількість слів з парною кількістю літер: " + count);
        }
    }
