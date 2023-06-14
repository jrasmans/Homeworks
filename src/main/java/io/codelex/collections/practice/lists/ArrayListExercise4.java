package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise4 {

    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        //fixme
        String firstColor = colors.get(0);
        System.out.println("First color: " + firstColor);

        //fixme
        String thirdColor = colors.get(2);
        System.out.println("Third color: " + thirdColor);
    }
}
