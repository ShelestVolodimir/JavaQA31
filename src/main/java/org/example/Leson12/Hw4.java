package org.example.Leson12;

public class Hw4 {
    /*
    Дано натуральне число N. Виведіть всі його цифри по одній у
    зворотному порядку через пробіл. Дозволена тільки рекурсія і
    цілочислова арифметика.
    Введення: 179
    Виведення: 9 7 1
    */
    public static void main(String[] args) {
        int N = 30313131;
        reverseAndPrintDigits(N);
    }
    public static void reverseAndPrintDigits(int N) {
        if (N < 10) {
            System.out.print(N + " ");
        } else {
            int lastDigit = N % 10;
            System.out.print(lastDigit + " ");
            reverseAndPrintDigits(N / 10);
        }
    }


}
