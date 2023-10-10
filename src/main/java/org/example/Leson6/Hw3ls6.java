package org.example.Leson6;

public class Hw3ls6 {
    public static void main(String[] args) {

        int[] array = {5, 5, 5, 4, 5};

        boolean allEqual = true;
        int firstElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] != firstElement) {
                allEqual = false;
                break;
            }
        }

        if (allEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
