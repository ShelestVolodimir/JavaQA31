package org.example.Leson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test10ls6 {
    public static void main(String[] args) {
        /*
        Заповніть масив розмірності n випадковими цифрами від 0 до 33.
        Виведіть в консоль значення початкового масиву.
        Знайдіть елемент масиву, який ділиться без остачі на значення елемента зліва і значення елемента справа.
        Виведіть індекс знайденого елемента. Якщо такий не знайдено,виведіть -1.
        n — задається з клавіатури.
        */

        //1. Запитуємо розмір масиву
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву ");
        int n = sc.nextInt();

        //2. Створити масив
        int[] nums = new int[n];

        //3. Заповнюємо масив випадковими цифрами від 0 до 33.
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1,34);
        }

        //4. Виводимо в консоль заповнений масив
        System.out.println(Arrays.toString(nums));

        //5. Шукаємо підходящий елемент
        for (int i = 1; i < nums.length - 1; i++) {
            int currentElement = nums[i];
            int leftElement = nums[i-1];
            int rightElement = nums[i+1];

            int leftRemainder = currentElement % leftElement;
            int rightRemainder = currentElement % rightElement;
            if (leftRemainder == 0 && rightRemainder == 0) {
                System.out.println("Індекс знайденого елементу - " + i );
                return;
            }
        }
        System.out.println("Індекс знайденого елементу -1 ");
    }
}
