package io.codelex.dateandtime.practice.datePeriod;

import java.time.LocalDate;

public class DatePeriodApp {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2023, 5, 1);
        LocalDate firstEnd = LocalDate.of(2023, 6, 20);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2023, 6, 10);
        LocalDate secondEnd = LocalDate.of(2023, 8, 20);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);
        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        System.out.println(overlap);
    }
}

