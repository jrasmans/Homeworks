package io.codelex.arithmetic.practice;

public class Exercise_6 {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 110) {
            boolean printed = false;
            if (num % 3 == 0) {
                System.out.print("Coza");
                printed = true;
            }
            if (num % 5 == 0) {
                System.out.print("Loza");
                printed = true;
            }
            if (num % 7 == 0) {
                System.out.print("Woza");
                printed = true;
            }
            if (!printed) {
                System.out.print(num);
            }
            System.out.print(" ");
            if (num % 11 == 0) {
                System.out.println();
            }
            num++;
        }
    }
}

