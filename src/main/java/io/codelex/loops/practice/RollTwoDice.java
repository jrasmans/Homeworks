package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Desired sum: ");
        int desiredSum = scanner.nextInt();

        int dice1, dice2, sum;
        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + sum);
        } while (sum != desiredSum);
    }
}

