package io.codelex.arrays.practice;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number");
        int maxNumber = input.nextInt();

        int arraySize = maxNumber - minNumber + 1;
        int[] myArray = new int[arraySize];
        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            myArray[i] = minNumber + 1;
            sum += myArray[i];
        }

        System.out.println("The sum is " + sum);
    }
}
