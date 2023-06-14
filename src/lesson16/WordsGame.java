package src.lesson16;

import java.util.Scanner;
import java.util.Random;
public class WordsGame {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String secretWord = selectRandomWord(words);
        String guessedWord = initializeGuessedWord(secretWord.length());

        System.out.println("Welcome to the Word Game!");
        System.out.println("Try to guess the secret word. It has " + secretWord.length() + " letters.");
        System.out.println("The word is in lowercase. Use lowercase letters for your guesses.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (!guessedWord.equals(secretWord)) {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (guess.length() != secretWord.length()) {
                System.out.println("Invalid guess. The word has " + secretWord.length() + " letters.");
                continue;
            }

            guessedWord = compareWords(secretWord, guessedWord, guess);
            System.out.println("Current progress: " + guessedWord);
            System.out.println();
        }

        System.out.println("Congratulations! You guessed the word correctly. The secret word was: " + secretWord);
    }

    public static String selectRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }

    public static String initializeGuessedWord(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("#");
        }
        return sb.toString();
    }

    public static String compareWords(String secretWord, String guessedWord, String guess) {
        StringBuilder sb = new StringBuilder(guessedWord);

        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess.charAt(i)) {
                sb.setCharAt(i, secretWord.charAt(i));
            }
        }

        return sb.toString();
    }

}
