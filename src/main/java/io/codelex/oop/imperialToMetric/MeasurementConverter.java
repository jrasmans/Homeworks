package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public static double convert(int value, ConversionType conversionType) {
        Converter converter = conversionType.getConverter();
        return converter.convert(value);
    }
}
