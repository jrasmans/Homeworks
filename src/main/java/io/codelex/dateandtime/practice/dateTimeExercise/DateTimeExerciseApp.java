package io.codelex.dateandtime.practice.dateTimeExercise;

import java.time.LocalDate;

public class DateTimeExerciseApp {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextFriday13th = DateTimeExercise.findNextFriday13th(currentDate);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Next Friday the 13th: " + nextFriday13th);
    }
}
