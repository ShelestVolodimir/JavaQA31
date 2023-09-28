package org.example.Practic1;

public class View {
    public static void main (String[]args) {

        String name= "Jack";
        int num = 15;

        System.out.println("My name is " + name);
        System.out.println("мені " + num + " років");
        System.out.print("Я не перекидаю на новий рядок");
        System.out.println(" Я на цьому ж рядку");


        System.out.printf("My name is %s. I am a human\n", name);
        System.out.printf(" мені %d років", num);


    }
}
