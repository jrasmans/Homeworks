package io.codelex.dateandtime.practice.serverUpdateCalculator;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Scanner;

import static io.codelex.dateandtime.practice.serverUpdateCalculator.CalculateUpdateDates.calculateUpdateDates;

public class ServerUpdateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the server launch date (format: yyyy-MM-dd): ");
        String launchDateStr = scanner.nextLine();
        LocalDate serverLaunchDate = LocalDate.parse(launchDateStr);

        Month targetMonth = Month.SEPTEMBER;
        int targetYear = 2022;

        List<LocalDate> updateDates = calculateUpdateDates(serverLaunchDate, targetMonth, targetYear);
        if (updateDates.size() >= 2) {
            System.out.println("Server update date in " + targetMonth.toString() + ":");
            System.out.println(updateDates.get(0));
            System.out.println(updateDates.get(1));
        } else if (updateDates.size() == 1) {
            System.out.println("Server update date in " + targetMonth.toString() + ":");
            System.out.println(updateDates.get(0));
            LocalDate nextUpdateDate = updateDates.get(0).plusDays(14);
            System.out.println("Next update date after " + updateDates.get(0) + ":");
            System.out.println(nextUpdateDate);
        } else {
            System.out.println("No update dates found in " + targetMonth.toString());
        }

        scanner.close();
    }
}
    