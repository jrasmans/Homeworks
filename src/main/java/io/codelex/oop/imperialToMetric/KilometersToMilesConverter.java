package io.codelex.oop.imperialToMetric;

public class KilometersToMilesConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 0.621371;
    }
}
