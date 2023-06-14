package io.codelex.examination_work.magicapp;

import java.util.Arrays;
import java.util.List;

import static io.codelex.examination_work.magicapp.MagicApp.partOf;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent); // Should print out 0.75

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent); // Should print out 0.5
    }
}