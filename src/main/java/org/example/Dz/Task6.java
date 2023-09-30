package org.example.Dz;

public class Task6 {
    public static void main(String[] args) {

        final int w = 4;
        final int h = 5;

        System.out.printf("Rectangle: width - %s, height - %s%n", w, h);
        System.out.printf("Area - %s%n", getArea(w, h));
        System.out.printf("Perimeter - %s%n", getPerimeter(w, h));
    }
        private static int getArea(int w, int h) {
            return w * h;
    }

            private static int getPerimeter(int w, int h) {
                return 2 * (w + h);

            }
        }


