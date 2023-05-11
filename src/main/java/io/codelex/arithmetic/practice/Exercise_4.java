package io.codelex.arithmetic.practice;

public class Exercise_4 {
    public static void main(String[] args) {
        int n = 10;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println("The product of integers from 1 to " + n + " is " + product);
    }
}

