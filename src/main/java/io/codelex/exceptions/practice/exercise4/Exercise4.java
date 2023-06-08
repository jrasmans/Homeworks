package io.codelex.exceptions.practice.exercise4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double d = getInput(scanner.nextLine());
            if (d < 0) {
                throw new NonPositiveNumberException();
            }
            double root = Math.sqrt(d);
            System.out.println("The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be an imaginary number.");
        }
    }

    static double getInput(String s) {
        double d = Double.parseDouble(s);
        return d;
    }
}


