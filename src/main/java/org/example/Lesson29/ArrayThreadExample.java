package org.example.Lesson29;

import java.util.Scanner;

public class ArrayThreadExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SumThread sumThread = new SumThread(array);

        AverageThread averageThread = new AverageThread(array);

        sumThread.start();
        averageThread.start();

        try {

            sumThread.join();
            averageThread.join();

            int sumResult = sumThread.getSumResult();
            double averageResult = averageThread.getAverageResult();

            System.out.println("Сума елементів масиву: " + sumResult);
            System.out.println("Середнє арифметичне елементів масиву: " + averageResult);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
