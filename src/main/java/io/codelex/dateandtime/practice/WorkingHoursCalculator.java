package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkingHoursCalculator {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 5, 1);
        LocalDate endDate = LocalDate.of(2023, 5, 31);
        int workingHours = calculateWorkingHours(startDate, endDate);
        System.out.println("Total working hours: " + workingHours);
    }

    public static int calculateWorkingHours(LocalDate startDate, LocalDate endDate) {
        int workingHours = 0;

        LocalDate currentDate = startDate;
        while (!currentDate.isAfter(endDate)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingHours += 8;
            }
            currentDate = currentDate.plusDays(1);
        }

        return workingHours;
    }
}
