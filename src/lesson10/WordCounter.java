package src.lesson10;

import java.util.List;

public class WordCounter {
    public static int countOccurrence(List<String> wordList, String targetWord) {
        int count = 0;
        for (String word : wordList) {
            if (word.equals(targetWord)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> wordList = List.of("apple", "banana", "orange", "strawberry",
                "watermelon", "pineapple", "grapes", "mango", "kiwi", "apple", "avocado",
                "tomato", "carrot", "cucumber", "apple", "apple", "potato", "onion",
                "garlic", "lemon");
        String targetWord = "apple";

        int occurrences = countOccurrence(wordList, targetWord);
        System.out.println("The word '" + targetWord + "' occurs " + occurrences + " times in the list.");
    }
}

