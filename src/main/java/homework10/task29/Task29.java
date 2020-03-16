package main.java.homework10.task29;

/**
 * Task 29. There is a text. A  frequency dictionary should be compiled for it.
 */

import java.util.HashMap;

public class Task29 {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
        String text = "Text text class class hello hello hello hello hello";
        String[] words = text.toLowerCase().split(" ");
        for (String word : words) {
            if (!wordCountMap.containsKey(word)) {
                wordCountMap.put(word, 0);
            }
            wordCountMap.put(word, wordCountMap.get(word) + 1);
        }
        for (String word : wordCountMap.keySet()) {
            System.out.println("The word " + "'" + word + "'" + " was found - " + wordCountMap.get(word) + " time(-s)");
        }

    }
}