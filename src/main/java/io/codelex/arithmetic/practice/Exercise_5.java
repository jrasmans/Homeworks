package io.codelex.arithmetic.practice;

import java.util.Scanner;
import java.util.Random;

public class Exercise_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1; // pick a random number between 1-100
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
        int guess = input.nextInt();
        if (guess == number) {
            System.out.println("You guessed it! What are the odds?!?");
        } else if (guess < number) {
            System.out.println("Sorry, you are too low. I was thinking of " + number + ".");
        } else {
            System.out.println("Sorry, you are too high. I was thinking of " + number + ".");
        }
    }
}

