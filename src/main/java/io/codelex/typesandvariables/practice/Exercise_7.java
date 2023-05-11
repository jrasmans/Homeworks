package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String strInput = input.nextLine();

        int count = 0;
        for (int i = 0; i < strInput.length(); i++) {
            char c = strInput.charAt(i);
            if (Character.isUpperCase(c)) {
                    count++;
            }
        }
        System.out.println("Number of uppercase letters: " + count);
    }
}

