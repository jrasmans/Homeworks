package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Min? ");
        int min = scanner.nextInt();

        System.out.print("Max? ");
        int max = scanner.nextInt();

        int range = max - min + 1;

        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
                int num = (min + i + j) % range + min;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
