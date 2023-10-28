package org.example.Practic1;

public class Practic19Task2 {
    public static void main(String[] args) {
        System.out.println(method(12, 32, 73, 11, 83));
    }
    public static <T extends Number> T method (T num1, T num2,T num3,T num4,T num5){
        T min;
        if (num1. doubleValue() > num2. doubleValue()){
        return min = num2;
    } else if (num2.doubleValue() > num3.doubleValue()){
        return min = num1;
    }else if (num3.doubleValue() > num4.doubleValue()) {
            return min = num4;
        }else {
        return min = num5;
    }
}
}
