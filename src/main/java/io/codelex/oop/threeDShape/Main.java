package io.codelex.oop.threeDShape;

public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(3.0, 4.0);
        System.out.println("Cone Area: " + String.format("%.2f", cone.calculateArea()));
        System.out.println("Cone Volume: " + String.format("%.2f", cone.calculateVolume()));

        Cube cube = new Cube(5.0);
        System.out.println("Cube Area: " + String.format("%.2f", cube.calculateArea()));
        System.out.println("Cube Volume: " + String.format("%.2f", cube.calculateVolume()));
    }
}