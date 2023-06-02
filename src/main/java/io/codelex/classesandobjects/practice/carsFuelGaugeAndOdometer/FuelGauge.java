package io.codelex.classesandobjects.practice.carsFuelGaugeAndOdometer;

public class FuelGauge {
    private int fuelAmount;

    public FuelGauge() {
        fuelAmount = 0;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void incrementFuel() {
        if (fuelAmount < 70) {
            fuelAmount++;
        }
    }

    public void decrementFuel() {
        if (fuelAmount > 0) {
            fuelAmount--;
        }
    }
}

