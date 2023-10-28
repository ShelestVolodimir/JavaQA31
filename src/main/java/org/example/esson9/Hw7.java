package org.example.esson9;

import java.util.Scanner;

public class Hw7 {
    //    Користувач вводить з клавіатури будь-який рядок. Змініть у
//    початковому рядку всі великі літери на маленькі, а маленькі —
//    великими. Якщо в рядку є цифри, замініть їх на символи
//    підкреслення, і виведіть результат у консоль
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рядок");
        String inputStr = sc.nextLine();

        String replacedStr = inputStr.replaceAll("\\d", "_");
        String swappedCaseStr = swapCase(inputStr);
        System.out.println(replacedStr);
    }

    public static String swapCase(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            }
            return new String(charArray);

        }

        return input;
    }
}

