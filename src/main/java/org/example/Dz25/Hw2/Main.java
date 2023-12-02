package org.example.Dz25.Hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("hello", Arrays.asList("привіт", "алло"));
        dictionary.addWord("world", Arrays.asList("світ", "універсум"));

        dictionary.displayTranslations("hello");

        dictionary.updateTranslations("hello", Arrays.asList("привіт", "здоровенькі були"));

        dictionary.displayTranslations("hello");

        dictionary.incrementPopularity("hello");

        dictionary.displayTopPopularWords();
    }
}