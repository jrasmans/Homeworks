package io.codelex.dateandtime.practice.serverUpdateCalculator;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CalculateUpdateDates {
    public static List<LocalDate> calculateUpdateDates(LocalDate serverLaunchDate, Month targetMonth, int targetYear) {
        List<LocalDate> updateDates = new ArrayList<>();

        LocalDate currentDate = serverLaunchDate;
        while (currentDate.getMonth() != targetMonth || currentDate.getYear() != targetYear) {
            currentDate = currentDate.plusDays(14);
            if (currentDate.getMonth() == targetMonth && currentDate.getYear() == targetYear) {
                updateDates.add(currentDate);
            }
        }

        return updateDates;
    }
}