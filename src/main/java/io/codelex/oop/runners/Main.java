package io.codelex.oop.runners;

public class Main {
    public static void main(String[] args) {
        int marathonTime = 150;

        Runner runner = Runner.getFitnessLevel(marathonTime);

        if (runner != null) {
            System.out.println("Fitness level: " + runner);
        } else {
            System.out.println("Invalid marathon time");
        }
    }
}
