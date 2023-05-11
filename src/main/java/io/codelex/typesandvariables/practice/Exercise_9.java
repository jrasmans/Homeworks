package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double distance = input.nextDouble();
        System.out.print("Enter time taken in hours: ");
        int hours = input.nextInt();
        System.out.print("Enter time taken in minutes: ");
        int minutes = input.nextInt();
        System.out.print("Enter time taken in seconds: ");
        int seconds = input.nextInt();

        double totalTimeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speedInMetersPerSecond = distance / totalTimeInSeconds;
        double speedInKmPerHour = (distance / 1000) / (totalTimeInSeconds / 3600);
        double speedInMilesPerHour = (distance / 1609) / (totalTimeInSeconds / 3600);

        System.out.printf("Your speed in meters/second is %.8f\n", speedInMetersPerSecond);
        System.out.printf("Your speed in km/h is %.8f\n", speedInKmPerHour);
        System.out.printf("Your speed in miles/h is %.8f\n", speedInMilesPerHour);
    }
}
