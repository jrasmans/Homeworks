package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i;
        int n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int result = n;
        for (i = 0; i < n; i++) {
            result *= n;
        }
        System.out.println("Result: " + result);
    }
}

