package io.codelex.classesandobjects.practice.car;

import java.text.DecimalFormat;

public class Car {
    private double startKilometers;
    private double liters;
    private double totalKilometers;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.totalKilometers = startKilometers;
    }

    /* public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.0;
    } */

    public void fillUp(int mileage, double liters) {
        this.liters = liters;
        this.totalKilometers = mileage;
    }

    public String calculateConsumption() {
        double consumption = (liters / (totalKilometers - startKilometers)) * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(consumption);
    }
}

