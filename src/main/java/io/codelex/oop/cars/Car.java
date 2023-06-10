package io.codelex.oop.cars;

import java.util.Objects;

class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private Manufacturer[] manufacturers;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacture,
               Manufacturer[] manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Manufacturer[] getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                yearOfManufacture == car.yearOfManufacture &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(manufacturers, car.manufacturers) &&
                engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturers, engineType);
    }
}
