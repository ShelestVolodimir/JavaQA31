package org.example.Leson3;

import java.util.Scanner;

public class practi3 {
    //програма робить скидку для пенсіонерів та школярів
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ведіть ваш вік");
        int age = 0;
        double amout = 1000;

        if (sc.hasNextInt()){
            age = sc.nextInt();

            if (age >=6 && age <= 90){

                if ( age >=6 && age <= 18){
                    amout = amout * 0.6;
                    System.out.println("ціна товару = " + amout );
                }else if (age > 18 && age <60){
                    amout = amout *0.75;
                    System.out.println("ціна товару = " + amout);
                }

            }else {
                System.out.println("Для вас все безкоштовно");
            }

        }else {
            System.out.println("Невірні дані ");
        }



    }
}
