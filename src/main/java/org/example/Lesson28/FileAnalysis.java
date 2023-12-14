package org.example.Lesson28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шлях до файлу: ");
        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            int letterCount = 0;
            int digitCount = 0;
            int punctuationCount = 0;

            while (fileScanner.hasNext()) {
                String token = fileScanner.next();

                for (char ch : token.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        letterCount++;
                    } else if (Character.isDigit(ch)) {
                        digitCount++;
                    } else if (Character.isWhitespace(ch) || Character.isISOControl(ch)) {
                        continue;
                    } else {
                        punctuationCount++;
                    }
                }
            }

            System.out.println("Кількість літер: " + letterCount);
            System.out.println("Кількість чисел: " + digitCount);
            System.out.println("Кількість розділових знаків: " + punctuationCount);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено.");
        }
    }
}
