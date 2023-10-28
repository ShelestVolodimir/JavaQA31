package org.example.Leson11;

public class Hw6 {
    /*
    Напишіть метод, який перевіряє, чи є число простим. Число
    передається як параметр. Якщо число просте, поверніть з методу
    true, якщо ні — false.
    */
    public static void main(String[] args) {
        int number = 14;

        boolean isPrime = isPrime(number);

        if (isPrime){
            System.out.println(number + " є простим числом.");
        }else {
            System.out.println(number + " Hе є простим числом");
        }

    }

    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        if (num <=3){
            return true;
        }
        if (num% 2 == 0 || num % 3 == 0){
            return false;
        }
        for (int i = 5; i*i <=num; i +=6){
            if (num % i == 0 || num% (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}
