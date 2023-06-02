package io.codelex.classesandobjects.practice.car;

import java.util.Scanner;

class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading (starting odometer reading): ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading (ending odometer reading): ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        /*
        Car car1 = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter are " + car1.calculateConsumption());

        System.out.print("Enter first reading (starting odometer reading) for the second car: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading (ending odometer reading) for the second car: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed for the second car: ");
        liters = scan.nextDouble();

        Car car2 = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter for the second car are " + car2.calculateConsumption());

        if (car1.gasHog()) {
            System.out.println("Car 1 is a gas hog");
        }

        if (car1.economyCar()) {
            System.out.println("Car 1 is an economy car");
        }

        if (car2.gasHog()) {
            System.out.println("Car 2 is a gas hog");
        }

        if (car2.economyCar()) {
            System.out.println("Car 2 is an economy car");
        }
        */

        Car car3 = new Car(0);
        car3.fillUp(800, 56);
        System.out.println("Fuel consumption: " + car3.calculateConsumption());

        car3.fillUp(1200, 37);
        System.out.println("Fuel consumption: " + car3.calculateConsumption());
    }
}
