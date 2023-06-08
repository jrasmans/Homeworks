package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            String input = scanner.nextLine();
            if (input.startsWith("q") || input.startsWith("Q")) {
                break;
            }
            try {
                int numerator = Integer.parseInt(input);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                if (divisor == 0) {
                    System.out.println("You can't divide " + numerator + " by 0");
                } else {
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                }
                scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again.");
                scanner.nextLine();
            }
        }
    }
}
