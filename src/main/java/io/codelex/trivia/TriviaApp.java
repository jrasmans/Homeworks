package io.codelex.trivia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static io.codelex.trivia.Trivia.*;

public class TriviaApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Trivia Game!");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int correctAnswers = 0;
            for (int i = 1; i <= MAX_QUESTIONS; i++) {
                System.out.println("Question " + i + ":");
                int number = getRandomNumber();
                String question = getQuestion(number);
                System.out.println(question);

                int answer = getIntegerInput(reader);

                if (answer == number) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect! The correct answer is: " + number);
                    break;
                }

                System.out.println();
            }

            System.out.println("Game Over!");
            System.out.println("You answered " + correctAnswers + " questions correctly.");

            if (correctAnswers < MAX_QUESTIONS) {
                System.out.println("The last question was not answered correctly.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while retrieving the question. Please try again.");
        }
    }
}

