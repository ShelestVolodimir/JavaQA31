package org.example.leson7;

import java.util.Arrays;
import java.util.Random;

public class Hw5 {
    public static void main(String[] args) {
//
            int[] arr = new int[10];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(-10, 11);
            }

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " find " + count + " times");
                count = 0;
            }
            System.out.println(Arrays.toString(arr));


            String srr = "123";
            String str1 = "123456";
            System.out.println(str1.contains(srr));
        }
    }
