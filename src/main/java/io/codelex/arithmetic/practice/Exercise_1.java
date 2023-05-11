package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        boolean result = isFifteen(num1, num2);
        System.out.println(result);
    }
    public static boolean isFifteen(int num1, int num2) {
        if (num1 == 15 || num2 == 15 || num1 + num2 == 15 || num1 - num2 == 15) {
            return true;
        } else {
            return false;
        }
    }
}

