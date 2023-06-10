package io.codelex.oop.imperialToMetric;

public class MilesToKilometersConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 1.60934;
    }
}
