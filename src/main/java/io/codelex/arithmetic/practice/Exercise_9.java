package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Your BMI is %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("You have optimal weight.");
        } else {
            System.out.println("You are overweight.");
        }
        input.close();
    }
}

