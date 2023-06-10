package io.codelex.oop.imperialToMetric;

public class TestClass {
    public static void main(String[] args) {
        int value = 10;

        double metersToYards = MeasurementConverter.convert(value, ConversionType.METERS_TO_YARDS);
        System.out.println(value + " meters is equal to " + metersToYards + " yards.");

        double yardsToMeters = MeasurementConverter.convert(value, ConversionType.YARDS_TO_METERS);
        System.out.println(value + " yards is equal to " + yardsToMeters + " meters.");

        double centimetersToInches = MeasurementConverter.convert(value, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(value + " centimeters is equal to " + centimetersToInches + " inches.");

        double inchesToCentimeters = MeasurementConverter.convert(value, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(value + " inches is equal to " + inchesToCentimeters + " centimeters.");

        double kilometersToMiles = MeasurementConverter.convert(value, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(value + " kilometers is equal to " + kilometersToMiles + " miles.");

        double milesToKilometers = MeasurementConverter.convert(value, ConversionType.MILES_TO_KILOMETERS);
        System.out.println(value + " miles is equal to " + milesToKilometers + " kilometers.");
    }
}
