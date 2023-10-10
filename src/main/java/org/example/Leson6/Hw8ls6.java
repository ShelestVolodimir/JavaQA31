package org.example.Leson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Hw8ls6 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(21)-10;
        }
        int min = array[0];
        int max = array[0];

        int negativeCount=0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int num : array){
            if (num < min){
                min = num;

            }
            if (num > max) {
                max = num;
            }
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
        }
    }
        System.out.println("Масив: " + Arrays.toString(array));
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Кількість від'ємних елементів: " + negativeCount);
        System.out.println("Кількість додатних елементів: " + positiveCount);
        System.out.println("Кількість нулів: " + zeroCount);
}
}
