package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        playPiglet();
    }

    public static void playPiglet() {
        System.out.println("Welcome to Piglet!");
        int score = 0;
        boolean continueGame = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (continueGame) {
            int roll = random.nextInt(6) + 1;
            System.out.println("You rolled a " + roll + "!");

            if (roll == 1) {
                score = 0;
                System.out.println("You got 0 points.");
                continueGame = false;
            } else {
                score += roll;
                System.out.print("Roll again? ");
                continueGame = readBoolean(scanner);
            }
        }

        System.out.println("You got " + score + " points.");
    }

    public static boolean readBoolean(Scanner scanner) {
        String input = scanner.next().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
}

