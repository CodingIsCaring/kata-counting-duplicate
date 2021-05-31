package com.codingiscaring.katacountingduplicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CountingDuplicate {

    static int count(String word) {
        String lowerCaseWord = word.toLowerCase(Locale.ROOT);
        String withoutDuplicate = removeDuplicates(lowerCaseWord);
        int cont = 0;

        for (int i = 0; i < withoutDuplicate.length(); i++) {
            int frequency = getFrequency(lowerCaseWord, String.valueOf(withoutDuplicate.charAt(i)));
            if (frequency > 1) {
                cont++;
            }
        }

        return cont;
    }

    public static int getFrequency(String word, String character) {
        List<String> wordInChars = Arrays.asList(word.split(""));
        return Collections.frequency(wordInChars, character);
    }

    public static String removeDuplicates(String word) {
        return Arrays.stream(word.split(""))
                .distinct()
                .collect(Collectors.joining());
    }

}
