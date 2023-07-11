package io.codelex.trivia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Trivia {
    private static final String NUMBERS_API_URL = "http://numbersapi.com/random?min=%d&max=%d";

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    static final int MAX_QUESTIONS = 20;

    private static final Set<Integer> usedNumbers = new HashSet<>();
    private static final int correctAnswers = 0;

    static int getRandomNumber() {
        Random random = new Random();
        int number;

        do {
            number = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        } while (usedNumbers.contains(number));

        usedNumbers.add(number);
        return number;
    }

    static String getQuestion(int number) throws IOException {
        String url = String.format(NUMBERS_API_URL, number, number);
        URL numbersApi = new URL(url);
        BufferedReader reader = new BufferedReader(new InputStreamReader(numbersApi.openStream()));
        String line = reader.readLine();
        reader.close();
        return line;
    }

    static int getIntegerInput(BufferedReader reader) throws IOException {
        while (true) {
            try {
                String input = reader.readLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
    }
}
