package io.codelex.dateandtime.practice.dateTimeExercise;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        LocalDate date = from.plusDays(1); // Start from the next day
        while (true) {
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
                return date;
            }
            date = date.plusDays(1); // Move to the next day
        }
    }
}

