package org.example.Leson11;

public class Hw4 {
    public static void main(String[] args) {
    int num1 = 44;
    int num2 = 13;
    int num3 = 11;
    int num4 = 284;

    int maxNumber = findMaxNumber(num1, num2, num3, num4);
    System.out.println("Максимальне число: " + maxNumber);
}

    public static int findMaxNumber(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }
}
