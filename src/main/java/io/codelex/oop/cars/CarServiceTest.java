package io.codelex.oop.cars;

public class CarServiceTest {
    public static void main(String[] args) {
        // Create manufacturers
        Manufacturer manufacturer1 = new Manufacturer("Manufacturer 1", 1990, "Country 1");
        Manufacturer manufacturer2 = new Manufacturer("Manufacturer 2", 1985, "Country 2");
        Manufacturer manufacturer3 = new Manufacturer("Manufacturer 3", 2000, "Country 3");

        // Create cars
        Car car1 = new Car("Car 1", "Model 1", 50000, 1995, new Manufacturer[]{manufacturer1}, EngineType.V8);
        Car car2 = new Car("Car 2", "Model 2", 80000, 2005, new Manufacturer[]{manufacturer1, manufacturer2}, EngineType.V12);
        Car car3 = new Car("Car 3", "Model 3", 30000, 1998, new Manufacturer[]{manufacturer3}, EngineType.S6);

        // Create CarService and add cars
        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);

        // Test methods
        System.out.println("All Cars:");
        carService.getAllCars().forEach(System.out::println);

        System.out.println("\nCars with V12 Engine:");
        carService.getCarsWithV12Engine().forEach(System.out::println);

        System.out.println("\nCars produced before 1999:");
        carService.getCarsProducedBefore1999().forEach(System.out::println);

        System.out.println("\nMost Expensive Car:");
        System.out.println(carService.getMostExpensiveCar());

        System.out.println("\nCheapest Car:");
        System.out.println(carService.getCheapestCar());

        System.out.println("\nCars with at least 2 Manufacturers:");
        carService.getCarsWithMultipleManufacturers(2).forEach(System.out::println);

        System.out.println("\nCars Sorted by Price (Ascending):");
        carService.getCarsSortedByPrice(true).forEach(System.out::println);

        System.out.println("\nIs car1 in the list? " + carService.isCarInList(car1));
        System.out.println("Is car2 in the list? " + carService.isCarInList(car2));

        System.out.println("\nCars manufactured by Manufacturer 1:");
        carService.getCarsByManufacturer(manufacturer1).forEach(System.out::println);

        System.out.println("\nCars manufactured by Manufacturer 3 with year of establishment > 1995:");
        carService.getCarsByManufacturerWithYearComparison(manufacturer3, ">", 1995).forEach(System.out::println);
    }
}
