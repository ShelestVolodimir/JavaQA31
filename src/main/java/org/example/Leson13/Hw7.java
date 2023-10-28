package org.example.Leson13;

import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть розмірність квадратного масиву (n): ");
    int n = scanner.nextInt();

    int[][] snakeArray = fillSnakeArray(n);

    int fieldWidth = Integer.toString(n * n).length();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.printf("%" + fieldWidth + "d ", snakeArray[i][j]);
        }
        System.out.println();
    }
}
    public static int[][] fillSnakeArray(int n) {
        int[][] array = new int[n][n];
        int value = 1;
        int row = 0;
        int col = 0;
        int direction = 1;

        while (value <= n * n) {
            array[row][col] = value;

            if (direction == 1) {
                if (col + 1 < n && array[row][col + 1] == 0) {
                    col++;
                } else {
                    direction = 2;
                    row++;
                }
            } else if (direction == 2) { // Рух вниз
                if (row + 1 < n && array[row + 1][col] == 0) {
                    row++;
                } else {
                    direction = 3;
                    col--;
                }
            } else if (direction == 3) { // Рух вліво
                if (col - 1 >= 0 && array[row][col - 1] == 0) {
                    col--;
                } else {
                    direction = 4;
                    row--;
                }
            } else if (direction == 4) {
                if (row - 1 >= 0 && array[row - 1][col] == 0) {
                    row--;
                } else {
                    direction = 1;
                    col++;
                }
            }

            value++;
        }

        return array;
    }
}
