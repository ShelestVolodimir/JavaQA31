package org.example.leson1;

import static jdk.internal.org.jline.utils.Colors.s;

public class Types {
    public static void main(String[] args) {

         // примітивні типи даних

        //числові типи даних

        //цілі числа
        byte b = 127 ; //-128 do 127 2^8 -2^7 do -2^7 -1
        short sh=20; // 2^16 -2^15 do 2^15 -1
        int in = 999999999; //2^32 -2^31 do 2^31 -1
        long l = 999999999999999999L; //2^64

        //дробові числа
        float fl= 15.5F; // 4 byte
        double d = 15.5; // 8 byte

        //symbols символи
        char ch = 'A' ; //2 byte

        //logic
        boolean bool = true; // 1 byte

        //особливість типів dooble float

        System.out.println(d/0); //infinity
        System.out.println(-d/0); //-infinity
        System.out.println(0.0/0.0); // not a number


        // силочні типи даних

        String name= "Jack";

        //класи обгортки для примітивів








    }
}
