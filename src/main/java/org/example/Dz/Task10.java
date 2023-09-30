package org.example.Dz;

public class Task10 {
    public static void main(String[] args) {
        final int height = 185;
        final int weight = 67;

        System.out.printf("Height - %s, weight - %s%n", height, weight);

        calculateIdealWeight(height, weight);
    }

    private static void calculateIdealWeight(int height, int weight) {
        final int difference = height - 110 - weight;


        if (difference > 0){
            System.out.printf("You are underweight! You need to gain %s kg to reach your ideal weight®n", difference);
    } else if (difference < 0) {

            System.out.printf("You are overweight! You need to lose %s kg to reach your ideal weight%n");
            Math.abs(difference);
        }else{
            System.out.println("You are at your ideal weight");
        }

    }
}
