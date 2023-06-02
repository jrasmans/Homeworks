package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    private static final List<String> words = new ArrayList<>();

    static {
        words.add("hangman");
        words.add("java");
        words.add("programming");
        words.add("computer");
        words.add("algorithm");
    }

    private static final int MAX_TRIES = 6;

    private String word;
    private StringBuilder guessedWord;
    private List<Character> guessedLetters;
    private int remainingTries;

    public Exercise8() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        word = words.get(index).toLowerCase();
        guessedWord = new StringBuilder(word.length());
        guessedLetters = new ArrayList<>();
        remainingTries = MAX_TRIES;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                guessedWord.append('_');
            } else {
                guessedWord.append(word.charAt(i));
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the word: " + guessedWord);

        while (remainingTries > 0 && guessedWord.toString().contains("_")) {
            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You have already guessed that letter. Try again.");
                continue;
            }

            guessedLetters.add(guess);

            if (word.contains(String.valueOf(guess))) {
                updateGuessedWord(guess);
                System.out.println("Correct guess!");
            } else {
                remainingTries--;
                System.out.println("Incorrect guess. Remaining tries: " + remainingTries);
            }

            System.out.println("Word: " + guessedWord);
            System.out.println("Misses: " + guessedLetters);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        if (guessedWord.toString().contains("_")) {
            System.out.println("Game over! You ran out of tries. The word was: " + word);
        } else {
            System.out.println("Congratulations! You guessed the word: " + word);
        }
    }

    private void updateGuessedWord(char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) == guess) {
                guessedWord.setCharAt(i, word.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Exercise8 game = new Exercise8();
        game.play();
    }
}

