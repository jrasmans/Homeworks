package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long minutesInDay = 60 * 24;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}

