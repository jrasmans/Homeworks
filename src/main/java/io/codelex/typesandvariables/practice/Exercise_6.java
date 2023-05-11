package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a series of single digit numbers (separated by spaces): ");
        String strInput = input.nextLine();
        String[] numbers = strInput.split(" ");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
