package io.codelex.enums.practice.rockPaperScissors;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {

        String input = "";
        Scanner scan = new Scanner(System.in);

        while (!input.equals("q")) {
            System.out.println("(Enter s for scissors, p for paper, r for rock, q to quit):");
            input = scan.nextLine();
            if (input.matches("[sprq]")) {
                processValidInput(input);
            } else {
                System.out.println("Wrong input");
            }
        }
    }

    private static void processValidInput(String input) {
        if (input.equals("q")) {
            System.out.println("Thanks for playing");
        } else {
            RockPaperScissors randomChoice = RockPaperScissors.randomPattern();
            RockPaperScissors userChoice = RockPaperScissors.userPattern(input);
            if (randomChoice.isStrongerThan(userChoice)) {
                printOutput(randomChoice, userChoice, " I won");
            } else if (userChoice.isStrongerThan(randomChoice)) {
                printOutput(userChoice, randomChoice, " You won");
            } else {
                System.out.println("Tie");

            }
        }
    }

    private static void printOutput(RockPaperScissors winningChoice, RockPaperScissors loosingChoice, String postfix) {
        System.out.println(winningChoice + " " + winningChoice.getFunction() + " " + loosingChoice + postfix);
    }
}
