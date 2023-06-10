package io.codelex.oop.imperialToMetric;

public class YardsToMetersConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 0.9144;
    }
}
