package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        int dotsCount = 30 - (firstWord.length() + secondWord.length());
        String dots = ".".repeat(dotsCount);

        System.out.println(firstWord + dots + secondWord);
    }
}
