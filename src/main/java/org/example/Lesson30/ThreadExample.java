package org.example.Lesson30;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;
public class ThreadExample {public static void main(String[] args) {
    int arraySize = 10;

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    int[] array = new int[arraySize];
    String fileName = "randomNumbers.txt";

    Future<?> fillArrayFuture = executorService.submit(() -> {
        fillArrayWithRandomNumbers(array);
        writeArrayToFile(array, fileName);
    });

    Future<Integer> sumFuture = executorService.submit(() -> calculateSum(array));

    Future<Double> averageFuture = executorService.submit(() -> calculateAverage(array));

    try {
        fillArrayFuture.get();

        int sum = sumFuture.get();
        double average = averageFuture.get();
        System.out.println("Масив: " + arrayToString(array));
        System.out.println("Сума елементів: " + sum);
        System.out.println("Середнє арифметичне: " + average);
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
    } finally {
        executorService.shutdown();
    }
}

    private static void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    private static void writeArrayToFile(int[] array, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int number : array) {
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    private static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = calculateSum(array);
        return (double) sum / array.length;
    }

    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
