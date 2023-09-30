package org.example.Dz;

public class Task7 {
    public static void main(String[] args) {
        final double depositAmount = 1050.00;
        final double annualInterestRate = 3.5;
        final int yearsTerm = 2;

        System.out.printf("Deposit: amount - %.2f UAH, annual interest rate - %s%% , tern - %s years%n",
                depositAmount, annualInterestRate, yearsTerm);

        double calculatedDepositAmount = calculateDepositAmount(depositAmount, annualInterestRate, yearsTerm);
        System.out.printf("Calculated deposit amount - %.2f UAH", calculatedDepositAmount);
    }

    private static double calculateDepositAmount(double depositAmount, double annualInterestRate, int yearsTerm) {
        double depositAmountResult = depositAmount;

        for (int i = 0; 1 < yearsTerm ;i++){

            depositAmountResult += annualInterestRate / 100 * depositAmountResult;
        }
        return depositAmountResult;
    }
}