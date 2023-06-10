package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(carList);
    }

    public List<Car> getCarsWithV12Engine() {
        List<Car> carsWithV12Engine = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngineType() == EngineType.V12) {
                carsWithV12Engine.add(car);
            }
        }
        return carsWithV12Engine;
    }

    public List<Car> getCarsProducedBefore1999() {
        List<Car> carsProducedBefore1999 = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfManufacture() < 1999) {
                carsProducedBefore1999.add(car);
            }
        }
        return carsProducedBefore1999;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : carList) {
            if (mostExpensiveCar == null || car.getPrice() > mostExpensiveCar.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar() {
        Car cheapestCar = null;
        for (Car car : carList) {
            if (cheapestCar == null || car.getPrice() < cheapestCar.getPrice()) {
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public List<Car> getCarsWithMultipleManufacturers(int minimumManufacturers) {
        List<Car> carsWithMultipleManufacturers = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturers().length >= minimumManufacturers) {
                carsWithMultipleManufacturers.add(car);
            }
        }
        return carsWithMultipleManufacturers;
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        List<Car> sortedCars = new ArrayList<>(carList);
        sortedCars.sort(Comparator.comparingDouble(Car::getPrice));
        if (!ascending) {
            // Reverse the list if descending order is required
            List<Car> reversedCars = new ArrayList<>(sortedCars);
            Collections.reverse(reversedCars);
            sortedCars = reversedCars;
        }
        return sortedCars;
    }

    public boolean isCarInList(Car car) {
        return carList.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer carManufacturer : car.getManufacturers()) {
                if (carManufacturer.equals(manufacturer)) {
                    carsByManufacturer.add(car);
                    break;
                }
            }
        }
        return carsByManufacturer;
    }

    public List<Car> getCarsByManufacturerWithYearComparison(Manufacturer manufacturer, String comparisonOperator,
                                                             int yearOfEstablishment) {
        List<Car> carsByManufacturerWithYearComparison = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer carManufacturer : car.getManufacturers()) {
                if (carManufacturer.equals(manufacturer)) {
                    switch (comparisonOperator) {
                        case "<":
                            if (carManufacturer.getYearOfEstablishment() < yearOfEstablishment) {
                                carsByManufacturerWithYearComparison.add(car);
                            }
                            break;
                        case ">":
                            if (carManufacturer.getYearOfEstablishment() > yearOfEstablishment) {
                                carsByManufacturerWithYearComparison.add(car);
                            }
                            break;
                        case "<=":
                            if (carManufacturer.getYearOfEstablishment() <= yearOfEstablishment) {
                                carsByManufacturerWithYearComparison.add(car);
                            }
                            break;
                        case ">=":
                            if (carManufacturer.getYearOfEstablishment() >= yearOfEstablishment) {
                                carsByManufacturerWithYearComparison.add(car);
                            }
                            break;
                        case "=":
                            if (carManufacturer.getYearOfEstablishment() == yearOfEstablishment) {
                                carsByManufacturerWithYearComparison.add(car);
                            }
                            break;
                        case "!=":
                            if (carManufacturer.getYearOfEstablishment() != yearOfEstablishment) {
                                carsByManufacturerWithYearComparison.add(car);
                            }
                            break;
                    }
                    break;
                }
            }
        }
        return carsByManufacturerWithYearComparison;
    }
}
