package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        float height = 0;
        float weight = 0;

        name = "Zed A. Shaw";
        age = 35;
        height = 74;  // inches
        float convertedHeightInCm = height * 2.54f; // cm
        String formattedHeight = String.format("%.2f",convertedHeightInCm);
        weight = 180; // lbs
        double convertedWeightInKg = weight * 0.453592f; // kg
        String formattedWeight = String.format("%.2f",convertedWeightInKg);

        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + formattedHeight + " cm tall.");
        System.out.println("He's " + formattedWeight + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + formattedHeight + ", and " + formattedWeight
                + " I get " + (age + formattedHeight + formattedWeight) + "."); // parseFlot ?
    }
}