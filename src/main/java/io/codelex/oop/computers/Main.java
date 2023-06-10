package io.codelex.oop.computers;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Intel i7", 16, "NVIDIA GeForce GTX 1660", "Dell", "Latitude", 5000);
        Laptop laptop2 = new Laptop("AMD Ryzen 5", 8, "AMD Radeon RX 580", "HP", "Pavilion", 4000);

        System.out.println(laptop1.getProcessor());
        System.out.println(laptop2.getBattery());

        laptop1.setRam(32);
        laptop2.setBattery(6000);

        System.out.println(laptop1);
        System.out.println(laptop2);

        Laptop laptop3 = new Laptop("Intel i7", 32, "NVIDIA GeForce GTX 1660", "Dell", "Latitude", 5000);
        System.out.println(laptop1.equals(laptop3));
    }
}


