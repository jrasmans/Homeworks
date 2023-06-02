package io.codelex.classesandobjects.practice.carsFuelGaugeAndOdometer;

class CarSimulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        System.out.println("Mileage: " + odometer.getMileage() + " km");
        System.out.println("Fuel amount: " + fuelGauge.getFuelAmount() + " liters");
        System.out.println("----------");

        for (int i = 0; i < 70; i++) {
            fuelGauge.incrementFuel();
            System.out.println("Fuel amount: " + fuelGauge.getFuelAmount() + " liters");
            System.out.println("----------");
        }

        while (fuelGauge.getFuelAmount() > 0) {
            odometer.incrementMileage();
            System.out.println("Mileage: " + odometer.getMileage() + " km");
            System.out.println("Fuel amount: " + fuelGauge.getFuelAmount() + " liters");
            System.out.println("----------");
        }
    }
}
