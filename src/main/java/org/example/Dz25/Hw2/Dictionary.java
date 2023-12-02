package org.example.Dz25.Hw2;

import java.util.*;

public class Dictionary {
    private Map<String, List<String>> translations;
    private Map<String, Integer> popularityCounter;

    public Dictionary() {
        translations = new HashMap<>();
        popularityCounter = new HashMap<>();
    }

    public void addWord(String word, List<String> translations) {
        this.translations.put(word, translations);
        popularityCounter.put(word, 0);
    }

    public void updateTranslations(String word, List<String> newTranslations) {
        if (translations.containsKey(word)) {
            translations.remove(word);
            translations.put(word, newTranslations);
        }
    }

    public void removeWord(String word) {
        translations.remove(word);
        popularityCounter.remove(word);
    }

    public void incrementPopularity(String word) {
        popularityCounter.put(word, popularityCounter.getOrDefault(word, 0) + 1);
    }

    public void displayTranslations(String word) {
        if (translations.containsKey(word)) {
            System.out.println("Переклади слова " + word + ": " + translations.get(word));
        } else {
            System.out.println("Слово " + word + " не знайдено в словнику.");
        }
    }

    public void displayTopPopularWords() {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(popularityCounter.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Топ-10 найпопулярніших слів:");
        for (int i = 0; i < Math.min(10, sortedList.size()); i++) {
            System.out.println(sortedList.get(i).getKey());
        }
    }

    public void displayTopUnpopularWords() {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(popularityCounter.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());

        System.out.println("Топ-10 найнепопулярніших слів:");
        for (int i = 0; i < Math.min(10, sortedList.size()); i++) {
            System.out.println(sortedList.get(i).getKey());
        }
    }
}
