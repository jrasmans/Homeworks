package io.codelex.oop.imperialToMetric;

public class InchesToCentimetersConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 2.54;
    }
}
