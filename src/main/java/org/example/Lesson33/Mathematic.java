package org.example.Lesson33;

import java.util.Random;

public class Mathematic {
    public static int sum(int first, int second) {
        return first + second + new Random().nextInt(0, 2);
    }

    public static double sumDouble(double first, double second) {
        return first + second;
    }

    public double div(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return first / second;
    }

    public static void main(String[] args) {
        testSum();
        testSumDouble();
        testDiv();
    }

    public static void testSum() {
        int actualRes = sum(10, 20);
        int expectedRes = 30;

        if (actualRes == expectedRes) {
            System.out.println("\u001B[32m Test sum ok");
        } else {
            System.out.println("\u001B[31m Test sum Error");
            System.out.println("expectedRes = " + expectedRes);
            System.out.println("actualRes = " + actualRes);
        }

        actualRes = sum(-10, -20);
        expectedRes = -30;
        if (actualRes == expectedRes) {
            System.out.println("\u001B[32m Test sum with negative numbers ok");
        } else {
            System.out.println("\u001B[31m Test sum with negative numbers Error");
            System.out.println("expectedRes = " + expectedRes);
            System.out.println("actualRes = " + actualRes);
        }
    }

    public static void testSumDouble() {
        double actualRes = sumDouble(10.5, 20.5);
        double expectedRes = 31.0;

        if (actualRes == expectedRes) {
            System.out.println("\u001B[32m Test sumDouble ok");
        } else {
            System.out.println("\u001B[31m Test sumDouble Error");
            System.out.println("expectedRes = " + expectedRes);
            System.out.println("actualRes = " + actualRes);
        }
    }

    public static void testDiv() {
        Mathematic mathematic = new Mathematic();
        double actualRes = mathematic.div(10.0, 2.0);
        double expectedRes = 5.0;

        if (actualRes == expectedRes) {
            System.out.println("\u001B[32m Test div ok");
        } else {
            System.out.println("\u001B[31m Test div Error");
            System.out.println("expectedRes = " + expectedRes);
            System.out.println("actualRes = " + actualRes);
        }

        try {
            mathematic.div(10.0, 0.0);
            System.out.println("\u001B[31m Test div by zero Error");
        } catch (ArithmeticException e) {
            System.out.println("\u001B[32m Test div by zero ok");
        }
    }
}