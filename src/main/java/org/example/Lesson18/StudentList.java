package org.example.Lesson18;


import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Іванов", 2000, new int[]{85, 90, 78}));
        students.add(new Student("Петров", 2001, new int[]{92, 88, 76}));
        students.add(new Student("Сидоров", 1999, new int[]{78, 85, 90}));


        System.out.println("Список студентів групи:");
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}
