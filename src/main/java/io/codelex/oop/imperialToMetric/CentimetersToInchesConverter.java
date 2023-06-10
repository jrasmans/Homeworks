package io.codelex.oop.imperialToMetric;

public class CentimetersToInchesConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 0.393701;
    }
}
