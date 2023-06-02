package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    final static int NUMBERED_SURVEYED = 12467;
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        int energyDrinkers = (int) calculateEnergyDrinkers(NUMBERED_SURVEYED);
        int preferCitrus = (int) calculatePreferCitrus(NUMBERED_SURVEYED);

        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink per week");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return (int) (numberSurveyed * PURCHASED_ENERGY_DRINKS);
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return (int) (calculateEnergyDrinkers(numberSurveyed) * PREFER_CITRUS_DRINKS);
    }
}
