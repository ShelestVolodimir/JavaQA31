package org.example.Lesson18;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String lastName;
    private int birthYear;
    private int[] grades;

    // Конструктор
    public Student(String lastName, int birthYear, int[] grades) {
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.grades = grades;
    }

    // Метод для виведення інформації про студента
    public void displayStudentInfo() {
        System.out.print(lastName + " " + birthYear + " ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("Середній бал: " + calculateAverageGrade());
    }

    // Метод для обчислення середнього балу
    private double calculateAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }
}

