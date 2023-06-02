package io.codelex.classesandobjects.practice.carsFuelGaugeAndOdometer;

class Odometer {
    private int mileage;
    private FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge) {
        mileage = 0;
        this.fuelGauge = fuelGauge;
    }

    public int getMileage() {
        return mileage;
    }

    public void incrementMileage() {
        if (mileage < 999999) {
            mileage++;
        } else {
            mileage = 0;
        }

        if (mileage % 10 == 0) {
            fuelGauge.decrementFuel();
        }
    }
}
