package org.example.Lesson16;

import java.util.ArrayList;
import java.util.List;

public class Hw16 {

    // Клас для співробітників, оплата яких відбувається за ставкою
    static class SalariedEmployee extends Employee {
        private double dailyRate;
        private int workedDays;

        public SalariedEmployee(String fullName, double dailyRate, int workedDays) {
            super(fullName);
            this.dailyRate = dailyRate;
            this.workedDays = workedDays;
        }

        @Override
        public double calculateSalary() {
            return dailyRate * workedDays;
        }
    }

    // Клас для співробітників, оплата яких відбувається за годинами
    class HourlyEmployee extends Employee {
        private double hourlyRate;
        private int workedHours;

        public HourlyEmployee(String fullName, double hourlyRate, int workedHours) {
            super(fullName);
            this.hourlyRate = hourlyRate;
            this.workedHours = workedHours;
        }

        @Override
        public double calculateSalary() {
            return hourlyRate * workedHours;
        }
    }

    // Клас для співробітників, оплата яких відбувається за відрядною роботою
    class ContractEmployee extends Employee {
        private List<Double> taskAmounts;

        public ContractEmployee(String fullName) {
            super(fullName);
            this.taskAmounts = new ArrayList<>();
        }

        public void addTaskAmount(double amount) {
            taskAmounts.add(amount);
        }

        @Override
        public double calculateSalary() {
            return taskAmounts.stream().mapToDouble(Double::doubleValue).sum();
        }
    }

    // Клас для виведення звіту по заробітній платі співробітників
    class PayrollReport {
        private List<Employee> employees;

        public PayrollReport(List<Employee> employees) {
            this.employees = employees;
        }

        public void displayReport() {
            System.out.println("П.І.Б.       Вид оплати   Сума");
            System.out.println("-----------------------------");
            double totalSalary = 0;

            for (Employee employee : employees) {
                double salary = employee.calculateSalary();
                totalSalary += salary;

                System.out.printf("%-12s%-14s%.2f грн%n", employee.getFullName(), getPaymentType(employee), salary);
            }

            System.out.println("-----------------------------");
            System.out.printf("Разом: %.2f грн%n", totalSalary);
        }

        private String getPaymentType(Employee employee) {
            if (employee instanceof SalariedEmployee) {
                return "ставка";
            } else if (employee instanceof HourlyEmployee) {
                return "погодинна";
            } else if (employee instanceof ContractEmployee) {
                return "відрядна";
            } else {
                return "не визначено";
            }
        }
    }

    public class PayrollSystem {
        public void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            // Додавання співробітників з різними видами оплати праці
            employees.add(new SalariedEmployee("Іваненко", 300, 20));
            employees.add(new HourlyEmployee("Сидоренко", 40, 80));

            ContractEmployee petrenko = new ContractEmployee("Петренко");
            petrenko.addTaskAmount(500);
            petrenko.addTaskAmount(5000);
            employees.add(petrenko);

            // Виведення звіту по заробітній платі співробітників
            PayrollReport report = new PayrollReport(employees);
            report.displayReport();
        }
    }
}
