package org.example.Leson2;

public class Operators2 {
    public static void main (String[] args){

        System.out.println("arithmetic");

        int first = 17;
        int second = 2;

        System.out.println((double) first/second);
        System.out.println (first%second);

        System.out.println("increment");

        int count = 9;
        System.out.println("count = " + count);
        System.out.println("count = " + count++); //постфіксний
        System.out.println("count = " + count);
        System.out.println("count = " + ++count); //префікс


        System.out.println("decrement");

        System.out.println("count = " + count);
        System.out.println("count = " + count--); //постфіксний
        System.out.println("count = " + count);
        System.out.println("count = " + --count); //префікс

        System.out.println("Операції порівняння");
        System.out.println(">" + (first > second));
        System.out.println("<" + (first < second));
        System.out.println(">=" + (first >= second));
        System.out.println("<=" + (first <= second));
        System.out.println("==" + (first == second));
        System.out.println("!=" + (first != second));


        System.out.println("логічні оператори");
        boolean res1 = 3<= (2+30) % 7 && 5 >= 10/2;
        System.out.println(res1);



    }
}
