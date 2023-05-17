package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeypadApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.next().toLowerCase();

        System.out.println("Using nested-if statement:");
        StringBuilder outputNested = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'c') {
                outputNested.append("2");
            } else if (c >= 'd' && c <= 'f') {
                outputNested.append("3");
            } else if (c >= 'g' && c <= 'i') {
                outputNested.append("4");
            } else if (c >= 'j' && c <= 'l') {
                outputNested.append("5");
            } else if (c >= 'm' && c <= 'o') {
                outputNested.append("6");
            } else if (c >= 'p' && c <= 's') {
                outputNested.append("7");
            } else if (c >= 't' && c <= 'v') {
                outputNested.append("8");
            } else if (c >= 'w' && c <= 'z') {
                outputNested.append("9");
            }
        }
        System.out.println(outputNested);

        System.out.println("Using switch-case-default statement:");
        StringBuilder outputSwitch = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            outputSwitch.append(switch (c) {
                case 'a', 'b', 'c' -> "2";
                case 'd', 'e', 'f' -> "3";
                case 'g', 'h', 'i' -> "4";
                case 'j', 'k', 'l' -> "5";
                case 'm', 'n', 'o' -> "6";
                case 'p', 'q', 'r', 's' -> "7";
                case 't', 'u', 'v' -> "8";
                case 'w', 'x', 'y', 'z' -> "9";
                default -> "";
            });
        }
        System.out.println(outputSwitch);
    }
}



