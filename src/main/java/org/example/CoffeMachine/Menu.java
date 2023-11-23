package org.example.CoffeMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======== Hello ========");
        System.out.println("Виберіть кавомашину для приготування кави");
        System.out.println("1. Phillips");
        System.out.println("2. Siemens");
        System.out.println("3. Delonghi");
        System.out.println("0. Вихід");


        //==== Завдання ====
        //=== 1 додати обробку InputMismatchException через try catch ===
        //=== 2 додати цикл для можливості повтору меню ===
        int machineChoice = -1;
        while (machineChoice == -1) {
            try {
                machineChoice = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Помилка. Введіть число\n");
                scanner.nextLine();
            }
        }

        CoffeeMachine selectMachine = null;
        boolean isSelectMachine = false;

        //обрати кавомашину
        switch (machineChoice) {
            case 1 -> {
                selectMachine = new PhillipsCoffeeMachine();
                isSelectMachine = true;
            }
            case 2 -> {
                selectMachine = new SiemensCoffeeMachine();
                isSelectMachine = true;
            }
            case 3 -> {
                selectMachine = new DelonghiCoffeeMachine();
                isSelectMachine = true;
            }
            case 0 -> System.out.println("Good bye");
        }


        if (isSelectMachine) {

            //обрати операцію
            System.out.println("Оберіть операцію");
            System.out.println("1 - Увімкнути");
            System.out.println("2 - Вимкнути");
            System.out.println("3 - Еспрессо");
            System.out.println("4 - Амерікано");
            System.out.println("5 - Додати воду");
            System.out.println("6 - Додати каву");
            System.out.println("7 - Очистити бак");
            System.out.println("0 - Вихід");


            //=== 3 додати обробку InputMismatchException через try catch ===
            //=== 4 додати цикл для можливості повтору меню ===
            int choice = -1;
            while (choice == -1) {
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException exception) {
                    System.out.println("Помилка. Введіть число\n");
                    scanner.nextLine();
                }
            }


            //=== 5 пропищіть виклик всіх необхідних методів ===
            switch (choice) {
                case 1 -> selectMachine.turnOn();
                case 2 -> selectMachine.turnOff();
                case 3 -> selectMachine.makeEspresso();
                case 4 -> selectMachine.makeAmericano();
                case 5 -> selectMachine.addWater(50);
                case 6 -> selectMachine.addCoffee(20);
                case 7 -> selectMachine.cleanGarbageBox();
                case 0 -> System.out.println("Good bye");
            }
        }
    }
}
