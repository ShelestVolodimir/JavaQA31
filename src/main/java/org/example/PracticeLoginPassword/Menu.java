package org.example.PracticeLoginPassword;

import java.util.*;

public class Menu {
    //Завдання 2:
    // Розробіть додаток, який дозволяє зберігати інформацію про логіни і паролі користувачів.
    // Кожному користувачу відповідає пара "логін — пароль".
    // При старті додатку відображається меню:
    // 1. Додати нового користувача.
    // 2. Видалити існуючого користувача.
    // 3. Перевірити, чи існує такий користувач.
    // 4. Змінити логін існуючого користувача.
    // 5. Змінити пароль існуючого користувача.
    // Дія виконується залежно від вибору користувача,
    // після чого меню з'являється знову.
    // Для вирішення завдання використовуйте відповідний клас з Java Collections Framework.
    private static List<User>users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    deleteUser();
                    break;
                case 3:
                    checkUserExistence();
                    break;
                case 4:
                    changeUsername();
                    break;
                case 5:
                    changePassword();
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Меню:");
        System.out.println("1. Додати нового користувача.");
        System.out.println("2. Видалити існуючого користувача.");
        System.out.println("3. Перевірити, чи існує такий користувач.");
        System.out.println("4. Змінити логін існуючого користувача.");
        System.out.println("5. Змінити пароль існуючого користувача.");
    }

    private static int getUserChoice() {
        System.out.print("Введіть номер опції: ");
        return scanner.nextInt();
    }

    private static void addUser() {
        System.out.print("Введіть логін нового користувача: ");
        String login = scanner.next();

        System.out.print("Введіть пароль нового користувача: ");
        String password = scanner.next();

        users.add(new User(login, password));
        System.out.println("Користувач " + login + " доданий успішно.");
    }

    private static void deleteUser() {
        System.out.print("Введіть логін користувача для видалення: ");
        String login = scanner.next();
        Optional<User> user = users.stream().filter(u -> u.login.equals(login)).findFirst();

        if (user.isPresent()) {
            users.remove(user.get());
            System.out.println("Користувач " + login + " видалений успішно.");
        } else {
            System.out.println("Користувача " + login + " не знайдено.");
        }
    }

    private static void checkUserExistence() {
        System.out.print("Введіть логін користувача для перевірки: ");
        String login = scanner.next();

        if (users.stream().anyMatch(u -> u.login.equals(login))) {
            System.out.println("Користувач " + login + " існує.");
        } else {
            System.out.println("Користувача " + login + " не знайдено.");
        }
    }

    private static void changeUsername() {
        System.out.print("Введіть старий логін користувача: ");
        String oldLogin = scanner.next();
        Optional<User> user = users.stream().filter(u -> u.login.equals(oldLogin)).findFirst();

        if (user.isPresent()){
            System.out.print("Введіть новий логін: ");
            String newUsername = scanner.next();
            String password = user.get().password;

            users.remove(user.get());
            users.add(new User(newUsername, password));
            System.out.println("Логін користувача успішно змінений на " + newUsername);
        } else {
            System.out.println("Користувача " + oldLogin + " не знайдено.");
        }
    }

    private static void changePassword() {
        System.out.print("Введіть логін користувача: ");
        String login = scanner.next();
        Optional<User> user = users.stream().filter(u -> u.login.equals(login)).findFirst();

        if (user.isPresent()) {
            System.out.print("Введіть новий пароль: ");
            String newPassword = scanner.next();

            user.get().password=newPassword;
            System.out.println("Пароль користувача " + login + " успішно змінений.");
        } else {
            System.out.println("Користувача " + login + " не знайдено.");
        }
    }
}