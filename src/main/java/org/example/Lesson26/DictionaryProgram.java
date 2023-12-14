package org.example.Lesson26;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryProgram {
    private static Map<String, String> dictionary = new HashMap<>();
    private static Map<String, Integer> popularityCounter = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Введення нових даних для словника");
            System.out.println("2. Відображення слова та його перекладу");
            System.out.println("3. Додавання/зміна/видалення перекладів слова");
            System.out.println("4. Додавання/зміна/видалення слова");
            System.out.println("5. Відображення топ-10 найпопулярніших слів");
            System.out.println("6. Відображення топ-10 найнепопулярніших слів");
            System.out.println("7. Вихід");

            System.out.print("Оберіть опцію: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addDataToDictionary();
                    break;
                case 2:
                    displayWordAndTranslations();
                    break;
                case 3:
                    addUpdateRemoveTranslations();
                    break;
                case 4:
                    addUpdateRemoveWord();
                    break;
                case 5:
                    displayTopPopularWords();
                    break;
                case 6:
                    displayTopUnpopularWords();
                    break;
                case 7:
                    System.out.println("Дякую за використання програми. До побачення!");
                    System.exit(0);
                default:
                    System.out.println("Невідома опція. Будь ласка, виберіть коректну опцію.");
            }
        }
    }

    private static void addDataToDictionary() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введення нових даних для словника:");
        System.out.print("Введіть слово: ");
        String word = scanner.nextLine();

        System.out.print("Введіть переклад слова: ");
        String translation = scanner.nextLine();

        dictionary.put(word, translation);
        popularityCounter.put(word, 0);

        System.out.println("Дані додано до словника.");
    }

    private static void displayWordAndTranslations() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть слово для відображення перекладу: ");
        String word = scanner.nextLine();

        if (dictionary.containsKey(word)) {
            String translation = dictionary.get(word);
            System.out.println("Переклад слова '" + word + "': " + translation);

            // Збільшити лічильник популярності слова
            popularityCounter.put(word, popularityCounter.get(word) + 1);
        } else {
            System.out.println("Слово '" + word + "' не знайдено у словнику.");
        }
    }

    private static void addUpdateRemoveTranslations() {
        // Реалізація додавання/зміни/видалення перекладів
        // (аналогічно до методу addDataToDictionary)
    }

    private static void addUpdateRemoveWord() {
        // Реалізація додавання/зміни/видалення слова
        // (аналогічно до методу addDataToDictionary)
    }

    private static void displayTopPopularWords() {
        // Реалізація відображення топ-10 найпопулярніших слів
    }

    private static void displayTopUnpopularWords() {
        // Реалізація відображення топ-10 найнепопулярніших слів
    }
}

