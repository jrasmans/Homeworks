package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements

        List<String> carBrands = new ArrayList<>();

        //TODO: Add 10 values to list

        carBrands.add("Audi");
        carBrands.add("BMW");
        carBrands.add("Porsche");
        carBrands.add("Jaguar");
        carBrands.add("Land Rover");
        carBrands.add("Mercedes-Benz");
        carBrands.add("Alpina");
        carBrands.add("Lanborghini");
        carBrands.add("Alfa Romeo");
        carBrands.add("Mini");

        //TODO: Add new value at 5th position

        carBrands.add(4, "Rolls-Royce");

        //TODO: Change value at last position (Calculate last position programmatically)

        int lastIndex = carBrands.size() - 1;
        carBrands.set(lastIndex, "Austin");

        //TODO: Sort your list in alphabetical order

        Collections.sort(carBrands);

        //TODO: Check if your list contains "Foobar" element

        boolean containsFoobar = carBrands.contains("Footbar");

        //TODO: Print each element of list using loop

        for (String brand : carBrands) {
            System.out.println(brand);
        }
    }
}
