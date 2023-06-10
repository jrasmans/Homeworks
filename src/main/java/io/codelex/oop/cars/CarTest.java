package io.codelex.oop.cars;

public class CarTest {
    public static void main(String[] args) {
        // Create manufacturers
        Manufacturer manufacturer1 = new Manufacturer("Manufacturer 1", 1990, "Country 1");
        Manufacturer manufacturer2 = new Manufacturer("Manufacturer 2", 1985, "Country 2");
        Manufacturer manufacturer3 = new Manufacturer("Manufacturer 3", 2000, "Country 3");

        // Create cars
        Car car1 = new Car("Car 1", "Model 1", 50000, 1995, new Manufacturer[]{manufacturer1}, EngineType.V8);
        Car car2 = new Car("Car 2", "Model 2", 80000, 2005, new Manufacturer[]{manufacturer1, manufacturer2}, EngineType.V12);
        Car car3 = new Car("Car 3", "Model 3", 30000, 1998, new Manufacturer[]{manufacturer3}, EngineType.S6);

        // Test equality
        System.out.println(car1.equals(car2));  // false
        System.out.println(manufacturer1.equals(manufacturer2));  // false
        System.out.println(car1.equals(car3));  // false
    }
}


