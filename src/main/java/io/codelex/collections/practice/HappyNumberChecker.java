package io.codelex.collections.practice;

import java.util.Scanner;

public class HappyNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHappyNumber(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }

        scanner.close();
    }

    public static boolean isHappyNumber(int number) {
        int slow = number;
        int fast = number;

        do {
            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static int calculateSumOfSquares(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }
}
