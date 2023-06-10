package io.codelex.oop.imperialToMetric;

public class MetersToYardsConverter implements Converter {
    @Override
    public double convert(int value) {
        return value * 1.09361;
    }
}
